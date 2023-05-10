package StructuralDP.CompositeDP;

import java.util.List;

abstract class Department {

    abstract String getName();

    // tum departmanlardan calisanlari getirecek method
    abstract List<String> getEmployees();

}
