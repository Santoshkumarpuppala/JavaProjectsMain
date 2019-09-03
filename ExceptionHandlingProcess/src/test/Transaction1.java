package test;

public interface Transaction1 {
	public static final Balance b1 = new Balance();
	public abstract void process(double amt) throws WithDraw;
	
}
