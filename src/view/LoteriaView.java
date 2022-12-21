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
	private JTextField txtNumerosSorteadosMegaSena = null;
	private JTextField txtNumerosSorteadosLotofacil = null;
	private JTextField txtNumerosSorteadosQuina = null;
	private JTextArea txtMensagem = null;
	private JButton btnSortear = null;
	private JButton btnFechar = null;

	private JCheckBox ckMegaSena = null;
	private JCheckBox ckLotofacil = null;
	private JCheckBox ckQuina = null;
	
	private JCheckBox ckLotofacil16 = null;
	private JCheckBox ckLotofacil17 = null;
	private JCheckBox ckLotofacil18 = null;

	private JTextField txtNumerosSorteadosLotofacil16 = null;
	private JTextField txtNumerosSorteadosLotofacil17 = null;
	private JTextField txtNumerosSorteadosLotofacil18 = null;

	public LoteriaView() throws HeadlessException {
		super();
		initialize();
	}

	public void initialize() {
		this.setSize(800, 235);
		this.setContentPane(getJContentPane());
		this.setTitle(LabelsEnum.TITULO.getDescricao());
		adicionarComponentesNoLayout();
		ckMegaSena.setSelected(true);
		acaoCheckbox();
		acaoComponentes();
		definirNomeComponente();
		definirTamanhoComponentes();
		habilitarComponentes();
	}

	private void limparCampos() {
		txtMensagem.setText("");
		txtNumerosSorteadosLotofacil.setText("");
		txtNumerosSorteadosMegaSena.setText("");
		txtNumerosSorteadosQuina.setText("");
		
		txtNumerosSorteadosLotofacil16.setText("");
		txtNumerosSorteadosLotofacil17.setText("");
		txtNumerosSorteadosLotofacil18.setText("");
	}

	/**
	 * Metodo responsavel pelas as acoes dos componentes.
	 */
	private void acaoComponentes() {
		acaoCheckMegaSena();
		acaoCheckQuina();
		acaoCheckLotofacil();
		acaoCheckLotofacil16();
		acaoCheckLotofacil17();
		acaoCheckLotofacil18();
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
					ckLotofacil16.setSelected(false);
					ckLotofacil17.setSelected(false);
					ckLotofacil18.setSelected(false);
					acaoCheckbox();
					limparCampos();

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
					ckLotofacil16.setSelected(false);
					ckLotofacil17.setSelected(false);
					ckLotofacil18.setSelected(false);
					acaoCheckbox();
					limparCampos();
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
					ckLotofacil16.setSelected(false);
					ckLotofacil17.setSelected(false);
					ckLotofacil18.setSelected(false);
					acaoCheckbox();
					limparCampos();
				}
			}
		});
	}
	
	private void acaoCheckLotofacil16() {
		ckLotofacil16.addMouseListener(new MouseListener() {
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
					ckLotofacil.setSelected(false);
					ckLotofacil17.setSelected(false);
					ckLotofacil18.setSelected(false);
					acaoCheckbox();
					limparCampos();
				}
			}
		});
	}
	private void acaoCheckLotofacil17() {
		ckLotofacil17.addMouseListener(new MouseListener() {
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
					ckLotofacil.setSelected(false);
					ckLotofacil16.setSelected(false);
					ckLotofacil18.setSelected(false);
					acaoCheckbox();
					limparCampos();
				}
			}
		});
	}
	
	private void acaoCheckLotofacil18() {
		ckLotofacil18.addMouseListener(new MouseListener() {
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
					ckLotofacil.setSelected(false);
					ckLotofacil16.setSelected(false);
					ckLotofacil17.setSelected(false);
					acaoCheckbox();
					limparCampos();
				}
			}
		});
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
					loterias.sortearNumerosMegaSena();
					txtNumerosSorteadosMegaSena.setText(loterias.getNumerosSorteados());
				} else if(ckQuina.isSelected()) {
					loterias.sortearNumerosQuina();
					txtNumerosSorteadosQuina.setText(loterias.getNumerosSorteados());
				} else if(ckLotofacil.isSelected()) {
					loterias.sortearNumerosLotofacil(15);
					txtNumerosSorteadosLotofacil.setText(loterias.getNumerosSorteados());
				} else if(ckLotofacil16.isSelected()) {
					loterias.sortearNumerosLotofacil(16);
					txtNumerosSorteadosLotofacil16.setText(loterias.getNumerosSorteados());
				} else if(ckLotofacil17.isSelected()) {
					loterias.sortearNumerosLotofacil(17);
					txtNumerosSorteadosLotofacil17.setText(loterias.getNumerosSorteados());
				} else if(ckLotofacil18.isSelected()) {
					loterias.sortearNumerosLotofacil(18);
					txtNumerosSorteadosLotofacil18.setText(loterias.getNumerosSorteados());
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
		if(ckMegaSena.isSelected()) {
			ckQuina.setSelected(false);
			ckLotofacil.setSelected(false);
			ckLotofacil16.setSelected(false);
			ckLotofacil17.setSelected(false);
			ckLotofacil18.setSelected(false);
			txtNumerosSorteadosLotofacil.setVisible(false);
			txtNumerosSorteadosLotofacil16.setVisible(false);
			txtNumerosSorteadosLotofacil17.setVisible(false);
			txtNumerosSorteadosLotofacil18.setVisible(false);
			txtNumerosSorteadosQuina.setVisible(false);
			txtNumerosSorteadosMegaSena.setVisible(true);
		}

		if(ckLotofacil.isSelected()) {
			ckMegaSena.setSelected(false);
			ckQuina.setSelected(false);
			ckLotofacil16.setSelected(false);
			ckLotofacil17.setSelected(false);
			ckLotofacil18.setSelected(false);
			txtNumerosSorteadosMegaSena.setVisible(false);
			txtNumerosSorteadosQuina.setVisible(false);
			txtNumerosSorteadosLotofacil16.setVisible(false);
			txtNumerosSorteadosLotofacil17.setVisible(false);
			txtNumerosSorteadosLotofacil18.setVisible(false);
			txtNumerosSorteadosLotofacil.setVisible(true);
		}
		
		if(ckLotofacil16.isSelected()) {
			ckLotofacil16.setSelected(true);
			ckMegaSena.setSelected(false);
			ckQuina.setSelected(false);
			ckLotofacil.setSelected(false);
			ckLotofacil17.setSelected(false);
			ckLotofacil18.setSelected(false);
			txtNumerosSorteadosMegaSena.setVisible(false);
			txtNumerosSorteadosQuina.setVisible(false);
			txtNumerosSorteadosLotofacil.setVisible(false);
			txtNumerosSorteadosLotofacil17.setVisible(false);
			txtNumerosSorteadosLotofacil18.setVisible(false);
			txtNumerosSorteadosLotofacil16.setVisible(true);
		}
		
		if(ckLotofacil17.isSelected()) {
			ckLotofacil17.setSelected(true);
			ckMegaSena.setSelected(false);
			ckQuina.setSelected(false);
			ckLotofacil.setSelected(false);
			ckLotofacil16.setSelected(false);
			ckLotofacil18.setSelected(false);
			txtNumerosSorteadosMegaSena.setVisible(false);
			txtNumerosSorteadosQuina.setVisible(false);
			txtNumerosSorteadosLotofacil.setVisible(false);
			txtNumerosSorteadosLotofacil16.setVisible(false);
			txtNumerosSorteadosLotofacil18.setVisible(false);
			txtNumerosSorteadosLotofacil17.setVisible(true);
		}
		
		if(ckLotofacil18.isSelected()) {
			ckLotofacil18.setSelected(true);
			ckMegaSena.setSelected(false);
			ckQuina.setSelected(false);
			ckLotofacil.setSelected(false);
			ckLotofacil17.setSelected(false);
			txtNumerosSorteadosMegaSena.setVisible(false);
			txtNumerosSorteadosQuina.setVisible(false);
			txtNumerosSorteadosLotofacil.setVisible(false);
			txtNumerosSorteadosLotofacil16.setVisible(false);
			txtNumerosSorteadosLotofacil17.setVisible(false);
			txtNumerosSorteadosLotofacil18.setVisible(true);

		}

		if(ckQuina.isSelected()) {
			ckLotofacil.setSelected(false);
			ckMegaSena.setSelected(false);
			txtNumerosSorteadosMegaSena.setVisible(false);
			txtNumerosSorteadosLotofacil.setVisible(false);
			txtNumerosSorteadosLotofacil16.setVisible(false);
			txtNumerosSorteadosLotofacil17.setVisible(false);
			txtNumerosSorteadosLotofacil18.setVisible(false);
			txtNumerosSorteadosQuina.setVisible(true);
		}
	}

	private void definirNomeComponente() {
		lbNumerosSorteados.setText(LabelsEnum.NUMEROSSORTEADOS.getDescricao());
		ckMegaSena.setText(LabelsEnum.MEGASENA.getDescricao());
		ckLotofacil.setText(LabelsEnum.LOTOFACIL15.getDescricao());
		ckLotofacil16.setText(LabelsEnum.LOTOFACIL16.getDescricao());
		ckLotofacil17.setText(LabelsEnum.LOTOFACIL17.getDescricao());
		ckLotofacil18.setText(LabelsEnum.LOTOFACIL18.getDescricao());
		ckQuina.setText(LabelsEnum.QUINA.getDescricao());
		btnSortear.setText(LabelsEnum.BTNSORTEAR.getDescricao());
		btnFechar.setText(LabelsEnum.BTNFECHAR.getDescricao());
	}

	private void definirTamanhoComponentes() {
		lbNumerosSorteados.setBounds(new Rectangle(30, 45, 150, 25));
		txtMensagem.setBounds(new Rectangle(30, 80, 720, 70));
		txtNumerosSorteadosMegaSena.setBounds(new Rectangle(180, 45, 170, 25));
		txtNumerosSorteadosLotofacil.setBounds(new Rectangle(180, 45, 320, 25));
		txtNumerosSorteadosLotofacil16.setBounds(new Rectangle(180, 45, 350, 25));
		txtNumerosSorteadosLotofacil17.setBounds(new Rectangle(180, 45, 370, 25));
		txtNumerosSorteadosLotofacil18.setBounds(new Rectangle(180, 45, 390, 25));
		txtNumerosSorteadosQuina.setBounds(new Rectangle(180, 45, 150, 25));
		ckMegaSena.setBounds(new Rectangle(20, 10, 110, 25));
		ckQuina.setBounds(new Rectangle(150, 10, 110, 25));
		ckLotofacil.setBounds(new Rectangle(280, 10, 110, 25));
		ckLotofacil16.setBounds(new Rectangle(420, 10, 110, 25));
		ckLotofacil17.setBounds(new Rectangle(550, 10, 110, 25));
		ckLotofacil18.setBounds(new Rectangle(680, 10, 110, 25));
		btnSortear.setBounds(new Rectangle(270, 160, 90, 25));
		btnFechar.setBounds(new Rectangle(410, 160, 90, 25));
	}

	private void habilitarComponentes() {
		txtNumerosSorteadosMegaSena.setEditable(false);
		txtNumerosSorteadosLotofacil.setEditable(false);
		txtNumerosSorteadosLotofacil16.setEditable(false);
		txtNumerosSorteadosLotofacil17.setEditable(false);
		txtNumerosSorteadosLotofacil18.setEditable(false);
		txtNumerosSorteadosQuina.setEditable(false);
		txtMensagem.setEditable(false);
	}

	private void adicionarComponentesNoLayout() {
		jContentPane.add(lbNumerosSorteados, null);
		jContentPane.add(getTxtNumerosSorteadosMegaSena(), null);
		jContentPane.add(getTxtNumerosSorteadosLotofacil(), null);
		jContentPane.add(getTxtNumerosSorteadosLotofacil16(), null);
		jContentPane.add(getTxtNumerosSorteadosLotofacil17(), null);
		jContentPane.add(getTxtNumerosSorteadosLotofacil18(), null);
		jContentPane.add(getTxtNumerosSorteadosQuina(), null);
		jContentPane.add(getTxtMensagem(), null);
		jContentPane.add(getCkMegaSena(), null);
		jContentPane.add(getCkLotofacil(), null);
		jContentPane.add(getCkLotofacil16(), null);
		jContentPane.add(getCkLotofacil17(), null);
		jContentPane.add(getCkLotofacil18(), null);
		jContentPane.add(getCkQuina(), null);
		jContentPane.add(getBtnSortear(), null);
		jContentPane.add(getBtnFechar(), null);
	}

	private JPanel getJContentPane() {
		if (jContentPane == null) {
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

	private JTextField getTxtNumerosSorteadosMegaSena() {
		if (txtNumerosSorteadosMegaSena == null) {
			txtNumerosSorteadosMegaSena = new JTextField();
		}
		return txtNumerosSorteadosMegaSena;
	}

	private JTextField getTxtNumerosSorteadosLotofacil() {
		if (txtNumerosSorteadosLotofacil == null) {
			txtNumerosSorteadosLotofacil = new JTextField();
		}
		return txtNumerosSorteadosLotofacil;
	}

	private JTextField getTxtNumerosSorteadosQuina() {
		if (txtNumerosSorteadosQuina == null) {
			txtNumerosSorteadosQuina = new JTextField();
		}
		return txtNumerosSorteadosQuina;
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
	
	private JCheckBox getCkLotofacil16() {
		if(ckLotofacil16 == null) {
			ckLotofacil16 = new JCheckBox();
		}
		return ckLotofacil16;
	}
	
	private JCheckBox getCkLotofacil17() {
		if(ckLotofacil17 == null) {
			ckLotofacil17 = new JCheckBox();
		}
		return ckLotofacil17;
	}
	
	private JCheckBox getCkLotofacil18() {
		if(ckLotofacil18 == null) {
			ckLotofacil18 = new JCheckBox();
		}
		return ckLotofacil18;
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
	
	private JTextField getTxtNumerosSorteadosLotofacil16() {
		if (txtNumerosSorteadosLotofacil16 == null) {
			txtNumerosSorteadosLotofacil16 = new JTextField();
		}
		return txtNumerosSorteadosLotofacil16;
	}
	
	private JTextField getTxtNumerosSorteadosLotofacil17() {
		if (txtNumerosSorteadosLotofacil17 == null) {
			txtNumerosSorteadosLotofacil17 = new JTextField();
		}
		return txtNumerosSorteadosLotofacil17;
	}
	
	private JTextField getTxtNumerosSorteadosLotofacil18() {
		if (txtNumerosSorteadosLotofacil18 == null) {
			txtNumerosSorteadosLotofacil18 = new JTextField();
		}
		return txtNumerosSorteadosLotofacil18;
	}
}
