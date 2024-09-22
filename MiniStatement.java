import java.awt.Color;
import java.awt.Image;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MiniStatement extends JFrame {

    String Pinnumber;
    MiniStatement(String pinnumber){
        setLayout(null);
        setTitle("Mini Statement");

        // ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        // Image i2=i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        // ImageIcon i3= new ImageIcon(i2);
        // JLabel image= new JLabel(i3);
        // add(image);

        JLabel mini = new JLabel();
        add(mini);

        JLabel bank = new JLabel("BANK OF MAHARASHTRA");
        bank.setBounds(130,20,200,20);
        add(bank);

        JLabel card = new JLabel();
        card.setBounds(20,80,300,20);
        add(card);

        JLabel balance = new JLabel();
        balance.setBounds(20,400,300,20);
        add(balance);

        try{
            conn c  = new conn();
            
            ResultSet rs=c.s.executeQuery("select * from login where pin ='"+pinnumber+"' ");

            while(rs.next()){
                card.setText("Card Number:"+rs.getString("cardnumber").substring(0,5)+"✗✗✗✗✗✗✗✗"+rs.getString("cardnumber").substring(13));
                
            }

        }catch(Exception e){
            System.out.println(e);
        }


        try{
            conn c  = new conn();
            int bal=0;
            ResultSet rs=c.s.executeQuery("select * from bank where pin ='"+pinnumber+"' ");

            while(rs.next()){
                mini.setText(mini.getText()+ "<html>" + rs.getString("date") + "&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;" + rs.getString("type") + "&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;" + rs.getString("amount") + "<br><br><html>");

                if(rs.getString("type").equals("Deposit")) {
                    bal += Integer.parseInt(rs.getString("amount"));
                }else{
                    bal -= Integer.parseInt(rs.getString("amount"));
                }
            }
            balance.setText("Your current Account balance is Rs "+ bal);

        }catch(Exception e){
            System.out.println(e);
        }

        mini.setBounds(20,140,400,200);



        
        setSize(400,600);
        setLocation(20,20);
        // setBounds(0,0,900,900);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);

    }
    public static void main(String[] args) {
        new MiniStatement("");
    }

}
