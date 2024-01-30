package de.demmer.dennis.interfacewiederholung;

import java.io.Serializable;

public class Glumanda extends Pokemon implements Drawable, Comparable<Pokemon>, Serializable{
	
	
	
	
	
	public Glumanda(int hp, String nickname) {
		this.hp = hp;
		this.nickname = nickname;
	}

	
	@Override
	public void draw() {
		
		System.out.println("⠀⠀⠀⠀⠀⠀⣀⠤⠄⠒⠒⠤⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⡰⠊⠁⠀⠀⠀⠀⠀⠀⠙⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⣸⢡⡄⠀⠀⠀⠀⢀⡴⢠⢦⡈⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⣿⢋⠃⠀⠀⠀⠀⠀⠁⣧⣸⣧⠸⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠠⡿⢿⠀⠀⠀⠀⠀⠀⠀⣟⠛⣹⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⢠⡟⠚⠀⠀⠀⠀⠀⠀⠀⠈⠉⢀⡀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣄⡀⠀⠀\r\n"
				+ "⠀⠀⢸⡙⢶⣤⣄⣀⣀⣀⣤⡤⠲⡿⠁⣸⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣤⣼⠿⣿⡀⠀\r\n"
				+ "⠀⠀⠀⠙⠢⣍⡓⢤⣴⣋⣉⡭⠛⠀⢠⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⡿⠿⠀⠀⡇⠀\r\n"
				+ "⠀⠀⠀⠀⠀⣀⡬⢿⠃⣻⡶⣆⡀⠀⠈⠉⠒⠦⢄⡀⠀⠀⠀⠀⠀⠀⣠⠇⠀⠀⠀⣷⠀\r\n"
				+ "⣴⣶⠶⠒⠉⠀⠀⢸⠞⠁⠀⠀⠙⢆⠀⠀⠀⠀⠀⠈⠉⠚⣿⡶⠀⢰⠃⠀⠀⠀⢠⣿⣄\r\n"
				+ "⠉⢻⣄⣀⡀⠀⢀⡾⠀⠀⠀⠀⠀⠈⢧⣀⣀⠀⠀⠀⣿⡧⠾⠗⠀⠀⢧⡀⠀⠀⠀⣡⠇\r\n"
				+ "⠀⠉⠁⠀⠀⠀⢠⡇⠀⠀⠀⠀⠀⠀⠈⡆⠀⠙⣆⠀⠀⠀⠀⠀⠀⠀⠀⠳⣤⣀⠞⠁⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⢸⡀⠀⠈⢧⠀⠀⠀⠀⠀⠀⠀⡰⠃⡄⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⢀⡠⠚⡇⠀⠀⠀⠀⠀⠀⠀⢠⠟⠀⠀⠀⢳⡀⠀⠀⠀⣠⠞⠁⣠⡇⠀⠀⠀\r\n"
				+ "⠀⠀⠀⢀⠎⠀⠀⠙⣄⠀⠀⠀⠀⠀⠀⡏⠀⠀⠀⠀⠀⢳⠒⠈⠉⠀⢀⣴⡟⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⢸⠀⠀⠀⠀⠈⠣⢄⡀⠀⠀⠀⢇⠀⠀⠀⠀⠀⢸⡀⣀⡠⠔⡩⠞⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⣈⣧⡀⠀⠀⠀⢠⠔⠛⠓⠒⠒⠚⠧⡀⠀⠀⠀⠈⡯⠄⠒⠉⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⣾⣟⣶⣳⠤⠤⠔⠊⠀⠀⠀⠀⠀⠀⠀⢹⡀⢀⣀⣀⣷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠈⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⢚⣾⣷⣟⡋⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		
	}


	@Override
	public int compareTo(Pokemon anderesObject) {
		
		
		
		return 0;
	}
	

}
