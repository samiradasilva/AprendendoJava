package tiposdedados;

public class CalcCom { // calcula o comprimento da hipotenusa de 2 lados opostos

	public static void main(String[] args) {

		double x, y, z; // declara��o das vari�veis

		x = 3; // valor lado 1
		y = 4; // valor lado 2

		z = Math.sqrt(x * x + y * y); // express�o pra descobrir valor de z

		System.out.println("Hipotenusa � " + z); // instru��o pra sa�da de dados no console

	}

}
