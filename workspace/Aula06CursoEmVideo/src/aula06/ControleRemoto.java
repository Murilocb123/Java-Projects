package aula06;

public class ControleRemoto implements Controlador {
	
	private int volume;
	private boolean ligado;
	private boolean tocando;
	private int auxVolume;

	public ControleRemoto() {
		this.volume = 50;
		this.ligado = false;
		this.tocando = false;
	}

	private int getVolume() {
		return volume;
	}

	private void setVolume(int volume) {
		this.volume = volume;
	}

	private boolean getLigado() {
		return ligado;
	}

	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	private boolean getTocando() {
		return tocando;
	}

	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
	private int getAuxVolume(){
		return this.getAuxVolume();
	}
	private void setAuxVolume(){
		this.auxVolume= this.getVolume();
	}
	@Override
	public void ligar() {
		// TODO Auto-generated method stub
		this.setLigado(true);
	}

	@Override
	public void desligar() {
		// TODO Auto-generated method stub
		this.setLigado(false);
		
	}

	@Override
	public void abrirMenu() {
		// TODO Auto-generated method stub
		System.out.println("---------Menu---------");
		System.out.println("Está Ligado? "+ this.getLigado());
		System.out.println("Está Tocando? "+ this.getTocando());
		System.out.println("Volume: "+ this.getVolume());
		for (int i = 0; i < this.getVolume(); i+=10) {
			System.out.print("█ ");
		}
		System.out.println("");
	}

	@Override
	public void fecharMenu() {
		// TODO Auto-generated method stub
		System.out.println("Fechando Menu");
	}

	@Override
	public void maisVolume() {
		// TODO Auto-generated method stub
		if (this.getLigado()) {
			this.setVolume(getVolume()+5);
		}
	}

	@Override
	public void menosVolume() {
		// TODO Auto-generated method stub
		if (this.getLigado()) {
			this.setVolume(getVolume()-5);
		}
	}

	@Override
	public void ligarMudo() {
		// TODO Auto-generated method stub
		if (ligado && this.getVolume()>0) {
			this.setAuxVolume();
			this.setVolume(0);
		}
	}

	@Override
	public void desligarMudo() {
		// TODO Auto-generated method stub
		if (this.getLigado() && this.getVolume() == 0) {
			this.setVolume(this.getAuxVolume());
		}
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		if (this.getLigado() && !(this.getTocando())) {
			this.setTocando(true);
		}
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		if (this.getLigado() && this.getTocando()) {
			this.setTocando(false);
		}
	}

}
