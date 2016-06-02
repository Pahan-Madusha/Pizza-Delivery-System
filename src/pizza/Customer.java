

/*****changed tital to title******/
package pizza;

/**
 *
 * @author chalaka
 */
public class Customer extends Address{
    /*public enum Tital{
        Mr,Miss,Ms,Dr
    }
    
     public enum Badge{
        Glod,Silver,Platinum
    }*/
     
private String   title; 
private String  name;
private int     callingNumber;
private int     regulerPhoneNumber;
private String   badge;

public void setTital(String tital){
    this.title=title;
}
public void setName(String name){
    this.name=name;
}
public void setCallingNumber(int callingNumber){
    this.callingNumber=callingNumber;
}
public void setRegulerPhoneNumber(int regulerPhoneNumber){
    this.regulerPhoneNumber=regulerPhoneNumber;
}
public void setBadge(String badge){
    this.badge=badge;
}


public String getTitle(){
    return this.title;
}
public String getName(){
    return this.name;
}
public int getCallingNumber(){
    return this.callingNumber;
}
public int getRegulerPhoneNumber(){
    return this.regulerPhoneNumber;
}

    public String getBadge(){
    return this.badge;
}
    
}

