import java.util.Scanner;

class ArrayOps {
    int arr[] = new int[5];

    void input() {
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++)
            arr[i] = sc.nextInt();
    }

    void output1() {
        for(int i=0;i<5;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    void output2() {
        for(int i:arr)
            System.out.print(i+" ");
        System.out.println();
    }

    void reverse() {
        for(int i=arr.length-1;i>=0;i--)
            System.out.print(arr[i]+" ");
    }

    public static void main(String[] args) {
        ArrayOps obj = new ArrayOps();
        obj.input();
        obj.output1();
        obj.output2();
        obj.reverse();
    }
}