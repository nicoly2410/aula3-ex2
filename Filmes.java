public class Filmes{
  //Atributos
  private String titulo;
  private int anoLancamento;
  private int duracao;

  //costrutor
  public Filmes (String titulo, int anoLancamento, int duracao){
    this.titulo = titulo;
    this.anoLancamento = anoLancamento;
    this.duracao = duracao;
  }
  
  //metodos
  public String exibirInfo(){
    return "Titulo: " + titulo + " Ano de Lancamentos: " + anoLancamento + " Duracao: " + duracao;
  }
}

 
