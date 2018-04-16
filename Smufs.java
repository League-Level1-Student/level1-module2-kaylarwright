
public class Smufs {
public static void main(String[] args) {
	Smurf handy = new Smurf("Handy");
	handy.eat();
	String smurf = handy.getName();
	System.out.println(smurf);
	
	Smurf papa = new Smurf("Papa");
	String smurfs = papa.getName();
	System.out.println(smurfs);
	String hat = papa.getHatColor();
	System.out.println(hat);
	String them = papa.isGirlOrBoy();
	System.out.println(them);
	
	Smurf smurfette = new Smurf("Smurfette");
	String smurfss = smurfette.getName();
	System.out.println(smurfss);
	String hats = smurfette.getHatColor();
	System.out.println(hats);
	String thems = smurfette.isGirlOrBoy();
	System.out.println(thems);
	
}
}
