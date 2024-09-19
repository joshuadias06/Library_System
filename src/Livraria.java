import java.util.ArrayList;
import java.util.List;

public class Livraria {

    private List<Livro> livros;

    public Livraria() {
        this.livros = new ArrayList<>();
    }

    public boolean adicionarLivro(Livro livro) {

        for(Livro l : livros){
            if(l.getTitulo().equalsIgnoreCase(livro.getTitulo())){

                System.out.println("Titulo ja cadastrado");
                return false;
            }
        }
        livros.add(livro);
        return true;
    }

    public void listarLivros() {
        if(livros.isEmpty()){
            System.out.println("Nenhum livro encontrado");
        }else {
            for(Livro livro : livros){
                System.out.println(livro);
            }
        }
    }

    public Livro buscarLivro(String titulo) {
        for(Livro livro : livros){
            if(livro.getTitulo().equalsIgnoreCase(titulo)){
                return livro;
            }
        }
        return null;
    }

    public boolean removerLivro(String titulo){
        Livro livro = buscarLivro(titulo);
        if(livro != null){
            livros.remove(livro);
            return true;
        }
        return false;
    }

    public boolean atualizarPreco(String titulo, double novoPreco) {

        Livro livro = buscarLivro(titulo);
        if(livro != null){
            livro.setPreco(novoPreco);
            return true;
        }
        return false;
    }
}
