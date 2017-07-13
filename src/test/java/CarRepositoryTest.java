import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Test;

import com.fanniemae.payroll.dao.CarRepository;

public class CarRepositoryTest {
	@Test
	public void testToyotaCar() {
		CarRepository c = new CarRepository();
		Map<String, Double> map = c.findMaps();
		
		assertTrue(map.containsKey("Toyota"));
	}
	
	@Test
	public void testBMWPrice(){
		CarRepository c = new CarRepository();
		Map<String, Double> map = c.findMaps();		
		assertTrue(map.get("BMW") > 50_000d);
	}
	
	@Test
	public void testCarRepositorySize(){
		assertTrue(new CarRepository().findMaps().size() == 10);
	}
	
	@Test
	public void testAudiPrice(){
		CarRepository c = new CarRepository();
		Map<String, Double> map = c.findMaps();		
		assertTrue(map.get("Audi") == 70_000d);
	}
	
	@Test 
	public void testTeslaPrice(){
		CarRepository c = new CarRepository();
		Map<String, Double> map = c.findMaps();		
		assertFalse(map.get("Tesla") == 70_000d);
	}
	
	@Test
	public void testDifferenceBetweenToyotaHondaPrice(){
		CarRepository c = new CarRepository();
		Map<String, Double> map = c.findMaps();		
		assertEquals("Delta", map.get("Toyota"), map.get("Honda"), 10_000d);
	}
	
	@Test
	public void testJaguarPriceNotNull(){
		CarRepository c = new CarRepository();
		Map<String, Double> map = c.findMaps();		
		assertNotNull(map.get("Jaguar"));
	}
	
	@Test 
	public void testNissanNotExist(){
		CarRepository c = new CarRepository();
		Map<String, Double> map = c.findMaps();		
		assertNull(map.get("Nissan"));
		
	}


}
