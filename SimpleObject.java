/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleobject;

/**
 *
 * @author visiness
 */
public class SimpleObject {

  public static void main(String[] args){
        Address a1 = new Address("103 Borough Road", "London", "SE1 0AA");
        System.out.println(a1);
        Location l1 = new Location("London", 51.528308, -0.3817765);
        Location l2 = new Location("Paris", 48.8587741, 2.2069771);
        Location l3 = new Location("Paris", 48.8587741, 2.2069771);
        Location l4 = l1;
        Location l5 = l2;
        Location l6 = l5;
        System.out.println(l1==l2);
        System.out.println(l1==l4);
        System.out.println(l2==l6);
        System.out.println(l2==l3);
  
    }
}