
public class Main {

    public static void main(String[] args) {
        VNRemote remote = new Television();
        remote.setLock();
        remote.onDevice();
        remote.offDevice();
        
        VNRemote.setTimer(10000);
        
        System.out.println("TV remote's price:" + remote.price);
        System.out.println("TV Remote has: " + remote.MAXofButtons + "buttons");
    }

}
