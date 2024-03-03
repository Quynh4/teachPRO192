public class ReservationCode {
   private String name;
   private String rc;

    public ReservationCode() {
    }

    public ReservationCode(String name, String rc) {
        this.name = name;
        this.rc = rc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRc() {
        return rc;
    }

    public void setRc(String rc) {
        this.rc = rc;
    }
   
    public String getCode() {
        StringBuilder sb = new StringBuilder();
        for (char c : rc.toCharArray()) {
            if(Character.isLetter(c)) {
                if (c == 'z') {
                    sb.append('a');
                } else if (c == 'Z') {
                    sb.append('A');
                } else {
                    sb.append((char)(c + 1));
                }
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
