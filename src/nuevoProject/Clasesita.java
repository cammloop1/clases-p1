package nuevoProject;
import java.util.Scanner;


public class Clasesita{

public static void main(String[] args) {
	sumatoriaPares(10);
	
	
}
public static void suma(){
	Scanner scan = new Scanner(System.in);
	System.out.println("ingrese un numero: ");
	int n1 = scan.nextInt();
	System.out.println("ingrese otro numero: ");
	int n2 = scan.nextInt();
	imprimirSuma(n1, n2);
	imprimirPromedio(n1,n2, 0);

    scan.close();
}
 public static void imprimirSuma(int a, int b) {
	 System.out.println("la suma es: " +(a+b));
 }
public static void imprimirPromedio(int a, int b, int promedio) {
	promedio = (a+b)/2;
	System.out.println("el promedio es: " + promedio);
}
public static void ponerNota(double x, double y, double promedio) {
	promedio = (x+y)/2;
	if (promedio>=7) {
		System.out.println("promocionado: "+ promedio);
	}
	else {
		if (promedio>=4 && promedio<=7) {
			System.out.println("aprobado:  "+ promedio);
		}
		else {
			System.out.println("Debe recuperar:   "+ promedio);
		}
	}}

public static void imprimirFecha(int dia, int mes, int anio) {
		if(mes==1) {
			System.out.println(dia + " de " + "Enero " + "de " + anio);
		} else if(mes==2) {
			System.out.println(dia + " de " + "Febrero " + "de " + anio);
		}else if(mes==3) {
			System.out.println(dia + " de " + "Marzo " + "de " + anio);
		}else if(mes==4) {
			System.out.println(dia + " de " + "Abril " + "de " + anio);
		}else if(mes==5) {
			System.out.println(dia + " de " + "mayo " + "de " + anio);
		}
		
		}
public static int sumatoria(int n) {
	int suma = 0;
	for(int x=0;x <= n;x++){
		suma = suma + x;
	}
	System.out.println("La suma es: " + suma);
	return 0;
}
public static int sumatoriaPares(int n1) {
	int suma2 = 0;
	for(int i=0;i<=n1;i++) {
		if(i%2==0) {
			suma2 = suma2 + i;
		}
	}
	System.out.println("La suma es: " + suma2);
	return 0;
}
}
