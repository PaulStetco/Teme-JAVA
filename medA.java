 import java.util.*;
 import javax.swing.JOptionPane;

public class medA 
{ 
    public static void main(String[] arg)
    {
        int i, numarIntrodus, number;
        float medie, suma=0;

        numarIntrodus=Integer.parseInt (JOptionPane.showInputDialog(null,"Cate numere sa contina media aritmetica ? "));
            JOptionPane.showMessageDialog(null, "Introduceti numerele in urmatorul pop-up.\n");       
        
        for(i=1; i<=numarIntrodus; i++){
            number =Integer.parseInt(JOptionPane.showInputDialog("Introduceti numarul "+i));
            suma= suma + number;
        }
		
        medie = suma / numarIntrodus;
		
        JOptionPane.showMessageDialog(null,"Media aritmetica a numerelor alese este = " +medie);
    }
} 