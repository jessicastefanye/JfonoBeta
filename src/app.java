public class app {
    public class Exercicio {
        String nome;
        String descricao;
        String instrucao; // Adicionei 'instrucao' porque parece ser o terceiro argumento
        String tempoMin;
    
        public Exercicio(String nome, String descricao, String instrucao, String tempoMin) {
            this.nome = nome;
            this.descricao = descricao;
            this.instrucao = instrucao;
            this.tempoMin = tempoMin;
        }
    
        // ... outros métodos da classe
    }
        

      

       Exercicio ex2= new Exercicio();
       ex2.nome = "Articulação";
       ex2.descricao ="Melhorar a pronúncia de fonemas";
       ex2.tempoMin = 30;
        ex2.som = "src/sons/somKiko";
       
       Exercicio ex3 = new Exercicio();
       ex3.nome = "Respiração Diafragmática";
       ex3.descricao ="Fortalecer o controle respiratório para melhorar a sustentação da voz.";
       ex3.tempoMin = 5;
       ex3.som = "src/sons/somKiko";

       Exercicio ex4 = new Exercicio();
       ex4.nome = "Motricidade Orofacial";
       ex4.descricao ="Fortalecer os músculos da língua para melhorar a articulação e a deglutição.";
       ex4.tempoMin = 10;
       ex4.som = "src/sons/somKiko";



      Clinica cli = new Clinica();
      cli.nome = "";
      cli.cnpj = "";

      Paciente paci = new Paciente();
      paci.nome = "";
      paci.email = "";

      Profissional prof = new Profissional();
      prof.nome = "";
      prof.telefone = "";

    }
} 