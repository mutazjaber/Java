
public class Painting extends Art {
	private String paintType ;
	public Painting(String paintType) {
		this.paintType = paintType;
		this.author = "mutaz";
		this.description = "mutza paiting";
		this.title = "mutaz art";
	}
	@Override
	public void viewArt() { 
		System.out.print("paintType : "+this.paintType+"\n");
		System.out.print("Auther : "+this.author+"\n");
		System.out.print("Piece Title : "+this.title+"\n");
		System.out.print("Description : "+this.description+"\n");
	}
	
}