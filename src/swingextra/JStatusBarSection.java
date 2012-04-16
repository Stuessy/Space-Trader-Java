package swingextra;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.JLabel;

public class JStatusBarSection extends JLabel {
	private static final long serialVersionUID = -8750721176309914721L;

	public JStatusBarSection() {
		setBorder(BorderFactory.createLoweredBevelBorder());
	}

	public JStatusBarSection(Icon image, int horizontalAlignment) {
		super(image, horizontalAlignment);
		setBorder(BorderFactory.createLoweredBevelBorder());
	}

	public JStatusBarSection(Icon image) {
		super(image);
		setBorder(BorderFactory.createLoweredBevelBorder());
	}

	public JStatusBarSection(String text, Icon icon, int horizontalAlignment) {
		super(text, icon, horizontalAlignment);
		setBorder(BorderFactory.createLoweredBevelBorder());
	}

	public JStatusBarSection(String text, int horizontalAlignment) {
		super(text, horizontalAlignment);
		setBorder(BorderFactory.createLoweredBevelBorder());
	}

	public JStatusBarSection(String text) {
		super(text);
		setBorder(BorderFactory.createLoweredBevelBorder());
	}
}
