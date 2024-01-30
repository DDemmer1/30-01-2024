package de.demmer.dennis.interfacewiederholung;

public class Application {
	
	public static void main(String[] args)  {
		
		Pokemon p = new Glumanda(100, "Glumanda");

		Drawable d = new Glumanda(0, null);
		
		d.draw();
		Drawable d1 = new Pokeball();
		d1.draw();
		
		Drawable[] dArr = new Drawable[2];
		dArr[0] = new Pokeball();
		dArr[1] =  new Glumanda(0, null);
		
		
		
		
	}

}
