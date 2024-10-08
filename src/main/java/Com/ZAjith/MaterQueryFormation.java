package Com.ZAjith;

public class MaterQueryFormation {
  public static void main(String[] args) {
	  StringBuilder queryMasterBuilder = new StringBuilder();
	  for (int i = 1; i <= 5; i++) {
			queryMasterBuilder.append("SELECT DISTINCT PF").append(i).append(".REFERENCE_OBJECT_ID ");
			queryMasterBuilder.append(" FROM PFM_FIELDS PF1 ");
          
          for (int j = 2; j <= i; j++) {
          	queryMasterBuilder.append(" , PFM_FIELDS PF").append(j);
          }
          
          queryMasterBuilder.append(" WHERE PF1.OBJECT_ID = ").append("11404").append(" AND PF1.FIELD_TYPE ='MASTERDETAIL' ");
          
          for (int j = 2; j <= i; j++) {
          	queryMasterBuilder.append(" AND PF").append(j).append(".OBJECT_ID =PF").append(j - 1).append(".REFERENCE_OBJECT_ID ");
          	queryMasterBuilder.append(" AND PF").append(j).append(".FIELD_TYPE ='MASTERDETAIL' ");
          }
          
          if (i < 5) {
          	queryMasterBuilder.append(" UNION ALL ");
          }
      }
	  System.out.println(queryMasterBuilder.toString());

  }
}
