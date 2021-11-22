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
public class Query_10 {
     private String susn,sname,SubjectCode,SubjectName;
    public Query_10(String susn,String sname,String SubjectCode,String SubjectName)
    {
        this.susn=susn;
        this.sname=sname;
        this.SubjectCode=SubjectCode;
        this.SubjectName=SubjectName;
    }       

   
    public String getsusn(){
        return susn;
    }
    
    public String getsname(){
        return sname;
    }
    public String getSubjectCode(){
        return SubjectCode;
    }
    public String getSubjectName(){
        return SubjectName;
}
}