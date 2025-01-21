public class ArcadeGame {
    String gameName;
    int numberOfTokens;
    boolean isMultiplayer;

    public ArcadeGame(String paramName, int paramTokens, boolean paramMultiplayer){
        gameName = paramName;
        numberOfTokens = paramTokens;
        isMultiplayer = paramMultiplayer;

    }

    public void printInfo(){
        System.out.println("This is the "+gameName+" arcade game! It requires "+numberOfTokens+" of tokens, and it is "+isMultiplayer+" that it is multiplayer.");
    }

}
