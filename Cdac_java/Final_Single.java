class Exam {
    private static Exam ex;

    private Exam() {
        System.out.println("inside Exam ()");
    }

    static Exam getReference() {
        if (ex == null) {
            ex = new Exam();
        }
        return ex;

    }

}

class Final_Single {
    public static void main(String[] args) {
        Exam e = Exam.getReference();
        System.out.println(e.hashCode());
        Exam ee = Exam.getReference();
        System.out.println(ee.hashCode());
        Exam eee = Exam.getReference();
        System.out.println(eee.hashCode());

    }

}
