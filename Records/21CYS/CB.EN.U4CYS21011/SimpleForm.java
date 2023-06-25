package com.amrita.jpl.cys21011.pract.gui;

import javax.swing.*;
import java.awt.*;

public class SimpleForm extends JFrame {

    public SimpleForm() {
        setTitle("Simple Form");
        setSize(400, 200);
        setLayout(new GridLayout(7, 2));

        JLabel nameLabel = new JLabel("Name", JLabel.CENTER);
        JLabel rollNoLabel = new JLabel("Roll no", JLabel.CENTER);
        JLabel emailLabel = new JLabel("Email", JLabel.CENTER);
        JLabel phoneLabel = new JLabel("Phone no", JLabel.CENTER);
        JLabel ageLabel = new JLabel("Age", JLabel.CENTER);
        JLabel addressLabel = new JLabel("Address", JLabel.CENTER);

        JTextArea nameTextArea = new JTextArea("");
        JTextArea rollNoTextArea = new JTextArea("");
        JTextArea emailTextArea = new JTextArea("");
        JTextArea phoneTextArea = new JTextArea("");
        JTextArea ageTextArea = new JTextArea("");
        JTextArea addressTextArea = new JTextArea("");

        JButton submitButton = new JButton("Submit");

        add(nameLabel);
        add(nameTextArea);
        add(rollNoLabel);
        add(rollNoTextArea);
        add(emailLabel);
        add(emailTextArea);
        add(phoneLabel);
        add(phoneTextArea);
        add(ageLabel);
        add(ageTextArea);
        add(addressLabel);
        add(addressTextArea);

        add(submitButton);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SimpleForm();
    }
}
