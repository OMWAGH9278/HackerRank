
/*
    AUTHOR : OM MANGESH WAGH
    TITLE : JAVA REFLECTION
*/

public class JavaReflection {

    public static void main(String[] args) {
        Class<?> student = Student.class;
        Method[] methods = student.getDeclaredMethods();

        ArrayList<String> methodList = new ArrayList<>();
        for (Method method : methods) {
            methodList.add(method.getName());
        }
        Collections.sort(methodList);
        for (String name : methodList) {
            System.out.println(name);
        }
    }
}