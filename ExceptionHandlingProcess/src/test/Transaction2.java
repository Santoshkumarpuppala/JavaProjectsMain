package test;
public interface Transaction2 {
	public static final Balance b1 = new Balance();
	public abstract void process(double amt) throws Exception;

}
