public class Flight {
    private String route;
    private int fare;

    public Flight(String route, int fare) {
        this.route = route;
        this.fare = fare;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public int getFare() {
        return fare;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }
    
    public String getDeparture() {
        char[] a  = route.toCharArray();
        int pos =-1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == '-') pos = i;
        }
        return route.substring(0, pos);
    }

    @Override
    public String toString() {
        return route + " " + fare;}
   
}
