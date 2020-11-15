package module7_java_advanced_features.lesson2.inner_classes.anonymous;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Main {

    public static void main(String[] args) {

        Outer outer = new Outer();
        System.out.println(outer.calculate(10));

        //Real life example of Anonymous class from Swing framework
        JButton button = new JButton("Button");
        //We are adding ActionListener implementation as an anonymous class
        //because it is used only in this Button object
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello!");
            }
        });
    }
}
