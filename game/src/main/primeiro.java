package main;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame; 
import java.util.Random;

public class primeiro extends BasicGameState 
{	
	
	private boolean enterPressed = false;
	Random r = new Random();
	float velX=r.nextFloat()-.5f;
	int x = r.nextInt(800);
	private Image guerreiro = null;
	private Image taverna = null;
	private Image arqueiro = null;
	private Image anao = null;
	public static int id=1;

	@Override
	public void init(GameContainer arg0, StateBasedGame arg1) throws SlickException 
	{
		anao = new Image("images/personagens/anaoPNG.png");
		guerreiro = new Image("images/personagens/guerreiroPNG.png");
		taverna = new Image("images/cenarios/tavern.png");
		arqueiro = new Image("images/personagens/arqueiroPNG.png");
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(GameContainer arg0, StateBasedGame arg1, Graphics g) throws SlickException
	{
		
		
		
		taverna.draw();
		
		anao.draw(250, 150);
		
		arqueiro.draw(675, 15);
		
		guerreiro.draw(-250, 15);
		
		g.drawString("Aperte Enter para continuar", 10, 25);
		
		g.setColor(Color.yellow);
		g.drawString("Vocês precisavam achar pistas do local, e dos goblins, e nada melhor do que\r\n"
				+ "vasculhar por onde eles passaram, então fazem suas buscas.\r\n"
				+ "Rolar numero de 1-20\r\n"
				+ "Se >10 acham com facilidade, se <10 com um pouco de difuldade, se <5 não\r\n"
				+ "acham nada e terão de buscar de novo.\r\n"
				+ "Vocês acham um pedaço de papel, com uma espécie de caverna e algo\r\n"
				+ "como uma pedra grande e verde, cheia de provavelmente musgo.\r\n"
				+ "E começam a pensar, onde em Altheryn teriam cavernas?\r\n"
				+ "O arqueiro responde:\r\n"
				+ "-Já sei na floresta. ", 341, 100);

	
				if(enterPressed) {
					g.setColor(Color.yellow);
					g.drawString("continuar", 1250, 700);
				}
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(GameContainer container, StateBasedGame arg1, int delta) throws SlickException 
	{
		Input input = container.getInput();
		if(input .isKeyPressed(input.KEY_ENTER)) {
			enterPressed = true;
			
		}
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getID() 
	{
		// TODO Auto-generated method stub
		return BasicGame.id;
	}

}
