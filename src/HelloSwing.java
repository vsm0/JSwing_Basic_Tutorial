import javax.swing.*;

public class HelloSwing extends JFrame
{
	public HelloSwing()
	{
		// HelloSwing extends JFrame
		// So "super" == "new JFrame"
		super("HelloSwing“");

		var label = new JLabel("Hello Swing");

		// no need for frame.add(...);
		// we just type add(...)
		// since HelloSwing extends JFrame
		add(label);

		setSize(360, 240);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String... args)
	{
		// Let swing start the program later
		// when it's ready
		SwingUtilities.invokeLater(
			() -> new HelloSwing();
		);
	}
