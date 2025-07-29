package Com.practice.reflection;

import java.lang.reflect.InvocationTargetException;

public class GetObjectUsingReflection {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
        try {
            // 1. Using class name
            Class<?> clazz = Class.forName("Com.practice.reflection.Person");

            // 2. Using class literal
            Class<Person> clazz2 = Person.class;

            // 3. From object
            Person p = new Person();
            Class<?> clazz3 = p.getClass();
            
            Object obj =  clazz.getDeclaredConstructor().newInstance();
            
            Person p2 = (Person) obj;

            System.out.println("Class from name: " + clazz.getName()+" Hascode : "+clazz.hashCode());
            System.out.println("Class from literal: " + clazz2.getName()+" Hascode : "+clazz2.hashCode());
            System.out.println("Class from object: " + clazz3.getName()+" Hascode : "+clazz3.hashCode());
            System.out.println(" Person 2 hascode : "+p2.hashCode());

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
