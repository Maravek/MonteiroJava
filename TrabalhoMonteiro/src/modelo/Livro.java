package modelo;

public class Livro {

    private int id;
    private String TituloLivro;
    private String AutorLivro;
    private int estoque;
    private String editora;

    Livro() {
    }

    Livro(String TituloLivro, String AutorLivro, int estoque, String editora) {
        this.TituloLivro = TituloLivro;
        this.AutorLivro = AutorLivro;
        this.estoque = estoque;
        this.editora = editora;
    }

    public String getTituloLivro() {
        return TituloLivro;
    }

    public void setTituloLivro(String TituloLivro) {
        this.TituloLivro = TituloLivro;
    }

    public String getAutorLivro() {
        return AutorLivro;
    }

    public void setAutorLivro(String AutorLivro) {
        this.AutorLivro = AutorLivro;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getId() {
        return id;
    }
    
}
