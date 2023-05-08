import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
 

public class BMICalculators implements ActionListener {
	double heightNum, weightNum;
	JTextField weightField, heightField,textfield;
	JLabel height, weight;
	JPanel panel;
	JFrame frame;

	BMICalculators() {
		frame = new JFrame("BMI 계산기");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		panel = new JPanel();
		panel.setBounds(40, 40, 220, 200);
		panel.setBackground(Color.gray);
		height = new JLabel("키를 입력하세요 (예) 170cm = 1.7");
		weight = new JLabel("몸무게를 입력하세요 (예) 50kg = 50");
		height.setBounds(50, 50, 200, 30);
		weight.setBounds(50, 150, 200, 30);
		weightField = new JTextField(15);
		heightField = new JTextField(15);
		heightField.setBounds(50, 100, 200, 30);
		weightField.setBounds(50, 200, 200, 30);
		JButton button = new JButton();
		button.setText("결과  보기");
		button.setBounds(150, 300, 300, 50);
		textfield = new JTextField(15);
		textfield.setBounds(50, 350, 300, 50);
		textfield.setEditable(false);

		panel.add(height);
		panel.add(heightField);
		panel.add(weight);
		panel.add(weightField);
		panel.add(button);
		panel.add(textfield);

		frame.add(panel);
		frame.setSize(500, 500);

		frame.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BMICalculators bmi = new BMICalculators();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
