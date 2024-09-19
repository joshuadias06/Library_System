import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Livraria livraria = new Livraria();
        int opcao;
        
        do{
            System.out.println("\nBem-vindo à Livraria");
            System.out.println("1. Adicionar Livro");
            System.out.println("2. Listar Livro");
            System.out.println("3. Buscar Livro");
            System.out.println("4. Remover Livro");
            System.out.println("5. Atualizar Preço de Livro");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch(opcao){
                case 1:
                    System.out.println("Digite o titulo do Livro: ");
                    String titulo = sc.nextLine();
                    System.out.println("Digite o autor do Livro: ");
                    String autor = sc.nextLine();
                    System.out.println("Digite o preço do Livro: ");
                    double preco = sc.nextDouble();
                    sc.nextLine();

                    Livro novoLivro = new Livro(titulo, autor, preco);
                    if(livraria.adicionarLivro(novoLivro)){
                        System.out.println("Livro adicionado com sucesso!");
                    }
                    break;

                case 2:
                    livraria.listarLivros();
                    break;

                case 3:
                    System.out.println("Digite o titulo do livro para buscar: ");
                    String buscaTitulo= sc.nextLine();
                    Livro livroBuscado = livraria.buscarLivro(buscaTitulo);
                    if(livroBuscado !=  null){
                        System.out.println(livroBuscado);
                    }else{
                        System.out.println("Livro nao encontrado!");
                    }
                    break;

                case 4:
                    System.out.print("Digitre o titulo do livro para remover: ");
                    String tituloRemover = sc.nextLine();
                    if(livraria.removerLivro(tituloRemover)){
                        System.out.println("Livro removido com sucesso!");
                    }else{
                        System.out.println("Livro nao encontrado.");
                    }
                    break;

                case 5:
                    System.out.println("Digite o titulo do livro para atualizar o preco: ");
                    String tituloAtualizar = sc.nextLine();
                    System.out.println("Digite o novo preco: ");
                    double novoPreco = sc.nextDouble();
                    if(livraria.atualizarPreco(tituloAtualizar, novoPreco)){
                        System.out.println("Preco atualizado com sucesso!");
                    }else{
                        System.out.println("Livro nao encontrado.");
                    }
                    break;

                case 6:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opcao invalida.");
            }
        } while(opcao != 6);
        sc.close();

    }
}