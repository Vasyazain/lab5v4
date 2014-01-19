//06.11.2013 01:22:14
package ru.zainkovski.objects;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Cone extends Body{
    private double angle_base; // угол при основании
    private double angle_top; // угол при вершине
    private double diag;
        
  public Cone(int id1, int Hight, int R, String name1)
        {id = id1; hight=Hight; lenght=R; name = name1; 
        this.angle_base = angle_base;
        this.angle_top = angle_top;
        this.diag = Math.sqrt(this.getHig()*this.getHig()) + Math.sqrt(lenght*lenght);
        this.volume = Double.valueOf(hight*lenght*lenght*3.14/3);
        this.square = Double.valueOf(Math.sqrt(hight*hight+lenght*lenght)*3.14*lenght);
        }
    
    
    public double getAngleB(){
        return angle_base=Math.sin(this.getHig()/diag);
    }
    
    public double getAngleT(){
        return angle_top= Math.sin(lenght/diag);
    }

    @Override
    public double getHig() {
        return hight;
    }
    
    @Override
    public int compareTo(Body t) {
        throw new UnsupportedOperationException("Not supported yet.");
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
        System.out.println("id= "+this.getId()+", "+this.getName()+", Высота: "+this.getHig()+", sin угла при основании: "+Math.ceil(this.getAngleB()*100)/100 
                            +", sin угла при вершине: "+Math.ceil(this.getAngleT()*100)/100 
                            +", Объём: "+Math.ceil(volume*100)/100 +", Площадь: "+Math.ceil(square*100)/100+" Дата создания: "+this.getDateTime());
    }

       
   }
