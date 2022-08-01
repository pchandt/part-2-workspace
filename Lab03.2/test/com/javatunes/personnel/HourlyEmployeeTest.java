package com.javatunes.personnel;

import static org.junit.Assert.*;

import gov.irs.TaxPayer;
import java.sql.Date;
import org.junit.Before;
import org.junit.Test;

public class HourlyEmployeeTest {
  private HourlyEmployee employee;

  @Before
  public void setUp() throws Exception {
    employee =  new HourlyEmployee("Harry", new Date(2021,7,5), 50D, 40D);

  }

  @Test
  public void pay() {
    assertEquals(40D*50D, employee.pay(), 0.005); //add tolerance 0.005

  }

  @Test
  public void payTaxes() {
    assertEquals(40D*50D * TaxPayer.HOURLY_TAX_RATE, employee.payTaxes(), 0.005);

  }
}