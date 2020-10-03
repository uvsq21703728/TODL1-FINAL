
public class Fraction {

private int denom;
private int num;

public Fraction (int denom, int num) {

this.denom = denom;
this.num	= num;
}

public static String toString(Fraction f) {
	String fract = String.valueOf(f.num)+"/"+String.valueOf(f.denom);
	System.out.print(fract);
	return fract;
}
}
