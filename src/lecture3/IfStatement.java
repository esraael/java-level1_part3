package Lecture3;

import javax.swing.JOptionPane;

public class IfStatement {

    public static void main(String[] args) {
       
        if (7 + -9 >= 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
            JOptionPane.showConfirmDialog(null, "false");
        }

    }

}
