import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.*;

public class Login extends JFrame{
    JLabel l1,l2,l3,l4;
    JTextField t1,t2;
    JButton b1,b2; 
    Login(String s1)
    {
     super(s1);
    }
    Login()
    {

    }
    void setComponents();
    {
      l1=new JLabel("welcome to Sachin Plz login");
      l2=new JLabel("USERNAME");
      l3=new JLabel("PASSWORD");
      l4=new JLabel();
      t1=new JTextField();
      t2=new JTextField();
      b1=new JButton("login");
      b2=new JButton("clear");
      setLayout(null);
      add(l1);
      add(l2);
      add(l3);  
      add(l4);
      add(t1);
      add(t2);
      add(b1);
      add(b2);
      l1.setBounds(100,50,300,30);
      l2.setBounds(100,200,100,30);
      l3.setBounds(100,350,100,30);
      l4.setBounds(100,550,100,30);
      t1.setBounds(350,200,100,30);
      t2.setBounds(350,350,100,30);
      b1.setBounds(200,450,100,30);
      b2.setBounds(400,450,100,30);
      b1.addActionListener(new Log());

    }
    public static void main(String[] args) {
        Login s1=new Login("welcome Sachin");
        s1.setVisible(true);
        s1.setSize(700,700);
        s1.setComponents();
        s1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    class Log implements ActionListener{
        public void actionPerformed(ActionEvent e1)
        {
            String s1=t1.getText();
            String s2=t2.getText();
            if(s1.equals("sachin")&&s2.equals("123456")){
                l4.setText("Login succesful");
            }
            else{
                l4.setText("wrong useid and password");
            }
        }
    
    }
}
