/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderpackage;

/**
 *
 * @author palonsovazquez
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Employee emp = new EmployeeBuilder("Jose", 154894643).setNewBirthDate(15).setNewBirthMonth(4).setNewBirthYear(1980).setNewLastName("Rodriguez").setNewMiddleName("Luis").createEmployee();
        
       Employee emp2;
       EmployeeBuilder  empBui = new EmployeeBuilder("Juan", 8494651);
       empBui.setNewLastName("Alonso");
       empBui.setNewHireDate(15);
       
       emp2 = empBui.createEmployee();
    }
    
}
