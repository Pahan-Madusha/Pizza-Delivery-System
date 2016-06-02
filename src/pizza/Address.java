/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*********Edited blockorhousenumber data type***********/

package pizza;


public class Address {
   private String street;
   private String crossroad;
   private String blockOrHouseNUmber;
   private String ladmark;
   
   public void setStreet(String street){
       this.street=street;
   }
   public void setBlockOrHouseNUmber(String blockOrHouseNUmber){
       this.blockOrHouseNUmber=blockOrHouseNUmber;
   }
   public void setCrossroad(String crossroad){
       this.crossroad=crossroad;
   }
   public void setLandmark(String landmaark){
       this.ladmark=landmaark;
   }
   
     public String getStreet(){
       return this.street;
   }
   public String getBlockOrHouseNumber(){
       return this.blockOrHouseNUmber;
   }
   public String getCrossroad(){
       return this.crossroad;
   }
   public String getLandmark(){
       return this.ladmark;
   }
}
