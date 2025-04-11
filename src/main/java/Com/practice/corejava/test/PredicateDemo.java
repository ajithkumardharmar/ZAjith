package Com.practice.corejava.test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;


public class PredicateDemo {
		public static void main(String[] args) {
			Predicate<Integer> isEven = (n)->n%2==0;
			isEven.test(2);
			System.out.println(isEven.test(2));
			System.out.println(isEven.test(3));
			List<Integer> nums = Arrays.asList(1,2,3,4,5,6);
			List<Integer> evenNumberList = nums.stream().filter(isEven).toList();
			System.out.println(evenNumberList);
			List<String> nameList = Arrays.asList("Ram","Kumar","Rajesh","Karthick","Ram","Rajesh");
//			Map<String,Integer> result = new HashMap<>();
//			for(String name : nameList) {
//				if(result.containsKey(name)) {
//					int count = result.get(name)+1;
//					result.put(name, count);
//				}else {
//					result.put(name, 1);
//				}
//			}
//			for(java.util.Map.Entry<String, Integer> nameListMap : result.entrySet()) {
//				System.out.println("Name : "+nameListMap.getKey() +" Count : "+nameListMap.getValue() );
//			}
//			result.entrySet().stream().forEach(System.out::println);
			Map<String, Long> result = nameList.stream()
		            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		        System.out.println(result);
			JsonObject jsonObject= new JsonObject();
			jsonObject.addProperty("ObjectName","Employee" );
			jsonObject.addProperty("ObjectType","MasterDetail" );
			JsonObject jsonObject2= new JsonObject();
			jsonObject2.addProperty("ObjectName","Department" );
			jsonObject2.addProperty("ObjectType","Lookup" );
			JsonArray jsonArray = new JsonArray();
			jsonArray.add(jsonObject);
			jsonArray.add(jsonObject2);
			System.out.println(jsonArray);
			
			
			
		}
		//MainNode--> AppDesigner -->DataExe
		//SELECT OBJECT_NAME,OBJECT_TYPE FORM PFM_OBJECTS WHERE OBJECT_ID=?;
		
		
}
