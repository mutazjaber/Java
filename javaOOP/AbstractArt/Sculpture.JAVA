// inside of Sculpture.java
public class Sculpture extends Art {
    // TODO: implement Sculpture class
    // inside of Painting.java
    private string material ;
    public Painting(string title, string artist, int year, double price , string material){
        super(title,artist,year,price);
        this.material = material;
    }
    @override 
    public void viewArt(){
        System.out.println("Title : " + title);
        System.out.println("Artist : " + artist);
        System.out.println("Year created : "+ year);
        System.out.println("Price : $" + price);
        System.out.println("material : " + material);
    }
} 


