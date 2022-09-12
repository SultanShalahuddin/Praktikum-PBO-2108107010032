import java.util.Scanner;

public class soal2 {
public static void main(String[] args) {
int marks;
System.out.print("Masukkan nilai anda :");
Scanner nil = new Scanner(System.in);
marks= nil.nextInt();


if(marks>=87 && marks<=100){
System.out.println(" Nilai huruf    : A");
System.out.println(" Indeks Prestasi: 4.00");
}
else if(marks>=78 && marks<87){
System.out.println(" Nilai huruf     : AB");
System.out.println(" Indeks Prestasi : 3.50");
}
else if(marks>=69 && marks<78){
System.out.println(" Nilai huruf     : B");
System.out.println(" Indeks Prestasi : 3.00");
}
else if(marks>=60 && marks<69){
System.out.println(" Nilai huruf     : BC");
System.out.println(" Indeks Prestasi : 2.50");
}
else if(marks>=51 && marks<60){
System.out.println(" Nilai huruf     : C");
System.out.println(" Indeks Prestasi : 2.00");
}else if(marks>=41 && marks<51){
System.out.println(" Nilai huruf     : D");
System.out.println(" Indeks Prestasi : 1.00");
}else if(marks<41 ){
System.out.println("Nilai huruf      : E");
System.out.println(" Indeks Prestasi : 0.00");
}else{
System.out.println("Mohon masukkan nilai yang valid");
}
}
}
