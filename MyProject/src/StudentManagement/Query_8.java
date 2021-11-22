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
class Query_8 {

    private String susn,subjectCode,total,result;
    public Query_8(String susn,String subjectCode,String total,String result)
    {
        this.susn=susn;
        this.subjectCode=subjectCode;
        this.total=total;
        this.result=result;
    }       

   
    public String getsusn(){
        return susn;
    }
    
    public String getsubjectCode(){
        return subjectCode;
    }
    public String gettotal(){
        return total;
    }
    public String getresult(){
        return result;
    }
    
}
