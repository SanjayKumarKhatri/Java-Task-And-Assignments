import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
import java.net.*;
import java.applet.*;


class Alphabates extends JFrame implements ActionListener {
	  JFrame fram = new JFrame("");
	  ImageIcon iconA = new ImageIcon("A.jpg");
	  JButton btnA = new JButton(iconA);
	  ImageIcon iconB = new ImageIcon("B.jpg");
	  JButton btnB = new JButton(iconB);
	  ImageIcon iconC = new ImageIcon("C.jpg");
	  JButton btnC = new JButton(iconC);
	  ImageIcon iconD = new ImageIcon("D.jpg");
	  JButton btnD = new JButton(iconD);
	  ImageIcon iconE = new ImageIcon("E.jpg");
	  JButton btnE = new JButton(iconE);
	  ImageIcon iconF = new ImageIcon("F.jpg");
	  JButton btnF = new JButton(iconF);
	  ImageIcon iconG = new ImageIcon("G.jpg");
	  JButton btnG = new JButton(iconG);
	  ImageIcon iconH = new ImageIcon("H.jpg");
	  JButton btnH = new JButton(iconH);
	  ImageIcon iconI = new ImageIcon("I.jpg");
	  JButton btnI = new JButton(iconI);
	  ImageIcon iconJ = new ImageIcon("J.jpg");
	  JButton btnJ = new JButton(iconJ);
	  ImageIcon iconK = new ImageIcon("K.jpg");
	  JButton btnK = new JButton(iconK);
	  ImageIcon iconL = new ImageIcon("L.jpg");
	  JButton btnL = new JButton(iconL);
	  ImageIcon iconM = new ImageIcon("M.jpg");
	  JButton btnM = new JButton(iconM);
	  ImageIcon iconN = new ImageIcon("N.jpg");
	  JButton btnN = new JButton(iconN);
	  ImageIcon iconO = new ImageIcon("O.jpg");
	  JButton btnO = new JButton(iconO);
	  ImageIcon iconP = new ImageIcon("P.jpg");
	  JButton btnP = new JButton(iconP);
	  ImageIcon iconQ = new ImageIcon("Q.jpg");
	  JButton btnQ = new JButton(iconQ);
	  ImageIcon iconR = new ImageIcon("R.jpg");
	  JButton btnR = new JButton(iconR);
	  ImageIcon iconS = new ImageIcon("S.jpg");
	  JButton btnS = new JButton(iconS);
	  ImageIcon iconT = new ImageIcon("T.jpg");
	  JButton btnT = new JButton(iconT);
	  ImageIcon iconU = new ImageIcon("U.jpg");
	  JButton btnU = new JButton(iconU);
	  ImageIcon iconV = new ImageIcon("V.jpg");
	  JButton btnV = new JButton(iconV);
	  ImageIcon iconW = new ImageIcon("W.jpg");
	  JButton btnW = new JButton(iconW);
	  ImageIcon iconX = new ImageIcon("X.jpg");
	  JButton btnX = new JButton(iconX);
	  ImageIcon iconY = new ImageIcon("Y.jpg");
	  JButton btnY = new JButton(iconY);
	  ImageIcon iconZ = new ImageIcon("Z.jpg");
	  JButton btnZ = new JButton(iconZ);
	  
	  Alphabates(){
	        fram.setLayout(null);
			fram.setBounds(0,0,1340,1400);
			btnA.setBounds(0,0,170,130);
			btnB.setBounds(190,0,170,130);
			btnC.setBounds(380,0,170,130);
			btnD.setBounds(570,0,170,130);
			btnE.setBounds(760,0,170,130);
			btnF.setBounds(950,0,170,130);
			btnG.setBounds(1140,0,170,130);
			btnH.setBounds(0,145,170,130);
			btnI.setBounds(190,145,170,130);
			btnJ.setBounds(380,145,170,130);
			btnK.setBounds(570,145,170,130);
			btnL.setBounds(760,145,170,130);
			btnM.setBounds(950,145,170,130);
			btnN.setBounds(1140,145,170,130);
			btnO.setBounds(0,290,170,130);
			btnP.setBounds(190,290,170,130);
			btnQ.setBounds(380,290,170,130);
			btnR.setBounds(570,290,170,130);
			btnS.setBounds(760,290,170,130);
			btnT.setBounds(950,290,170,130);
			btnU.setBounds(1140,290,170,130);
			btnV.setBounds(190,440,170,130);
			btnW.setBounds(380,440,170,130);
			btnX.setBounds(570,440,170,130);
			btnY.setBounds(760,440,170,130);
			btnZ.setBounds(950,440,170,130);
			   
			   fram.add(btnA);
			   fram.add(btnB);
			   fram.add(btnC);
			   fram.add(btnD);
			   fram.add(btnE);
			   fram.add(btnF);
			   fram.add(btnG);
			   fram.add(btnH);
			   fram.add(btnI);
			   fram.add(btnJ);
			   fram.add(btnK);
			   fram.add(btnL);
			   fram.add(btnM);
			   fram.add(btnN);
			   fram.add(btnO);
			   fram.add(btnP);
			   fram.add(btnQ);
			   fram.add(btnR);
			   fram.add(btnS);
			   fram.add(btnT);
			   fram.add(btnU);
			   fram.add(btnV);
			   fram.add(btnW);
			   fram.add(btnX);
			   fram.add(btnY);
			   fram.add(btnZ);
			   
			   fram.setVisible(true);
			   
			   btnA.addActionListener(this);
		       btnB.addActionListener(this);
		       btnC.addActionListener(this);
		       btnD.addActionListener(this);
		       btnE.addActionListener(this);
		       btnF.addActionListener(this);
		       btnG.addActionListener(this);
			   btnH.addActionListener(this);
			   btnI.addActionListener(this);
			   btnJ.addActionListener(this);
			   btnK.addActionListener(this);
			   btnL.addActionListener(this);
	           btnM.addActionListener(this);
			   btnN.addActionListener(this);
			   btnO.addActionListener(this);
               btnP.addActionListener(this);
			   btnQ.addActionListener(this);
			   btnR.addActionListener(this);
			   btnS.addActionListener(this);
			   btnT.addActionListener(this);
			   btnU.addActionListener(this);
			   btnV.addActionListener(this);
			   btnW.addActionListener(this);
			   btnX.addActionListener(this);
			   btnY.addActionListener(this);
			   btnZ.addActionListener(this);
			}
			
			public void actionPerformed(ActionEvent e) {
            if(e.getSource() == btnA) {
				A a = new A();
				a.start();
				btnA.setIcon(null);
				//btnA.setEnabled(false);
			}
			if(e.getSource() == btnB) {
				
			}
			if(e.getSource() == btnC) {
				
			}
			if(e.getSource() == btnD) {
				
			}
			if(e.getSource() == btnE) {
				
			}
			if(e.getSource() == btnF) {
				
			}
			if(e.getSource() == btnG) {
				
			}
			if(e.getSource() == btnH) {
				
			}
			if(e.getSource() == btnI) {
				
			}
			if(e.getSource() == btnJ) {
				
			}
			if(e.getSource() == btnK) {
				
			}
			if(e.getSource() == btnL) {
				
			}
			if(e.getSource() == btnM) {
				
			}
			if(e.getSource() == btnN) {
				
			}
			if(e.getSource() == btnO) {
				
			}
			if(e.getSource() == btnP) {
				
			}
			if(e.getSource() == btnQ) {
				
			}
			if(e.getSource() == btnR) {
				
			}
			if(e.getSource() == btnS) {
				
			}
			if(e.getSource() == btnT) {
				
			}
			if(e.getSource() == btnU) {
				
			}
			if(e.getSource() == btnV) {
				
			}
			if(e.getSource() == btnW) {
				
			}
			if(e.getSource() == btnX) {
				
			}
			if(e.getSource() == btnY) {
				
			}
			if(e.getSource() == btnZ) {
				
			}
		}
			
	    public static void main(String arg[]) {
	  
	          new Alphabates();
		}
}

class A extends Thread {
	public void run() {
		try {
			File file = new File("A.wav");
			URL url = file.toURL();
			AudioClip clip = Applet.newAudioClip(url);
			clip.play();
		} catch(Exception e) {}
	}
}