import javax.swing.JOptionPane;

public class Details {
    int age;
    String fName;
    String lName;
    double height;

public static void main(String[] args){
    int x;

    Details a = new Details();
    a.age=Integer.parseInt (JOptionPane.showInputDialog(null, "Age" ));
    a.fName= (JOptionPane.showInputDialog(null, "First name" ));
    a.lName= (JOptionPane.showInputDialog(null, "Last name" ));
    a.height=Double.parseDouble(JOptionPane.showInputDialog(null, "Height" ));
    a.printDetails();
    Integer.parseInt (JOptionPane.showInputDialog(null, "Introduceti x" ));
}
public void setAge(int age){
    this.age=age;
}
public void setFName (String fName){
    this.fName=fName;
}
public void setLName (String lName){
    this.lName=lName;
}
public void setHeight (double height){
    this.height=height;
}
public Integer getAge (){
    return this.age;
}
public String getfName(){
    return this.fName;
}
public String getlName() {
    return this.lName;
}
public Double getHeight(){
    return this.height;
}
public void printDetails(){
    JOptionPane.showMessageDialog(null, "My name is "+getlName()+ " " + getfName() +" , i'm "+ getAge() + " years old "+" and my height is "+getHeight());
}
}
