package com.greatwideweb.samples.streams;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class EmployeeSorterUnitTest {

    private List<Employee> list;

    @Before
    public void setup() {
        list = new ArrayList<>();
        list.add(new Employee(6, "Tobias Harris", LocalDate.of(2016, Month.MAY, 15)));
        list.add(new Employee(2, "Stanly Johnson", LocalDate.of(2017, Month.MAY, 15)));
        list.add(new Employee(9, "Andre Drummond", LocalDate.of(2016, Month.MAY, 14)));
        list.add(new Employee(4, "Luke Kennard", LocalDate.of(2018, Month.JANUARY, 15)));
    }

    @Test
    public void ensureSortByIdReturnsExpected() {
        list = EmployeeSorter.sortById(list);
        Assert.assertEquals(list.get(0).getEmployeeId(), 2);
        Assert.assertEquals(list.get(1).getEmployeeId(), 4);
        Assert.assertEquals(list.get(2).getEmployeeId(), 6);
        Assert.assertEquals(list.get(3).getEmployeeId(), 9);
    }

    @Test
    public void ensureSortByNameReturnsExpected() {
        list = EmployeeSorter.sortByName(list);
        Assert.assertEquals(list.get(0).getEmployeeId(), 9);
        Assert.assertEquals(list.get(1).getEmployeeId(), 4);
        Assert.assertEquals(list.get(2).getEmployeeId(), 2);
        Assert.assertEquals(list.get(3).getEmployeeId(), 6);
    }

    @Test
    public void ensureSortByStartDateReturnsExpected() {
        list = EmployeeSorter.sortByStartDate(list);
        Assert.assertEquals(list.get(0).getEmployeeId(), 9);
        Assert.assertEquals(list.get(1).getEmployeeId(), 6);
        Assert.assertEquals(list.get(2).getEmployeeId(), 2);
        Assert.assertEquals(list.get(3).getEmployeeId(), 4);
    }

    @Test
    public void ensureNewestMemberReturnsExpected() {
        Employee e = EmployeeSorter.getNewestMember(list);
        Assert.assertEquals(e.getEmployeeId(), 4);
    }

    @Test
    public void ensureOldestMemberReturnsExpected() {
        Employee e = EmployeeSorter.getOldestMember(list);
        Assert.assertEquals(e.getEmployeeId(), 9);
    }

}
