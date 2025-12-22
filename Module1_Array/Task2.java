import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] array= new int[10];
    array[0]=5; 
    array[1]=10;
    array[2]=15; 
    array[3]=20;
    array[4]=25;
    System.out.println("Initial array elements:");
    for(int i=0;i<array.length;i++){
        System.out.print(array[i]+" ");
    } 
    //Insertion of elements in specific positions
    System.out.println("Enter the position where you want to insert element");
    int p=scanner.nextInt();
    System.out.println("Enter the element to be inserted");
    int e=scanner.nextInt();
    for(int i=0;i<array.length;i++){
        if(i==p)
            array[i]=e;
    }
    System.out.println("Array after insertion:");
    for(int i=0;i<array.length;i++){
        System.out.print(array[i]+" ");
    }

    //Deletion of element from specific position and readjusting the array to it's left side
    System.out.println("Enter the position from where you want to delete element");
    int d=scanner.nextInt();
    for(int i=d;i<array.length-1;i++){
        array[i]=array[i+1];        
    }
    System.out.println("Array after deletion:");
    for(int i=0;i<array.length-1;i++){
        System.out.print(array[i]+" ");
    }
}}
