package com.br.cursoemvideo;

public class UEC {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lutador[] l =new Lutador[6];
		l[0] = new Lutador("Pretty Boy", "França", 31, (float) 1.75, (float) 68.9, 11, 3, 1);
		l[1] = new Lutador("Xablau", "China", 32, (float) 1.60, (float) 120.9, 11, 3, 1);
		l[2] = new Lutador("seila", "Brasil", 28, (float) 1.50, (float) 75.9, 11, 3, 1);
		l[3] = new Lutador("seila1", "Brasil", 28, (float) 1.50, (float) 75.9, 11, 3, 1);
		
		l[0].apresentar();
		l[1].status();
		l[2].getCategoria();
		
		System.out.println("---------------------------------------------------------------");
		Luta lu = new Luta();
		lu.marcarLuta(l[2], l[3]);
		lu.lutar();
		
		
	}

}
