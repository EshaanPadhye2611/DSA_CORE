public class main {
    public static void main(String[] args) {
        Student s1 = new Student("John",20,123);
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNo);
    }

    class Student {
        String name;
        int age;
        int rollNo;

       public Student(String name,int age,int rollNo){
            this.name = name;
            this.age = age;
            this.rollNo = rollNo;
        }

    }
}
