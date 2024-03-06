package TemplateMethodDesignPatternByMe;

public abstract sealed class Poster permits carPoster,PolitisionPoster{
    private String name;
    public Poster(String name){
        this.name = name;
    }
    //make a template for the poster
    public final void posterTemplate(){
        Posterpicture();
        posterName();
        posterColor();
        if(peopleSection()){
            posterFootPeopleSection();
        }
        if(border()){
            posterborder();
        }
        if(holes()){
            holesOnPoster();
        }
    }

    public abstract void Posterpicture();
    public abstract void posterName();
    public abstract void posterColor();

    //optional stuff
    public void posterFootPeopleSection(){
       System.out.println(name+" posterFootPeopleSection");
    }

    public void posterborder(){
        System.out.println(name+" posterborder");
    }
    public void holesOnPoster(){
        System.out.println(name+" holesOnPoster");
    }

    public boolean peopleSection(){
        return false;
    }

    public boolean  border(){
        return false;
    }
    public boolean  holes(){
        return false;
    }
}