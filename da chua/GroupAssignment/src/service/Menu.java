/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;
import java.util.*;
/**
 *
 * @author thail
 */
public class Menu {
    public int int_getChoice(ArrayList<Object> options) {
        Scanner scanner = new Scanner(System.in);
        int response;
        int N = options.size();

        for (int i = 0; i < N; i++) {
            System.out.println((i + 1) + ". " + options.get(i));
        }

        do {
            System.out.print("Please choose an option (1-" + N + "): ");
            response = scanner.nextInt();
            scanner.nextLine();
        } 
        while (response < 1 || response > N);

        return response;
    }
    public Object ref_getChoice(ArrayList<Object> options) {
        int response;

        do {
            response = int_getChoice(options);
        } 
        while (response < 1 || response > options.size());

        return options.get(response - 1);
    }
    
}
