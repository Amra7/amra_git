public class SimulacijaKockica {
	public static void main(String[] args) {
		double kockica1 = (int) (1 + Math.random() * 6);
		System.out.println("kockica1 "+ kockica1);
		double kockica2 = (int) (1 + Math.random() * 6);
		System.out.println("kockica2 " +kockica2);
		double suma = kockica1 + kockica2;
		System.out.println("Zbir dvijek kockice je:" + suma);

	}
}
