import java.util.Arrays;

public class Test {
        static void fun() throws Exception {
            try {
                System.out.print("try1 ");
                throw new Exception();
            } catch (Exception e) {
                System.out.print("exception1 ");
                throw new Exception(e);
            }
        }
        public static void main(String[] args){
            try {
                fun();
            } catch (Exception e) {
                System.out.print("exception2 ");
            }
            System.out.print("finish ");
        }
}
