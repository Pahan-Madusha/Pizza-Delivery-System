/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza;

/**
 *
 * @author chalaka
 */
public class Item 
{
    private float price;
    private String code;
    private int quantity;
    private String remark;
    /**setter*/
    public void setprice(float p)
    {
        this.price = p;
    }
    
    public void setcode(String s)
    {
        this.code = s;
    }
    
    public void setremark(String s)
    {
        this.remark = s;
    }
    
    public void setquantity(int q)
    {
        this.quantity = q;
    }
    
    
    /*getters*/
    public float getprice()
    {
        return this.price;
    }
    
    public String getcode()
    {
        return this.code;
    }
    
    public String getremark()
    {
        return this.remark;
    }
    
    public int getquantity()
    {
        return this.quantity;
    }
}
