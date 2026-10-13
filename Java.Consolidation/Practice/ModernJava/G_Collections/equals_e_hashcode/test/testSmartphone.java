package ModernJava.G_Collections.equals_e_hashcode.test;

import ModernJava.G_Collections.equals_e_hashcode.Smartphone.SmartPhone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class testSmartphone {
    public static void main(String[] args) {
        SmartPhone s1 = new SmartPhone("ANN2an43poj", "Iphone 16 Pro Max");
        SmartPhone s2 = new SmartPhone("3345njkKJGk", "Iphone 17 Pro Max");
        SmartPhone s3 = new SmartPhone("4NN2an43poj", "Samsung a17");
        SmartPhone s4 = new SmartPhone("aNN2an43poj", "Moto g270");
        SmartPhone s5 = new SmartPhone("zZNN5553poj", "Nokia Tijolão");
        List<SmartPhone> armazem = new ArrayList<>();

        armazem.add(s1);
        armazem.add(s2);
        armazem.add(s3);
        armazem.add(s4);
        armazem.add(s5);

        for (SmartPhone s : armazem) {
            System.out.println(s.toString());
        }
        System.out.println("---------------------------------------------------------------");
            Collections.sort(armazem);
        for (SmartPhone s : armazem) {
            System.out.println(s.toString());
        }
    }
}
