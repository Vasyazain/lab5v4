package ru.zainkovski.objects;
import java.io.*;
import java.util.*;
import org.junit.Test;
import static org.junit.Assert.*;


    public class CylinderTest {
	@Test
         public void testType(){
			System.out.println("Тестируем класс Цилиндр");
			Cylinder t = new Cylinder(1,1,1,"Cylinder");
			assertEquals("Cylinder",t.name);
		}   
	@Test
	 public void testMethod(){
			System.out.println("Тестируем метод getArea()");
			Cylinder t = new Cylinder(4,8,4,"Cylinder");
			assertEquals(32.0,t.getArea(),0.01);			
		}
	@Test
	 public void testMethodsNew(){
			System.out.println("Тестируем метод getDiag()");
			Cylinder t = new Cylinder(1,5,2,"Cylinder");
			assertEquals(7.0,t.getDiag(),0.0001);			
		}
}
