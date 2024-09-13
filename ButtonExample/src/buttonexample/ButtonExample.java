/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buttonexample;

/**
 *
 * @author DELL
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonExample {

    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Example Frame");
        frame.setSize(400, 500);

        frame.setLayout(new FlowLayout());

        // Create components
        JLabel label = new JLabel("Enter Text:");
        JTextField textField = new JTextField(15);
        JButton button = new JButton("Submit");
        JComboBox<String> comboBox = new JComboBox<>(new String[] {"Option 1", "Option 2", "Option 3"});

        // Add components to the frame
        frame.add(label);
        frame.add(textField);
        frame.add(comboBox);
        frame.add(button);

        // Add action listener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                String selectedOption = (String) comboBox.getSelectedItem();
                JOptionPane.showMessageDialog(null, "Text: " + text + "\nSelected Option: " + selectedOption);
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}

