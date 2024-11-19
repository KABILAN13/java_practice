class ParaConstr {
    int rollno;
    int marks;

    ParaConstr(int num,int mark){
        System.out.println("this is kabilan");
        rollno=num;
        marks=mark;
    }
}

class Kabil {
    public static void main(String[] args) {
        ParaConstr obj = new ParaConstr(21,45);
        System.out.println(obj.rollno);
        System.out.println(obj.marks);
    }
}
