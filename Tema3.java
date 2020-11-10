
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class GUI {
    public static void main (String[] args) {

JPanel panel = jFrame();
principalButon(panel);
radioButon(panel);
checkBox(panel);

    }
        public static JPanel jFrame() {
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        
        frame.setSize (600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        
        panel.setLayout(null);
        
        JLabel label = new JLabel("Marca");
        JLabel label1 = new JLabel("Model");
        JLabel label2 = new JLabel("Culoare");
        JLabel label3 = new JLabel("CP");
        JLabel label4 = new JLabel ("Nou");
        JLabel label5 = new JLabel ("Scond-Hand");
        JLabel label6 = new JLabel ("Inmatriculata");
        
        label.setBounds(10, 20, 80, 25);
        label1.setBounds(10, 60, 80, 25);
        label2.setBounds(10, 100, 80, 25);
        label3.setBounds(10, 140, 80, 25);
        label4.setBounds(10, 180, 80, 25);
        label5.setBounds(10, 220, 80, 25);
        label6.setBounds(10, 260, 80, 25);
        
        panel.add(label);
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        panel.add(label4);
        panel.add(label5);
        panel.add(label6);
        
        textField(panel);
        
        frame.setVisible(true);
        return panel;
    }

    private static void textField(JPanel panel) {
        JTextField marca = new JTextField();
        JTextField model = new JTextField();
        JTextField culoare = new JTextField();
        JTextField cp = new JTextField();
        
        marca.setBounds(100, 20, 165, 25);
        model.setBounds(100, 60, 165, 25);
        culoare.setBounds(100, 100, 165, 25);
        cp.setBounds(100, 140, 165, 25);
        
        panel.add(marca);
        panel.add(model);
        panel.add(culoare);
        panel.add(cp);
    }

    public static void principalButon(JPanel panel) {
        JButton buton = new JButton("Salveaza");
        buton.setBounds(10, 310, 560, 25);
        panel.add(buton);
        }

    public static void checkBox(JPanel panel) {
        JCheckBox check = new JCheckBox();
        check.setBounds(100, 260, 165, 25);
        panel.add(check);
    }

    public static void radioButon(JPanel panel) {
        JRadioButton radio = new JRadioButton();
        JRadioButton radio1 = new JRadioButton();
        radio.setBounds(100, 180, 165, 25);
        radio1.setBounds(100, 220, 165, 25);
        ButtonGroup bg = new ButtonGroup();
        bg.add(radio);bg.add(radio1);    
        panel.add(radio);
        panel.add(radio1);
    }
}
