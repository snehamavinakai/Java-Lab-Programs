//(15).Demonstrate creation of list using an applet.

import java.applet.Applet;
import java.awt.List;
import java.awt.Color;
public class DemoList extends Applet
{
	public void init()
	{
		List l = new List(6,true);
		l.add("Gadag");
		l.add("Hubli");
		l.add("Dharwad");
		l.add("Belagavi");
		l.add("Koppal");
		l.add("Mysore");
		l.add("Bangalore");
		l.add("Haveri");
		l.add("Udupi");
		add(l);
		setBackground(Color.blue);
	}
}