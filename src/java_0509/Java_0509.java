
package java_0509;

import javax.swing.JOptionPane;

/**
 *
 * @author Jeverson Nery
 */
public class Java_0509 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String circle = JOptionPane.showInputDialog(null, "Informe o diâmetro de "
                + "um círculo (em metros): ");
        int op1 = Integer.parseInt(circle);
        
        double raio = op1/2;
        double circunferencia = 2*(Math.PI*raio);
        double area = Math.PI*(Math.pow(raio, 2));
        
        JOptionPane.showMessageDialog(null, "Dados do Círculo: \n" + "\n- Raio: \t" + raio +
                "\n- Circunferencia: \t" + circunferencia + "\n- Area: \t" + area);
        
    }
    
}
