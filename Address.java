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
public class Address {
      private String addressLine1;
        private String addressLine2;
        private String addressLine3;
        private String addressLine4;
        private String postcode;

        /**
         *
         * @param addressLine1
         * @param addressLine2
         * @param addressLine3
         * @param addressLine4
         */
        public Address(String addressLine1, String addressLine2, String addressLine3, String addressLine4) {
            this.addressLine1 = addressLine1;
            this.addressLine2 = addressLine2;
            this.addressLine3 = addressLine3;
            this.addressLine4 = addressLine4;
            this.postcode = "";
        }




        public Address(String addressLine1, String addressLine2, String postcode) {
            this.addressLine1 = addressLine1;
            this.addressLine2 = addressLine2;
            this.addressLine3 = "";
            this.addressLine4 = "";
            this.postcode = postcode;
        }
    

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        String s = "";
        if (this.addressLine1.length() > 0) {
            s = s + this.addressLine1 + "\n";
        }
        if (this.addressLine2.length() > 0) {
            s = s + this.addressLine2 + "\n";
        }
        if (this.addressLine3.length() > 0) {
            s = s + this.addressLine3 + "\n";
        }
        if (this.addressLine4.length() > 0) {
            s = s + this.addressLine4 + "\n";
        }
        if (this.postcode.length() > 0) {
            s = s + this.postcode + "\n";
        }
        return s;

     }

}