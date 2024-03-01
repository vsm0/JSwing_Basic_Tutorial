import java.awt.*;
import javax.swing.*;

public class SwingPanel extends JFrame
{
	public SwingPanel()
	{
		super("HelloSwing“");

		setSize(360, 240);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String... args)
	{
		SwingUtilities.invokeLater(
			() -> new SwingPanel()
		);
	}
}
