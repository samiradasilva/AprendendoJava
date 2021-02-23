package instrucaocontrole;

import java.io.IOException;

public class AdivinheALetra { // jogo advinhe a letra

	public static void main(String[] args) throws IOException {

		char ch, resposta = 'S'; // define qual é a resposta correta, neste caso, letra S (em maiúscula)

		System.out.println("Estou pensando em uma letra entre A e Z");
		System.out.print("Seu palpite: "); // programa pede pra vc digitar seu palpite no Console

		ch = (char) System.in.read();

		if (ch == resposta) // Se vc digitar 'S', a mensagem abaixo será exibida no Console
			System.out.println("** Certa resposta **");
		else
			System.out.println("Desculpe, sua resposta está errada"); // Se vc digitar 'B', a mensagem abaixo será exibida no Console

		
	
	}

}
