package view;

import controller.Sapo;

public class Principal {

	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) {
			Sapo sapo = new Sapo(100,"SAPO "+i);
			sapo.start();
		}
	}

}
