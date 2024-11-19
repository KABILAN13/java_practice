class Sample {
    int rollno;
    int marks;

    Sample(){
        System.out.println("this is kabilan");
        rollno=21;
        marks=10;
    }
}

class Construct{
    public static void main(String[] args) {
        Sample obj = new Sample();
        System.out.println(obj.rollno);
        System.out.println(obj.marks);
    }
}
