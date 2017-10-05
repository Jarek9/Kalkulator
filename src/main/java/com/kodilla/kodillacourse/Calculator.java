package com.kodilla.kodillacourse;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {

    private JFrame frame;
    private JTextField TextField;

    double firstnum;
    double secondnum;
    double result;
    String operations;


//	 Launch the application.

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Calculator window = new Calculator();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


//	Create the application.

    public Calculator() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 30));
        frame.setBounds(100, 100, 376, 583);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                | UnsupportedLookAndFeelException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        TextField = new JTextField();
        TextField.setHorizontalAlignment(SwingConstants.RIGHT);
        TextField.setFont(new Font("Tahoma", Font.BOLD, 30));
        TextField.setBounds(15, 16, 325, 50);
        frame.getContentPane().add(TextField);
        TextField.setColumns(10);

        JButton btnBackSpace = new JButton("\uF0E7");
        btnBackSpace.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String backspace = null;

                if (TextField.getText().length() > 0) {
                    StringBuilder strB = new StringBuilder(TextField.getText());
                    strB.deleteCharAt(TextField.getText().length() - 1);
                    backspace = strB.toString();
                    TextField.setText(backspace);
                }
            }
        });
        btnBackSpace.setFont(new Font("Wingdings", Font.BOLD, 30));
        btnBackSpace.setBounds(15, 82, 70, 70);
        frame.getContentPane().add(btnBackSpace);

        JButton btn7 = new JButton("7");
        btn7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String EnterNumber = TextField.getText() + btn7.getText();
                TextField.setText(EnterNumber);
            }
        });
        btn7.setFont(new Font("Tahoma", Font.BOLD, 30));
        btn7.setBounds(15, 168, 70, 70);
        frame.getContentPane().add(btn7);

        JButton btn4 = new JButton("4");
        btn4.addActionListener(e -> {
            String EnterNumber = TextField.getText() + btn4.getText();
            TextField.setText(EnterNumber);
        });
        btn4.setFont(new Font("Tahoma", Font.BOLD, 30));
        btn4.setBounds(15, 254, 70, 70);
        frame.getContentPane().add(btn4);

        JButton btn1 = new JButton("1");
        btn1.addActionListener(e -> {
            String EnterNumber = TextField.getText() + btn1.getText();
            TextField.setText(EnterNumber);
        });
        btn1.setFont(new Font("Tahoma", Font.BOLD, 30));
        btn1.setBounds(15, 340, 70, 70);
        frame.getContentPane().add(btn1);

        JButton btn0 = new JButton("0");
        btn0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String EnterNumber = TextField.getText() + btn0.getText();
                TextField.setText(EnterNumber);
            }
        });
        btn0.setFont(new Font("Tahoma", Font.BOLD, 30));
        btn0.setBounds(15, 426, 70, 70);
        frame.getContentPane().add(btn0);

        JButton btnClear = new JButton("C");
        btnClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                TextField.setText(null);
            }
        });
        btnClear.setFont(new Font("Tahoma", Font.BOLD, 30));
        btnClear.setBounds(100, 82, 70, 70);
        frame.getContentPane().add(btnClear);

        JButton btnPrecent = new JButton("%");
        btnPrecent.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                firstnum = Double.parseDouble(TextField.getText());
                TextField.setText("");
                operations = "%";
            }
        });
        btnPrecent.setFont(new Font("Tahoma", Font.BOLD, 30));
        btnPrecent.setBounds(185, 82, 70, 70);
        frame.getContentPane().add(btnPrecent);

        JButton btnPlus = new JButton("+");
        btnPlus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                firstnum = Double.parseDouble(TextField.getText());
                TextField.setText("");
                operations = "+";
            }
        });
        btnPlus.setFont(new Font("Tahoma", Font.BOLD, 30));
        btnPlus.setBounds(270, 82, 70, 70);
        frame.getContentPane().add(btnPlus);

        JButton btn8 = new JButton("8");
        btn8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String EnterNumber = TextField.getText() + btn8.getText();
                TextField.setText(EnterNumber);
            }
        });
        btn8.setFont(new Font("Tahoma", Font.BOLD, 30));
        btn8.setBounds(100, 168, 70, 70);
        frame.getContentPane().add(btn8);

        JButton btn5 = new JButton("5");
        btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String EnterNumber = TextField.getText() + btn5.getText();
                TextField.setText(EnterNumber);
            }
        });
        btn5.setFont(new Font("Tahoma", Font.BOLD, 30));
        btn5.setBounds(100, 254, 70, 70);
        frame.getContentPane().add(btn5);

        JButton btn2 = new JButton("2");
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String EnterNumber = TextField.getText() + btn2.getText();
                TextField.setText(EnterNumber);
            }
        });
        btn2.setFont(new Font("Tahoma", Font.BOLD, 30));
        btn2.setBounds(100, 340, 70, 70);
        frame.getContentPane().add(btn2);

        JButton btnDot = new JButton(".");
        btnDot.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String EnterNumber = TextField.getText() + btnDot.getText();
                TextField.setText(EnterNumber);
            }
        });
        btnDot.setFont(new Font("Tahoma", Font.BOLD, 30));
        btnDot.setBounds(100, 426, 70, 70);
        frame.getContentPane().add(btnDot);

        JButton btn9 = new JButton("9");
        btn9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String EnterNumber = TextField.getText() + btn9.getText();
                TextField.setText(EnterNumber);
            }
        });
        btn9.setFont(new Font("Tahoma", Font.BOLD, 30));
        btn9.setBounds(185, 168, 70, 70);
        frame.getContentPane().add(btn9);

        JButton btnMinus = new JButton("-");
        btnMinus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                firstnum = Double.parseDouble(TextField.getText());
                TextField.setText("");
                operations = "-";
            }
        });
        btnMinus.setFont(new Font("Tahoma", Font.BOLD, 30));
        btnMinus.setBounds(270, 168, 70, 70);
        frame.getContentPane().add(btnMinus);

        JButton btn6 = new JButton("6");
        btn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String EnterNumber = TextField.getText() + btn6.getText();
                TextField.setText(EnterNumber);
            }
        });
        btn6.setFont(new Font("Tahoma", Font.BOLD, 30));
        btn6.setBounds(185, 254, 70, 70);
        frame.getContentPane().add(btn6);

        JButton btnMult = new JButton("*");
        btnMult.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                firstnum = Double.parseDouble(TextField.getText());
                TextField.setText("");
                operations = "*";
            }
        });
        btnMult.setFont(new Font("Tahoma", Font.BOLD, 30));
        btnMult.setBounds(270, 254, 70, 70);
        frame.getContentPane().add(btnMult);

        JButton btn3 = new JButton("3");
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String EnterNumber = TextField.getText() + btn3.getText();
                TextField.setText(EnterNumber);
            }
        });
        btn3.setFont(new Font("Tahoma", Font.BOLD, 30));
        btn3.setBounds(185, 340, 70, 70);
        frame.getContentPane().add(btn3);

        JButton btnDiv = new JButton("/");
        btnDiv.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                firstnum = Double.parseDouble(TextField.getText());
                TextField.setText("");
                operations = "/";
            }
        });
        btnDiv.setFont(new Font("Tahoma", Font.BOLD, 30));
        btnDiv.setBounds(270, 340, 70, 70);
        frame.getContentPane().add(btnDiv);

        JButton btnPM = new JButton("\u00B1");
        btnPM.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double ops = Double.parseDouble(String.valueOf(TextField.getText()));
                ops = ops * (-1);
                TextField.setText(String.valueOf(ops));
            }
        });
        btnPM.setFont(new Font("Tahoma", Font.BOLD, 30));
        btnPM.setBounds(185, 426, 70, 70);
        frame.getContentPane().add(btnPM);

        JButton btnEqual = new JButton("=");
        btnEqual.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String answer;
                secondnum = Double.parseDouble(TextField.getText());
                if (operations == "+") {

                    result = firstnum + secondnum;
                    answer = String.format("%1f", result);
                    TextField.setText(answer);
                } else if (operations == "-") {

                    result = firstnum - secondnum;
                    answer = String.format("%1f", result);
                    TextField.setText(answer);
                } else if (operations == "*") {

                    result = firstnum * secondnum;
                    answer = String.format("%1f", result);
                    TextField.setText(answer);
                } else if (operations == "/") {

                    result = firstnum / secondnum;
                    answer = String.format("%1f", result);
                    TextField.setText(answer);
                } else if (operations == "%") {

                    result = firstnum % secondnum;
                    answer = String.format("%1f", result);
                    TextField.setText(answer);
                }
            }
        });
        btnEqual.setFont(new Font("Tahoma", Font.BOLD, 30));
        btnEqual.setBounds(270, 426, 70, 70);
        frame.getContentPane().add(btnEqual);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(166, 36, 4, 16);
        frame.getContentPane().add(textArea);
    }
}
