package Com.ZAjith;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class QueryString {

    public static void main(String[] args) {
    	String jsonString = "";


        try {
            ObjectMapper mapper = new ObjectMapper();
            JsonNode root = mapper.readTree(jsonString);
            JsonNode criteria = root.get("criteria");

            StringBuilder queryString = new StringBuilder();
            for (JsonNode criterion : criteria) {
                JsonNode leftExpression = criterion.get("leftExpression");
                if (leftExpression == null) {
                    leftExpression = criterion.get("leftExpession");
                }

                String valueType = leftExpression.get("valueType").asText();
                switch (valueType) {
                    case "fieldName":
                        String fieldName = leftExpression.get("fieldName").asText().toLowerCase();
                        String operator = criterion.get("operator").asText();
                        String rightValue = criterion.get("rightExpression").get("value").asText();
                        queryString.append(fieldName).append(operator).append(rightValue.toLowerCase());
                        break;

                    case "logicalOperator":
                        String logicalOperator = leftExpression.get("value").asText();
                        queryString.append(" ").append(logicalOperator.toLowerCase()).append(" ");
                        break;

                    case "groupingOperator":
                        String groupingOperator = leftExpression.get("value").asText();
                        queryString.append(groupingOperator);
                        break;
                }
            }

            System.out.println(queryString.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

