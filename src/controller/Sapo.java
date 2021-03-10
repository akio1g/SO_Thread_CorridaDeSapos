package controller;

import java.util.Random;

public class Sapo extends Thread {
	static int pos = 0;
	private int corrida = 100;
	private int salto;
	private String name;
	private int distanciaPercorrida = 0;
	
	
	public Sapo(int corrida, String name) {
		this.corrida = corrida;
		this.name = name;
	}


	@Override
	public void run() {
		while(corrida > 0) {
			salto = randomizarSalto();
			corrida -= salto;
			distanciaPercorrida += salto;
			atualPos(name,salto,distanciaPercorrida);
			pararSapo();
		}
		colocacao(name);
	}
	
	public int randomizarSalto() {
		Random r = new Random();
		int x = r.nextInt(10);
		return x;
	}
	
	public void atualPos(String name, int salto, int distancia) {
		System.out.println(name + " percorreu "+ distancia + " metros com um salto de " + salto + " m");
	}
	
	public void pararSapo() {
		yield();
	}
	
	public void colocacao(String name) {
		pos = pos + 1;
		System.out.println(name + " ficou na colocaçao: "+ pos);
	}
}
