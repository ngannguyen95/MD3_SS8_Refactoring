package refactoring;

public class Cacurator {
    public static final char ADDITION='+';
    public static final char SUBTRACTION='-';
    public static final char MULTIPLICATION='*';
    public static final char DIVISION='/';
    public static int caculate(int firstOperand,int secondOperand, char operator ){
        switch (operator){
            case ADDITION:
                return firstOperand+secondOperand;
            case SUBTRACTION:
                return firstOperand-secondOperand;
            case MULTIPLICATION:
                return firstOperand*secondOperand;
            case DIVISION:
                if(secondOperand!=0){
                    return firstOperand/secondOperand;
                }else throw new RuntimeException(" Can not divide by 0 (không thể chia hết cho 0");
            default:
                throw new RuntimeException("Unsupported operation (Không được hỗ trợ)");

        }
    }

}

