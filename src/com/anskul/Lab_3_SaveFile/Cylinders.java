package com.anskul.Lab_3_SaveFile;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cylinders {

    ArrayList<Cylinder> cylinders;

    public Cylinders() {cylinders = new ArrayList<>();}

    public static String averageVolume(ArrayList<Cylinder> cylinders)
    {
        double volume = 0;
        for (Cylinder cylinder : cylinders) {
            volume += cylinder.getVolume();
        }
        volume /= cylinders.size();

        return "\nAverage volume of a cylinder = " + volume;
    }

    public void clear() {
        this.cylinders.clear();
    }

//    public void save(String filename) throws IOException {
//        FileWriter fw = new FileWriter(filename);
//        BufferedWriter bw = new BufferedWriter(fw);
//        for (int i = 0; i < cylinders.size(); i++) {
//            try {
//                bw.write("\nCylinder " + i);
//                bw.write("\n");
//                bw.write(String.valueOf(cylinders.get(i).getHeight()));
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//        bw.close();
//        fw.close();
//    }
//
//    public void load(String filename, final ArrayList<Circle> circles) throws IOException {
//        this.clear();
//        Scanner scanner = new Scanner(new FileReader(filename));
//        double height = 1.0;
//        int counter = 1;
//        scanner.nextLine();
//        while (scanner.hasNextLine()) {
//            if(counter % 2 != 0) {
//                    height = Double.valueOf(scanner.nextLine());
//                    this.cylinders.add(new Cylinder(circles.get(counter-1).getRadius(), height));
//            }
//            else
//                scanner.nextLine();
//            counter++;
//        }
//        scanner.close();
//    }
//

}
