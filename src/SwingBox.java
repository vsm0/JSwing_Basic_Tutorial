import java.awt.*;
import javax.swing.*;

public class SwingBox extends JFrame
{
	public SwingBox()
	{
		super("HelloSwing“");

		// This will hold all our content
		var panel = new JPanel();
		add(panel);

		var layout = new BoxLayout(panel, BoxLayout.X_AXIS);
		panel.setLayout(layout);

		var label1 = new JLabel("Hello");
		var label2 = new JLabel("Swing");

		// We add them to the content panel
		// not the window since we want to use
		// box layout
		panel.add(label1);
		panel.add(label2);

		setSize(360, 240);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String... args)
	{
		SwingUtilities.invokeLater(
			() -> new SwingBox()
		);
	}
}
