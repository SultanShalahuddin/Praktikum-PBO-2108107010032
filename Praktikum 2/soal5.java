public class soal5{
    public static void main(String[] args){
        for(int w=0; w<21; w++){
            if (w % 2 == 0)
                 if(w % 6 == 0){
                 continue;
                 }else{
                 System.out.print(w + " ");
            }
        }
    }
}
