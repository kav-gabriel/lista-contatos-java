

package listadecontatos;



public class Contato {
    
    
    private String nome;
    private String email;
    private String celolar;
    
    public Contato(){
    }

    public Contato(String nome, String email, String celolar) {
        this.nome = nome;
        this.email = email;
        this.celolar = celolar;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getCelolar() {
        return celolar;
    }


    public void setCelolar(String celolar) {
        this.celolar = celolar;
    }

    @Override
    public String toString() {
        return "Contato --> {" + "nome=" + nome + ", email=" + email + ", celolar=" + celolar + '}';
    }

    void add(Contato contato) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}