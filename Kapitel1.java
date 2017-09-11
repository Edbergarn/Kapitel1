import javax.swing.*;
import java.awt.*;
import java.util.*;

	public class Kapitel1{
		public static void main(String[] args){
			//JOptionPane.showMessageDialog(null, "Du k" + '\u00F6' + "r " +System.getProperty("os.name") + " idag!");
			//Toolkit.getDefaultToolkit() .beep();
			//JOptionPane.showMessageDialog(null, "0703902222");
			//Toolkit.getDefaultToolkit() .beep();
			//JOptionPane.showMessageDialog(null, "Emil Edberg \nVB 29 \n0703902222");
			//JOptionPane.showMessageDialog(null, "Datum och Tid: \n" + Calendar.getInstance () .getTime() .toString ());
			JOptionPane.showMessageDialog(null, "Info", "Information", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null, "Varning", "Varning", JOptionPane.WARNING_MESSAGE);
			JOptionPane.showMessageDialog(null, "Fel","Felmeddelande", JOptionPane.ERROR_MESSAGE);
	}
}
