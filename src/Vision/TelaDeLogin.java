package Vision;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaDeLogin extends JFrame {
	private JTextField textFieldUser;
	private JTextField textFieldSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaDeLogin frame = new TelaDeLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaDeLogin() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 523, 318);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		JButton btnLogar = new JButton("Logar");
		btnLogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaPrincipal tela = new TelaPrincipal();
				tela.setVisible(true);
				dispose();
			}
		});
		btnLogar.setBounds(35, 219, 89, 23);
		getContentPane().add(btnLogar);

		JButton btnSair = new JButton("Sair");
		btnSair.setBounds(164, 219, 89, 23);
		getContentPane().add(btnSair);
	
		JLabel lblLogin = new JLabel("User:");
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblLogin.setBounds(35, 81, 46, 14);
		getContentPane().add(lblLogin);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSenha.setBounds(35, 124, 62, 14);
		getContentPane().add(lblSenha);
		
		textFieldUser = new JTextField();
		textFieldUser.setBounds(91, 80, 130, 20);
		getContentPane().add(textFieldUser);
		textFieldUser.setColumns(10);
		
		textFieldSenha = new JTextField();
		textFieldSenha.setBounds(91, 123, 130, 20);
		getContentPane().add(textFieldSenha);
		textFieldSenha.setColumns(10);
		
		
		JLabel lblWallpaperTelaLogin = new JLabel("");
		lblWallpaperTelaLogin.setIcon(new ImageIcon(TelaDeLogin.class.getResource("/Imagens/FundoTelaLogin.png")));
		lblWallpaperTelaLogin.setBounds(0, -93, 577, 462);
		getContentPane().add(lblWallpaperTelaLogin);
		
		
	}
}
