package TemplateMethodDesignPatternByMe;

public class Main {
    public static void main(String[] args){
        carPoster carPoster = new carPoster();
        carPoster.posterTemplate();

        System.out.print("\n");

        PolitisionPoster politisionPoster = new PolitisionPoster();
        politisionPoster.posterTemplate();
    }
}
