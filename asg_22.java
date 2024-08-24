interface Dog {
    void sample1();
}

interface Cat {
    void sample2();
}

class asg_22 implements Dog, Cat {

    public void sample1() {
        System.out.println("wofoo");
    }

    public void sample2() {
        System.out.println("meow");
    }

    public static void main(String[] args) {
        asg_22 sub = new asg_22();
        sub.sample1();
        sub.sample2();
    }
}
