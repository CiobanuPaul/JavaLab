package lab1.task4;

public class DummyCalculator {

    public String detectType(String input) {
        try {
            int intValue = Integer.parseInt(input);
            return "int";
        } catch (NumberFormatException eInt) {
            try {
                float floatValue = Float.parseFloat(input);
                return "float";
            } catch (NumberFormatException eFloat) {
                if (input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false")) {
                    return "boolean";
                } else {
                    return "unknown";
                }
            }
        }
    }
    public void calculate(String[] args){
        var type = detectType(args[0]);
        switch (type){
            case "int":
                if(args[1] == "+")
        }
    }
}
