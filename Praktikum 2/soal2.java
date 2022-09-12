import java.util.Scanner;

public class soal2 {
public static void main(String[] args) {
int marks;
System.out.print("Masukkan nilai anda :");
Scanner nil = new Scanner(System.in);
marks= nil.nextInt();


if(marks>=87 && marks<=100){
System.out.println(" Nilai huruf : A");
}
else if(marks>=78 && marks<87){
System.out.println(" Nilai huruf : AB");
}
else if(marks>=69 && marks<78){
System.out.println(" Nilai huruf : B");
}
else if(marks>=60 && marks<69){
System.out.println(" Nilai huruf : BC");
}
else if(marks>=51 && marks<60){
System.out.println(" Nilai huruf : C");
}else if(marks>=41 && marks<51){
System.out.println(" Nilai huruf : D");
}else if(marks<41 ){
System.out.println("Nilai huruf : E");
}else{
System.out.println("Mohon masukkan nilai yang valid");
}
}
}