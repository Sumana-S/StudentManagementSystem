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
class Marks {
     private int internal1,internal2,internal3,quiz1,quiz2,assignment;
    private String susn,sname,total,result;
    public Marks(String susn, String sname,int internal1,int internal2, int internal3, int quiz1, int quiz2, int assignment, String total, String result)
    {
        this.susn=susn;
        this.sname=sname;
        this.internal1=internal1;
        this.internal2=internal2;
        this.internal3=internal3;
        this.quiz1=quiz1;
        this.quiz2=quiz2;
        this.assignment=assignment;
        this.total=total;
        this.result=result;
    }       

    
    public String getsusn(){
        return susn;
    }
    public String getsname(){
        return sname;
    }
    public int getinternal1(){
        return internal1;
    }
    public int getinternal2(){
        return internal2;
    }
     public int getinternal3(){
        return internal3;
    }
      public int getquiz1(){
        return quiz1;
    }
      public int getquiz2(){
        return quiz2;
    }
      public int getassignment(){
        return assignment;
    }
     public String gettotal(){
       return total;
    }
      public String getres(){
       return result;
    }

    
}
