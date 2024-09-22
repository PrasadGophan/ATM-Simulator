import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Withdrwal extends JFrame implements ActionListener {

    JButton back,withdraw;
    JTextField amount;
    JLabel text;
    String pinnumber;
    Withdrwal(String pinnumber)
    {
        this.pinnumber=pinnumber;
        setLayout(null);


        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2= i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image =new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);

        text = new JLabel("Enter the Amount you want to withdraw");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("system",Font.BOLD,16));
        text.setBounds(185,300,400,20);
        image.add(text);

        amount = new JTextField();
        amount.setFont(new Font("Raleway",Font.BOLD,22));
        amount.setBounds(185,340,290,25);
        image.add(amount);

        withdraw = new JButton("withdraw");
        withdraw.setBounds(380,470,120,30);
        withdraw.addActionListener(this);
        image.add(withdraw);

        back = new JButton("Back");
        back.setBounds(380,510,120,30);
        back.addActionListener(this);
        image.add(back);




        setSize(900,900);
        setLocation(300,0);
        setVisible(true);

    }

    public void actionPerformed (ActionEvent ae){
        if(ae.getSource()==withdraw){
            String number = amount.getText();
            Date date= new Date();
            if(number.equals("")){
                JOptionPane.showMessageDialog(null," Please enter the Amount you want to withdraw");
            }else{
                try{
                conn conn= new conn();
                String query="insert into bank values('"+pinnumber+"','"+date+"','"+"withdraw"+"','"+number+"')";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Rs "+number+" withdraw Successfully");
                setVisible(false);
                new transactions(pinnumber).setVisible(true);
                }catch(Exception e){
                    System.out.println(e);
                }

            }

        }else if(ae.getSource()==back){
            setVisible(false);
            new transactions(pinnumber).setVisible(true);

        }
    }

    public static void main(String[] args) {
        new Withdrwal(" ");
        
    }

}
