package main;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

import java.util.Random;

public class Main extends StateBasedGame {

	public Main(String name)
	{
		super(name);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[]args) {
		
        for (int i = 0; i < 10; i++) {
            System.out.println(aleatorio());
        }
			
		AppGameContainer appgc;
		
		try {
			appgc = new AppGameContainer(new Main ("Altheryn RPG"));
			appgc.setDisplayMode(1366, 768, false);
			appgc.setAlwaysRender(true);
			appgc.start();	
		} catch (SlickException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public static int aleatorio() {
		Random gerador = new Random();
		return gerador.nextInt(10);
	}	
	
	@Override
	public void initStatesList(GameContainer arg0) throws SlickException {	
		addState(new BasicGame());
	}

}

