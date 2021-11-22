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
public class Query_5 {
    private String susn,sname,total,result;
    public Query_5(String susn, String sname, String total, String result)
    {
        this.susn=susn;
        this.sname=sname;
        this.total=total;
        this.result=result;
       
    }       

    

    

    
    public String getsusn(){
        return susn;
    }
    public String getsname(){
        return sname;
    }
   
     public String gettotal(){
       return total;
    }
     public String getres(){
       return result;
    }
}
