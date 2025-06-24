import model.User;
import controller.UserControl;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroDePessoa extends JFrame {

    private JTextField txtNome;
    private JComboBox<String> cmbTipo;
    private JTextField txtCpfCnpj;
    private JCheckBox chkFornecedor;
    private JTextField txtRgInscricaoEstadual;
    private JTextField txtOrgaoExpedidor;
    private JTextField txtEmail;
    private JTextField txtCep;
    private JTextField txtPais;
    private JTextField txtUf;
    private JTextField txtMunicipio;
    private JTextField txtLogradouro;
    private JTextField txtNumero;
    private JTextField txtComplemento;
    private JTextField txtBairro;
    private JTextField txtTelefone;
    private JRadioButton rbAtivo;
    private JRadioButton rbInativo;
    private ButtonGroup bgSituacao;

    private UserControl userControl;
    private User currentUser;

    public CadastroDePessoa() {
        setTitle("Cadastro de Pessoa");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(780, 560);
        setResizable(false);
        setLocationRelativeTo(null);

        userControl = new UserControl();
        currentUser = new User();

        JPanel contentPane = new JPanel();
        contentPane.setBackground(new Color(240, 240, 240));
        contentPane.setLayout(null);
        setContentPane(contentPane);

        JLabel lblCadastroDePessoa = new JLabel("Cadastro de Pessoa");
        lblCadastroDePessoa.setFont(new Font("Arial", Font.BOLD, 28));
        lblCadastroDePessoa.setForeground(new Color(230, 90, 30));
        lblCadastroDePessoa.setBounds(30, 20, 300, 35);
        contentPane.add(lblCadastroDePessoa);

        JLabel lblTipo = new JLabel("Tipo");
        lblTipo.setBounds(30, 80, 60, 25);
        contentPane.add(lblTipo);

        cmbTipo = new JComboBox<>(new String[]{"Física", "Jurídica"});
        cmbTipo.setBounds(90, 80, 100, 25);
        cmbTipo.setSelectedItem("Física");
        cmbTipo.setBackground(Color.WHITE);
        contentPane.add(cmbTipo);

        JLabel lblCpfCnpj = new JLabel("CPF / CNPJ ...");
        lblCpfCnpj.setBounds(230, 80, 80, 25);
        contentPane.add(lblCpfCnpj);

        txtCpfCnpj = new JTextField();
        txtCpfCnpj.setBounds(310, 80, 210, 25);
        txtCpfCnpj.setBackground(new Color(235, 235, 235));
        contentPane.add(txtCpfCnpj);

        chkFornecedor = new JCheckBox("Fornecedor");
        chkFornecedor.setBounds(580, 80, 100, 25);
        chkFornecedor.setBackground(new Color(240, 240, 240));
        contentPane.add(chkFornecedor);

        JLabel lblNome = new JLabel("Nome");
        lblNome.setBounds(30, 120, 60, 25);
        contentPane.add(lblNome);

        txtNome = new JTextField();
        txtNome.setBounds(90, 120, 630, 25);
        txtNome.setBackground(new Color(235, 235, 235));
        contentPane.add(txtNome);

        JLabel lblRgInscricaoEstadual = new JLabel("RG / Inscrição Estadual");
        lblRgInscricaoEstadual.setBounds(30, 160, 140, 25);
        contentPane.add(lblRgInscricaoEstadual);

        txtRgInscricaoEstadual = new JTextField();
        txtRgInscricaoEstadual.setBounds(180, 160, 210, 25);
        txtRgInscricaoEstadual.setBackground(new Color(235, 235, 235));
        contentPane.add(txtRgInscricaoEstadual);

        JLabel lblOrgaoExpedidor = new JLabel("Orgão Expedidor");
        lblOrgaoExpedidor.setBounds(410, 160, 100, 25);
        contentPane.add(lblOrgaoExpedidor);

        txtOrgaoExpedidor = new JTextField();
        txtOrgaoExpedidor.setBounds(520, 160, 200, 25);
        txtOrgaoExpedidor.setBackground(new Color(235, 235, 235));
        contentPane.add(txtOrgaoExpedidor);

        JLabel lblEmail = new JLabel("Email");
        lblEmail.setBounds(30, 200, 60, 25);
        contentPane.add(lblEmail);

        txtEmail = new JTextField();
        txtEmail.setBounds(90, 200, 430, 25);
        txtEmail.setBackground(new Color(235, 235, 235));
        contentPane.add(txtEmail);

        JLabel lblCep = new JLabel("CEP");
        lblCep.setBounds(540, 200, 40, 25);
        contentPane.add(lblCep);

        txtCep = new JTextField();
        txtCep.setBounds(580, 200, 140, 25);
        txtCep.setBackground(new Color(235, 235, 235));
        contentPane.add(txtCep);

        JLabel lblPais = new JLabel("País");
        lblPais.setBounds(30, 240, 60, 25);
        contentPane.add(lblPais);

        txtPais = new JTextField("BRASIL");
        txtPais.setBounds(90, 240, 300, 25);
        txtPais.setBackground(new Color(235, 235, 235));
        txtPais.setEditable(false);
        txtPais.setBorder(new LineBorder(new Color(180, 180, 180)));
        contentPane.add(txtPais);

        JLabel lblUf = new JLabel("UF ...");
        lblUf.setBounds(410, 240, 40, 25);
        contentPane.add(lblUf);

        txtUf = new JTextField();
        txtUf.setBounds(460, 240, 60, 25);
        txtUf.setBackground(new Color(235, 235, 235));
        contentPane.add(txtUf);

        JLabel lblMunicipio = new JLabel("Município ...");
        lblMunicipio.setBounds(30, 280, 80, 25);
        contentPane.add(lblMunicipio);

        txtMunicipio = new JTextField();
        txtMunicipio.setBounds(120, 280, 600, 25);
        txtMunicipio.setBackground(new Color(235, 235, 235));
        txtMunicipio.setEditable(false);
        txtMunicipio.setBorder(new LineBorder(new Color(180, 180, 180)));
        contentPane.add(txtMunicipio);

        JLabel lblLogradouro = new JLabel("Logradouro");
        lblLogradouro.setBounds(30, 320, 80, 25);
        contentPane.add(lblLogradouro);

        txtLogradouro = new JTextField();
        txtLogradouro.setBounds(120, 320, 600, 25);
        txtLogradouro.setBackground(new Color(235, 235, 235));
        contentPane.add(txtLogradouro);

        JLabel lblNumero = new JLabel("Número");
        lblNumero.setBounds(30, 360, 60, 25);
        contentPane.add(lblNumero);

        txtNumero = new JTextField();
        txtNumero.setBounds(90, 360, 100, 25);
        txtNumero.setBackground(new Color(235, 235, 235));
        contentPane.add(txtNumero);

        JLabel lblComplemento = new JLabel("Complemento");
        lblComplemento.setBounds(220, 360, 90, 25);
        contentPane.add(lblComplemento);

        txtComplemento = new JTextField();
        txtComplemento.setBounds(320, 360, 150, 25);
        txtComplemento.setBackground(new Color(235, 235, 235));
        contentPane.add(txtComplemento);

        JLabel lblBairro = new JLabel("Bairro");
        lblBairro.setBounds(30, 400, 60, 25);
        contentPane.add(lblBairro);

        txtBairro = new JTextField();
        txtBairro.setBounds(90, 400, 150, 25);
        txtBairro.setBackground(new Color(235, 235, 235));
        contentPane.add(txtBairro);

        JLabel lblTelefone = new JLabel("Telefone");
        lblTelefone.setBounds(270, 400, 60, 25);
        contentPane.add(lblTelefone);

        txtTelefone = new JTextField();
        txtTelefone.setBounds(340, 400, 130, 25);
        txtTelefone.setBackground(new Color(235, 235, 235));
        contentPane.add(txtTelefone);

        JLabel lblSituacao = new JLabel("Situação");
        lblSituacao.setBounds(500, 400, 70, 25);
        contentPane.add(lblSituacao);

        rbAtivo = new JRadioButton("Ativo");
        rbAtivo.setBounds(580, 400, 60, 25);
        rbAtivo.setBackground(new Color(240, 240, 240));
        rbAtivo.setSelected(true);
        contentPane.add(rbAtivo);

        rbInativo = new JRadioButton("Inativo");
        rbInativo.setBounds(650, 400, 70, 25);
        rbInativo.setBackground(new Color(240, 240, 240));
        contentPane.add(rbInativo);

        bgSituacao = new ButtonGroup();
        bgSituacao.add(rbAtivo);
        bgSituacao.add(rbInativo);

        JButton btnConfirmar = new JButton("Confirmar");
        btnConfirmar.setBounds(30, 460, 100, 35);
        btnConfirmar.setBackground(new Color(230, 90, 30));
        btnConfirmar.setForeground(Color.WHITE);
        btnConfirmar.setFont(new Font("Arial", Font.BOLD, 14));
        btnConfirmar.setBorderPainted(false);
        contentPane.add(btnConfirmar);

        JButton btnExcluir = new JButton("Excluir");
        btnExcluir.setBounds(150, 460, 100, 35);
        btnExcluir.setBackground(new Color(230, 90, 30));
        btnExcluir.setForeground(Color.WHITE);
        btnExcluir.setFont(new Font("Arial", Font.BOLD, 14));
        btnExcluir.setBorderPainted(false);
        contentPane.add(btnExcluir);

        JButton btnLimpar = new JButton("Limpar");
        btnLimpar.setBounds(270, 460, 100, 35);
        btnLimpar.setBackground(new Color(200, 200, 200));
        btnLimpar.setForeground(Color.BLACK);
        btnLimpar.setFont(new Font("Arial", Font.BOLD, 14));
        btnLimpar.setBorderPainted(false);
        contentPane.add(btnLimpar);

        btnConfirmar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                populateUserFromForm();
                userControl.salvarPessoa(currentUser);
                JOptionPane.showMessageDialog(CadastroDePessoa.this, "Dados confirmados e salvos (simulação no console)!");
            }
        });

        btnExcluir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                populateUserFromForm();
                userControl.excluirPessoa(currentUser);
                JOptionPane.showMessageDialog(CadastroDePessoa.this, "Dados excluídos (simulação no console)!");
                clearForm();
            }
        });

        btnLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userControl.limparCampos(currentUser);
                clearForm();
                JOptionPane.showMessageDialog(CadastroDePessoa.this, "Campos limpos!");
            }
        });
    }

    private void populateUserFromForm() {
        currentUser.setNome(txtNome.getText());
        currentUser.setCpfCnpj(txtCpfCnpj.getText());
        currentUser.setEmail(txtEmail.getText());
        currentUser.setRg(txtRgInscricaoEstadual.getText());
        currentUser.setOrgaoExpedidor(txtOrgaoExpedidor.getText());
        currentUser.setCep(txtCep.getText());
        currentUser.setPais(txtPais.getText());
        currentUser.setUf(txtUf.getText());
        currentUser.setMunicipio(txtMunicipio.getText());
        currentUser.setLogradouro(txtLogradouro.getText());
        currentUser.setNumero(txtNumero.getText());
        currentUser.setComplemento(txtComplemento.getText());
        currentUser.setBairro(txtBairro.getText());
        currentUser.setTelefone(txtTelefone.getText());
        currentUser.setFornecedor(chkFornecedor.isSelected());
        currentUser.setAtivo(rbAtivo.isSelected());
    }

    private void clearForm() {
        txtNome.setText("");
        txtCpfCnpj.setText("");
        txtEmail.setText("");
        txtRgInscricaoEstadual.setText("");
        txtOrgaoExpedidor.setText("");
        txtCep.setText("");
        txtPais.setText("BRASIL");
        txtUf.setText("");
        txtMunicipio.setText("");
        txtLogradouro.setText("");
        txtNumero.setText("");
        txtComplemento.setText("");
        txtBairro.setText("");
        txtTelefone.setText("");
        chkFornecedor.setSelected(false);
        rbAtivo.setSelected(true);
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CadastroDePessoa().setVisible(true);
            }
        });
    }
}