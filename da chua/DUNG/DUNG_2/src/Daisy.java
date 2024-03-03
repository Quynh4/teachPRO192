
public class Daisy implements Flower{

    @Override
    public int bloom_at(int currHour) {
        return (currHour>=24-5)? currHour + 5-24: currHour+5;
    }

    @Override
    public int fade_at(int currHour) {
    return (currHour>=24-10)? currHour + 10-24: currHour+10;
    }

    @Override
    public int price(int numOfFlower) {
        return Flower.unitPrice*numOfFlower;
    }
    
}
