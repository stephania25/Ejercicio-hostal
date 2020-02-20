package menu;

import clases.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class menu {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int s = 0;

        List<Comida>comidas = new ArrayList<>();
        List<Baño>baños = new ArrayList<>();
        List<Lavanderia>lavanderias = new ArrayList<>();
        List<Dormida>dormidas= new ArrayList<>();

        Comida c1 = new Comida(12,"desayuno",7000.0);
        Comida c2 = new Comida(13,"desayuno y almuerzo",10000.0);
        comidas.add(c1);
        comidas.add(c2);

        Baño b1 = new Baño(100,"Privado",5000.0);
        Baño b2 = new Baño(110,"normal",10000.0);
        baños.add(b1);
        baños.add(b1);

        Lavanderia l1 = new Lavanderia(201,"todos los dias", 20000.0);
        Lavanderia l2 = new Lavanderia(202,"una vez a la semana", 2000.0);
        lavanderias.add(l1);
        lavanderias.add(l2);


        Dormida d1 = new Dormida(30,"cama sencilla", 25000.0, "habitacion privada");
        Dormida d2 = new Dormida(33,"cama doble", 35000.0, "habitacion privada");
        Dormida d3 = new Dormida(34,"inferior", 25000.0, "camarote");
        Dormida d4 = new Dormida(35,"superior", 25000.0, "camarote");
        dormidas.add(d1);
        dormidas.add(d2);
        dormidas.add(d3);
        dormidas.add(d4);

        System.out.println("");
        System.out.println("     << HOSTAL 7pk2's >>");
        System.out.println("");
        System.out.println(" Te damos una BIENVENIDA aqui puedes hscer tu reseva :) ");
        System.out.println("");
        System.out.println("        |  Tipo de Dormitorio  |");
        System.out.println("        :::::::::::::::::::::::: ");
        System.out.println("Codigo      Descripcion       Valor");
        for (Dormida h: dormidas){
            System.out.println(" " + h.getCodigo() + "    " + h.getDescripcion() + "   " + h.getPrecio());
        }
        System.out.print("    Seleccione: ");
        s = scan.nextInt();
        Dormida hab = dormidas.get(s);
        // (Dormida h:camarote) si acepta el camarote descuento 5%
        Double suma = (hab.getPrecio() + res.getPrecio() + lav.getPrecio() + ban.getPrecio());
           Double descuento = suma * 0.05;
            Double total = suma - descuento;

        System.out.println("");
        System.out.println(" ");
        System.out.println("        |     Alimentación    |");
        System.out.println("        :::::::::::::::::::::::  ");
        System.out.println("Codigo      Descripcion       Valor");
        for (Comida r: comidas){
            System.out.println(" " + r.getCodigo() + "    " + r.getDescripcion() + "   " + r.getPrecio());
        }
        System.out.print("    Seleccione:  ");
        s = scan.nextInt();
        Comida res = comidas.get(s);
        System.out.println("");

        System.out.println("");
        System.out.println("");
        System.out.println("        |Servicio de Lavandería|");
        System.out.println("        :::::::::::::::::::::::: ");
        System.out.println("Codigo     Descripcion       Valor");
        for (Lavanderia l: lavanderias){
            System.out.println(" " + l.getCodigo() + "    " + l.getDescripcion() + "   " + l.getPrecio());
        }
        System.out.print("    Seleccione: ");
        s = scan.nextInt();
        Lavanderia lav = lavanderias.get(s);

        System.out.println("");
        System.out.println("");
        System.out.println("        |  Servicio de Baño   |");
        System.out.println("        :::::::::::::::::::::::  ");
        System.out.println("Codigo      Descripcion         Valor");
        for (Baño b: baños){
            System.out.println(" " + b.getCodigo() + "    " + b.getDescripcion() + "   " + b.getPrecio());
        }
        System.out.print("    Seleccione: ");
        s = scan.nextInt();
        Baño ban = baños.get(s);


        System.out.println("");
        System.out.println("");
        System.out.println("        |       RESERVA SELECCIONADA       |");
        System.out.println("        ::::::::::::::::::::::::::::::::::: ");
        System.out.println("COD      DESCRIPCION            PRECIO");
        System.out.println(" " + hab.getCodigo() + "    " + hab.getDescripcion() + "  "  + hab.getPrecio());
        System.out.println(" " + res.getCodigo() + "    " + res.getDescripcion() + "  "  + res.getPrecio());
        System.out.println(" " + lav.getCodigo() + "    " + lav.getDescripcion() + "   "  + lav.getPrecio());
        System.out.println(" " + ban.getCodigo() + "    " + ban.getDescripcion() + "   "  + ban.getPrecio());
        System.out.println("-----------------------------------------");

        System.out.println(" DESCUENTO  5%              $   " + descuento);
        System.out.println(" TOTAL                      $  " + total);

    }
}