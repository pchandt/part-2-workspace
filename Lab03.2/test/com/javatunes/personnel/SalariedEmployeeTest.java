package com.javatunes.personnel;

import static org.junit.Assert.*;

import gov.irs.TaxPayer;
import java.sql.Date;
import org.junit.Before;
import org.junit.Test;

public class SalariedEmployeeTest {

  private SalariedEmployee employee;

  @Before
  public void setUp() throws Exception {
    employee =  new SalariedEmployee("Ram", new Date(0), 2000D);

  }

  @Test
  public void pay() {
    assertEquals(2000D, employee.pay(), 0.005); //add tolerance 0.005


  }

  @Test
  public void payTaxes() {
    assertEquals(2000d * TaxPayer.SALARIED_TAX_RATE, employee.payTaxes(), 0.005);
  }

  @Test
  public void equals_same() {
    Employee employee2 =  new SalariedEmployee("Ram", new Date(0), 2000D);
    //    Employee employee2 =  new SalariedEmployee("John Smith", new Date(0), 1000.0);
    assertTrue(employee.equals(employee2));

  }

  @Test
  public void equals_different() {
    Employee employee2 =  new SalariedEmployee("Ram", new Date(0), 2000D);
    assertNotEquals(employee, employee2);

  }

  @Test
  public void hashCode_same() {
    Employee employee2 =  new SalariedEmployee("Ram", new Date(0), 2000D);
    assertEquals(employee.hashCode(), employee2.hashCode());

  }
  @Test
  public void hashCode_different() {
    Employee employee2 =  new SalariedEmployee("Ram", new Date(1), 2000.01);
    assertNotEquals(employee.hashCode(), employee2.hashCode());

  }
}