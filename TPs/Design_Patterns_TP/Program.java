package Software_Eng_TPs;

abstract class Program {
    public Program() {
    }
    public void go() {

    }
}

class Program1 extends Program {
    public Program1() {
    }
    @Override
    public void go() {
        System.out.println("Je suis le traitement 1");
    }
}

class Program2 extends Program {
    public Program2() {
    }
    @Override
    public void go() {
        System.out.println("Je suis le traitement 2");
    }
}

class Program3 extends Program {
    public Program3() {
    }
    @Override
    public void go() {
        System.out.println("Je suis le traitement 3");
    }
}
class Program4 extends Program {
    public Program4() {
    }
    @Override
    public void go() {
        System.out.println("Je suis le traitement 4");
    }
}
