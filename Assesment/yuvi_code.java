import java.util.*;
class yuvi_code{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        int count=0;
        System.out.println("Enter array size(for N*N matrix): ");
        int a=sc.nextInt();
        int[][] arr = new int[a][a];
        for (int i = 0; i < a; i++){
            for (int j = 0; j < a; j++){
                arr[i][j] = (r.nextInt(10) + 1) * 2;
            }
        }
        System.out.println("Generated 2D array: ");
       
       System.out.print("    ");
        for(int i=0;i<a;i++){
            if(i<10)
            System.out.print("  0"+i+" ");
            else
            System.out.print("  "+i+" ");
        }
        System.out.println();
        for(int i=0;i<a;i++){
            System.out.print("    ");
        for(int k=0;k<a;k++){
            System.out.print("+----");
        }
        System.out.print("+");
        System.out.println();
        if(i<10)
        System.out.print(" 0"+i+" | ");
        else
        System.out.print(" "+i+" | ");
            for(int j=0;j<a;j++){
                if(arr[i][j]>=10){
               System.out.print(arr[i][j]+" | ");
                }
                else{
                     System.out.print(" "+arr[i][j]+" | ");
                }
            }
            
            System.out.println();
        }   
        System.out.print("    ");
        for(int k=0;k<a;k++){
            System.out.print("+----");
        }
        System.out.print("+");
        System.out.println("\nEnter a number to highlight (even 2-20): ");
        int b=sc.nextInt();
        if(b>20||b%2!=0){
            System.out.println("Invalid");
            return;
        }
        System.out.print("\n Array with"+b+"highlighted");
        System.out.println();
        System.out.print("    ");
        for(int i=0;i<a;i++){
            if(i<10)
            System.out.print("  0"+i+" ");
            else
            System.out.print("  "+i+" ");
        }
        System.out.println();
        for(int i=0;i<a;i++){
            System.out.print("    ");
        for(int k=0;k<a;k++){
            System.out.print("+----");
        }
        System.out.print("+");
        System.out.println();
        if(i<10)
        System.out.print(" 0"+i+" |");
        else
         System.out.print(" "+i+" |");
            for(int j=0;j<a;j++){
                if(arr[i][j]>=10){
                    if(arr[i][j]==b) 
                    {
                        System.out.print("["+arr[i][j]+"]|");
                        count++;
                    }
                    else{
                     System.out.print(" "+arr[i][j]+" |");
                    }
                }
                else{
                    if(arr[i][j]==b){
                        System.out.print(" ["+arr[i][j]+"]|");
                        count++;
                    }
                    else{
                     System.out.print("  "+arr[i][j]+" |");
                    }
                }
            }
            
            System.out.println();
        }   
        System.out.print("    ");
        for(int k=0;k<a;k++){
            System.out.print("+----");
        }
        System.out.print("+");
        System.out.print("\n\nNumber of "+b+" appeared "+count+" time(s)");
        
        }
    }
