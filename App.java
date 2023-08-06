import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class App extends JFrame implements ActionListener{
    
    String[] elements = {
        "null",
        "H-Hidrogênio",
        "He-Hélio",
        "Li-Lítio",
        "Be-Berílio",
        "B-Boro",
        "C-Carbono",
        "N-Nitrogênio",
        "O-Oxigênio",
        "F-Flúor",
        "Ne-Neônio",
        "Na-Sódio",
        "Mg-Magnésio",
        "Al-Alumínio",
        "Si-Silício",
        "P-Fósforo",
        "S-Enxofre",
        "Cl-Cloro",
        "Ar-Argônio",
        "K-Potássio",
        "Ca-Cálcio",
        "Sc-Escândio",
        "Ti-Titânio",
        "V-Vanádio",
        "Cr-Cromo",
        "Mn-Manganês",
        "Fe-Ferro",
        "Co-Cobalto",
        "Ni-Níquel",
        "Cu-Cobre",
        "Zn-Zinco",
        "Ga-Gálio",
        "Ge-Germânio",
        "As-Arsênio",
        "Se-Selênio",
        "Br-Bromo",
        "Kr-Criptônio",
        "Rb-Rubídio",
        "Sr-Estrôncio",
        "Y-Ítrio",
        "Zr-Zircônio",
        "Nb-Nióbio",
        "Mo-Molibdênio",
        "Tc-Tecnécio",
        "Ru-Rutênio",
        "Rh-Ródio",
        "Pd-Paládio",
        "Ag-Prata",
        "Cd-Cádmio",
        "In-Índio",
        "Sn-Estanho",
        "Sb-Antimônio",
        "Te-Telúrio",
        "I-Iodo",
        "Xe-Xenônio",
        "Cs-Césio",
        "Ba-Bário",
        "La-Lantânio",
        "Ce-Cério",
        "Pr-Praseodímio",
        "Nd-Neodímio",
        "Pm-Promécio",
        "Sm-Samário",
        "Eu-Európio",
        "Gd-Gadolínio",
        "Tb-Térbio",
        "Dy-Disprósio",
        "Ho-Hólmio",
        "Er-Érbio",
        "Tm-Túlio",
        "Yb-Itérbio",
        "Lu-Lutécio",
        "Hf-Háfnio",
        "Ta-Tântalo",
        "W-Tungstênio",
        "Re-Rênio",
        "Os-Ósmio",
        "Ir-Irídio",
        "Pt-Platina",
        "Au-Ouro",
        "Hg-Mercúrio",
        "Tl-Tálio",
        "Pb-Chumbo",
        "Bi-Bismuto",
        "Po-Polônio",
        "At-Ástato",
        "Rn-Radônio",
        "Fr-Frâncio",
        "Ra-Rádio",
        "Ac-Actínio",
        "Th-Tório",
        "Pa-Protactínio",
        "U-Urânio",
        "Np-Neptúnio",
        "Pu-Plutônio",
        "Am-Amerício",
        "Cm-Cúrio",
        "Bk-Berquélio",
        "Cf-Califórnio",
        "Es-Einstênio",
        "Fm-Férmio",
        "Md-Mendelévio",
        "No-Nobélio",
        "Lr-Laurêncio",
        "Rf-Rutherfórdio",
        "Db-Dúbnio",
        "Sg-Seabórgio",
        "Bh-Bóhrio",
        "Hs-Hássio",
        "Mt-Meitnério",
        "Ds-Darmstádtio",
        "Rg-Roentgênio",
        "Cn-Copernício",
        "Nh-Nihônio",
        "Fl-Fleróvio",
        "Mc-Moscóvio",
        "Lv-Livermório",
        "Ts-Tenesso",
        "Og-Oganessônio"
    };

    String[] distribuicao = {
        "null",
        "1s¹",
        "1s²",
        "1s² 2s¹",
        
    };

    JComboBox displayelements;
    JTextField textfield;

    App(){
        this.setTitle("Distribuicao eletronica");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(null);
        this.setSize(400,350);
        this.setLocationRelativeTo(null);

        displayelements = new JComboBox(elements);
        displayelements.addActionListener(this);
        displayelements.setSelectedItem("null");
        displayelements.setBounds(140,50,120,40);

        textfield = new JTextField();
        textfield.setEditable(false);
        textfield.setFocusable(true);
        textfield.setBounds(50,110,300,50);
        textfield.setFont(new Font("Ink Free",Font.BOLD,14));

        this.add(textfield);
        this.add(displayelements);
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == displayelements){
            for(int i = 1; i<118;i++){
                if((String)displayelements.getSelectedItem() == elements[i]){
                    textfield.setText(distribuicao[i]);
                }
            }
        }
    }
    
}
