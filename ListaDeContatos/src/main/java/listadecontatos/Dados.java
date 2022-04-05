
package listadecontatos;

import java.util.ArrayList;


public class Dados {
    
    public ArrayList<Contato> listaContatos = new ArrayList();
    
    public void cadastraContatos(Contato contato){
        listaContatos.add(contato);
    }
    

    public String numedoDeContatos(){
        return listaContatos.size()  + "";
    }

    void cadastraContato(Contato listaContatos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String numedodecontatos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
