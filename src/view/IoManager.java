package view;

import javax.swing.JOptionPane;

public class IoManager {
    
  
    public String readString(String message){
        return (JOptionPane.showInputDialog(null, message));
    }
    
    public int readInt(String message){
        int valueInt;
        String value = JOptionPane.showInputDialog(null, message);
        valueInt = Integer.parseInt(value);
        return valueInt;
        
    }
    
    public int readMenu(){
        String menuText = "1. Ingresar\n"
                + "2. Atender\n"
                + "3. Ultimo\n"
                + "4. Proximo\n"
                + "5. Tamanio\n"
                + "6. Imprimir\n"
                + "7. Salir\n";
        return readInt(menuText);
    }
    public double readDouble(String message){
        double valueDouble; 
        String value = JOptionPane.showInputDialog(null, message);
        valueDouble = Double.parseDouble(value);
        return valueDouble;
    }
    
    public void showMessage(String message){
        JOptionPane.showMessageDialog(null, message);
    }
    
    public void showErrorMessage(String message){
        JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
    }
}
