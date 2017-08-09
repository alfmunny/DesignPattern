package SimpleFactory;

/**
 * Created by yzhang on 09.08.17.
 */
public class Calculator {
   public static void main(String[] args) {
      Operation oper = OperationFactory.createOperate("+");
      oper.setNumberA(1);
      oper.setNumberB(2);
      System.out.println(oper.getResult());
   }
}
