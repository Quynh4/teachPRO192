public class MyConvertible implements Convertible{

    @Override
    public double toMile(double x) {
        return x*0.621371;
    }
    @Override
    public String getCode(String rc) {
        String a = "";
        for (int i=0; i< rc.length()/3 -1; i++){
            a += rc.substring(i*3, i*3+3) + "-";
        }
        a+= rc.substring(rc.length()-3,rc.length());
        return a;
    }
}
