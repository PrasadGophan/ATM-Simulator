import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
//import com.toedtr.calendar.JDateChooser;

public class SignUpOne extends JFrame implements ActionListener {

    
    JTextField nameTextField,fnameTextField,dobTextField,emailTextField,addressTextField,cityTextField,pinTextField,stateTextField;

    JButton next;

    JRadioButton male, female, married, unmarried, Other;
         Random ran = new Random();
        long Random =Math.abs((ran.nextLong() % 9000L )+ 1000L);
        String first = "" + Math.abs(Random);


    SignUpOne()
    {
        setLayout(null);


        JLabel formno =  new JLabel("APPLICATION FORM NO  " + first);
        formno.setFont(new Font("Raleway",Font.BOLD,38));
        formno.setBounds(140,20,600,40);
        add(formno);

        JLabel personalDetails =  new JLabel("Page 1:Personal Details" );
        personalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        personalDetails.setBounds(290,80,400,30);
        add(personalDetails);


        JLabel name =  new JLabel("Name:" );
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);

        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        nameTextField.setBounds(300,140,400,30);
        add(nameTextField);



        JLabel fname =  new JLabel("Father's Name:" );
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);

        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        fnameTextField.setBounds(300,190,400,30);
        add(fnameTextField);



        JLabel dob =  new JLabel("Date of Birth:" );
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob);

       /* JDateChooser datechooser = new JDateChooser();
        datechooser.setBounds(300,240,200,30);
        add(datechooser);*/

        dobTextField = new JTextField();
        dobTextField.setFont(new Font("Raleway",Font.BOLD,14));
        dobTextField.setBounds(300,240,400,30);
        add(dobTextField);

        

        JLabel gender =  new JLabel("Gender:" );
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);

        male =new JRadioButton("Male");
        male.setBounds(300,290,60,30);
        male.setFont(new Font("Raleway",Font.BOLD,10));
        male.setBackground(Color.WHITE);
        add(male);

        female =new JRadioButton("Female");
        female.setBounds(450,290,120,30);
        female.setFont(new Font("Raleway",Font.BOLD,10));
        female.setBackground(Color.WHITE);
        add(female);

        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        




        JLabel email =  new JLabel("E-mail:" );
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,340,200,30);
        add(email);
        
        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway",Font.BOLD,14));
        emailTextField.setBounds(300,340,400,30);
        add(emailTextField);



        JLabel Martialstatus =  new JLabel("Marital Status:" );
        Martialstatus.setFont(new Font("Raleway",Font.BOLD,20));
        Martialstatus.setBounds(100,390,200,30);
        add(Martialstatus);

        
        married =new JRadioButton("Married");
        married.setBounds(300,390,100,30);
        married.setFont(new Font("Raleway",Font.BOLD,10));
        married.setBackground(Color.WHITE);
        add(married);

        unmarried =new JRadioButton("Unmarried");
        unmarried.setBounds(450,390,100,30);
        unmarried.setFont(new Font("Raleway",Font.BOLD,10));
        unmarried.setBackground(Color.WHITE);
        add(unmarried);

        Other =new JRadioButton("Other");
        Other.setBounds(630,390,100,30);
        Other.setFont(new Font("Raleway",Font.BOLD,10));
        Other.setBackground(Color.WHITE);
        add(Other);

        ButtonGroup marritalgroup = new ButtonGroup();
        marritalgroup.add(married);
        marritalgroup.add(unmarried);
        marritalgroup.add(Other);




        JLabel address =  new JLabel("Address:" );
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100,440,200,30);
        add(address);

        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway",Font.BOLD,14));
        addressTextField.setBounds(300,440,400,30);
        add(addressTextField);



        JLabel city =  new JLabel("City:" );
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,490,200,30);
        add(city);

        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway",Font.BOLD,14));
        cityTextField.setBounds(300,490,400,30);
        add(cityTextField);



        JLabel state =  new JLabel("State:" );
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,540,200,30);
        add(state);

        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway",Font.BOLD,14));
        stateTextField.setBounds(300,540,400,30);
        add(stateTextField);



        JLabel pincode =  new JLabel("Pin Code:" );
        pincode.setFont(new Font("Raleway",Font.BOLD,20));
        pincode.setBounds(100,590,200,30);
        add(pincode);

        pinTextField = new JTextField();
        pinTextField.setFont(new Font("Raleway",Font.BOLD,14));
        pinTextField.setBounds(300,590,400,30);
        add(pinTextField);

        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,17));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
    



        getContentPane().setBackground(Color.WHITE);

        setSize(850,800);
        setLocation(350,10);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae){
        String formno= first;
        String name= nameTextField.getText();
        String fname= fnameTextField.getText();
        String dob= dobTextField.getText();
        String gender=null;
        if(male.isSelected())
        {
            gender="male";
        }
        else if(female.isSelected())
        {
            gender="female";
        }
        String email= emailTextField.getText();
        String marrital= null;
        if(married.isSelected())
        {
            marrital="married";
        }
        else if(unmarried.isSelected())
        {
            marrital="unmarried";
        }
        else if(Other.isSelected())
        {
            marrital="Other";
        }

        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pin = pinTextField.getText();

        try{
            if(name.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Name is Required");
            }
            else if(fname.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Father Name is Required");
            }
            else if(dob.equals(""))
            {
                JOptionPane.showMessageDialog(null, "DOB is Required");
            }
            else if(email.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Email is Required");
            }
            else if(address.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Address is Required");
            }
            else if(city.equals(""))
            {
                JOptionPane.showMessageDialog(null, "City is Required");
            }else if(state.equals(""))
            {
                JOptionPane.showMessageDialog(null, "State is Required");
            }
            else if(pin.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Pin is Required");
            }
            else{
                conn c= new conn();
                String query = "insert into signup values ( '"+formno+"', '"+name+"', '"+fname+"', '"+dob+"', '"+gender+"', '"+email+"', '"+marrital+"', '"+address+"','"+city+"', '"+pin+"', '"+state+"')";

                c.s.executeUpdate(query);

                setVisible(false);
                new SignUpTwo(formno).setVisible(true);

            }
        }catch(Exception e){
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        new SignUpOne();
    }

}
