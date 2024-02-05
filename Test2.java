public class Test2 {
    public static void main(String[] args){
        //Wrote By Dallin Lyman, counts to 100 and says if it is even or odd.
        //Also counts up a total
        int tot = 0;
        int n = 0;
        //this only works when "n" is less than 100
        //adds 1 to n and adds n to the total
        //also prints n
        for (;n < 100;n++,tot = tot += n){
            System.out.print(n);
             //this checks the remainder and if it is 0, it prints even.
            //if it is 1, it prints even
            if(n%2 == 0) {
                System.out.println(" even");
            } else {
                System.out.println(" odd");
            }
        }
        //when it hits 100, this prints 100 and the total
        if (n == 100){
            System.out.println(n);
            System.out.print(tot);
            System.out.print(" Total");
        }
    }
}

