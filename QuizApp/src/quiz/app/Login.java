package quiz.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {

    JTextField text;
    JButton next,back;
    Login(){
       getContentPane().setBackground(Color.white); // inside area of jframe
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/rocket.png"));
        Image i = i1.getImage().getScaledInstance(550,500,Image.SCALE_DEFAULT);   // setting size of image
        ImageIcon i2 = new ImageIcon(i);

        JLabel image = new JLabel(i2);
        image.setBounds(440,0,550,500); //setting location in JFrame
        add(image);

        // JLabel is used to display any type of text or image on jframe

        JLabel heading = new JLabel("QUIZ TEST");
        heading.setBounds(140,60,300,45);
        heading.setFont(new Font("Mongolian Baiti",Font.BOLD,40));
        heading.setForeground(new Color(27, 32, 245));
        add(heading);

        JLabel name = new JLabel("Enter Your Name");
        name.setBounds(160,150,300,20);
        name.setFont(new Font("Viner Hand ITC",Font.BOLD,18));
        name.setForeground(new Color(239, 158, 2));
        add(name);

        // text field
        text = new JTextField();
        text.setBounds(100,200,250,25);
        text.setFont(new Font("Mongolian Baiti",Font.PLAIN,15));
        add(text);

        next = new JButton("Next");
        next.setBounds(110,270,100,25);
        next.setBackground(new Color(39, 35, 248));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);

        back = new JButton("Back");
        back.setBounds(230,270,100,25);
        back.setBackground(new Color(19, 34, 241));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);


       setSize(1000,500);
       setLocation(200,150);
       setVisible(true) ; // by default the visiblity of the frame is false( means frame is by Default invisible)
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()== next){
            //redirect to next page
            String name = text.getText();
            setVisible(false);
            new Rules(name);


        }else if(e.getSource()==back){
            System.exit(1); // lose the app
        }
    }

    public static void main(String[] args) {
      new Login();
    }
}
