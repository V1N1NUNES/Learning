package PracticeProjects.B_Locadora_de_Jogos.App;

import PracticeProjects.B_Locadora_de_Jogos.Views.Menus;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        Menus menuPrincipal = new Menus();
        menuPrincipal.menuPrincipal(r);
        r.close();
    }
}
