
public class Student {
    String code;
    String name;
    int mark;

    public Student(String code, String name, int mark) {
        this.code = code;
        this.name = name;
        this.mark = mark;
    }

    public Student() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name.trim().toUpperCase();
        if(name.length()>0) this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        if(mark>=0 && mark<=10) this.mark = mark;
    }

    @Override
    public String toString() {
        return code + ", " + name + ", " + mark;
    }

}
