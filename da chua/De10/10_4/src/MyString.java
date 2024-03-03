
public class MyString implements IString{

    @Override
    public int sum(String string) {
        char[] a = string.toCharArray();
        int sum = 0;
        for(int i = 0; i < a.length;i++){
            if(Character.isDigit(a[i]) && (a[i]-'0') % 2 == 0)
                sum+= a[i]-'0';
        }
        return sum;
    }


    @Override
    public String getCode(String string) {
        StringBuilder x = new StringBuilder();
        char[] a = string.toCharArray();
        for(int i = 0; i < a.length;i++){
            if(Character.isDigit(a[i]) || Character.isUpperCase(a[i]))
                x.append(a[i]);
        }
        return x.toString();
    }

   
}
