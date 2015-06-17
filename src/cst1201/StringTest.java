/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cst1201;

/**
 *
 * @author rkhatchadourian
 */
public class StringTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s = "Literal value";
        String t = s;
        
        System.out.println("Initial values:");
        System.out.println("The value of s: " + s);
        System.out.println("The value of t: " + t);
        
        //this should not change t.
//        s.append(" hello");

        System.out.println("New values:");
        System.out.println("The value of s: " + s);
        System.out.println("The value of t: " + t);
        
        char secondCharacterOfS = s.charAt(1);
        System.out.println("Second character of s: " + secondCharacterOfS); //should be 'i'.
        System.out.println(s.concat(t));
        System.out.println(s + t);
        System.out.println("Does s equal t? " + s.equals(t));
        System.out.println("Does s equal t? " + s == t);
        
        String anotherString = "hello";
        int indexOfLL = anotherString.indexOf("ll");
        System.out.println("The index of \"ll\" in anotherString is: " + indexOfLL);
        
        int indexOfJello = anotherString.indexOf("jello");
        System.out.println("The index of \"jello\" in anotherString is: " + indexOfJello);
        
        anotherString = anotherString.replace('h', 'j');
        indexOfJello = anotherString.indexOf("jello");
        System.out.println("The index of \"jello\" in anotherString is: " + indexOfJello);
        
        System.out.println("anotherString in caps is: " + anotherString.toUpperCase());
    }
    
}
