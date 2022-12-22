package view;

import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import controle.Loterias;
import enums.LabelsEnum;

/**
 * @author eduardo.andrade
 * @since 01/09/2014
 */
public class LoteriaView extends JFrame {

	private static final long serialVersionUID = -6673004886460089120L;

	private JPanel jContentPane = null;
	private JLabel lbNumerosSorteados = null;
	private JTextField txtNumerosSorteados = null;

	private JTextArea txtMensagem = null;
	private JButton btnSortear = null;
	private JButton btnFechar = null;

	private JCheckBox ckMegaSena = null;
	private JCheckBox ckLotofacil = null;
	private JCheckBox ckQuina = null;

	private JLabel lbQuantidadeNumeros = null;
	private int quantidadeNumeros = 0;

	private JCheckBox ckMega6 = null;
	private JCheckBox ckMega7 = null;
	private JCheckBox ckMega8 = null;
	private JCheckBox ckMega9 = null;
	private JCheckBox ckMega10 = null;
	private JCheckBox ckMega11 = null;
	private JCheckBox ckMega12 = null;
	private JCheckBox ckMega13 = null;
	private JCheckBox ckMega14 = null;
	private JCheckBox ckMega15 = null;

	private JCheckBox ckLotoFacil15 = null;
	private JCheckBox ckLotoFacil16 = null;
	private JCheckBox ckLotoFacil17 = null;
	private JCheckBox ckLotoFacil18 = null;
	
	public LoteriaView() throws HeadlessException {
		super();
		initialize();
	}

	public void initialize() {
		this.setSize(800, 300);
		this.setContentPane(getJContentPane());
		this.setTitle(LabelsEnum.TITULO.getDescricao());
		adicionarComponentesNoLayout();
		ckMegaSena.setSelected(true);
		ckMega6.setSelected(true);
		quantidadeNumeros = 6;
		acaoCheckbox();
		acaoComponentes();
		definirNomeComponente();
		definirTamanhoComponentes();
		habilitarComponentes();
	}

	private void limparCampos() {
		txtMensagem.setText("");
		txtNumerosSorteados.setText("");
	}

	/**
	 * Metodo responsavel pelas as acoes dos componentes.
	 */
	private void acaoComponentes() {
		acaoCheckMegaSena();
		acaoCheckQuina();
		acaoCheckLotofacil();
		acaoCheckQuantidadeMega();
		acaoCheckQuantidadeLotofacil();
		acaoBtnFechar();
		acaoBtnSortear();
	}

	private void acaoCheckMegaSena() {
		ckMegaSena.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {}
			@Override
			public void mousePressed(MouseEvent e) {}
			@Override
			public void mouseExited(MouseEvent e) {}
			@Override
			public void mouseEntered(MouseEvent e) {}
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount() >= 1) {
					ckLotofacil.setSelected(false);
					ckQuina.setSelected(false);
					quantidadeMegaIsSelected(false);
					ckMega6.setSelected(true);
					quantidadeLotofacilIsSelected(false);
					acaoCheckbox();
					limparCampos();
					quantidadeNumeros = 6;
				}
			}
		});
	}

	private void acaoCheckQuina() {
		ckQuina.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {}
			@Override
			public void mousePressed(MouseEvent e) {}
			@Override
			public void mouseExited(MouseEvent e) {}
			@Override
			public void mouseEntered(MouseEvent e) {}
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount() >= 1) {
					ckMegaSena.setSelected(false);
					ckLotofacil.setSelected(false);
					quantidadeMegaIsSelected(false);
					quantidadeLotofacilIsSelected(false);
					acaoCheckbox();
					limparCampos();
					quantidadeNumeros = 5;
				}
			}
		});
	}

	private void acaoCheckLotofacil() {
		ckLotofacil.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {}
			@Override
			public void mousePressed(MouseEvent e) {}
			@Override
			public void mouseExited(MouseEvent e) {}
			@Override
			public void mouseEntered(MouseEvent e) {}
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount() >= 1) {
					ckMegaSena.setSelected(false);
					ckQuina.setSelected(false);
					quantidadeMegaIsSelected(false);
					quantidadeLotofacilIsSelected(false);
					ckLotoFacil15.setSelected(true);
					acaoCheckbox();
					limparCampos();
					quantidadeNumeros = 15;
				}
			}
		});
	}
	
	private void acaoCheckQuantidadeMega() {
		tratarCheckMega(ckMega6, "m6");
		tratarCheckMega(ckMega7, "m7");
		tratarCheckMega(ckMega8, "m8");
		tratarCheckMega(ckMega9, "m9");
		tratarCheckMega(ckMega10, "m10");
		tratarCheckMega(ckMega11, "m11");
		tratarCheckMega(ckMega12, "m12");
		tratarCheckMega(ckMega13, "m13");
		tratarCheckMega(ckMega14, "m14");
		tratarCheckMega(ckMega15, "m15");
	}
	
	private void acaoCheckQuantidadeLotofacil() {
		tratarCheckLotofacil(ckLotoFacil15, "l15");
		tratarCheckLotofacil(ckLotoFacil16, "l16");
		tratarCheckLotofacil(ckLotoFacil17, "l17");
		tratarCheckLotofacil(ckLotoFacil18, "l18");
	}
	
	private void tratarCheckMega(final JCheckBox checkBox, final String tipo) {
		checkBox.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {
			}
			@Override
			public void mousePressed(MouseEvent e) {
			}
			@Override
			public void mouseExited(MouseEvent e) {
			}
			@Override
			public void mouseEntered(MouseEvent e) {
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				quantidadeMegaIsSelected(false);
				marcarCheckBox(checkBox, tipo);
				limparCampos();
			}
		});
	}
	
	private void tratarCheckLotofacil(final JCheckBox checkBox, final String tipo) {
		checkBox.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {
			}
			@Override
			public void mousePressed(MouseEvent e) {
			}
			@Override
			public void mouseExited(MouseEvent e) {
			}
			@Override
			public void mouseEntered(MouseEvent e) {
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				quantidadeLotofacilIsSelected(false);
				marcarCheckBox(checkBox, tipo);
				limparCampos();
			}
		});
	}
	
	private void marcarCheckBox(JCheckBox checkBox, String tipo) {
		switch (tipo) {
		case "m6":
			ckMega6.setSelected(true);
			quantidadeNumeros = 6;
			break;
		case "m7":
			ckMega7.setSelected(true);
			quantidadeNumeros = 7;
			break;
		case "m8":
			ckMega8.setSelected(true);
			quantidadeNumeros = 8;
			break;
		case "m9":
			ckMega9.setSelected(true);
			quantidadeNumeros = 9;
			break;
		case "m10":
			ckMega10.setSelected(true);
			quantidadeNumeros = 10;
			break;
		case "m11":
			ckMega11.setSelected(true);
			quantidadeNumeros = 11;
			break;
		case "m12":
			ckMega12.setSelected(true);
			quantidadeNumeros = 12;
			break;
		case "m13":
			ckMega13.setSelected(true);
			quantidadeNumeros = 13;
			break;
		case "m14":
			ckMega14.setSelected(true);
			quantidadeNumeros = 14;
			break;
		case "m15":
			ckMega15.setSelected(true);
			quantidadeNumeros = 15;
			break;
		case "l15":
			ckLotoFacil15.setSelected(true);
			quantidadeNumeros = 15;
			break;
		case "l16":
			ckLotoFacil16.setSelected(true);
			quantidadeNumeros = 16;
			break;
		case "l17":
			ckLotoFacil17.setSelected(true);
			quantidadeNumeros = 17;
			break;
		case "l18":
			ckLotoFacil18.setSelected(true);
			quantidadeNumeros = 18;
			break;
		}
	}
	
	private void quantidadeMegaIsSelected(boolean flag) {
		ckMega6.setSelected(flag);
		ckMega7.setSelected(flag);
		ckMega8.setSelected(flag);
		ckMega9.setSelected(flag);
		ckMega10.setSelected(flag);
		ckMega11.setSelected(flag);
		ckMega12.setSelected(flag);
		ckMega13.setSelected(flag);
		ckMega14.setSelected(flag);
		ckMega15.setSelected(flag);
	}
	
	private void quantidadeLotofacilIsSelected(boolean flag) {
		ckLotoFacil15.setSelected(flag);
		ckLotoFacil16.setSelected(flag);
		ckLotoFacil17.setSelected(flag);
		ckLotoFacil18.setSelected(flag);
	}
	
	private void acaoBtnFechar() {
		btnFechar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
	}
	
	private void acaoBtnSortear() {
		btnSortear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Loterias loterias = new Loterias();

				if(ckMegaSena.isSelected()) {
					loterias.sortearNumerosMegaSena(quantidadeNumeros);
					txtNumerosSorteados.setText(loterias.getNumerosSorteados());
				} else if(ckQuina.isSelected()) {
					loterias.sortearNumerosQuina(quantidadeNumeros);
					txtNumerosSorteados.setText(loterias.getNumerosSorteados());
				} else if(ckLotofacil.isSelected()) {
					loterias.sortearNumerosLotofacil(quantidadeNumeros);
					txtNumerosSorteados.setText(loterias.getNumerosSorteados());
				}
				txtMensagem.setText(loterias.getMensagemBancaria());
			}
		});
	}

	/**
	 * Metodo responsavel por definir as
	 * acoes dos checkboxs.
	 */
	private void acaoCheckbox() {
		txtNumerosSorteados.setVisible(true);
		tratarCheckMegaSena();
		tratarCheckLotoFacil();
		tratarCheckQuina();
	}
	
	private void tratarCheckMegaSena() {
		if(ckMegaSena.isSelected()) {
			ckQuina.setSelected(false);
			ckLotofacil.setSelected(false);
			ckMega6.setVisible(true);
			ckMega7.setVisible(true);
			ckMega8.setVisible(true);
			ckMega9.setVisible(true);
			ckMega10.setVisible(true);
			ckMega11.setVisible(true);
			ckMega12.setVisible(true);
			ckMega13.setVisible(true);
			ckMega14.setVisible(true);
			ckMega15.setVisible(true);
			lbQuantidadeNumeros.setVisible(true);
			ckLotoFacil15.setVisible(false);
			ckLotoFacil16.setVisible(false);
			ckLotoFacil17.setVisible(false);
			ckLotoFacil18.setVisible(false);
		}
	}
	
	private void tratarCheckLotoFacil() {
		if(ckLotofacil.isSelected()) {
			ckMegaSena.setSelected(false);
			ckQuina.setSelected(false);
			ckMega6.setVisible(false);
			ckMega7.setVisible(false);
			ckMega8.setVisible(false);
			ckMega9.setVisible(false);
			ckMega10.setVisible(false);
			ckMega11.setVisible(false);
			ckMega12.setVisible(false);
			ckMega13.setVisible(false);
			ckMega14.setVisible(false);
			ckMega15.setVisible(false);
			lbQuantidadeNumeros.setVisible(true);
			ckLotoFacil15.setVisible(true);
			ckLotoFacil16.setVisible(true);
			ckLotoFacil17.setVisible(true);
			ckLotoFacil18.setVisible(true);
		}
	}
	
	private void tratarCheckQuina() {
		if(ckQuina.isSelected()) {
			ckMegaSena.setSelected(false);
			ckLotofacil.setSelected(false);
			ckMega6.setVisible(false);
			ckMega7.setVisible(false);
			ckMega8.setVisible(false);
			ckMega9.setVisible(false);
			ckMega10.setVisible(false);
			ckMega11.setVisible(false);
			ckMega12.setVisible(false);
			ckMega13.setVisible(false);
			ckMega14.setVisible(false);
			ckMega15.setVisible(false);
			lbQuantidadeNumeros.setVisible(false);
			ckLotoFacil15.setVisible(false);
			ckLotoFacil16.setVisible(false);
			ckLotoFacil17.setVisible(false);
			ckLotoFacil18.setVisible(false);
		}
	}

	private void definirNomeComponente() {
		lbQuantidadeNumeros.setText(LabelsEnum.QUANTIDADENUMEROS.getDescricao());
		lbNumerosSorteados.setText(LabelsEnum.NUMEROSSORTEADOS.getDescricao());
		definirNomeMega();
		definirNomeLotofacil();
		
		ckQuina.setText(LabelsEnum.QUINA.getDescricao());
		btnSortear.setText(LabelsEnum.BTNSORTEAR.getDescricao());
		btnFechar.setText(LabelsEnum.BTNFECHAR.getDescricao());
	}
	
	private void definirNomeMega() {
		ckMegaSena.setText(LabelsEnum.MEGASENA.getDescricao());
		ckMega6.setText("6");
		ckMega7.setText("7");
		ckMega8.setText("8");
		ckMega9.setText("9");
		ckMega10.setText("10");
		ckMega11.setText("11");
		ckMega12.setText("12");
		ckMega13.setText("13");
		ckMega14.setText("14");
		ckMega15.setText("15");
	}
	
	private void definirNomeLotofacil() {
		ckLotofacil.setText(LabelsEnum.LOTOFACIL.getDescricao());
		ckLotoFacil15.setText("15");
		ckLotoFacil16.setText("16");
		ckLotoFacil17.setText("17");
		ckLotoFacil18.setText("18");
	}

	private void definirTamanhoComponentes() {
		definirTamanhoComponenteMega();
		definirTamanhoComponenteQuina();
		definirTamanhoComponenteLotofacil();
		definirTamanhoComponenteLabels();
		definirTamanhoComponenteTextos();
		definirTamanhoComponenteBotoes();
	}
	
	private void definirTamanhoComponenteLabels() {
		lbQuantidadeNumeros.setBounds(new Rectangle(30, 50, 150, 25));
		lbNumerosSorteados.setBounds(new Rectangle(30, 95, 150, 25));
	}
	
	private void definirTamanhoComponenteMega() {
		ckMegaSena.setBounds(new Rectangle(20, 10, 110, 25));
		ckMega6.setBounds(new Rectangle(180, 50, 50, 25));
		ckMega7.setBounds(new Rectangle(230, 50, 50, 25));
		ckMega8.setBounds(new Rectangle(280, 50, 50, 25));
		ckMega9.setBounds(new Rectangle(330, 50, 50, 25));
		ckMega10.setBounds(new Rectangle(380, 50, 50, 25));
		ckMega11.setBounds(new Rectangle(430, 50, 50, 25));
		ckMega12.setBounds(new Rectangle(480, 50, 50, 25));
		ckMega13.setBounds(new Rectangle(530, 50, 50, 25));
		ckMega14.setBounds(new Rectangle(580, 50, 50, 25));
		ckMega15.setBounds(new Rectangle(630, 50, 50, 25));
	}
	
	private void definirTamanhoComponenteQuina() {
		ckQuina.setBounds(new Rectangle(150, 10, 110, 25));		
	}
	
	private void definirTamanhoComponenteLotofacil() {
		ckLotofacil.setBounds(new Rectangle(280, 10, 110, 25));
		ckLotoFacil15.setBounds(new Rectangle(180, 50, 50, 25));
		ckLotoFacil16.setBounds(new Rectangle(230, 50, 50, 25));
		ckLotoFacil17.setBounds(new Rectangle(280, 50, 50, 25));
		ckLotoFacil18.setBounds(new Rectangle(330, 50, 50, 25));
	}
	
	private void definirTamanhoComponenteTextos() {
		txtMensagem.setBounds(new Rectangle(30, 130, 720, 70));
		txtNumerosSorteados.setBounds(new Rectangle(180, 95, 550, 25));
	}
	
	private void definirTamanhoComponenteBotoes() {
		btnSortear.setBounds(new Rectangle(270, 230, 90, 25));
		btnFechar.setBounds(new Rectangle(410, 230, 90, 25));
	}

	private void habilitarComponentes() {
		txtNumerosSorteados.setEditable(false);
		txtMensagem.setEditable(false);
	}

	private void adicionarComponentesNoLayout() {
		jContentPane.add(lbQuantidadeNumeros, null);
		jContentPane.add(lbNumerosSorteados, null);
		jContentPane.add(getTxtNumerosSorteados(), null);
		jContentPane.add(getTxtMensagem(), null);
		jContentPane.add(getCkMegaSena(), null);
		jContentPane.add(getCkLotofacil(), null);
		
		jContentPane.add(getCkMega6(), null);
		jContentPane.add(getCkMega7(), null);
		jContentPane.add(getCkMega8(), null);
		jContentPane.add(getCkMega9(), null);
		jContentPane.add(getCkMega10(), null);
		jContentPane.add(getCkMega11(), null);
		jContentPane.add(getCkMega12(), null);
		jContentPane.add(getCkMega13(), null);
		jContentPane.add(getCkMega14(), null);
		jContentPane.add(getCkMega15(), null);
		
		jContentPane.add(getCkLotoFacil15(), null);
		jContentPane.add(getCkLotoFacil16(), null);
		jContentPane.add(getCkLotoFacil17(), null);
		jContentPane.add(getCkLotoFacil18(), null);
		
		jContentPane.add(getCkQuina(), null);
		jContentPane.add(getBtnSortear(), null);
		jContentPane.add(getBtnFechar(), null);
	}

	private JPanel getJContentPane() {
		if (jContentPane == null) {
			lbQuantidadeNumeros = new JLabel();
			lbNumerosSorteados = new JLabel();
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
		}
		return jContentPane;
	}

	public JTextArea getTxtMensagem() {
		if(txtMensagem == null) {
			txtMensagem = new JTextArea();
		}
		return txtMensagem;
	}
	
	private JTextField getTxtNumerosSorteados() {
		if (txtNumerosSorteados == null) {
			txtNumerosSorteados = new JTextField();
		}
		return txtNumerosSorteados;
	}

	private JCheckBox getCkMegaSena() {
		if(ckMegaSena == null) {
			ckMegaSena = new JCheckBox();
		}
		return ckMegaSena;
	}

	private JCheckBox getCkLotofacil() {
		if(ckLotofacil == null) {
			ckLotofacil = new JCheckBox();
		}
		return ckLotofacil;
	}

	private JCheckBox getCkQuina() {
		if(ckQuina == null) {
			ckQuina = new JCheckBox();
		}
		return ckQuina;
	}

	private JButton getBtnSortear() {
		if (btnSortear == null) {
			btnSortear = new JButton();
		}
		return btnSortear;
	}

	private JButton getBtnFechar() {
		if (btnFechar == null) {
			btnFechar = new JButton();
		}
		return btnFechar;
	}

	public JCheckBox getCkMega6() {
		if(ckMega6 == null) {
			ckMega6 = new JCheckBox();
		}
		return ckMega6;
	}

	public JCheckBox getCkMega7() {
		if(ckMega7 == null) {
			ckMega7 = new JCheckBox();
		}
		return ckMega7;
	}

	public JCheckBox getCkMega8() {
		if(ckMega8 == null) {
			ckMega8 = new JCheckBox();
		}
		return ckMega8;
	}

	public JCheckBox getCkMega9() {
		if(ckMega9 == null) {
			ckMega9 = new JCheckBox();
		}
		return ckMega9;
	}

	public JCheckBox getCkMega10() {
		if(ckMega10 == null) {
			ckMega10 = new JCheckBox();
		}
		return ckMega10;
	}

	public JCheckBox getCkMega11() {
		if(ckMega11 == null) {
			ckMega11 = new JCheckBox();
		}
		return ckMega11;
	}

	public JCheckBox getCkMega12() {
		if(ckMega12 == null) {
			ckMega12 = new JCheckBox();
		}
		return ckMega12;
	}

	public JCheckBox getCkMega13() {
		if(ckMega13 == null) {
			ckMega13 = new JCheckBox();
		}
		return ckMega13;
	}

	public JCheckBox getCkMega14() {
		if(ckMega14 == null) {
			ckMega14 = new JCheckBox();
		}
		return ckMega14;
	}

	public JCheckBox getCkMega15() {
		if(ckMega15 == null) {
			ckMega15 = new JCheckBox();
		}
		return ckMega15;
	}

	public JCheckBox getCkLotoFacil15() {
		if(ckLotoFacil15 == null) {
			ckLotoFacil15 = new JCheckBox();
		}
		return ckLotoFacil15;
	}

	public JCheckBox getCkLotoFacil16() {
		if(ckLotoFacil16 == null) {
			ckLotoFacil16 = new JCheckBox();
		}
		return ckLotoFacil16;
	}

	public JCheckBox getCkLotoFacil17() {
		if(ckLotoFacil17 == null) {
			ckLotoFacil17 = new JCheckBox();
		}
		return ckLotoFacil17;
	}

	public JCheckBox getCkLotoFacil18() {
		if(ckLotoFacil18 == null) {
			ckLotoFacil18 = new JCheckBox();
		}
		return ckLotoFacil18;
	}


}
