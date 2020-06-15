package InputOutput;
  import java.io.BufferedReader;
  import java.io.IOException;
  import java.io.InputStreamReader;
/**
 *
 * @author HP
 */
    public class Buffer_Reader{
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String NAMA, NIM, PRODI, FAKULTAS;
        
        System.out.println("Masukkan NAMA Anda");
        Nama = br.readLine();
        System.out.println("Masukkan NIM");
        Nim = br.readLine();
        System.out.println("Masukkan PRODI Anda");
        Prodi = br.readLine();
        System.out.println("Masukkan FAKULTAS Anda");
        Fakultas = br.readLine();
        System.out.println("====================================");
        System.out.println("Nama        : "+NAMA);
        System.out.println("NIM         : "+NIM);
        System.out.println("Prodi       : "+PRODI);
        System.out.println("Fakultas    : "+FAKULTAS);
        
    }
}
