public class MyString implements IString {

    @Override
    public int f1(String string){
        int res = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isDigit(string.charAt(i)))   
                res += string.charAt(i) - '0'; 
        }
        return res;
    }
    @Override
    public String f2(String string) {
        String res = "";
        for (int i = 0; i < string.length(); i++) {
            if (Character.isDigit(string.charAt(i))
                && Character.getNumericValue(string.charAt(i)) <= 8)
                res += Character.getNumericValue(string.charAt(i)) + 1;
            else res += string.charAt(i);
        }       
        return res;
    }
}
