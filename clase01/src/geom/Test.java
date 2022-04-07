package geom;

/* A trav�s de este c�digo se generan 3 TAD, 1 por cada point3D, y uno por el line */

public class Test {
	
	public static void main(String[] args) {
		
		Point3D p1 = new Point3D(1, 2, 3);
		
		Point3D p2 = new Point3D(4, 5, 6);
		
		System.out.println("Punto 1: " + p1.getX() + ", " + p1.getY() + ", " + p1.getZ());
		System.out.println("Punto 2: " + p2.getX() + ", " + p2.getY() + ", " + p2.getZ());
		System.out.println("Distancia entre los puntos: " + p1.distance(p2));
		
		Line3D l1 = new Line3D(p1, p2);
		
		System.out.println("Longitud de la l�nea: " + l1.lenght());
		
	}

}
