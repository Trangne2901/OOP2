public class Test {

    public static void main(String[] args) {
        StudentImpl student = new StudentImpl("Hoa Le", 25, true);

        System.out.println("Ten: "+ student.getName() + "  Tuoi: "+ student.getAge()+ "  Gioitinh: " + student.isGender());
        System.out.println(student.eat());
        System.out.println(student.sleep());
        System.out.println(student.study());
        System.out.println(student.registerCourse("Programming Node JS") );
        student.attendClass();
    }
}

