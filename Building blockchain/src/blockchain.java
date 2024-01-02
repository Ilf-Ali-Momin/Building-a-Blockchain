import java.util.Arrays;
import java.util.List;

public class blockchain {
    public static void main(String[] args) {
         Transaction transaction1 =new Transaction("Ilf","Mazhar",1100L);
        Transaction transaction2 =new Transaction("Mazhar","Taseeb",1000L);
        Transaction transaction3 =new Transaction("Taseeb","Ilf",10000L);
        Transaction transaction4 =new Transaction("Mazhar","Ilf",100L);


//        System.out.println(transaction1.hashCode());
//        System.out.println(transaction2.hashCode());
//        System.out.println(transaction3.hashCode());
        block firstBlock = new block(0, Arrays.asList(transaction1,transaction2));
        System.out.println(firstBlock.hashCode());
        block secBlock = new block(firstBlock.hashCode(),Arrays.asList(transaction3));
        System.out.println((secBlock.hashCode()));
        block thirdBlock = new block(secBlock.hashCode(),Arrays.asList(transaction4 ));
        System.out.println((thirdBlock.hashCode()));
    }
}
