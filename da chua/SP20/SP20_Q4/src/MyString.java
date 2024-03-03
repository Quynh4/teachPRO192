
public class MyString implements IString{
    @Override
    public int f1(String string) {
        char[] a = string.toCharArray();
        int sum = 0;
        for(int i = 0; i < a.length;i++){
            if(Character.isDigit(a[i]) && (a[i]-'0') % 2 == 0)
                sum+= a[i]-'0';
        }
        return sum;
    }
    
    @Override
    public String f2(String string) {
        char[] a = string.toCharArray();
        String result = "";
        for(int i = 0; i < a.length;i++){
            if(Character.isDigit(a[i])){
                if(Character.isDigit(a[i]) && (a[i]-'0') % 2 == 0)
                    continue;
            }
            result += a[i];
        }      
        return result;
    }   
}
