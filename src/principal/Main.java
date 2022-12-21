package principal;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import view.LoteriaView;

/**
 * @author eduardo.andrade
 * @since 01/09/2014
 */
public class Main {

	public static void main(String[] args) {	
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				LoteriaView thisClass = new LoteriaView();
				thisClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				thisClass.setVisible(true);
			}
		});

	}

}
