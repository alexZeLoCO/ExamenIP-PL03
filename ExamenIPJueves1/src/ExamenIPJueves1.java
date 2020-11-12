import java.util.Scanner;		//SCANNER
public class ExamenIPJueves1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);		//CREA TECLADO

		//EJ1
		System.out.print("Introduzca una secuencia de números naturales. ");		//SOLICITA DATO
		int productopares=1;		//INICIALIZAR PROD PARES (1 PARA MULTIPLICAR)
		int productoimpares=1;		//INICIALIZAR PROD IMPARES (1 PARA MULTIPLICAR)
		int n;		//INICIALIZAR N (SECUENCIA)
		do {		//BUCLE
			n=teclado.nextInt();		//SIGUIENTE VALOR EN SECUENCIA
			if (n%2==0 && n!=0) {		//SI ES PAR (DIF DE 0)
				productopares = productopares * n;		//ACTUALIZAR PROD
			} else {		//SI NO
				if (n!=0) {			//Y ES DIF DE 0
					productoimpares = productoimpares * n;		//ACTUALIZAR PROD
				}
			}
		} while(n!=0);		//HASTA N==0
		System.out.printf("Pares: %d, Impares: %d", productopares,productoimpares);			//OUTPUT
		if (productopares>productoimpares) {		//PARES>IMPARES
			System.out.println("El producto de pares es mayor.");		//OUTPUT
		}
		if (productopares<productoimpares) {		//PARES<IMPARES
			System.out.println("El producto de impares es mayor.");		//OUTPUT
		}

		//EJ2
		System.out.println("Introduce los extremos del intervalo (a,b): ");		//SOLICITA DATO
		int a = teclado.nextInt();		//A
		int b = teclado.nextInt();		//B
		int i=a;		//I ES A
		
		do {		//BUCLE
			i++;		//ACTUALIZA A
		} while ((i%a!=0 || b%i!=0) && i<b-1);		//CONDICIÓN
		
		if (i%a==0 && b%i==0) {		//CONDICIÓN
			System.out.printf("Sí, %d es múltiplo de %d y divisor de %d.",i,a,b);		//OUTPUT
		} else {		//SI NO
			System.out.printf("No hay un número múltiplo de %d y divisor de %d.",a,b);		//OUTPUT
		}
	}
}
