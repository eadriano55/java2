package sistemaadministrativo;

import java.util.Random;

public class Matematica {
		public static void main(String[] args) {
			int i = -10;
			System.out.println(i);
			int j = Math.abs(i);
			System.out.println(j);
			
			double d1 = 4.15;
			System.out.println(d1);
			double d2 = Math.round(d1);
			System.out.println(d2);

			Random gerador = new Random();
	         
	        //imprime sequência de 10 números inteiros aleatórios
	        for (int r = 0; r < 10; r++) {
	            System.out.println(gerador.nextInt());
	        }
			

//			– public static double max(double a, double b)
//			– public static double min(double a, double b)
//			– public static double ceil(double a)
//			– public static double floor(double a)
//			– public static double exp(double a)
//			– public static double log(double a)
//			– public static double pow(double a, double b)
//			– public static long round(double a)
//			– public static double sqrt(double a)
//			– public static double sin(double a)
//			– public static double toDegrees(double angrad)
//			– public static double toRadians(double angdeg)
			
			
		}
	
}
