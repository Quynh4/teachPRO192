
/**
 *
 * @author nofom
 */
public interface VNRemote{
//    public int x;
    final int MAXofButtons = 20;// constant
    int price = 10;// variable must be initialized //public final static 

    public static void setTimer(int number) {
        System.out.println("shut down after " + number + " seconds");
    }

    public abstract void onDevice();//no body

    abstract void offDevice( );//no body

    default void setLock() {
        System.out.println("set lock in the default method");
    }
}
