package sms.apps.kontak;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.Icon;
import javax.swing.JPanel;

import sms.apps.components.Datebox;
import sms.apps.components.LabelCustom;
import sms.apps.components.LabelTitle;
import sms.apps.components.Textbox;

public class KontakTambah extends JPanel {
	private static final long serialVersionUID = 7850334984466704293L;
	public KontakTambah(String title, Icon icon) {
		this.setPreferredSize(new Dimension(500,500));
		this.setLayout(new FlowLayout(FlowLayout.LEADING, 0, 0));
		
		LabelTitle titleLabel = new LabelTitle(title, icon);
		this.add(titleLabel);
		
		LabelCustom nomorHpLabel = new LabelCustom("Nomor handphone");
		this.add(nomorHpLabel);
		
		Textbox nomorHPTextbox = new Textbox();
		this.add(nomorHPTextbox);
		
		
		LabelCustom namaKontak = new LabelCustom("Nama kontak");
		this.add(namaKontak);
		
		Textbox namaTextbox = new Textbox();
		this.add(namaTextbox);
		
		LabelCustom tanggalLahirCustom = new LabelCustom("Tanggal lahir");
		this.add(tanggalLahirCustom);


		Datebox chooser = new Datebox("dd-MM-yy","##-##-##",'_');
		this.add(chooser);
	}
}
