public class Usuario {
    private String email, senha, nome;

    //Constructor
    public  Usuario (String email,String senha,String nome){
          this.email = email;
          this.senha = senha;
          this.nome = nome;
    }

    // Getters e Setters (métodos de acesso)
    // Métodos de validação, autenticação, etc.


    public String getEmail(){
        return email;
    }
}
