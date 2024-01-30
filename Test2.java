public class Test2 {
    public static void main(String[] args){
        int tot = 0;
        int n = 0;
        for (;n < 100;n++,tot = tot += n){
            System.out.print(n);
            if(n%2 == 0) {
                System.out.println(" even");
            } else {
                System.out.println(" odd");
            }
        }
        if (n == 100){
            System.out.println(n);
            System.out.print(tot);
            System.out.print(" Total");
        }
    }
}

