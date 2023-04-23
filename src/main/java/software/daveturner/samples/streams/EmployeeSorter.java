package software.daveturner.samples.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSorter {

    public static List<Employee> sortById(List<Employee> list) {
        return list.stream()
                .sorted(Comparator.comparing(Employee::getEmployeeId))
                .peek(System.out::println)
                .collect(Collectors.toList());
    }

    public static List<Employee> sortByName(List<Employee> list) {
        return list.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .peek(System.out::println)
                .collect(Collectors.toList());
    }

    public static List<Employee> sortByStartDate(List<Employee> list) {
        return list.stream()
                .sorted(Comparator.comparing(Employee::getStartDate))
                .peek(System.out::println)
                .collect(Collectors.toList());
    }

    public static Employee getNewestMember(List<Employee> list) {
        return list.stream()
                .sorted(Comparator.comparing(Employee::getStartDate).reversed())
                .findFirst().get();
    }

    public static Employee getOldestMember(List<Employee> list) {
        return list.stream()
                .sorted(Comparator.comparing(Employee::getStartDate))
                .findFirst().get();
    }





}
