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

public class BasicGame extends BasicGameState 
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
		g.drawString("Era um dia comum em uma cidade comum, onde voc�s estavam no lugar\r\n"
				+ "que comumumente frequentavam a taberna de Altheryn.\r\n"
				+ "At� que um estranho aproxima-se de voc�s, e assim come�a a conversar,\r\n"
				+ "ele n�o era grande nem parecia um guerreiro, pra ser mais sincero era mais\r\n"
				+ "como um civil.\r\n"
				+ "Voc�s passam horas conversando. Sem nenhuma no��o de tempo.\r\n"
				+ "Estava tudo bem at� que... tr�s goblins invadem a taberna, humilham o\r\n"
				+ "taberneiro, e roubam todo seu dinheiro.\r\n"
				+ "Ent�o o �estranho� que estava na mesa de voc�s se levanta vai at� o\r\n"
				+ "taberneiro e diz:\r\n"
				+ "-Pai est� tudo bem ? -Voc�s ficam surpresos por isso, e pensam como ele\r\n"
				+ "era filho do taberneiro e n�o nos disse.\r\n"
				+ "Logo ap�s o taberneiro retruca:\r\n"
				+ "-Filho, estamos perdidos, eles levaram toda nossa reserva, n�o sei como\r\n"
				+ "nos manteremos, nem como pagaremos os impostos.\r\n"
				+ "Ent�o o an�o, se levanta e diz:\r\n"
				+ "-N�o se preocupe, n�s iremos salvar voc�s.\r\n"
				+ "Voc�s olham uns para os outros e lembram de toda hospitalidade do lugar\r\n"
				+ "e do filho do taberneiro, e assim, concordam.\r\n"
				+ "", 341, 100);

	
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
			System.out.println(Main.aleatorio());
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
