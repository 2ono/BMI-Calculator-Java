import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BMICalculators implements ActionListener {
	double num1 = 0, num2 = 0, result = 0;
	JTextField weightField, heightField, textfield;
	JLabel height, weight;
	JPanel panel;
	JFrame frame;
	JButton resultBtn;

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
		resultBtn = new JButton("=");
		resultBtn.setText("결과  보기");
		resultBtn.addActionListener(this);
		resultBtn.setBounds(150, 300, 300, 50);
		textfield = new JTextField(15);
		textfield.setBounds(50, 350, 300, 50);
		textfield.setEditable(false);

		textfield.setText("");

		panel.add(height);
		panel.add(heightField);
		panel.add(weight);
		panel.add(weightField);
		panel.add(resultBtn);
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

		/*
		 * 비만도 측정(BMI지수) BMI를 이용한 비만도 계산은 자신의 몸무게를 키의 제곱으로 나누는 것으로 공식은 kg/㎡. BMI가 18.5
		 * 이하면 저체중 ／ 18.5 ~ 22.9 사이면 정상 ／ 23.0 ~ 24.9 사이면 과체중 ／ 25.0 이상부터는 비만으로 판정. ex)
		 * 키 170㎝에 몸무게 73kg이면, 계산식 : 73 / (1.7×1.7) = 25.26 → 과체중
		 */

		if (e.getSource() == resultBtn) {
			num1 = Double.parseDouble(heightField.getText());
			num2 = Double.parseDouble(weightField.getText());

			result = num2 / (num1 * num1);

		}

		if (result < 18.5) {
			textfield.setText("저체중");
		} else if (result < 22.9) {
			textfield.setText("정상");
		} else if (result < 24.9) {
			textfield.setText("과체중");
		} else {
			textfield.setText("비만");
		}

	}

}
