public class StringBrojZadBr9 {
	public static void main(String[] args) {
		String str = "  Recenica koju  mi provjeravano,sa zarezom koji zaza!";
		int redniBrojKojiTrazimo = 4;
		System.out.println("To je rijec: " + izvadiRijec(str, redniBrojKojiTrazimo));

	}

	private static String izvadiRijec(String recenica, int redniBrojKojiTrazimo)  {
	
		String trazenaRijec = "";
		int trenutnaRijec = 0;
		int trenutniIndex = 0;
		while (trenutnaRijec < redniBrojKojiTrazimo) {
			if (recenica.charAt(trenutniIndex)!=' '){
				if(trenutniIndex==0) {
					trenutnaRijec++;
					
				}else{
					if(recenica.charAt(trenutniIndex - 1)== ' ') {
						trenutnaRijec++;
						
					}
				}
			}
				trenutniIndex++;
		}
		trenutniIndex--;
		while (recenica.charAt(trenutniIndex) !=' ') {
			trazenaRijec += recenica.charAt(trenutniIndex);
			trenutniIndex++;
			
		}
		return trazenaRijec;
	}
}
