package front;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class pokerfront extends Applet implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int bi;
	path[] pat = new path[12];
	Label name1 = new Label("player1");
	Label name2 = new Label("player2");
	Label name3 = new Label("player3");
	Label name4 = new Label("player4");
	Label result1 = new Label("");
	Label result2 = new Label("");
	Label result3 = new Label("");
	Label result4 = new Label("");
	Label result = new Label("");
	private Button btn = new Button("start");

	public void init() {
		this.add(btn);

		btn.addActionListener(this);
		{
			setLayout(null);
			btn.setBounds(900, 900, 100, 50);
		}
		this.add(name1);
		{
			setLayout(null);
			name1.setBounds(600, 70, 100, 50);
		}
		this.add(name2);
		{
			setLayout(null);
			name2.setBounds(100, 400, 100, 50);
		}
		this.add(name3);
		{
			setLayout(null);
			name3.setBounds(1700, 400, 100, 50);
		}
		this.add(name4);
		{
			setLayout(null);
			name4.setBounds(600, 700, 100, 50);
		}

		this.add(result);
		{
			setLayout(null);
			result.setBounds(200, 800, 200, 20);
		}

		this.add(result1);
		{
			setLayout(null);
			result1.setBounds(200, 600, 200, 20);
		}

		this.add(result2);
		{
			setLayout(null);
			result2.setBounds(200, 650, 200, 20);
		}

		this.add(result3);
		{
			setLayout(null);
			result3.setBounds(200, 700, 200, 20);
		}
		this.add(result4);
		{
			setLayout(null);
			result4.setBounds(200, 750, 200, 20);
		}
		for (int i = 0; i < 12; i++) {
			pat[i] = new path(0);
		}
	}

	public void paint(Graphics g) {
		g.drawImage(getToolkit().getImage(pat[0].pathre()), 700, 50, this);
		g.drawImage(getToolkit().getImage(pat[1].pathre()), 900, 50, this);
		g.drawImage(getToolkit().getImage(pat[2].pathre()), 1100, 50, this);
		g.drawImage(getToolkit().getImage(pat[3].pathre()), 200, 400, this);
		g.drawImage(getToolkit().getImage(pat[4].pathre()), 400, 400, this);
		g.drawImage(getToolkit().getImage(pat[5].pathre()), 600, 400, this);
		g.drawImage(getToolkit().getImage(pat[6].pathre()), 1100, 400, this);
		g.drawImage(getToolkit().getImage(pat[7].pathre()), 1300, 400, this);
		g.drawImage(getToolkit().getImage(pat[8].pathre()), 1500, 400, this);
		g.drawImage(getToolkit().getImage(pat[9].pathre()), 700, 700, this);
		g.drawImage(getToolkit().getImage(pat[10].pathre()), 900, 700, this);
		g.drawImage(getToolkit().getImage(pat[11].pathre()), 1100, 700, this);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn) {
			poker curpoker = new poker();
			int[] d1 = curpoker.deal(3);
			for (int i = 0; i < 3; i++) {
				pat[i].pathset(d1[i] + 1);
			}
			player p1 = new player("player1", d1);

			int[] d2 = curpoker.deal(3);

			player p2 = new player("player2", d2);
			for (int i = 3; i < 6; i++) {
				pat[i].pathset(d2[i - 3] + 1);
			}
			int[] d3 = curpoker.deal(3);

			player p3 = new player("player3", d3);
			for (int i = 6; i < 9; i++) {
				pat[i].pathset(d3[i - 6] + 1);
			}
			int[] d4 = curpoker.deal(3);

			player p4 = new player("player4", d4);
			for (int i = 9; i < 12; i++) {
				pat[i].pathset(d4[i - 9] + 1);
			}
			result1.setText(p1.toString1());
			result2.setText(p2.toString1());
			result3.setText(p3.toString1());
			result4.setText(p4.toString1());
			result.setText("Ê¤³öÕßÊÇ£º" + p1.compare(p2).compare(p3).compare(p4).name);
			repaint();
		}

	}
}
