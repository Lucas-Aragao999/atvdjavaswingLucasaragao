// CadastroPessoa.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class CadastroPessoa extends JFrame {
    private final UserControl userControl = new UserControl();
    private JComboBox<String> tipoComboBox, expedidorComboBox, paisComboBox, ufComboBox, municipioComboBox;
    private JComboBox<String> sinusjabComboBox, almoComboBox, indiroComboBox;
    private JTextField halasField, cpfCrpField, fornecedorField, nomeField, rgInscricaoField;
    private JTextField emailField, cepField, logradouroField, numeroField, complementoField, bairroField, telefoneField;
    private JButton confirmaButton, codemButton, dadosButton, limposButton;

    public CadastroPessoa() {
        initComponents();
        setupLayout();
    }

    private void initComponents() {
        setTitle("Cadastro de Pessoa");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 450);
        setLocationRelativeTo(null);

        // Inicialização dos componentes
        tipoComboBox = new JComboBox<>(new String[]{"", "Tipo 1", "Tipo 2"});
        halasField = new JTextField(10);
        cpfCrpField = new JTextField(10);
        fornecedorField = new JTextField(10);
        nomeField = new JTextField(20);
        rgInscricaoField = new JTextField(10);
        expedidorComboBox = new JComboBox<>(new String[]{"", "Opção 1", "Opção 2"});
        emailField = new JTextField(15);
        cepField = new JTextField(8);
        paisComboBox = new JComboBox<>(new String[]{"BANSL", "Brasil", "Argentina"});
        ufComboBox = new JComboBox<>(new String[]{"", "SP", "RJ", "MG"});
        municipioComboBox = new JComboBox<>(new String[]{"", "São Paulo", "Rio de Janeiro"});
        logradouroField = new JTextField(20);
        numeroField = new JTextField(5);
        complementoField = new JTextField(10);
        bairroField = new JTextField(10);
        telefoneField = new JTextField(10);
        sinusjabComboBox = new JComboBox<>(new String[]{"", "Sinusjab 1", "Sinusjab 2"});
        almoComboBox = new JComboBox<>(new String[]{"", "Almo 1", "Almo 2"});
        indiroComboBox = new JComboBox<>(new String[]{"", "Indiro 1", "Indiro 2"});

        confirmaButton = new JButton("Confirma");
        codemButton = new JButton("Códem");
        dadosButton = new JButton("Dados");
        limposButton = new JButton("Limpos");

        // Configurar ações dos botões
        confirmaButton.addActionListener(this::salvarAction);
        limposButton.addActionListener(e -> limparCampos());
        codemButton.addActionListener(e -> userControl.gerarCodigo());
        dadosButton.addActionListener(e -> userControl.carregarDados());
    }

    private void setupLayout() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(2, 2, 2, 2);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Linha 0
        gbc.gridy = 0;
        adicionarComponente(panel, gbc, new JLabel("Tipo"), 0, 0);
        adicionarComponente(panel, gbc, tipoComboBox, 1, 0);
        adicionarComponente(panel, gbc, new JLabel("Hálas"), 2, 0);
        adicionarComponente(panel, gbc, halasField, 3, 0);
        adicionarComponente(panel, gbc, new JLabel("CPV / CRP/..."), 4, 0);
        adicionarComponente(panel, gbc, cpfCrpField, 5, 0);
        adicionarComponente(panel, gbc, new JLabel("Fornecedor"), 6, 0);
        adicionarComponente(panel, gbc, fornecedorField, 7, 0);

        // Linha 1
        gbc.gridy = 1;
        adicionarComponente(panel, gbc, new JLabel("Nome"), 0, 0);
        gbc.gridwidth = 7;
        adicionarComponente(panel, gbc, nomeField, 1, 0);
        gbc.gridwidth = 1;

        // Linha 2
        gbc.gridy = 2;
        adicionarComponente(panel, gbc, new JLabel("RG / Inscrição Estadual"), 0, 0);
        adicionarComponente(panel, gbc, rgInscricaoField, 1, 0);
        adicionarComponente(panel, gbc, new JLabel("Opção Expedidor"), 2, 0);
        adicionarComponente(panel, gbc, expedidorComboBox, 3, 0);
        adicionarComponente(panel, gbc, new JLabel("Email"), 4, 0);
        gbc.gridwidth = 2;
        adicionarComponente(panel, gbc, emailField, 5, 0);
        gbc.gridwidth = 1;
        adicionarComponente(panel, gbc, new JLabel("CEP"), 7, 0);
        adicionarComponente(panel, gbc, cepField, 8, 0);

        // Linha 3
        gbc.gridy = 3;
        adicionarComponente(panel, gbc, new JLabel("País"), 0, 0);
        adicionarComponente(panel, gbc, paisComboBox, 1, 0);
        adicionarComponente(panel, gbc, new JLabel("UF ..."), 2, 0);
        adicionarComponente(panel, gbc, ufComboBox, 3, 0);
        adicionarComponente(panel, gbc, new JLabel("Município ..."), 4, 0);
        gbc.gridwidth = 4;
        adicionarComponente(panel, gbc, municipioComboBox, 5, 0);
        gbc.gridwidth = 1;

        // Linha 4
        gbc.gridy = 4;
        adicionarComponente(panel, gbc, new JLabel("Logradouro"), 0, 0);
        gbc.gridwidth = 8;
        adicionarComponente(panel, gbc, logradouroField, 1, 0);
        gbc.gridwidth = 1;

        // Linha 5
        gbc.gridy = 5;
        adicionarComponente(panel, gbc, new JLabel("Número"), 0, 0);
        adicionarComponente(panel, gbc, numeroField, 1, 0);
        adicionarComponente(panel, gbc, new JLabel("Complemento"), 2, 0);
        adicionarComponente(panel, gbc, complementoField, 3, 0);
        adicionarComponente(panel, gbc, new JLabel("Bairro"), 4, 0);
        adicionarComponente(panel, gbc, bairroField, 5, 0);
        adicionarComponente(panel, gbc, new JLabel("Telefone"), 6, 0);
        adicionarComponente(panel, gbc, telefoneField, 7, 0);

        // Linha 6
        gbc.gridy = 6;
        adicionarComponente(panel, gbc, new JLabel("Sinusjab"), 0, 0);
        adicionarComponente(panel, gbc, sinusjabComboBox, 1, 0);
        adicionarComponente(panel, gbc, new JLabel("Almo"), 2, 0);
        adicionarComponente(panel, gbc, almoComboBox, 3, 0);
        adicionarComponente(panel, gbc, new JLabel("Indiro"), 4, 0);
        adicionarComponente(panel, gbc, indiroComboBox, 5, 0);

        // Linha 7 (Botões)
        gbc.gridy = 7;
        gbc.gridx = 0;
        gbc.gridwidth = 8;
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(confirmaButton);
        buttonPanel.add(codemButton);
        buttonPanel.add(dadosButton);
        buttonPanel.add(limposButton);
        panel.add(buttonPanel, gbc);

        add(panel);
    }

    private void adicionarComponente(JPanel panel, GridBagConstraints gbc, JComponent comp, int x, int y) {
        gbc.gridx = x;
        gbc.gridy = y;
        panel.add(comp, gbc);
    }

    private void salvarAction(ActionEvent e) {
        User user = new User();
        // Preencher objeto user com dados dos campos
        userControl.salvar(user);
        JOptionPane.showMessageDialog(this, "Dados salvos com sucesso!");
    }

    private void limparCampos() {
        // Limpar todos os campos
        tipoComboBox.setSelectedIndex(0);
        halasField.setText("");
        cpfCrpField.setText("");
        fornecedorField.setText("");
        nomeField.setText("");
        rgInscricaoField.setText("");
        expedidorComboBox.setSelectedIndex(0);
        emailField.setText("");
        cepField.setText("");
        paisComboBox.setSelectedIndex(0);
        ufComboBox.setSelectedIndex(0);
        municipioComboBox.setSelectedIndex(0);
        logradouroField.setText("");
        numeroField.setText("");
        complementoField.setText("");
        bairroField.setText("");
        telefoneField.setText("");
        sinusjabComboBox.setSelectedIndex(0);
        almoComboBox.setSelectedIndex(0);
        indiroComboBox.setSelectedIndex(0);
    }

    public static void main(String[] args) {
        new CadastroPessoa().setVisible(true);
    }
}