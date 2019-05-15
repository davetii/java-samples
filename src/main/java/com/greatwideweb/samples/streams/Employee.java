package com.greatwideweb.samples.streams;

import java.time.LocalDate;

public class Employee {

    private final int employeeId;
    private final String name;
    private final LocalDate startDate;

    public Employee(int employeeId, String name, LocalDate startDate) {
        this.employeeId = employeeId;
        this.name = name;
        this.startDate = startDate;
    }

    public int getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public LocalDate getStartDate() { return startDate; }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", startDate=" + startDate +
                '}';
    }
}
