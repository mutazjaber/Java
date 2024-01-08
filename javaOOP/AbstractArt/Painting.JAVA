// inside of Painting.java
public class Painting extends Art {
    // TODO: implement Painting class
    private string paintType ;
    public String getPaintType(){
        return this.paintType;
    }
    public void setPaintType(String type){
        this.paintType = type;

    }
    public Painting(string title, string artist, int year, double price ,string paintType ){
        super(title,artist,year,price);
        this.paintType = paintType;
    }
    @override 
    public void viewArt(){
        System.out.println("Title : " + title);
        System.out.println("Artist : " + artist);
        System.out.println("Year created : "+ year);
        System.out.println("Price : $" + price);
        System.out.println("Paint Type : " + paintType);
    }
} 
