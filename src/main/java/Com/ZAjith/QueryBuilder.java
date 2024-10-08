package Com.ZAjith;

public class QueryBuilder {
    public static void main(String[] args) {
        StringBuilder queryBuilder = new StringBuilder();

        // Build the query using StringBuilder
        for (int i = 1; i <= 5; i++) {
            queryBuilder.append("SELECT DISTINCT PF").append(i).append(".FIELD_ID ");
            queryBuilder.append("FROM pfm_fields PF1");
            
            for (int j = 2; j <= i; j++) {
                queryBuilder.append(", pfm_fields PF").append(j);
            }
            
            queryBuilder.append(" WHERE PF1.FIELD_ID = 202667 AND PF1.field_type ='LOOKUP' ");
            
            for (int j = 2; j <= i; j++) {
                queryBuilder.append("AND PF").append(j).append(".OBJECT_ID =PF").append(j - 1).append(".REFERENCE_OBJECT_ID ");
                queryBuilder.append("AND PF").append(j).append(".field_type ='LOOKUP' ");
            }
            
            if (i < 5) {
                queryBuilder.append("UNION ALL ");
            }
        }

        // Convert the query to uppercase
        String fullQuery = queryBuilder.toString();

        // Print the result
        System.out.println(fullQuery);
    }
}
