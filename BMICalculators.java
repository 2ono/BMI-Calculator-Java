import java.awt.FlowLayout;  
import javax.swing.JButton;  
import javax.swing.JFrame;  
import javax.swing.JLabel;  
import javax.swing.JPanel;
import javax.swing.JTextField; 
import java.awt.*;  
import java.awt.event.*;  

public class BMICalculators implements ActionListener{
	double heightNum, weightNum;
	
	public BMICalculators() {
		JFrame frame = new JFrame("BMI 계산기");
		JPanel panel = new JPanel();
//		panel.setLayout(new FlowLayout());
		JLabel height = new JLabel("키를 입력하세요 (예) 170cm = 1.7");
		JTextField heightField = new JTextField(10);
		heightField.setBounds(100, 100, 300, 20);
		JLabel weight = new JLabel("몸무게를 입력하세요 (예) 50kg = 50");
		JTextField weightField = new JTextField(10);
		weightField.setBounds(200, 200, 300, 20);
		JButton button = new JButton();
		button.setText("결과 보기");
		button.setBounds(150, 430, 100, 50); 
		panel.add(height);
		panel.add(heightField);
		panel.add(weight);
		panel.add(weightField);
		
		panel.add(button);
		
	
		frame.add(panel);
		frame.setSize(420, 550);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
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
