/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza;

import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author chalaka
 */
public class Order extends Customer
{
    private double total;
    private String payment_method; // 1- cash,  2- visa/master  3-amex
    private ArrayList item_list = new ArrayList();
    private Date date = new Date(new java.util.Date().getTime());
    private int reg_no;
    
    /*Setters*/
    public void setTotal(double total)
    {
        this.total = total;
    }
    
    public void setPayMethod(String s)
    {
        this.payment_method = s;
    }

    public void add_to_list(Item a)
    {
        this.item_list.add(a);
    }
    
    public void setreg_no(int n)
    {
        this.reg_no = n;
    }
   
   /*getters*/ 
    public double getTotal()
    {
        return this.total;
    }
    
    public String getPayMethod()
    {
        return this.payment_method;
    }
   
    public Object getItem(int index)
    {
        return this.item_list.get(index);
    }
    
    public Date getdate()
    {
        return this.date;
    }
    
    public int getlist_size()
    {
        return this.item_list.size();
    }
    
    public int getreg_no()
    {
        return this.reg_no;
    }        
}
