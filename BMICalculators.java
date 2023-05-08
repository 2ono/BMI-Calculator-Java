import java.awt.FlowLayout;  
import javax.swing.JButton;  
import javax.swing.JFrame;  
import javax.swing.JLabel;  
import javax.swing.JPanel;  

public class BMICalculators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("BMI Calculator");
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		JLabel height = new JLabel("키를 입력하세요 (예) 170cm = 1.7");
		JLabel weight = new JLabel("몸무게를 입력하세요 (예) 50kg = 50");
		JButton button = new JButton();
		button.setText("Button");
		panel.add(height);
		panel.add(weight);
		panel.add(button);
		frame.add(panel);
		frame.setSize(500, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setVisible(true);
	}

}
