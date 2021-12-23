public class Main {
    public static void main(String[] args) {

        Teacher t1= new Teacher("Ali Yılmaz","123124","Matematik");
        Teacher t2 = new Teacher("Ayşe Yılmaz","2134124","Türkçe");
        Teacher t3 = new Teacher ("Veli Yılmaz","21321421","Tarih");


        Course c1 = new Course("Matematik","1","Matematik");
        c1.addTeacher(t1);

        Course c2 = new Course("Türkçe","2","Türkçe");
        c2.addTeacher(t2);

        Course c3 = new Course("Tarih","3","Tarih");
        c3.addTeacher(t3);

        Student s1 = new Student("Ezgi","1","1",c1,c2,c3);
        s1.addBulkExamNote(100,50,60,70,50,80);
        s1.isPass();

        Student s2 = new Student("Zehra","2","1",c1,c2,c3);
        s2.addBulkExamNote(50,60,70,50,50,90);
        s2.isPass();

        Student s3 =  new Student("Emir","4","3",c1,c2,c3);
        s3.addBulkExamNote(10,20,30,40,50,60);
        s3.isPass();





    }
}
