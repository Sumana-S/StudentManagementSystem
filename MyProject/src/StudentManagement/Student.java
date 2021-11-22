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
class Student {
    private int age;
    private String susn,sname,dob,state,city;
    public Student(String susn, String sname,int age, String dob, String state, String city)
    {
        this.susn=susn;
        this.sname=sname;
        this.age=age;
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
    public int getage(){
        return age;
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
