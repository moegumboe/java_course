package LambdaPractice;

import javax.swing.*;

public class MyFrame extends JFrame {

    JButton myButton = new JButton("MY BUTTON 1");
    JButton myButton2 = new JButton("MY BUTTON 2");

    MyFrame(){

        myButton.setBounds(50,50,100,50);
        myButton.addActionListener(
            (e) -> System.out.println("You clicked the first button"));

        myButton2.setBounds(200,50,100,50);
        myButton2.addActionListener(
            (e) ->System.out.println("You clicked the second button"));

        this.add(myButton);
        this.add(myButton2);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420,420);
        this.setLayout(null);
        this.setVisible(true);
    }
}
