class S1 {
    int marks;

    S1(int marks) {
        this.marks = marks;
    }
}
class S1Main{
    static void change(int x, S1 s) {
        x = 100;
        s.marks = 95;
        s = new S1(50);
    }

    public static void main(String[] args) {
        int n = 20;
        S1 st = new S1(60);

        change(n, st);

        System.out.println(n);
        System.out.println(st.marks);
    }
}
