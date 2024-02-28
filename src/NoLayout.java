import javax.swing.*;

public class NoLayout extends JFrame
{
	public NoLayout()
	{
		super("HelloSwing“");

		var label1 = new JLabel("Hello");
		var label2 = new JLabel("Swing");

		add(label1);
		add(label2);

		setSize(360, 240);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String... args)
	{
		SwingUtilities.invokeLater(
			() -> new NoLayout()
		);
	}
}
