package com.br.cursoemvideo;

import java.util.Random;

public class Luta {
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovado;
	
	public void marcarLuta(Lutador l1, Lutador l2){
		if ((l1.getCategoria() == l2.getCategoria()&& !l1.equals(l2))) {
			this.setAprovado(true);
			this.setDesafiado(l1);
			this.setDesafiante(l2);
		} else{
			this.setAprovado(false);
			this.setDesafiado(null);
			this.setDesafiante(null);
		}
	}
	public void lutar(){
		if(this.getAprovado()) {
			this.desafiado.apresentar();
			this.desafiante.apresentar();
			int vencedor = new Random().nextInt(3);
			
			switch (vencedor) {
			case 0:
				System.out.println("Empatou");
				this.getDesafiado().empatarLuta();
				this.getDesafiante().empatarLuta();
				break;
			case 1:
				System.out.println("O Desafiado ganhou");
				this.getDesafiado().ganharLuta();
				this.getDesafiante().perderLuta();
				break;
			case 2:
				System.out.println("O Desafiante ganhou");
				this.getDesafiado().perderLuta();
				this.getDesafiante().ganharLuta();
				break;
			}
			
		}else {
			System.out.println("Luta não foi aprovada");
		}
	}
	public Lutador getDesafiado() {
		return desafiado;
	}
	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}
	public Lutador getDesafiante() {
		return desafiante;
	}
	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}
	public int getRounds() {
		return rounds;
	}
	public void setRounds(int rounds) {
		this.rounds = rounds;
	}
	public Boolean getAprovado() {
		return aprovado;
	}
	public void setAprovado(Boolean aprovado) {
		this.aprovado = aprovado;
	}
	
}
