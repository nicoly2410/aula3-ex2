//definir a clase pessoa
public class Pessoa {
  // Artributos de classe
  private String nome;
  private int idade;

  // Constutor pra inicializar a classe
  public Pessoa(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
  }

  // metodos da classe
  public String exibiInfor() {
    return "Nome: " + this.nome + "Idade: " + this.idade;

  }

  public String getNome() {
    return nome;
  }

  public int getIdade() {
    return idade;
  }
}
