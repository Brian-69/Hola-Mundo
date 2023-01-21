
public class Main {

	public static void main(String[] args) {
		
		Cuadrado c = new Cuadrado(); 
		System.out.println("El lado del cuadrado es: "+c.id);
		System.out.println("El perimetro es: "+c.perimetro);
		System.out.println("El area es: "+c.area);
		System.out.println("La diagonal es: "+c.diagonal);
		
		c.nuevovalor=11;
		
		System.out.println("El nuevo valor es: "+c.nuevovalor);
		
		Circulo cir = new Circulo();
		
		System.out.println("El radio del circulo es: "+cir.id);
		System.out.println("La circunferencia es: "+cir.circunferencia);
		System.out.println("El area del circulo es: "+cir.area);
		cir.nuevovalor=(float) 10;
		
		System.out.println("El nuevo valor es: "+cir.nuevovalor);
		
		

	}

}