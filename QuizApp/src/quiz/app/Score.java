package quiz.app;

import javax.swing.*;
import java.awt.*;

public class Score extends JFrame {
    String totalScore;
    String congo;

    Score(String name, int score){

        setSize(800,600);
        setLocation(400,200);
        setVisible(true);
        setLayout(null);
        getContentPane().setBackground(Color.white);

        congo = "Test Is Completed Successfully";
        totalScore ="Score : "+score;

//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
//        Image i2 = i1.getImage().getScaledInstance(400,300,Image.SCALE_DEFAULT);
//        ImageIcon i = new ImageIcon(i2);
//
//        JLabel image = new JLabel(i);
//        image.setBounds(0,200,800,600);
//        add(image);

        JLabel text = new JLabel("Congratulations!!!");
        text.setFont(new Font("Courier New",Font.BOLD,50));
        text.setBounds(155,100,800,80);
        text.setForeground(Color.BLACK);
        add(text);

        JLabel text1 = new JLabel(congo);
        text1.setFont(new Font("Mongolian Baiti",Font.BOLD,30));
        text1.setBounds(210,220,800,30);
        text1.setForeground(Color.BLACK);
        add(text1);



        JLabel text2 = new JLabel(totalScore);
        text2.setFont(new Font("Mongolian Baiti",Font.BOLD,50));
        text2.setBounds(290,300,800,50);
        text2.setForeground(Color.ORANGE);
        text2.setBackground(Color.CYAN);
        add(text2);


//        text1.
//        JLabel text2 = new JLabel(totalScore);

    }

    public static void main(String[] args) {
        new Score("User",0);
    }
}
