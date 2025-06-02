public class Exercicio {
     private int id; // Apenas private
     private String nome; // Apenas private
     private String descricao; // Apenas private
     private String som; // Apenas private
     private int tempoMin; 
     public Exercicio(){
          
     }
 
     public Exercicio(String nome, String descricao, String som, int tempoMin /*, String exemplo */){
         // Corrigido: 'mome' para 'nome' no parâmetro do construtor, se for um erro de digitação
         this.nome = nome;
         this.descricao = descricao;
         this.som = som;
         this.tempoMin = tempoMin;
         
     }
 
  
   
 }