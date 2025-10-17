package carpetaSaludo;

public class Salida_formateada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Artículo	Precio/caja	Nºcajas");
		System.out.println("---------------------------------------");
		System.out.printf("%-10s	%8.2f	6%d\n",	"manzanas", 4.5, 10);
		System.out.printf("%-10s	%8.2f	6%d\n",	"peras", 2.75, 120);
		System.out.printf("%-10s	%8.2f	6%d\n",	"aguacates", 10.0, 6);

	}

}
