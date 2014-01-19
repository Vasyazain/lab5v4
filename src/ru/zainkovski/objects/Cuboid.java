//19.01.2014 17:21:40
/*
 * Прямоугольный параллелепипед
 */
package ru.zainkovski.objects;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class Cuboid extends Body {
   
   public Cuboid(int id1, int Hight, int Lengh,int Width, String name1)
        {id = id1; hight=Hight; lenght=Lengh; width=Width; name = name1; 
         volume = Double.valueOf(hight*lenght*width);
         square = Double.valueOf(2*(hight*lenght+lenght*width+hight*width));
        }
    
    public double getLen(){
        return lenght;
    }

    public double getWide(){
        return width;
    }
    
    @Override
    public double getHig() {
        return hight;
    }
    
    
    @Override
    public double volume() {
        return volume;
    }

    @Override
    public double square() {
       return square;
    }
    
 public String getDateTime() {

        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        Date date = new Date();

        return dateFormat.format(date);

    }
    
    
    @Override
    public void print() {
        System.out.println("id= "+this.getId()+", "+this.getName()+", высота: "+this.getHig()
                +", Ширина: "+this.getWide()+", Длина: "+Math.ceil(this.getLen()*100)/100
                +", Объём: "+Math.ceil(volume*100)/100+", Площадь: "+Math.ceil(square*100)/100+" Дата создания: "+this.getDateTime());
    }
    @Override
    public int compareTo(Body t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
