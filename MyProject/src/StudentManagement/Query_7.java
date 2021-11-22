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
class Query_7 {

    private String susn,sname,sectionID;
    public Query_7(String susn,String sname,String sectionID)
    {
        this.susn=susn;
        this.sname=sname;
        this.sectionID=sectionID;
    }       

   
    public String getsusn(){
        return susn;
    }
    
    public String getsname(){
        return sname;
    }
    public String getsectionID(){
        return sectionID;
    }
    
}
