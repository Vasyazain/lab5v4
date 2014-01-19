package ru.zainkovski.lab5_stp;

import ru.zainkovski.objects.Body;
import ru.zainkovski.objects.Cylinder;
import ru.zainkovski.objects.Cube;
import ru.zainkovski.objects.Cuboid;
import ru.zainkovski.objects.Cone;
import ru.zainkovski.objects.SortMode;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import static ru.zainkovski.lab5_stp.Lab5_stp.baze;
import static ru.zainkovski.lab5_stp.Lab5_stp.key;
import static ru.zainkovski.lab5_stp.Lab5_stp.test;

public class Lab5_stp {
    public static int key = -1;
    public static Body test = null;
    public static List<Body> baze = new ArrayList();
    
    public static void main(String[] args) throws IOException {
      
        
        while(key!=0)
        {   System.out.println("*--------------------------*");
            System.out.println("1 - Создать Куб");
            System.out.println("2 - Создать Параллелепипед");
            System.out.println("3 - Создать Цилиндр");
            System.out.println("4 - Создать Конус");
            System.out.println("5 - Вывод списка с детальной информацией");
            System.out.println("6 - Удаление по id");
            System.out.println("7 - Запустить сортировку");
            System.out.println("0 - Выход");
            System.out.println("*--------------------------*");
            InputStreamReader isr = new InputStreamReader(System.in); 
            BufferedReader br = new BufferedReader(isr); 

            Scanner in = new Scanner(System.in);
            key = in.nextInt();
            switch(key)
            {
                case 1:
                    System.out.println("Создаём Куб.");
                    System.out.println("Введите id: ");
                    int id = in.nextInt();
                    System.out.println("Введите Высоту: ");
                    int Hight = in.nextInt();
                    String name = "Куб";
                    System.out.println("На какое место добавить?(всего-"+baze.size()+",добавить на любое - 0)");
                    int pos = in.nextInt();
                    pos = pos -1;
                    if(baze.size()!=0 && pos != -1) 
                         {baze.add(pos,new ru.zainkovski.objects.Cube(id,Hight,name));}
                    else {baze.add(new ru.zainkovski.objects.Cube(id,Hight,name));}
                    
                    break;
                case 2:
                    System.out.println("Создаём прямоугольный параллелепипед.");
                    System.out.println("Введите id: ");
                    id = in.nextInt();
                    System.out.println("Введите Высоту: ");
                    Hight = in.nextInt();
                    System.out.println("Введите Длину: ");
                    int Lengh = in.nextInt();
                    System.out.println("Введите Ширину: ");
                    int Width = in.nextInt();                    
                    name = "Параллелепипед";
                    System.out.println("На какое место добавить?(всего-"+baze.size()+",добавить на любое - 0)");
                    pos = in.nextInt();
                    pos = pos -1;
                    if(baze.size()!=0 && pos != -1) 
                         {baze.add(pos,new ru.zainkovski.objects.Cuboid(id,Hight,Lengh,Width,name));}
                    else {baze.add(new ru.zainkovski.objects.Cuboid(id,Hight,Lengh,Width,name));}
                    
                
                    break;
                case 4:
                    System.out.println("Создаём Конус.");
                    System.out.println("Введите id: ");
                    id = in.nextInt();
                    name = "Конус";
                    System.out.println("Введите высоту: ");
                    Hight = in.nextInt();
                    System.out.println("Введите радиус: ");
                    int R = in.nextInt();
                    System.out.println("На какое место добавить?(всего-"+baze.size()+",добавить на любое - 0)");
                    pos = in.nextInt();
                    pos = pos -1;
                    if(baze.size()!=0 && pos != -1) 
                         {baze.add(pos,new ru.zainkovski.objects.Cone(id,Hight,R,name));}
                    else {baze.add(new ru.zainkovski.objects.Cone(id,Hight,R,name));}

                   
                    break;                
                case 3:
                    System.out.println("Создаём Цилиндр.");
                    System.out.println("Введите id: ");
                    id = in.nextInt();
                    name = "Цилиндр";
                    System.out.println("Введите высоту: ");
                    Hight = in.nextInt();
                    System.out.println("Введите радиус: ");
                    R = in.nextInt();
                    System.out.println("На какое место добавить?(всего-"+baze.size()+",добавить на любое - 0)");
                    pos = in.nextInt();
                    pos = pos -1;
                    if(baze.size()!=0 && pos != -1) 
                         {baze.add(pos,new ru.zainkovski.objects.Cylinder(id, Hight, R, name));}
                    else {baze.add(new ru.zainkovski.objects.Cylinder(id, Hight, R, name));}
                    
                    break;

               case 5:
                   for(Body test: baze)
                  {
                      test.print();
                  }
                  break;
                   
              case 6:
                  System.out.print("Введите id: ");
                  int id1 = in.nextInt();
                  for(int i = 0; i < baze.size(); i++)
                  {
                   test = (Body) baze.get(i);
                   if (test.id == id1) 
                   {
                        baze.remove(i);
                        System.out.println("Удаление произведено!"); 
                        i = baze.size();
                   }
                  }
                  break;
              case 7:
                System.out.println("*--------------------------*");
                System.out.println("1 - по возраcтанию id");
                System.out.println("2 - по убыванию id");
                System.out.println("3 - по возраcтанию имени");
                System.out.println("4 - по убыванию имени");
                System.out.println("5 - по возрастанию объёма");
                System.out.println("6 - по убыванию объёма");
                System.out.println("7 - по возрастанию площади");
                System.out.println("8 - по убыванию площади");
                System.out.println("9 - по возрастанию времени");
                System.out.println("10 - по убыванию времени");
                                  
                String mode = br.readLine(); // читаем строку из буфера ввода
                if (mode.isEmpty()) break; // прерываем цикл, если строка пустая
                boolean sortUp = mode.equals("2")||mode.equals("4")||mode.equals("6")||mode.equals("8"); 
                int  sortMode=0; 
                if (mode.equals("3")||mode.equals("4")) sortMode=1; 
                    else if (mode.equals("5")||mode.equals("6")) sortMode=2; 
                        else if (mode.equals("7")||mode.equals("8")) sortMode=3;
                            else if (mode.equals("9")||mode.equals("10")) sortMode=4;
                
                Collections.sort(baze,new SortMode(sortUp,sortMode)); 
                
                        for(Body test: baze)
                        {
                            test.print();
                        }
                  break;
                                
            }
        }
    }
//17.11.2013 22:45:11
}
