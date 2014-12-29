public class KrugKvadratVajak {
	public static void main(String[] args) {
		int broj = 5;
		int Pkvadrata = broj * broj;
		System.out.println("Povrsina kvadrata je " + Pkvadrata);
		double Pkruga = broj * broj * Math.PI;
		System.out.println("Povrsina kruga je " + Pkruga);
		double KrugUKvadrat = (int) (Pkruga / Pkvadrata);
		System.out.println("Kvadrat stane " + (int) KrugUKvadrat + " puta u krug.");
		double pocetniBroj = 0.5;
		double maxBroj = 36.7;
		double H = (double) (pocetniBroj + (Math.random() * (maxBroj - pocetniBroj + 1)));
		double Zvaljka = (double) (broj * broj * Math.PI * H);
		System.out.println("Zapremina valjka je " + Zvaljka);
	   
	   
}
}
