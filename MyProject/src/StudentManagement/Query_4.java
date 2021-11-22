/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentManagement;

/**
 *
 * @author Sumantha S
 */
public class Query_4 {
    private String susn,sname,dob,state,city;
    public Query_4(String susn, String sname, String dob, String state, String city)
    {
        this.susn=susn;
        this.sname=sname;
        
        this.dob=dob;
        this.state=state;
        this.city=city;
    }       
    public String getsusn(){
        return susn;
    }
    public String getsname(){
        return sname;
    }
    
    public String getdob(){
        return dob;
    }
     public String getstate(){
        return state;
    }
      public String getcity(){
        return city;
    }
}
