/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exception2;

/**
 *
 * @author พีช
 */
public class LAB7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Main method call method doThis()");
        try {
            doThis();
        } catch (Exception e) {
            System.out.println("Main method receive exception " + e.getMessage());
        }
    }

    public static void doThis() throws Exception {
        System.out.println("Method doThis() call method doThat()");
        doThat();
    }

    public static void doThat() throws Exception {
        throw new MyException("Hello MyException");
    }
    
}
