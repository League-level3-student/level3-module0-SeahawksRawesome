import javax.swing.JOptionPane;

public class Checkpoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "input a numba!";
		int[] array = new int[5];
		for(int i = 0; i < array.length; i++) {
			String parse = JOptionPane.showInputDialog(text);
			int parsey = Integer.parseInt(parse);
			array[i] = parsey;
		}
		int totaltemp = 0;
		int tempy = 0;
		for(int j = 0; j < array.length; j++) {
			tempy = array[j];
			totaltemp += tempy;
		}
		JOptionPane.showMessageDialog(null, "" + totaltemp);
		
	}

}
