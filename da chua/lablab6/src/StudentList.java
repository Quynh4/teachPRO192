/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
/**
 *
 * @author DELL
 */
public class StudentList extends ArrayList<Student>{

    public StudentList() {
        super();
    }
    
    public Student search(String code){
        code = code.trim().toUpperCase();
        for(int i=0;i<this.size();i++)
            if(this.get(i).getCode().equals(code)) return this.get(i);
        return null;
    }
    
    private boolean isCodeDuplicated(String code){
        code = code.trim().toUpperCase();
        return search(code) != null;
    }
    
    public void addStudent(){
        String newCode, newName;
        int newMark;
//        boolean codeDuplicated = false;
        do{
            newCode = Inputter.inputPattern("St. code s000: ", "[sS][\\d]{3}");
            newCode = newCode.trim().toUpperCase();
//            codeDuplicated = isCodeDuplicated(newCode);
//            if(codeDuplicated) System.out.println("Code is duplicated!");
            if(isCodeDuplicated(newCode)) System.out.println("Code is duplicated!");
        }//while (codeDuplicated == true)
        while(isCodeDuplicated(newCode));
        newName = Inputter.inputNonBlankStr("Name of new student: ");
        newName = newName.toUpperCase();
        newMark = Inputter.inputInt("Mark: ", 0, 10);
        
        Student st = new Student(newCode,newName,newMark);
        this.add(st);
        System.out.println("Student " + newCode + " has been added.");
    }
    
    public void searchStudent(){
        if(this.isEmpty())
            System.out.println("Empty list. No seacrh can be performed.");
        else{
            String sCode = Inputter.inputStr("Input student code for search: ");
            Student st = this.search(sCode);
            if(st==null)
                System.out.println("Student " + sCode + " does not exist.");
            else System.out.println("Found: " + st);
        }
    }
    
    public void updateStudent(){
        if(this.isEmpty()) System.out.println("Empty list. No update can be performed.");
        else{
            String uCode = Inputter.inputStr("Input code of student to update: ");
            Student st = this.search(uCode);
            if(st==null) System.out.println("Student " + uCode + " does not exist.");
            else{
//                String oldName = st.getName();
//                String msg = "Old name: " + oldName + ", newName: ";
//                String newName = Inputter.inputNonBlankStr(msg);
                String newName = Inputter.inputNonBlankStr("Old name: " + st.getName() + ", new name: ");
                st.setName(newName);
                
//                int oldMark = st.getMark();
//                msg = "Old mark" + oldMark + ", new mark (0-10):";
//                int newMark = Inputter.inputInt(msg,0,10);
                int newMark = Inputter.inputInt("Old mark: " + st.getMark() + ", new mark (0-10): ",0,10);
                st.setMark(newMark);
                System.out.println("Student " + uCode + " has been updated.");
            }
        }
    }
    
    public void removeStudent(){
        if(this.isEmpty()) System.out.println("Empty list. No removal can be performed.");
        else{
            String rCode = Inputter.inputStr("Input code of student to remove: ");
            Student st = this.search(rCode);
            if(st==null) System.out.println("Student " + rCode + " does not exist.");
            else{
                this.remove(st);
                System.out.println("Student " + rCode + " has been removed.");
            }
        }
    }
    
    public void printAll(){
        if(this.isEmpty()) System.out.println("Empty list.");
        else{
            System.out.println("Student list:");
            for(Student st:this)
                System.out.println(st);
             System.out.println("Total: " + this.size() + " student(s).");
        }
    }
}
