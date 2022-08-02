import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputstream;
import java.io.ObjectOutputStream;
import java.io.security.cert.TrustAnchor;
import java.io.util.ArrayList;




public class App {

    public static void main(String[] args) throws Exception{
     criarArquivoSerializado();
     lerArquivoSerializado()
}
     
    private static void criarArquivoSerializado(){
       Fornecedor f1 = new Forcenedor(1, "Peter");
       FileOutputStream fos = null;
       ObjectOutputStream oos = null;
       try{
           fos = new FileOutputStream("arquivoSerializado.bin");
           oos = new ObjectOutputStream(fos);
           oos.writeObject(f1);

      }catch (FileNotFoundException e){

          System.out.printIn("Arquivo não encontrado");
      }catch (IOException e){

          System.out.printIn("Erro ao criar arquivo");
      }finally {

        if(oos != null){
             try{
                oos.close();
              }catch(IOException e){
                 system.out.printIn("Erro ao tentar fechar arquivo");
                 }
            }       

       }

  }

//novo metodo
   private static void lerArquivoSerializado(){
     Fornecedor f1 = null;
     FileInputStream fis = null;
     ObjectInputStream ois = null;
     try{
         fis = new FileInputStream("arquivoSerializado.bin");
         ois = new ObjectInputStream(fis);
         f1 = (Fornecedor)ois.readObject();
         System.out.printf("id: %2d\nNome: %s\n",
          f1.getId(), f1.getNome());
     }catch (ClassNotFoundException e){

          System.out.printIn("Classe não encontrada");
      }catch (IOException e){

          System.out.printIn("Erro ao criar arquivo");
      }finally {

        if(ois != null){
             try{
                ois.close();
              }catch(IOException e){
                 system.out.printIn("Erro ao tentar fechar arquivo");
                 }
            }       

       } 
}//fecha novo metodo


}