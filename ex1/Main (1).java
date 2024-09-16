public class Main {
  public static void main(String[] args) {

    // Iatalando o objeto pessoa
    Pessoa pessoa1 = new Pessoa("miguel", 18);
    Pessoa pessoa2 = new Pessoa("Claudia", 18);
    Pessoa pessoa3 = new Pessoa("Ana", 18);

    System.out.println(pessoa1.exibiInfor());
    System.out.println(pessoa2.getNome());
    System.out.println(pessoa3.getIdade());
  }
}