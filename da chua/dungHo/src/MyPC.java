
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MyPC implements IPC, IString{

    @Override
    public int count1(List<PC> list, String m) {
//count how many PCs in the list t which have a model equal to m (ignoring case sensitivity)
    int cnt=0;
    for (PC pc:list){
        if (pc.getModel().equalsIgnoreCase(m)) cnt++;
    }
    return cnt;
    }
@Override
    public int count2(List<PC> t, double p) {
//  count how many PCs in the list t which have a price = p
    int cnt=0;
    for (PC pc:t){
        if (pc.getPrice() == p) cnt++;
    }
    return cnt;
    }
    
    @Override
    public int count3(List<PC> t, double r) {
// count how many PCs in the list t which have a rate= r 
    int cnt=0;
    for (PC pc:t){
        if (pc.getRate() == r) cnt++;
    }
    return cnt;
    }

    @Override
    public List<PC> sublist(List<PC> t, String m) {
//returns a sublist of List t where PC has a model equal to m (ignoring case sensitivity)
    List<PC> result = new ArrayList<PC>();
    for (PC pc : t) {
        if (pc.getModel().equalsIgnoreCase(m)) {
            result.add(pc);
        }
    }
    return result;
}
//find the first PC in the list t has maximum price and model equal DELL.            
    public PC find1(List<PC> t) {
    double maxPrice = Double.NEGATIVE_INFINITY;
    PC result = null;
    for (PC pc : t) {
        if (pc.getModel().equalsIgnoreCase("DELL")) {
            if (pc.getPrice() > maxPrice) {
                maxPrice = pc.getPrice();
                result = pc;
            }
        }
    }
    return result;
}
    @Override
    public PC find2(List<PC> t) {
// find the last PC in the list t has maximum price and model equal DELL (ignoring case sensitivity).
    double maxPrice = Double.NEGATIVE_INFINITY;
    PC result = null;
    Collections.reverse(t);
    for (PC pc : t) {
        if (pc.getModel().equalsIgnoreCase("DELL")) {
            if (pc.getPrice() >= maxPrice) {
                maxPrice = pc.getPrice();
                result = pc;
            }
        }    
    }
    return result;
    }
    
    public List<PC> find3(List<PC> t) {
// find the all PC in the list t has minimum rate and model equal DELL (ignoring case sensitivity).
    double minRate = Double.POSITIVE_INFINITY;
    List<PC> lst = new ArrayList<>();
    for (PC pc : t) {
        if (pc.getModel().equalsIgnoreCase("DELL")) {
            if (pc.getRate()< minRate) {
                minRate = pc.getRate();
            }
        }    
    }
    for (PC pc : t) {
        if (pc.getModel().equalsIgnoreCase("DELL")) {
            if (pc.getRate()== minRate) {
                lst.add(pc);
            }
        }    
    }
    return lst;
    }
    
    public List<PC> find4(List<PC> t) {
//find the all PC in the list t has maximum rate and model equal DELL (ignoring case sensitivity).           
    double maxRate = Double.NEGATIVE_INFINITY;
    List<PC> lst = new ArrayList<>();
    for (PC pc : t) {
        if (pc.getModel().equalsIgnoreCase("DELL")) {
            if (pc.getRate() < maxRate) {
                maxRate = pc.getRate();
            }
        }    
    }
    for (PC pc : t) {
        if (pc.getModel().equalsIgnoreCase("DELL")) {
            if (pc.getRate() == maxRate) {
                lst.add(pc);
            }
        }
    }
    return lst;
    }
    
    @Override
//remove all PCs with model equal to m (ignoring case sensitivity)
    public void remove1(List<PC> t, String m) {
        for (int i = 0; i < t.size(); i++) {
            if(t.get(i).getModel().equalsIgnoreCase(m)) t.remove(t.get(i));
        }
    }
    
    @Override
    public void remove1(List<PC> t, String m, double r) {
// Remove all the PC which have model equal m, rate = r  
        for (int i = 0; i < t.size(); i++) {
            PC pc = t.get(i);
            if (pc.getModel().equalsIgnoreCase(m) && pc.getRate() == r)
            t.remove(pc);
        }
    }

    @Override
    public void remove1(List<PC> t, String m, double r, double p) {
// Remove all the PC which have model equal m, rate = r and price = p.
    for (int i = 0; i < t.size(); i++) {
            PC pc = t.get(i);
        if (pc.getModel().equalsIgnoreCase(m)
                && pc.getRate() == r
                && pc.getPrice() == p)
            t.remove(pc);
    }
 }    
    @Override
//return the number of character x in String s
    public int countChar(String s, char x) {
    int cnt =0;
    for (char c: s.toCharArray()){
        if (c == 'x') cnt++;
}   
    return cnt;}
    
    @Override
    /* Chuan hoa
        Each word is separated by only 1 space
        no spaces before the dot or comma.
        There must be a space after a dot or comma.
        The character after the dot must be capitalized. */
        
    public String normalization(String s) {
    s = s.toLowerCase().replace(".", ". ").replace(",", ", ").replaceAll("\\s+", " ");
    s = s.replace(" .", ".").replace(" ,", ",");
    char[] a = s.toCharArray();
    for (int i = 2; i < a.length; i++) {
        if (a[i - 1] == ' ' && a[i - 2] == '.') {
            a[i] = Character.toUpperCase(a[i]);
        }
    }
    s = new String(a);
    return s.trim();
}

    
// repalce all longest words in s by x
    @Override
    public String replace1(String s, char x) {
    String[] words = s.split("\\s+");
    int maxLength = 0;
    for (String word : words) {
        if (word.length() > maxLength) {
            maxLength = word.length();
        }
    }
    StringBuilder sb = new StringBuilder();
    for (String word : words) {
        if (word.length() == maxLength) {
            sb.append("x");
        } else {
            sb.append(word);
        }
        sb.append(" ");
    }
    return sb.toString().trim();
}

    @Override
 // repalce all palidrom words by x
    public String replace2(String s, char x) {
    String[] words = s.split("\\s+"); // split string into words
    StringBuilder sb = new StringBuilder();
    for (String word : words) {
        // check if word is a palindrome
        if (isPalindrome(word)) {
            sb.append(x); // replace palindrome with 'x'
        } else {
            sb.append(word);
        }
        sb.append(" "); // add space after each word
    }
    return sb.toString().trim(); // trim trailing space and return result
}

private boolean isPalindrome(String s) {
    int left = 0;
    int right = s.length() - 1;
    while (left < right) {
        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }
        left++;
        right--;
    }
    return true;
}


    @Override
// replace all shortest word in s by x
    public String replace3(String s, char x) {
    String[] words = s.split(" ");
    int shortestLength = Integer.MAX_VALUE;
    for (String word : words) {
        int length = word.length();
        if (length < shortestLength) {
            shortestLength = length;
        }
    }
    for (int i = 0; i < words.length; i++) {
        if (words[i].length() == shortestLength) {
            words[i] = String.valueOf(x);
        }
    }
    return String.join(" ", words);
}

    @Override
    public String replace4(String s, char x) {
    String[] words = s.split(" ");
    int longestLength = 0;
    int lastIndex = -1;
    for (int i = 0; i < words.length; i++) {
        int length = words[i].length();
        if (length >= longestLength) {
            longestLength = length;
            lastIndex = i;
        }
    }
    if (lastIndex >= 0) {
        words[lastIndex] = String.valueOf(x);
    }
    return String.join(" ", words);
}

    @Override
//      Returns the first position of substring sub in string s. if sub is not in s, return -1
    public int find(String sub, String s) {
    return s.indexOf(sub);
}

    @Override
    public List<PC> find3(List<PC> var1, String var2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PC> find4(List<PC> var1, String var2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double average(List<PC> var1, String var2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}