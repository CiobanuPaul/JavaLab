package lab4.task2;


public record CalculatorRequest(Object leftOperand, Object rightOperand, String operation){
//    private final Object leftOperand, rightOperand;
//    private final String operation;
//
//    public Object getLeftOperand() {
//        return leftOperand;
//    }
//
//    public Object getRightOperand() {
//        return rightOperand;
//    }
//
//    public String getOperation() {
//        return operation;
//    }

    private String enumToString(Type type){
        switch (type){
            case INT:
                return "int";
            case DOUBLE:
                return "double";
            case BOOLEAN:
                return "boolean";
            default:
                return "unknown";
        }
    }

//    public CalculatorRequest(Object leftOperand, Object rightOperand, Object operation){
//        this.leftOperand = leftOperand;
//        this.rightOperand = rightOperand;
//        this.operation = (String) operation;
//    }

    public String getRequestType() throws UnknownOperandTypeException{
        Type type1 = Type.INT;
        try {
            int intValue = Integer.parseInt((String) leftOperand);
            type1 = Type.INT;
        } catch (NumberFormatException eInt) {
            try {
                double doubleValue = Double.parseDouble((String) leftOperand);
                type1 = Type.DOUBLE;
            } catch (NumberFormatException eDouble) {
                if (((String) leftOperand).equalsIgnoreCase("true") || ((String) leftOperand).equalsIgnoreCase("false")) {
                    type1 = Type.BOOLEAN;
                }
                else
                    throw new UnknownOperandTypeException("Unknown left operand type in operation: "+this.toString());
            }
        }

        Type type2 = Type.INT;
        try {
            int intValue = Integer.parseInt((String) rightOperand);
            type2 = Type.INT;
        } catch (NumberFormatException eInt) {
            try {
                double doubleValue = Double.parseDouble((String) rightOperand);
                type2 = Type.DOUBLE;
            } catch (NumberFormatException eDouble) {
                if (((String) rightOperand).equalsIgnoreCase("true") || ((String) rightOperand).equalsIgnoreCase("false")) {
                    type2 = Type.BOOLEAN;
                }
                else
                    throw new UnknownOperandTypeException("Unknown right operand type in operation: "+this.toString());
            }
        }

        return enumToString((type1 == Type.DOUBLE || type2 == Type.DOUBLE ? Type.DOUBLE : type1));
    }

    public String toString(){
        return leftOperand + " " + operation + " " + rightOperand;
    }
}
