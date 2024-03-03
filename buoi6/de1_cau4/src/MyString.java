
public class MyString implements IString {

    @Override
    public int f1(String str) {
        int count = 0;
        String[] a = new String[100];
        a = str.split("[ ]+");
        for (int i = 0; i < a.length; i++) {
            if(a[i].toLowerCase().endsWith("m") || a[i].toLowerCase().endsWith("n")){
                count++;
            }
        }
        return count;
    }

    @Override
    public String f2(String str) {
        String[] a = new String[100];
        a = str.split("[ ]+");
        int maxLength = a[0].length();
        int index = 0;
        for (int i = 1; i < a.length; i++) {
            if(a[i].length() > maxLength){
                maxLength = a[i].length();
                index = i;
            }
        }
        
        String rev = "";
        char[] kytu = a[index].toCharArray();
        
        for (int i = kytu.length - 1; i >= 0; i--) {
            rev += kytu[i];
        }
       
        String result = "";
        for (int i = 0; i < a.length; i++) {
            if(i == index){
                result += " " + rev;
            }
            else{
                result += " " +a[i];
            }
        }
        return result.trim();
    }
}
