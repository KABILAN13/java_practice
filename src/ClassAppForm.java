class ClassAppForm {
    String name;
    long rollno;
    long phoneno;
    public void display(){
        System.out.println(name);
        System.out.println(rollno);
        System.out.println(phoneno);
    }

    public static void main(String[] args) {
        ClassAppForm kabilan = new ClassAppForm();
        kabilan.name = "KABILAN";
        kabilan.rollno=42112110206969l;
        kabilan.phoneno=9876543210l;
        kabilan.display();
    }
}
