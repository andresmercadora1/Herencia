package co.com.cesde;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        ArrayList<Monitor> listMonitor = new ArrayList<>();

        Monitor monitor = new Monitor();

        String question = "";

        while (!question.equalsIgnoreCase("s")) {
            System.out.println("Ingrese la marca");
            monitor.setBrand(inputData.nextLine());

            System.out.println("Ingrese el nombre");
            monitor.setName(inputData.nextLine());

            System.out.println("Ingrese la referencia");
            monitor.setReference(inputData.nextLine());

            System.out.println("Ingrese el tamaño de la pantalla");
            monitor.setScreenSize(Double.parseDouble(inputData.nextLine()));

            System.out.println("Ingrese la resolucion del monitor");
            monitor.setResolution(inputData.nextLine());

            listMonitor.add(monitor);

            System.out.println("Digite s para dejar de comprar");
            question = inputData.nextLine();
        }

        for (Monitor mon : listMonitor) {
            System.out.println(mon.getName());
        }

    }
}
