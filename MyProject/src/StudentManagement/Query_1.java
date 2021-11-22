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
class Query_1 {
    private String susn,sname,total;
    public Query_1(String susn, String sname, String total)
    {
        this.susn=susn;
        this.sname=sname;
        this.total=total;
       
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
     
}
