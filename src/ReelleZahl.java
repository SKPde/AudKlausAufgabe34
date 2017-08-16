
public class ReelleZahl extends Zahl implements Comparable {
	
	private double value;
	
	public ReelleZahl(double v) {
		value = v;
	}

	@Override
	public int compareTo(Object o) {
		ReelleZahl temp = (ReelleZahl) o;
		if(this.value > temp.value) {
			return 1;
		} else if (this.value < temp.value) {
			return -1;
		}
		return 0;
	}

	@Override
	public Zahl sub(Zahl zahl) {
		ReelleZahl temp = (ReelleZahl) zahl;
		return new ReelleZahl(this.value - temp.value);
	}
	
	public String toString() {
		return "" + value;
	}

}
