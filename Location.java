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
public class Location {

    private String name;
    private double latitude;
    private double longitude;

    public Location(String name, double latitude, double longitude) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;

    }

    public String getName() {
        return this.name;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public boolean isNorthernHemisphere() {
        return this.latitude >= 0;
    }
    
 // public double toString(){
    // double a="";
   
     //  if (this.addressLine1.length() > 0) {
      //     a=this.name;
      //}         }
  // public toString(){
      // return this.name;
      // return this.latitude;
       //return this.longitude;
   //}
   //   String b= "";
      
    // if (this.name.length()>0){
      //  b=b+ this.name + " "+"(" + this.latitude + "," +" "+  +this.longitude + ")";
     // }
     // if (this.latitude.length() > 0){
     //   b=b+ ;
    //  }
       //if (this.longitude.length() > 0){
      //b=b+;
       //}
     //  return b;
    //  }


   
  
}
