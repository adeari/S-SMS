package sms.apps.kontak;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.JPanel;

import sms.apps.components.Datebox;
import sms.apps.components.LabelCustom;
import sms.apps.components.LabelTitle;
import sms.apps.components.Textbox;

public class TambahKontak extends JPanel {
	private static final long serialVersionUID = 7850334984466704293L;
	public TambahKontak(String title, Icon icon) {
		this.setPreferredSize(new Dimension(500,500));
		
		LabelTitle titleLabel = new LabelTitle(title, icon);
		this.add(titleLabel);
		
		JPanel formJPanel = new JPanel();
		this.add(formJPanel);
		formJPanel.setLayout(new GridLayout(3,2));
		
		LabelCustom nomorHpLabel = new LabelCustom("Nomor handphone");
		formJPanel.add(nomorHpLabel);
		
		Textbox nomorHPTextbox = new Textbox();
		formJPanel.add(nomorHPTextbox);
		
		
		LabelCustom namaKontak = new LabelCustom("Nama kontak");
		formJPanel.add(namaKontak);
		
		Textbox namaTextbox = new Textbox();
		formJPanel.add(namaTextbox);
		
		LabelCustom tanggalLahirCustom = new LabelCustom("Tanggal lahir");
		formJPanel.add(tanggalLahirCustom);


		Datebox chooser = new Datebox("dd-MM-yy","##-##-##",'_');
		formJPanel.add(chooser);
	}
}
