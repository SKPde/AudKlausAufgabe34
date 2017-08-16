
public class ReellerAlg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReelleZahl x = new ReelleZahl(0.2);
		ReelleZahl y = new ReelleZahl(5.0);
		
		while(y.compareTo(new ReelleZahl(0)) > 0) {
			y = (ReelleZahl) y.sub(x);
			System.out.println(y);
		}
		
		if(!y.equals(new ReelleZahl(0))) {
			System.out.println("Rundungsfehler");
		}
	}

}
