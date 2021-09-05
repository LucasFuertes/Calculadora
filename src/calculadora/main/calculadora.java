package calculadora.main;

import java.util.Scanner;

public class calculadora {
	public static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Introduzca que desea hacer: " + "\n1. Sumar" + "\n2. Restar" + "\n3. Multiplicar"
				+ "\n4. Dividir" + "\n5. Descubrir paridad" + "\n6. Ver tabla de multiplicacion" + "\n7. Comparar numeros" + "\n0. Apagar");
		int opcion;
		opcion = in.nextInt();
		int valorX;
		int valorY;
		
		while (opcion != 0) {

			switch (opcion) {
			case 1:
				System.out.println("Selecciono Sumar");
				valorX = cargarValorX();
				valorY = cargarValorY();
				int s_resultado = sumar(valorX, valorY);
				System.out.println("El resultado de la suma es: " + s_resultado);
				opcion = seguir();
				break;
			case 2:
				System.out.println("Selecciono Restar");
				valorX = cargarValorX();
				valorY = cargarValorY();
				int r_resultado = restar(valorX, valorY);
				System.out.println("El resultado de la resta es: " + r_resultado);
				opcion = seguir();
				break;
			case 3:
				System.out.println("Selecciono Multiplicar");
				valorX = cargarValorX();
				valorY = cargarValorY();
				int m_resultado = multiplicar(valorX, valorY);
				System.out.println("El resultado de la multiplicacion es: " + m_resultado);
				opcion = seguir();
				break;
			case 4:
				System.out.println("Selecciono Dividir");
				valorX = cargarValorX();
				valorY = cargarValorY();
				dividir(valorX, valorY);
				opcion = seguir();
				break;
			case 5:
				System.out.println("Selecciono Descubrir paridad");
				valorX = cargarValorX();
				esPar(valorX);
				opcion = seguir();
				break;
			case 6:
				System.out.println("La tabla de que numero desea ver?");
				tabla(cargarValorX(), cargarLineas());
				opcion = seguir();
				break;
			case 7:
				System.out.println("introduzca el primer numero que desea comparar:");
				int valorA = in.nextInt();
				System.out.println("introduzca el segundo numero que desea comparar:");
				int valorB = in.nextInt();
				System.out.println("introduzca el tercer numero que desea comparar:");
				int valorC = in.nextInt();
				comparar(valorA, valorB, valorC);
				opcion = seguir();
				break;
			default:
				System.out.println("Solo acepto numeros del 1 al 7");
				System.out.println("Desea continuar con el procedimiento?: \n1. Si \nCualquier otro Numero. No");
				int continuar = in.nextInt();
				if (continuar == 1) {
					opcion = seguir();
				} else {
					opcion = 0;
				}
				break;
			}

		}

		System.out.println("Programa finalizado");
		System.out.println("Gracias por utilizar la aplicacion Calculadora");
		in.close();

	}

	public static int sumar(int valorUno, int valorDos) {
		int resultado = valorUno + valorDos;
		return resultado;
	}

	public static int restar(int valorUno, int valorDos) {
		int resultado = valorUno - valorDos;
		return resultado;
	}

	public static int multiplicar(int valorUno, int valorDos) {
		int resultado = valorUno * valorDos;
		return resultado;
	}

	public static void dividir(int valorUno, int valorDos) {

		if (valorDos == 0) {
			System.out.println("No se puede dividir por 0, pendejo");
		} else {
			float resultado = valorUno / valorDos;
			System.out.println("El resultado de la division es: " + resultado);
		}
	}

	public static void esPar(int nro) {
		int resto = nro % 2;

		if (resto != 0) {
			System.out.println("El valor " + nro + " es impar");
		} else {
			System.out.println("El valor " + nro + " es par");
		}
	}

	public static int cargarValorY() {
		System.out.println("introduzca el segundo valor: ");
		int valorY = in.nextInt();
		return valorY;
	}

	public static int cargarValorX() {
		System.out.println("introduzca el primer valor: ");
		int valorX = in.nextInt();
		return valorX;
	}
	
	public static int cargarLineas() {
		System.out.println("Cuantas lineas de la tabla deseas ver?");
		int valorZ = in.nextInt();
		return valorZ;
	}

	public static int seguir() {
		System.out.println("Introduzca que desea hacer: " + "\n1. Sumar" + "\n2. Restar" + "\n3. Multiplicar"
				+ "\n4. Dividir" + "\n5. Descubrir paridad" + "\n6. Ver tabla de multiplicacion" + "\n7. Comparar numeros" + "\n0. Apagar");
		int opcion = in.nextInt();
		return opcion;
	}

	public static void tabla(int nro, int lineas) 
	{
		for (int i = 1; i <= lineas; i++) {			
			System.out.println(nro + " * " + i + " = " + nro * i);
		}

	}
	
	public static void comparar(int valorX, int valorY, int valorZ) 
	{	
		// Block to detect minor
		if(valorX <= valorY && valorX <= valorZ) {
			//minor x
			System.out.println("El menor es " + valorX);
		} else {
			if(valorY <= valorX && valorY <= valorZ) {
				//minor y
				System.out.println("El menor es " + valorY);
			}
			else {
				//minor z
				System.out.println("El menor es " + valorZ);
			}
		}
		
		// Block to detect greater		
		if(valorX >= valorY && valorX >= valorZ) {
			//greater x
			System.out.println("El mayor es " + valorX);
		} else {
			if(valorY >= valorX && valorY >= valorZ) {
				//greater y
				System.out.println("El mayor es " + valorY);
			}
			else {
				//greater z
				System.out.println("El mayor es " + valorZ);
			}
		}
	}}