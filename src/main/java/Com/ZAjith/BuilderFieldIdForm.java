package Com.ZAjith;




public class BuilderFieldIdForm {
	public static void main(String[] args) {
//		StringBuilder fieldIdBuilder = new StringBuilder();
//		fieldIdBuilder.append(101);
//    	fieldIdBuilder.append(",");
//    	fieldIdBuilder.append(102);
//    	fieldIdBuilder.append(",");
//    	fieldIdBuilder.append(103);
//    	fieldIdBuilder.append(",");
//    	String fieldIdBuilderString = fieldIdBuilder.toString().substring(0, fieldIdBuilder.toString().lastIndexOf(","));
//    	System.out.println("field list : "+ fieldIdBuilderString);
		 StringBuilder query = new StringBuilder();
		 String pFMFIELDS ="PFMF.GUID AS \\\"PFMF_GUID\\\", PFMF.FIELD_ID AS \\\"PFMF_FIELD_ID\\\", PFMF.NAME AS \\\"PFMF_NAME\\\", PFMF.LABEL AS \\\"PFMF_LABEL\\\", PFMF.DATA_TYPE AS \\\"PFMF_DATA_TYPE\\\", PFMF.LENGTH AS \\\"PFMF_LENGTH\\\", PFMF.DESCRIPTION AS \\\"PFMF_DESCRIPTION\\\", PFMF.HELP_TEXT AS \\\"PFMF_HELP_TEXT\\\", PFMF.IS_REQUIRED AS \\\"PFMF_IS_REQUIRED\\\", PFMF.IS_UNIQUE AS \\\"PFMF_IS_UNIQUE\\\", PFMF.AUTO_NUMBER AS \\\"PFMF_AUTO_NUMBER\\\", PFMF.REFERENCE_OBJECT_ID AS \\\"PFMF_REFERENCE_OBJECT_ID\\\", PFMF.REFERENCE_PROPERTY AS \\\"PFMF_REFERENCE_PROPERTY\\\", PFMF.IS_CUSTOM_FIELD AS \\\"PFMF_IS_CUSTOM_FIELD\\\", PFMF.IS_ID_FIELD AS \\\"PFMF_IS_ID_FIELD\\\", PFMF.IS_SEARCH_RESULT_ENABLED AS \\\"PFMF_IS_SEARCH_RESULT_ENABLED\\\", PFMF.IS_SEARCH_ENABLED AS \\\"PFMF_IS_SEARCH_ENABLED\\\", PFMF.IS_LIST_VIEW_ENABLED AS \\\"PFMF_IS_LIST_VIEW_ENABLED\\\", PFMF.IS_POPUP_ENABLED AS \\\"PFMF_IS_POPUP_ENABLED\\\", PFMF.IS_PERSONALIZATION_ENABLED AS \\\"PFMF_IS_PERSONALIZATION_ENABLED\\\", PFMF.IS_READ_ONLY AS \\\"PFMF_IS_READ_ONLY\\\", PFMF.IS_PRIMARY_FIELD AS \\\"PFMF_IS_PRIMARY_FIELD\\\", PFMF.POPUP_ID AS \\\"PFMF_POPUP_ID\\\", PFMF.RETURN_FIELD AS \\\"PFMF_RETURN_FIELD\\\", PFMF.METHOD_ARGUMENTS AS \\\"PFMF_METHOD_ARGUMENTS\\\", PFMF.CALL_BACK AS \\\"PFMF_CALL_BACK\\\", PFMF.STYLE AS \\\"PFMF_STYLE\\\", PFMF.FIELD_TYPE AS \\\"PFMF_FIELD_TYPE\\\", PFMF.OPTIONS AS \\\"PFMF_OPTIONS\\\", PFMF.OPTION_VALUE AS \\\"PFMF_OPTION_VALUE\\\", PFMF.OPTION_SELECTED_VALUE AS \\\"PFMF_OPTION_SELECTED_VALUE\\\", PFMF.DISPLAY_ORDER AS \\\"PFMF_DISPLAY_ORDER\\\", PFMF.CREATED_BY AS \\\"PFMF_CREATED_BY\\\", PFMF.CREATED_ON AS \\\"PFMF_CREATED_ON\\\", PFMF.LAST_MODIFIED_BY AS \\\"PFMF_LAST_MODIFIED_BY\\\", PFMF.LAST_MODIFIED_ON AS \\\"PFMF_LAST_MODIFIED_ON\\\", PFMF.IS_FREEZECOLUMN AS \\\"PFMF_IS_FREEZECOLUMN\\\", PFMF.IS_COMPOSITE_KEY AS \\\"PFMF_IS_COMPOSITE_KEY\\\", PFMF.OBJECT_ID AS \\\"PFMF_OBJECT_ID\\\", PFMF.RELATION_SHIP_TYPE AS \\\"PFMF_RELATION_SHIP_TYPE\\\", PFMF.IS_PROMINENT_ENABLE AS \\\"PFMF_IS_PROMINENT_ENABLE\\\", PFMF.PROMINENT_ORDER AS \\\"PFMF_PROMINENT_ORDER\\\", PFMF.CURRENCY_TYPE AS \\\"PFMF_CURRENCY_TYPE\\\", PFMF.PRECISION_VALUE AS \\\"PFMF_PRECISION_VALUE\\\", PFMF.PICK_LIST_JSON AS \\\"PFMF_PICK_LIST_JSON\\\", PFMF.PICK_LIST_FIELD AS \\\"PFMF_PICK_LIST_FIELD\\\", PFMF.LOOKUP_DEPENDENT_FIELDS AS \\\"PFMF_LOOKUP_DEPENDENT_FIELDS\\\", PFMF.EXTERNAL_MAPPER AS \\\"PFMF_EXTERNAL_MAPPER\\\", PFMF.IS_STATUS_WF_ENABLED AS \\\"PFMF_IS_STATUS_WF_ENABLED\\\", PFMF.CURRENCY_SYMBOL AS \\\"PFMF_CURRENCY_SYMBOL\\\", PFMF.IS_FIELDTRACKING_ENABLED AS \\\"PFMF_IS_FIELDTRACKING_ENABLED\\\", PFMF.ALLOWS_ZERO AS \\\"PFMF_ALLOWS_ZERO\\\", PFMF.ALLOWS_NEGATIVE_VALUES AS \\\"PFMF_ALLOWS_NEGATIVE_VALUES\\\", PFMF.COUNTRY AS \\\"PFMF_COUNTRY\\\", PFMF.LOCALE AS \\\"PFMF_LOCALE\\\", PFMF.LONG_HELP_TEXT AS \\\"PFMF_LONG_HELP_TEXT\\\", PFMF.REFERENCE_OBJECT_TYPE AS \\\"PFMF_REFERENCE_OBJECT_TYPE\\\", PFMF.FORMULA_FIELD_TYPE AS \\\"PFMF_FORMULA_FIELD_TYPE\\\", PFMF.UNIQUE_REFERENCE_OBJECT_TYPE AS \\\"PFMF_UNIQUE_REFERENCE_OBJECT_TYPE\\\", PFMF.UNIQUE_REFERENCE_FIELD_ID AS \\\"PFMF_UNIQUE_REFERENCE_FIELD_ID\\\", PFMF.IMPORT_NEEDED AS \\\"PFMF_IMPORT_NEEDED\\\", PFMF.URL_TYPE AS \\\"PFMF_URL_TYPE\\\", PFMF.IS_PRIMARY_ASSIGNMENT_OBJECT AS \\\"PFMF_IS_PRIMARY_ASSIGNMENT_OBJECT\\\", PFMF.CONSIDER_NUMERIC AS \\\"PFMF_CONSIDER_NUMERIC\\\", PFMF.IS_INDEXED AS \\\"PFMF_IS_INDEXED\\\", PFMF.IS_LIKERT_SCALE_ENABLED AS \\\"PFMF_IS_LIKERT_SCALE_ENABLED\\\", PFMF.LIKERT_SCALE_RATING_TYPE AS \\\"PFMF_LIKERT_SCALE_RATING_TYPE\\\", PFMF.PLACE_HOLDER AS \\\"PFMF_PLACE_HOLDER\\\", PFMF.HELP_TEXT_STYLE AS \\\"PFMF_HELP_TEXT_STYLE\\\", PFMF.PICKLIST_FIELD_ID AS \\\"PFMF_PICKLIST_FIELD_ID\\\", PFMF.PICKLIST_OBJECT_ID AS \\\"PFMF_PICKLIST_OBJECT_ID\\\"";
	     String PFMFIELDSFORMULAENTITY = "PFMO1.OBJECT_NAME AS \\\"PFMF_REFERENCE_OBJECT\\\", PFMO.OBJECT_NAME AS \\\"PFMF_OBJECT_NAME\\\"";
	            
	            query.append("SELECT ");
				query.append(pFMFIELDS).append(",");
				query.append(PFMFIELDSFORMULAENTITY);
				
				query.append(" FROM PFM_FIELDS PFMF ");
				query.append(" LEFT JOIN PFM_OBJECTS PFMO ON (PFMF.OBJECT_ID = PFMO.OBJECT_ID) ");
				query.append(" LEFT JOIN PFM_OBJECTS PFMO1 ON (PFMO1.OBJECT_ID = PFMF.REFERENCE_OBJECT_ID) ");
				
				query.append(" WHERE PFMF.FIELD_ID IN ( ");
				query.append(101);
				query.append(") ");

				query.append(" ORDER BY PFMO.OBJECT_ID, PFMF.FIELD_ID ");

				System.out.println("query : " +query.toString());


	}
}
