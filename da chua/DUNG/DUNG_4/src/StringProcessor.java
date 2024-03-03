
public class StringProcessor {
    
    public static boolean match_student_id(String s) {
      return s.matches("(?i)(se|he|qe)\\d{4,6}");
      
//    String lowerCaseStr = s.toLowerCase();
//    if (lowerCaseStr.startsWith("se") || lowerCaseStr.startsWith("he") || lowerCaseStr.startsWith("qe")) {
//        String digitsStr = lowerCaseStr.substring(2);
//        if (digitsStr.matches("\\d+") && digitsStr.length() >= 4 && digitsStr.length() <= 6) {
//            return true;
//        }
//    }
//    return false;
}
    public static String format_camel(String s){
        String[] str = s.toLowerCase().split("_+");
        for (int i = 1; i < str.length; i++) {
            str[i] = Character.toUpperCase(str[i].charAt(0))+str[i].substring(1) ;
        }
        return String.join("", str);
    }
    
}
