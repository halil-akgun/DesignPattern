package StructuralDP.CompositeDP;

import java.util.Arrays;

public class CompositeRunner {

    public void CcompositeDemo() {

        Department financeDep = new Finance();
        Department salesDep = new Sales();
        Department argeDep = new Arge();
        Department regionalDep = new RegionalDepartment(Arrays.asList(financeDep, salesDep, argeDep));

        System.out.println(regionalDep.getName());
        System.out.println("************************");
        System.out.println(regionalDep.getEmployees());
    }

    public static void main(String[] args) {

        CompositeRunner composite = new CompositeRunner();
        composite.CcompositeDemo();

    }
}
