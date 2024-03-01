/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nofom
 * 
 * •	Ký tự '-' sẽ tương ứng với phạm vi truy cập private.
•	Ký tự '~' sẽ tương ứng với phạm vi truy cập default.
•	Ký tự '#' sẽ tương ứng với phạm vi truy cập protected.
•	Ký tự '+' sẽ tương ứng với phạm vi truy cập public.

 */
public class Bottle {
    private String maker;
    private int volume;

    public Bottle() {
    }

    public Bottle(String maker, int volume) {
        this.maker = maker;
        this.volume = volume;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
   
}
