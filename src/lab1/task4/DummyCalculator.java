package lab1.task4;

import java.util.Objects;

public class DummyCalculator {


    private static int strength(String type){
        return Objects.equals(type, "float") ? 2 : 1;
    }
    private static String detectType(String input) {
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
    public static void calculate(String[] args) {
        var type1 = detectType(args[0]);
        var type2 = detectType(args[2]);
        String type;
        if (strength(type1) > strength(type2))
            type = type1;
        else
            type = type2;

        switch (type) {
            case "int":
                switch(args[1]){
                    case "+":
                        System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[2]));
                        break;
                    case "-":
                        System.out.println(Integer.parseInt(args[0]) - Integer.parseInt(args[2]));
                        break;
                    case "*":
                        System.out.println(Integer.parseInt(args[0]) * Integer.parseInt(args[2]));
                        break;
                    case "/":
                        System.out.println(Integer.parseInt(args[0]) / Integer.parseInt(args[2]));
                        break;
                }
                break;
            case "float":
                switch(args[1]){
                    case "+":
                        System.out.println(Float.parseFloat(args[0]) + Float.parseFloat(args[2]));
                        break;
                    case "-":
                        System.out.println(Float.parseFloat(args[0]) - Float.parseFloat(args[2]));
                        break;
                    case "*":
                        System.out.println(Float.parseFloat(args[0]) * Float.parseFloat(args[2]));
                        break;
                    case "/":
                        System.out.println(Float.parseFloat(args[0]) / Float.parseFloat(args[2]));
                        break;
                }
                break;
            case "boolean":
                switch(args[1]){
                    case "&":
                        System.out.println(Boolean.parseBoolean(args[0]) & Boolean.parseBoolean(args[2]));
                        break;
                    case "|":
                        System.out.println(Boolean.parseBoolean(args[0]) | Boolean.parseBoolean(args[2]));
                        break;
                }
        }
    }
}
