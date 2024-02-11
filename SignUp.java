package bank.management.system;

/**
 *
 * @author onkar
 */
import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
import java.util.regex.Pattern;

public class SignUp extends JFrame implements ActionListener{

    
    long random;
    JTextField nameTextField,fnameTextField,dobTextField,emailTextField,addressTextField,cityTextField,pincodeTextField,stateTextField;
    JButton next;
    JRadioButton male,female,other,married,unmarried;
    JDateChooser dateChooser;
SignUp(){
    
    setLayout(null);
    
    Random ran = new Random();
    long random = Math.abs ((ran.nextLong() % 9000L) + 1000L);
    
    JLabel formno = new JLabel("Application form ." +random);
    formno.setFont(new Font("Raleway",Font.BOLD,38));
    formno.setBounds(140,20,600,40);
    add(formno);
    
    JLabel personaldetails = new JLabel("Personal Details");
    personaldetails.setFont(new Font("Raleway",Font.BOLD,22));
    personaldetails.setBounds(290,80,400,30);
    add(personaldetails);
    
    JLabel name = new JLabel("Name");
    name.setFont(new Font("Raleway",Font.BOLD,20));
    name.setBounds(100,140,100,30);
    add(name);
    
    nameTextField = new JTextField();
    nameTextField.setFont(new Font("Raleway",Font.BOLD,14));
    nameTextField.setBounds(300,140,400,30);
    add(nameTextField);
    
    JLabel fname = new JLabel("Fathers Name");
    fname.setFont(new Font("Raleway",Font.BOLD,20));
    fname.setBounds(100,190,200,30);
    add(fname);
    
     fnameTextField= new JTextField();
    fnameTextField.setFont(new Font("Raleway",Font.BOLD,14));
    fnameTextField.setBounds(300,190,400,30);
    add(fnameTextField);
    
    JLabel dob = new JLabel("Date Of Birth");
    dob.setFont(new Font("Raleway",Font.BOLD,20));
    dob.setBounds(100,240,200,30);
    add(dob);
    
    dateChooser = new JDateChooser();
    dateChooser.setBounds(300,240,400,30);
    dateChooser.setForeground(new Color(105,105,105));
    add(dateChooser);
    
    JLabel gender = new JLabel("Gender");
    gender.setFont(new Font("Raleway",Font.BOLD,20));
    gender.setBounds(100,290,200,30);
    add(gender);
    
    male=new JRadioButton("Male");
    male.setBounds(300,290,60,30);
    male.setBackground(Color.white);
    add(male);
    
    female=new JRadioButton("Female");
    female.setBounds(450,290,120,30);
    female.setBackground(Color.white);
    add(female);
    
    ButtonGroup gendergroup=new ButtonGroup();
    gendergroup.add(male);
    gendergroup.add(female);
    
    JLabel email = new JLabel("Email");
    email.setFont(new Font("Raleway",Font.BOLD,20));
    email.setBounds(100,340,200,30);
    add(email);
    
     emailTextField = new JTextField();
    emailTextField.setFont(new Font("Raleway",Font.BOLD,14));
    emailTextField.setBounds(300,340,400,30);
    add(emailTextField);
    
    JLabel marriage = new JLabel("Marrital Status");
    marriage.setFont(new Font("Raleway",Font.BOLD,20));
    marriage.setBounds(100,390,200,30);
    add(marriage);
    
    married=new JRadioButton("Married");
    married.setBounds(300,390,100,30);
    married.setBackground(Color.white);
    add(married);
    
    unmarried=new JRadioButton("Unmarried");
    unmarried.setBounds(450,390,100,30);
    unmarried.setBackground(Color.white);
    add(unmarried);
    
    other=new JRadioButton("Other");
    other.setBounds(630,390,100,30);
    other.setBackground(Color.white);
    add(other);
    
    ButtonGroup maritalgroup=new ButtonGroup();
    maritalgroup.add(married);
    maritalgroup.add(unmarried);
    maritalgroup.add(other);
    
    JLabel address = new JLabel("Address");
    address.setFont(new Font("Raleway",Font.BOLD,20));
    address.setBounds(100,440,200,30);
    add(address);
    
    addressTextField = new JTextField();
    addressTextField.setFont(new Font("Raleway",Font.BOLD,14));
    addressTextField.setBounds(300,440,400,30);
    add(addressTextField);
    
    JLabel city = new JLabel("City");
    city.setFont(new Font("Raleway",Font.BOLD,20));
    city.setBounds(100,490,200,30);
    add(city);
    
   cityTextField = new JTextField();
    cityTextField.setFont(new Font("Raleway",Font.BOLD,14));
    cityTextField.setBounds(300,490,400,30);
    add(cityTextField);
    
    JLabel state = new JLabel("State");
    state.setFont(new Font("Raleway",Font.BOLD,20));
    state.setBounds(100,540,200,30);
    add(state);
    
    stateTextField = new JTextField();
    stateTextField.setFont(new Font("Raleway",Font.BOLD,14));
    stateTextField.setBounds(300,540,400,30);
    add(stateTextField);
    
    JLabel pincode = new JLabel("Pincode");
    pincode.setFont(new Font("Raleway",Font.BOLD,20));
    pincode.setBounds(100,590,200,30);
    add(pincode);
    
   pincodeTextField = new JTextField();
    pincodeTextField.setFont(new Font("Raleway",Font.BOLD,14));
    pincodeTextField.setBounds(300,590,400,30);
    add(pincodeTextField);
    
    next =new JButton("Next");
    next.setBackground(Color.BLACK);
    next.setForeground(Color.YELLOW);
    next.setFont(new Font("Raleway",Font.BOLD,14));
    next.setBounds(620,660,80,30);
    next.addActionListener(this);
    add(next);
    
    getContentPane().setBackground(Color.white);
    
    setSize(850,800);
    setLocation(350,10);
    setVisible(true);
}

public void actionPerformed (ActionEvent ae){
    String formno ="" + random; //long
    
    String name = nameTextField.getText().trim(); //setText
    String fname= fnameTextField.getText().trim();
    String dob =((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
    String gender = null;
    if (male .isSelected()) {
        gender ="Male";
    }else if (female.isSelected()){
         gender ="Female";
    }
    
    String email = emailTextField.getText().trim();
    String marital=null;
    if(married.isSelected()){
        marital="Married";
    }else if (unmarried.isSelected()){
        marital="Unmarried";
    }else if(other.isSelected()){
    marital="other";
    }
    String address =addressTextField.getText().trim();
    String city=cityTextField.getText().trim();
    String state=stateTextField.getText().trim();
    String pincode=pincodeTextField.getText().trim();
    
    
    try{
       if (name.equals("")) {
           JOptionPane.showMessageDialog(null,"Name is required");}
       else if (fname.equals("")) {
           JOptionPane.showMessageDialog(null,"Fathers name is required");}
           else if (dob.equals("")) {
           JOptionPane.showMessageDialog(null,"Date of birth is required");}
           else if (email.equals("")){
           JOptionPane.showMessageDialog(null,"Email is required");}
                   else if (address.equals("")) {
           JOptionPane.showMessageDialog(null,"Address is required");}
                           else if (city.equals("")) {
           JOptionPane.showMessageDialog(null,"City is required");}
                           else if (pincode.equals("")) {
           JOptionPane.showMessageDialog(null,"Pincode is required");}
            else if (state.equals("")) {
           JOptionPane.showMessageDialog(null,"State is required");}
           
       else{
           Conn c=new Conn();
           String query="insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
           c.s.executeUpdate(query);
           
           
           new SignupTwo(formno).setVisible(true);
               setVisible(false);
       }
    
}catch(Exception e){
       e.printStackTrace();
    }
}

public static void main(String [] args){
    new SignUp().setVisible(true);
 }
}
