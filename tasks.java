import java.util.Scanner;
import java.util.Arrays;

class tasks{

    public static int fib(int a){
        {
            if (a < 0) throw new IllegalArgumentException ("less 0");   
            else if (a == 1) return 1;
            else if (a == 2) return 1;        
            else return fib(a - 1) + fib(a - 2);   
         }
    }

    static public boolean istrue(boolean x) {return ((x == true) ? true : false);} 

    public static void task1(){
        int cont2; int count = 1;
     Scanner cont1 = new Scanner(System.in);
     System.out.println("vvedite chislo");
     if(cont1.hasNextInt()){
         cont2 = cont1.nextInt(); 
         for (int i = 1; i < cont2; i++){
             for(int j = 1; j < i; j++){
                 if(i % j == 0){
                     count++;
                 }
             }
             if(count == 2)
                System.out.println(i);
             count = 1;
         }
     }   
    }

    public static void task2(){
        int cont2;
        int vedro = 0;
        int i = 1;
        Scanner cont1 = new Scanner(System.in);
        System.out.println("vvedite chislo");
        if(cont1.hasNextInt()){
            cont2 = cont1.nextInt();
            while(vedro < cont2)
            {
                vedro = fib(i);
                if(vedro >= cont2)
                    break;
                else{
                    System.out.println(vedro);
                    i++;
                }
            }
    }
    else throw new IllegalArgumentException ("is not number");
    }

    static public void task3(){
        Scanner container = new Scanner(System.in);
        int[] a;
        int vedro = 0;
        System.out.println("vvedite razmer massiva");
        int count = container.nextInt();
        a = new int[count];
        for(int i = 0; i < count; i++){
            a[i] = container.nextInt();
        }
        Arrays.sort(a);
        System.out.println(a.length);
        int len = (a.length - 1);
        for(int i = 0; i < (len / 2) + 1; i++){
            vedro = a[i];
            a[i] = a[len - i];
            a[len - i] = vedro;
            System.out.println(a[i]); 
        }
        for(int i = 0; i <= len; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }
    
    static public void task4(){
        int count = 0;
        boolean perem;
        Scanner val = new Scanner(System.in);
        System.out.println("vvedite bulevy znacheniya");
        for(int i = 0; i <= 3; i ++){
            perem = val.nextBoolean();
            if(istrue(perem)) count++;
        }
        if(count == 2)
            System.out.println("True");
        else
            System.out.println("False");
    }

    public static void task5(){
        int left,right,flag;
        Scanner word = new Scanner(System.in);
        String s1;
        System.out.println("vvedite slovo");
        s1 = word.nextLine();
        left = 0; right = (s1.length() - 1); flag = 1;
        while(left <= right) {
            if (s1.charAt(left) == s1.charAt(right)){
                left++; right--;
            }
            else{ 
                flag = 0;
                break;
                }
        }
        if( flag == 1)
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    public static void task6(){
        Scanner cont = new Scanner(System.in);
        String s1 = ""; 
        String res_str = "";
        char prom;
        System.out.println("vvedite stroku");
        s1 = cont.nextLine();
        for(int i = 0; i < s1.length();i++){
            prom = s1.charAt(i);
            if (!(Character.isDigit(prom))){
                res_str += prom;
            }
        }
        System.out.println(res_str);
    }

    public static void main(String args[])
    {
        int i =Integer.parseInt(args[0]);
        switch(i){
            case 1:
            {
                task1();
            }
            break;
            case 2:
            { 
                task2();
            } 
            break;
            case 3:
            {
                task3();
            }
            break;
            case 4:
            {
                task4();
            }
            break;
            case 5:
            {
                task5();
            }
            break;
            case 6:
            {
               task6();
            }
        }
    }
}