package ru.zainkovski.objects;
import java.io.*;
import java.util.*;
import org.junit.Test;
import static org.junit.Assert.*;


    public class CubeTest {
	@Test
         public void testType(){
			System.out.println("Тестируем класс Куб");
			Cube t = new Cube(1,1,"Cube");
			assertEquals("Cube",t.name);
		}   
	@Test
	 public void testMethod(){
			System.out.println("Тестируем метод getDiag()");
			Cube t = new Cube(1,2,"Cube");
			assertEquals(3.4641,t.getDiag(),0.0001);			
		}


    }
