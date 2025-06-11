```java
import javax.swing.*;

public class Principal extends JFrame {

    private JComboBox<String> cmbTipoPessoa;
    private JTextField txtCpfCnpj, txtNome, txtRg, txtOrgaoExpedidor, txtEmail,
            txtCep, txtPais, txtUf, txtMunicipio, txtLogradouro, txtNumero,
            txtComplemento, txtBairro, txtTelefone;
    private JCheckBox chkFornecedor;
    private JRadioButton rdbAtivo, rdbInativo;
    private ButtonGroup grupoSituacao;
    private JButton btnConfirmar, btnExcluir, btnLimpar;

    public Principal() {
        setTitle("Cadastro de Pessoa");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 600);
        setLocationRelativeTo(null);
        getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        JPanel painelTitulo = new JPanel();
        JLabel lblTitulo = new JLabel("Cadastro de Pessoa");
        lblTitulo.setFont(new Font(lblTitulo.getFont().getName(), Font.BOLD, 24));
        lblTitulo.setForeground(Color.ORANGE);
        painelTitulo.add(lblTitulo);
        add(painelTitulo);

        JPanel painelFormulario = new JPanel();
        painelFormulario.setLayout(new BoxLayout(painelFormulario, BoxLayout.Y_AXIS));
        painelFormulario.setBorder(new EmptyBorder(10, 10, 10, 10));

        JPanel linha1 = new JPanel();
        linha1.add(new JLabel("Tipo:"));
        cmbTipoPessoa = new JComboBox<>(new String[]{"Física", "Jurídica"});
        linha1.add(cmbTipoPessoa);
        linha1.add(new JLabel("CPF/CNPJ:"));
        txtCpfCnpj = new JTextField(15);
        linha1.add(txtCpfCnpj);
        linha1.add(new JLabel("Fornecedor:"));
        chkFornecedor = new JCheckBox();
        linha1.add(chkFornecedor);
        painelFormulario.add(linha1);

        JPanel linha2 = new JPanel();
        linha2.add(new JLabel("Nome:"));
        txtNome = new JTextField(30);
        linha2.add(txtNome);
        painelFormulario.add(linha2);

        JPanel linhaBotoes = new JPanel();
        btnConfirmar = new JButton("Confirmar");
        btnExcluir = new JButton("Excluir");
        btnLimpar = new JButton("Limpar");
        linhaBotoes.add(btnConfirmar);
        linhaBotoes.add(btnExcluir);
        linhaBotoes.add(btnLimpar);
        painelFormulario.add(linhaBotoes);

        add(painelFormulario);

        btnConfirmar.addActionListener(new javax.swing.event.ActionListener() {
            public void actionPerformed(javax.swing.event.ActionEvent evt) {
                confirmar();
            }
        });

        btnExcluir.addActionListener(new javax.swing.event.ActionListener() {
            public void actionPerformed(javax.swing.event.ActionEvent evt) {
                excluir();
            }
        });

        btnLimpar.addActionListener(new javax.swing.event.ActionListener() {
            public void actionPerformed(javax.swing.event.ActionEvent evt) {
                limpar();
            }
        });
    }

    private void confirmar() {
        JOptionPane.showMessageDialog(this, "Pessoa salva com sucesso!");
        limparCampos();
    }

    private void excluir() {
        if (!txtNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Pessoa excluída!");
            limparCampos();
        } else {
            JOptionPane.showMessageDialog(this, "Preencha o nome para excluir.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void limpar() {
        limparCampos();
        JOptionPane.showMessageDialog(this, "Campos limpos!");
    }

    private void limparCampos() {
        txtNome.setText("");
        txtCpfCnpj.setText("");
        txtRg.setText("");
        txtOrgaoExpedidor.setText("");
        txtEmail.setText("");
        txtCep.setText("");
        txtPais.setText("");
        txtUf.setText("");
        txtMunicipio.setText("");
        txtLogradouro.setText("");
        txtNumero.setText("");
        txtComplemento.setText("");
        txtBairro.setText("");
        txtTelefone.setText("");
        chkFornecedor.setSelected(false);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
}