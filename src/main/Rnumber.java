package main;

import java.util.Random;

public class Rnumber extends Main {

    public Rnumber(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

        //inst�ncia um objeto da classe Random usando o construtor b�sico
        Random gerador = new Random();

        //imprime sequ�ncia de 10 n�meros inteiros aleat�rios entre 0 e 25
        for (int i = 1; i < 2; i++) {
            System.out.println(gerador.nextInt(20));
         }
    }
}