/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dormitory;

import Models.Beans.GuardianBean;
import Models.Beans.TenantBean;
import Models.DAOImplementation.GuardianDAOImplementation;
import Models.DAOImplementation.TenantDAOImplementation;
import Models.DAOInterface.GuardianDAOInterface;
import Models.DAOInterface.TenantDAOInterface;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 *
 * @author User
 */
public class Dormitory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //double number = 09166267392;
           
        Long number;
        number = 639166267392L;
        
        //BigInteger number = new BigInteger("639166267392");
        TenantBean tenant1 = new TenantBean();
        //    tenant1.setTenantID(10);
            tenant1.setAddress("2 Torre Lorenzo Taft Ave. Manila");
            tenant1.setContact(number);
            tenant1.setDegree("Computer Science Major in Computer Systems Engineering");
            tenant1.setExpectedyearofgrad(2016);
            tenant1.setFname("Jude Michael");
            tenant1.setGender("Male");
            tenant1.setLname("Teves");
            tenant1.setSchool("De La Salle University");
            tenant1.setStatus("true");
            
            TenantDAOInterface tdao = new TenantDAOImplementation();
            tdao.addTenant(tenant1);
       //     tdao.editTenant(tenant1, "Fname1", "Lname");
         
            GuardianBean guardian1 = new GuardianBean();
            guardian1.setContact(number);
            guardian1.setFname("Sherlock");
            guardian1.setLname("Holmes");
       //     guardian1.setGuardianID(67);
            
            GuardianDAOInterface gdao = new GuardianDAOImplementation();
            gdao.addGuardian(guardian1);
            
    }
    
}
