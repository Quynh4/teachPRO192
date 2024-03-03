public class Eagle {
  private String type;
  private int quantity;

  public Eagle() {
    type = "";
    quantity = 0;
  }

  public Eagle(String type, int quantity) {
    this.type = type;
    this.quantity = quantity;
  }

  public String getType() {
    return type.charAt(0) + "" + type.charAt(2);
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }
}
