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
class Subject {
     
    private String SubjectCode,SubjectName;
    public Subject(String SubjectCode, String SubjectName)
    {
        this.SubjectCode=SubjectCode;
        this.SubjectName=SubjectName;
        
    }       
    public String getSubjectCode(){
        return SubjectCode;
    }
    public String getSubjectName(){
        return SubjectName;
    }
    
    
}
