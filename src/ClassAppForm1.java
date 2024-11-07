public class ClassAppForm1 {
    String name;
    long rollno;

    public void display() {
        System.out.println(name);
        System.out.println(rollno);
    }

    public void setvalue(String str, long num) {
        str = name;
        num = rollno;

    }
}
    class main {
        public static void main(String[] args) {
            ClassAppForm1 kabilan = new ClassAppForm1();
            kabilan.setvalue("kabilan",421121102069l);
            kabilan.display();

        }
    }


