

package listadecontatos;

import java.util.ArrayList;

public class ListaDeContatos {
    
    public static void main(String[] args) {
        ArrayList<Contato> listaContatos;
        listaContatos = new ArrayList();
        
        Contato contato1 = new Contato("gustavo" ,"gustavosilva987@gmail.com" ,"119992692022" );
        Contato contato2 = new Contato("Maria" ,"maria1905@gmail.com" ,"48999763453" );
        Contato contato3 = new Contato("João" ,"joao123@gmail.com" ,"98996290317" );
        Contato contato4 = new Contato("Gabriel" ,"gabrielop2006@gmail.com" ,"48999487011" );
        Contato contato5 = new Contato("Gabriel" ,"gabrielop2006@gmail.com" ,"48999487011" );
        
        listaContatos.add(contato1);
        listaContatos.add(contato2);
        listaContatos.add(contato3);
        listaContatos.add(contato4);
        listaContatos.add(contato5);
                
        listaContatos.forEach(System.out::println);
        
        System.out.println("total de Itens na lista: " + listaContatos.size());
        
        listaContatos.remove(contato2);
        
        System.out.println(listaContatos.contains(contato2));
     }
 }