package Ex_3;

public class Principal {

	 public static void main(String[] args) {

	        // Retornos
	        System.out.println("Exercício retornos");

	        double areaQuadrado = Quadri.area(3);
	        System.out.println("Área do quadrado:" + areaQuadrado);

	        double areaRetangulo = Quadri.area(5,5);
	        System.out.println("Área do retângulo:" + areaRetangulo);

	        double areaTrapezio = Quadri.area(7,8,9);
	        System.out.println("Área do trapézio:" + areaTrapezio);

	    }
}
