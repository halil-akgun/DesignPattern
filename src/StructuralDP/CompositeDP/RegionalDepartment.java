package StructuralDP.CompositeDP;

import java.util.List;
import java.util.stream.Collectors;

public class RegionalDepartment extends Department {

    // butun departmanlari bir degisken uzerinde kontrol etmek icin olusturuldu
    List<Department> childDepartments;


    public RegionalDepartment(List<Department> childDepartments) {
        this.childDepartments = childDepartments;
    }

    @Override
    String getName() { // butun departmanlarin isimlerini getirir
        return childDepartments.stream().// stream yapida departmanlar geliyor
                map(Department::getName). // stream departman isimleri geliyor
                collect(Collectors.joining(", ")); // Finance, Sales
    }

    @Override
    List<String> getEmployees() { // butun calisanlarin isimlerini getirir
        return childDepartments.stream().
                flatMap(t -> t.getEmployees().stream()).
                collect(Collectors.toList());
    }
}
