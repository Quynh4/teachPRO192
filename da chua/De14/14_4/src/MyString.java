
public class MyString implements IString{

    @Override
    public int sum(String s) {
        int sum=0;
        String []str = s.split("\\s+");
        for(int i=0; i<str.length; i++) {
            if (str[i].matches("\\d+")){
                int num = Integer.parseInt(str[i]);
                sum += sumDigit(num);
                break;
            }
        }
        for(int i= str.length-1; i>=0; i++) {
            if (str[i].matches("\\d+")){
                int num = Integer.parseInt(str[i]);
                sum += sumDigit(num);
                break;
            }
        }
        return sum;
    }
    
    public int sumDigit(int a){
        int s=0;
        while(a!= 0){
            s+= a%10;
            a/=10;
        }
        return s;
    }

    @Override
    public String getCode(String s) {
        int a=0, b=0;
        String []str = s.split("\\s+");
        for(int i=0; i<str.length; i++) {
            if (str[i].matches("\\d+")){
                a=i;
                break;
            }
        }
        for(int i= str.length-1; i>=0; i--) {
            if (str[i].matches("\\d+")){
                b=i;
                break;
            }
        }
        String x = new StringBuilder(str[a]).reverse().toString();
        String y = new StringBuilder(str[b]).reverse().toString();
        return x+" "+y;
    }
}
