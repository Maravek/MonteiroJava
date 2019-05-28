package apresentacao;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaGrafica extends JFrame implements ActionListener {

    JButton salvar,cancelar;
    JLabel cadastro,tituloLivro,autorLivro,editora,estoque,branco;
    TextField tituloLivrotxt,autorLivrotxt,editoratxt,estoquetxt;
    
    
    public TelaGrafica() {
        super("Cadastro");
        setSize(300, 250);
        setLayout(new GridLayout(6, 2));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        setVisible(true);
        
        cadastro = new JLabel("Cadastro");
        tituloLivro = new JLabel("ritulo do livro");
        autorLivro = new JLabel("Autor do livro");
        editora = new JLabel("Editora");
        estoque = new JLabel("Estoque");
        branco = new JLabel(" ");
        
        salvar = new JButton("Salvar");
        cancelar = new JButton("Candelar");

        tituloLivrotxt = new TextField("ritulo do livro");
        autorLivrotxt = new TextField("Autor do livro");
        editoratxt = new TextField("Editora");
        estoquetxt = new TextField("Estoque");
        
        add(cadastro);
        add(branco);
        add(tituloLivro);
        add(tituloLivrotxt);
        add(autorLivro);
        add(autorLivrotxt);
        add(editora);
        add(editoratxt);
        add(estoque);
        add(estoquetxt);
        add(salvar);
        add(cancelar);

    }

    
    
}
