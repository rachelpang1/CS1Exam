public class Arcade {
    public static void main(String[] args) {
        Arcade pixelParadise = new Arcade();
    }

    public Arcade(){
        System.out.println("Hello World! Good luck on your exams!");

        String name;
        boolean isOpen;
        int yearFounded;

        name = "Pixel Paradise";
        isOpen = true;
        yearFounded = 1985;
        System.out.println("Welcome to "+name+"! It is "+isOpen+" that we are open. We are founded in "+yearFounded+".");
        yearFounded = 2008;
        System.out.println("Welcome to "+name+"! It is "+isOpen+" that we are open. We are founded in "+yearFounded+".");

        spinForTokens();
        gameOfTheDay("ring toss");
        displayScores();
        ticketMultiplier();
        ArcadeGame classicGame = new ArcadeGame("Pinball", 2, false);
        classicGame.printInfo();
        ArcadeGame myFavGame = new ArcadeGame("Basketball Hoops", 5, true);
        myFavGame.printInfo();

    }

    public void spinForTokens(){
        int randomInt;
        randomInt = (int)(Math.random()*52+1);
        System.out.println("You spun the wheel and you won "+randomInt+" tokens!");

    }

    public void gameOfTheDay(String gameName){
        System.out.println("Today's game of the day is "+gameName+".");
    }

    public void displayScores(){
        for (int m=1; m<=5; m=m+1){
            System.out.println(m);
        }
        for (int s=200; s<=1100; s=s+300){
            System.out.println(s);
        }
        for (int r=6; r>=0; r=r-1){
            System.out.print(r+",");
        }
        System.out.println();
    }

    public void ticketMultiplier(){
        double randomNum;
        randomNum = Math.random();
        if (randomNum < 0.25){
            System.out.println("You've won 10 extra tickets.");
        }
        if (0.25<=randomNum && randomNum <=0.5){
            System.out.println("You've won 50 extra tickets.");
        }
        if (0.5<=randomNum && randomNum <=0.75){
            System.out.println("You've doubled your tickets.");
        }
        if (0.75<=randomNum && randomNum<1){
            System.out.println("You've tripled your tickets.");
        }
    }


}
