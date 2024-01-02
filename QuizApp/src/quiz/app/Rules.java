package quiz.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rules extends JFrame implements ActionListener {

    JButton start,back;
    String name;
    Rules(String name){

        this.name = name;

        JLabel heading = new JLabel("Welcome "+name+ " to QUIZ");
        heading.setBounds(260,150,700,30);
        heading.setFont(new Font("Viner Head ITC",Font.ROMAN_BASELINE,28));
        heading.setForeground(new Color(7, 6, 6));
        add(heading);


        JLabel rules = new JLabel();
        rules.setBounds(210,150,700,350);
        rules.setFont(new Font("Tahoma",Font.BOLD,13));
        rules.setForeground(new Color(0, 53, 169));
        rules.setText("<html>"+
                "1. Participation in the quiz is free. Any one can participate age above 18" + "<br><br>" +
                "2. There are total 10 questions. " + "<br><br>" +
                "3. You only have 15 seconds to answer the question." + "<br><br>" +
                "4. No cell phones or calculater " + "<br><br>" +
                "5. make sure giving test at quiet place" + "<br><br>" +
                "6. Do not Cheat." + "<br><br>" +
                "<html>");
        add(rules);


        back = new JButton("BACK");
        back.setBounds(220,450,100,20);
        back.addActionListener(this);
        add(back);

        start = new JButton("START");
        start.setBounds(350,450,100,20);
        start.addActionListener(this);
        add(start);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bgimg.jpg"));
        Image i = i1.getImage().getScaledInstance(1050,720,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i);
        JLabel image = new JLabel(i2);
        image.setBounds(0,0,800,650);
        add(image);

        setSize(800,650);
        setLocation(300,100);
        setLayout(null);
        setVisible(true);


    }

    public static void main(String[] args) {
        new Rules("User");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
     if(e.getSource()==start){
         setVisible(false);
         new Quiz(name);

     }else if(e.getSource()==back){
         setVisible(false);
         new Login();
     }
    }

}
