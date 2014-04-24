import java.io.*;

class faktorial{
  public static void main(String[] args) throws Exception{
    DataInputStream input = new DataInputStream(System.in);
    System.out.println(" Program Faktorial");
    System.out.println("------------------------");
    System.out.print("Masukkan Sebuah bilangan :");
    int bil,bil1,bil2;
    bil = Integer.parseInt(input.readLine());
    bil1 = bil;
    bil2 = 1;
    while(bil1 > 1){
      bil2 = bil2 * bil1;
      System.out.print(bil1+" * ");
      bil1--;
    }
    System.out.print("1 ="+ bil2);
    System.out.println("\n Jadi Nilai Faktorial dari "+bil+" adalah:"+bil2);
  }
}
