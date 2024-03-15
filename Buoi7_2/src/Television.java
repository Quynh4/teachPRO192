
public class Television implements VNRemote{
    @Override
    public void onDevice() {
        System.out.println("on TV");
    }

    @Override
    public void offDevice() {
        System.out.println("off TV");}
}
