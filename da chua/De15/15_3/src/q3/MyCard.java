
package q3;

public class MyCard {

    private String cardNumber;
    private String type;

    public MyCard(String type, String cardNumber) {
        if (cardNumber.matches("[A-Za-z]+")) {
            this.cardNumber = cardNumber;
        } else {
            this.cardNumber = "0000";
        }
    
        this.type = type;
    }

    public String getCardCode() {
        if (type.equals("credit")) {
            return this.cardNumber.substring(this.cardNumber.length() - 4);
        } else {
            return this.cardNumber.substring(0, 4);
        }
    }

   

    @Override
    public String toString() {
        return  type+ " "+ cardNumber;}

    

}
