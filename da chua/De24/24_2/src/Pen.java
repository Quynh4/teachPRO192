public class Pen {
  private String name;
  private String color;

  public Pen() {
    name = "";
    color = "";
  }

  public Pen(String name, String color) {
    this.name = name;
    this.color = color;
  }

  public String getName() {
    return name;
  }

  public String getColor() {
    return color;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String toString() {
    return name + ", " + color;
  }
}


