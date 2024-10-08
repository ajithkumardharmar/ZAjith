package Com.ZAjith;
//import org.json.JSONArray;
//import org.json.JSONObject;

import java.util.ArrayDeque;
import java.util.Deque;

public class BuilderJson {
    public static void main(String[] args) {
        String queryString = "(name==chainsys||name==chainsys.pvt.ltd)&&(((departmentname==DataZap)&&(employeename==Vignesh))||((rolename!=Associate)&&(subordinatename==Ajith)))";
//    	String queryString = "(name==chainsys||name==chainsys.pvt.ltd)";
//    	JSONObject json = parseQuery(queryString);
//        System.out.println(json.toString(2));
    }

//    public static JSONObject parseQuery(String query) {
//        Deque<JSONObject> stack = new ArrayDeque<>();
//        Deque<String> operators = new ArrayDeque<>();
//        String[] tokens = query.split("(?<=\\()|(?=\\))|(?<=&&)|(?=&&)|(?<=\\|\\|)|(?=\\|\\|)");
//
//        for (String token : tokens) {
//            token = token.trim();
//            if (token.isEmpty()) continue;
//
//            if (token.equals("(")) {
//                operators.push(token);
//            } else if (token.equals(")")) {
//                while (!operators.isEmpty() && !operators.peek().equals("(")) {
//                    JSONObject right = stack.pop();
//                    JSONObject left = stack.pop();
//                    String operator = operators.pop();
//                    stack.push(createOperatorNode(operator, left, right));
//                }
//                operators.pop();
//            } else if (token.equals("&&") || token.equals("||")) {
//                while (!operators.isEmpty() && precedence(operators.peek()) >= precedence(token)) {
//                    JSONObject right = stack.pop();
//                    JSONObject left = stack.pop();
//                    String operator = operators.pop();
//                    stack.push(createOperatorNode(operator, left, right));
//                }
//                operators.push(token);
//            } else {
//                stack.push(createExpressionNode(token));
//            }
//        }
//
//        while (!operators.isEmpty()) {
//            JSONObject right = stack.pop();
//            JSONObject left = stack.pop();
//            String operator = operators.pop();
//            stack.push(createOperatorNode(operator, left, right));
//        }
//
//        JSONObject queryConfig = stack.pop();
//        queryConfig.put("queryString", query);
//
//        return queryConfig;
//    }
//
//    private static JSONObject createOperatorNode(String operator, JSONObject left, JSONObject right) {
//        JSONArray operands = new JSONArray();
//        operands.put(left);
//        operands.put(right);
//
//        JSONObject node = new JSONObject();
//        node.put("actionType", "operator");
//        node.put("isOperandsAvailable", true);
//        node.put("suffix", "");
//        node.put("operator", operator);
//        node.put("operands", operands);
//
//        return node;
//    }
//
//    private static JSONObject createExpressionNode(String token) {
//        String[] parts = token.split("(==|!=)");
//        String fieldName = parts[0].trim();
//        String value = parts[1].trim();
//        String operator = token.contains("==") ? "==" : "!=";
//
//        JSONObject leftOperand = new JSONObject();
//        leftOperand.put("fieldName", fieldName);
//        leftOperand.put("valueType", "fieldName");
//        leftOperand.put("isOperandsAvailable", false);
//        leftOperand.put("objectName", "");
//        leftOperand.put("suffix", "");
//        leftOperand.put("fieldDisplayName", "");
//        leftOperand.put("fieldType", "TEXT");
//        leftOperand.put("fieldId", "");
//
//        JSONObject rightOperand = new JSONObject();
//        rightOperand.put("fieldName", "");
//        rightOperand.put("valueType", "constant");
//        rightOperand.put("isOperandsAvailable", false);
//        rightOperand.put("objectName", "");
//        rightOperand.put("suffix", "");
//        rightOperand.put("value", value);
//        rightOperand.put("fieldDisplayName", "");
//        rightOperand.put("fieldType", "TEXT");
//
//        JSONArray operands = new JSONArray();
//        operands.put(leftOperand);
//        operands.put(rightOperand);
//
//        JSONObject node = new JSONObject();
//        node.put("actionType", "operator");
//        node.put("isOperandsAvailable", true);
//        node.put("suffix", "");
//        node.put("operator", operator);
//        node.put("operands", operands);
//
//        return node;
//    }
//
//    private static int precedence(String operator) {
//        switch (operator) {
//            case "&&":
//                return 2;
//            case "||":
//                return 1;
//            case "(":
//                return 0;
//            default:
//                return -1;
//        }
//    }
}
