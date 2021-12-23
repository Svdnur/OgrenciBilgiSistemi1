public class Course {

    String name;
    String code;
    String prefix;
    int note;
    int sozNote;
    Teacher teacher;


    public Course(String name, String code, String prefix){
        this.name = name;
        this. code = code;
        this.prefix =prefix;
        this.note= 0;
        this.sozNote = 0;

    }

    public void addTeacher(Teacher teacher) {
        if (this.prefix.equals(teacher.branch)) {
            System.out.println(this.name + "  dersine " + teacher.name + "   atandı.");
        } else {
            System.out.println("Öğretmen - ders eşleştirilemiyor.");
        }
    }

        public void printTeacher() {
            if(teacher != null){
                System.out.println(this.name + " dersi öğretmeni :" + teacher.name);
            }else {
                System.out.println("Öğretmen ataması yapamadınız");
            }
        }



}
