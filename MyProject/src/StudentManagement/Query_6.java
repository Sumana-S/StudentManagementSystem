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
public class Query_6 {
    private String susn,SubjectCode;
    public Query_6(String susn,String SubjectCode)
    {
        this.susn=susn;
        this.SubjectCode=SubjectCode;
    }       

   
    public String getsusn(){
        return susn;
    }
    
    public String getSubjectCode(){
        return SubjectCode;
    }
}
