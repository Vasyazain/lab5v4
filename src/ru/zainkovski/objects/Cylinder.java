//19.01.2014 17:22:04
package ru.zainkovski.objects;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Cylinder extends Body {
    private double diag; // диагональ
    private double area_Body_rot; // площадь тела вращения, прямоуг. который образует цилиндр 
        
    public Cylinder(int id1, int Hight, int R, String name1){
        id = id1; hight=Hight; lenght=R; name = name1; 
        this.diag = diag;
        this.area_Body_rot = area_Body_rot;
        volume = Double.valueOf(hight*lenght*lenght*3.14);
        square = Double.valueOf(hight*lenght*2*3.14+2*lenght*lenght*3.14);
    }
    
    public double getRad(){
        return lenght;
    }

    public double getDiag(){
        return diag=Math.sqrt(this.getHig()*this.getHig())+Math.sqrt(lenght*lenght);
    }
    public double getArea(){
        return area_Body_rot = this.getHig()*lenght;
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
        System.out.println("id= "+this.getId()+", "+this.getName()+", Высота: "+this.getHig()
                            +", Радиус: "+this.getRad()+", Диагональ: "+Math.ceil(this.getDiag()*100)/100
                            + ",Площадь тела вращения: "+Math.ceil(this.getArea()*100)/100
                            +", Объём: "+Math.ceil(volume*100)/100+", Площадь: "+Math.ceil(square*100)/100+" Дата создания: "+this.getDateTime()); 
    }
}
