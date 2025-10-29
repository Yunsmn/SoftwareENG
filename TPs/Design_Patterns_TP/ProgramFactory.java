package Software_Eng_TPs;

public class ProgramFactory {
    static Program createProgram(int num) {
        if  (num == 1) {
            return new Program1();
        }
        else if (num == 2) {
            return new Program2();
        }
        else if (num == 3) {
            return new Program3();
        }
        else if (num == 4) {
            return new Program4();
        }
        else {
            return null;
        }
    }

}
