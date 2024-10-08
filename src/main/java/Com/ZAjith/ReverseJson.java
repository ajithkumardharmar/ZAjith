package Com.ZAjith;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class ReverseJson {

    public static void main(String[] args) throws Exception {
        // Your original JSON as a string
        String originalJson = "{\r\n"
        		+ "  \"objectId\": \"11890\",\r\n"
        		+ "  \"referenceObjectId\": \"0\",\r\n"
        		+ "  \"objectName\": \"objecta1\",\r\n"
        		+ "  \"isStandardObject\": \"N\",\r\n"
        		+ "  \"rootPath\": \"objecta1_DUMMY\",\r\n"
        		+ "  \"fieldId\": \"0\",\r\n"
        		+ "  \"relationShipType\": \"null\",\r\n"
        		+ "  \"objectType\": \"PRIMARY\",\r\n"
        		+ "  \"childObject\": [\r\n"
        		+ "    {\r\n"
        		+ "      \"objectId\": \"11891\",\r\n"
        		+ "      \"fieldId\": \"147684\",\r\n"
        		+ "      \"objectName\": \"objectb1\",\r\n"
        		+ "      \"objectType\": \"MASTERDETAIL\",\r\n"
        		+ "      \"referenceObjectId\": 11890,\r\n"
        		+ "      \"rootPath\": \"objecta1_DUMMY$$objectb1_b1relation\",\r\n"
        		+ "      \"isStandardObject\": \"N\",\r\n"
        		+ "      \"relationShipType\": \"one_to_one\",\r\n"
        		+ "      \"includeFields\": true,\r\n"
        		+ "      \"childObject\": [\r\n"
        		+ "        {\r\n"
        		+ "          \"objectId\": \"11892\",\r\n"
        		+ "          \"fieldId\": \"147700\",\r\n"
        		+ "          \"objectName\": \"objectc1\",\r\n"
        		+ "          \"objectType\": \"MASTERDETAIL\",\r\n"
        		+ "          \"referenceObjectId\": 11891,\r\n"
        		+ "          \"rootPath\": \"objecta1_DUMMY$$objectb1_b1relation$$objectc1_c1relation\",\r\n"
        		+ "          \"isStandardObject\": \"N\",\r\n"
        		+ "          \"relationShipType\": \"one_to_one\",\r\n"
        		+ "          \"includeFields\": true,\r\n"
        		+ "          \"childObject\": [\r\n"
        		+ "            {\r\n"
        		+ "              \"objectId\": \"11893\",\r\n"
        		+ "              \"fieldId\": \"147716\",\r\n"
        		+ "              \"objectName\": \"objectd1\",\r\n"
        		+ "              \"objectType\": \"MASTERDETAIL\",\r\n"
        		+ "              \"referenceObjectId\": 11892,\r\n"
        		+ "              \"rootPath\": \"objecta1_DUMMY$$objectb1_b1relation$$objectc1_c1relation$$objectd1_d1relation\",\r\n"
        		+ "              \"isStandardObject\": \"N\",\r\n"
        		+ "              \"relationShipType\": \"one_to_one\",\r\n"
        		+ "              \"includeFields\": true,\r\n"
        		+ "              \"childObject\": [\r\n"
        		+ "                {\r\n"
        		+ "                  \"objectId\": \"11894\",\r\n"
        		+ "                  \"fieldId\": \"147732\",\r\n"
        		+ "                  \"objectName\": \"objecte1\",\r\n"
        		+ "                  \"objectType\": \"MASTERDETAIL\",\r\n"
        		+ "                  \"referenceObjectId\": 11893,\r\n"
        		+ "                  \"rootPath\": \"objecta1_DUMMY$$objectb1_b1relation$$objectc1_c1relation$$objectd1_d1relation$$objecte1_e1relation\",\r\n"
        		+ "                  \"isStandardObject\": \"N\",\r\n"
        		+ "                  \"relationShipType\": \"one_to_one\",\r\n"
        		+ "                  \"includeFields\": true,\r\n"
        		+ "                  \"childObject\": []\r\n"
        		+ "                }\r\n"
        		+ "              ]\r\n"
        		+ "            }\r\n"
        		+ "          ]\r\n"
        		+ "        }\r\n"
        		+ "      ]\r\n"
        		+ "    }\r\n"
        		+ "  ]\r\n"
        		+ "}";

        // Parse the original JSON
        ObjectMapper mapper = new ObjectMapper();
        JsonNode originalNode = mapper.readTree(originalJson);

        // Reverse the JSON structure
        JsonNode reversedNode = reverseJsonStructure(originalNode);

        // Convert the reversed JSON back to a string
        String reversedJson = mapper.writeValueAsString(reversedNode);

        // Print the reversed JSON
        System.out.println(reversedJson);
    }

    private static JsonNode reverseJsonStructure(JsonNode node) {
        if (node.isObject()) {
            ObjectNode reversedObject = new ObjectMapper().createObjectNode();

            // Process child objects in reverse order
            node.fields().forEachRemaining(entry -> {
                JsonNode reversedChild = reverseJsonStructure(entry.getValue());
                reversedObject.set(entry.getKey(), reversedChild);
            });

            return reversedObject;
        } else if (node.isArray()) {
            ArrayNode reversedArray = new ObjectMapper().createArrayNode();

            // Process array elements in reverse order
            for (int i = node.size() - 1; i >= 0; i--) {
                JsonNode reversedElement = reverseJsonStructure(node.get(i));
                reversedArray.add(reversedElement);
            }

            return reversedArray;
        } else {
            // Base case: leaf node, return as is
            return node;
        }
    }
}
