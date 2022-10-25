import javax.swing.JOptionPane;
public class Calculate {
	public static void main(String[] args) {
		String strNum1, strNum2;
		String strSum = " Tổng 2 số là: ";
		strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
		strNum2 = JOptionPane.showInputDialog(null, "Please input the first number: ","Input the second number", JOptionPane.INFORMATION_MESSAGE);
		double num1 = Double.parseDouble(strNum1);
		double num2 = Double.parseDouble(strNum2);
		JOptionPane.showMessageDialog(null, num1 + num2, "Tổng 2 số là: " ,JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, num1 - num2, "Hiệu 2 số là: " ,JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, num1 * num2, "tích 2 số là: " ,JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, num1 / num2, "Thương 2 số là: " ,JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}
