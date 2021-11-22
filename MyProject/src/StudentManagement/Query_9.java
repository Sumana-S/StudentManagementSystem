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
public class Query_9 {
    private String susn,sname,state;
    public Query_9(String susn,String sname,String state)
    {
        this.susn=susn;
        this.sname=sname;
        this.state=state;
        
    }       

   
    public String getsusn(){
        return susn;
    }
    
    public String getsname(){
        return sname;
    }
    public String getstate(){
        return state;
    }
    
}
