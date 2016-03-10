
package projektbank;

import control.AdminControl;
import model.Bank;

/**
 *
 * @author Tanja
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bank bank = new Bank();
        AdminControl ac = new AdminControl(bank);
        
    }
    
}
