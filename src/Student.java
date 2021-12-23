public class Student {
    String name;
    String stuNo;
    String classes;
    Course c1;
    Course c2;
    Course c3;
    double avarage;
    boolean isPass;
    double sozNote;
    double finalexam1;
    double finalExam2;
    double finalExam3;

    public Student(String name, String stuNo, String classes, Course c1,Course c2,Course c3){
        this.name = name;
        this.stuNo =stuNo;
        this.classes = classes;
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        this.avarage=0.0;
        this.isPass=false;
        this.sozNote=0.0;
        this.finalexam1=0.0;
        this.finalExam2=0.0;
        this.finalExam3=0.0;

    }
    public void addBulkExamNote(int n1, int soz1, int n2, int soz2, int n3, int soz3 ) {
        if ((n1 >= 0 && n1 <= 100) && (soz1 >= 0 && soz1 <= 100)) {
            this.c1.note = n1;
            this.c1.sozNote = soz1;
        }

        if ((n2 >= 0 && n2 <= 100) && (soz2 >= 0 && soz2 <= 100)) {
            this.c2.note = n2;
            this.c2.sozNote = soz2;
        }

        if ((n3 >= 0 && n3 <= 100) && (soz3 >= 0 && soz3 <= 100)) {
            this.c3.note = n3;
            this.c3.sozNote = soz3;
        }
    }
        public void calcAvarage(){
            this.finalexam1 = (this.c1.note * 0.8) + (this.c1.sozNote * 0.2);
            this.finalExam2 = (this.c2.note * 0.8) + (this.c2.sozNote * 0.2);
            this.finalExam3 = (this.c3.note * 0.8) + (this.c3.sozNote * 0.2);
            this.avarage =  (this.finalexam1 + this.finalExam2 + this.finalExam3) /3;

        }
        public void isPass(){
        calcAvarage();
        printNote();
            System.out.println("Ortalama :" + this.avarage);
            if(this.avarage > 55){
                System.out.println("Sınıfı geçti");
            }else{
                System.out.println("Sınıfta kaldı");
            }
        }

        public void printNote(){
            System.out.println("------------------------");
            System.out.println("Öğrenci :" + this.name);
            System.out.println("Matematik notu :" + this.finalexam1);
            System.out.println("Türkçe notu :" + this.finalExam2);
            System.out.println("Tarih notu :" + this.finalExam3);
        }





}
