package se.newton.martin.inheritance;

public class TestCode {
    public static void main(String[] args) {
        Object c = new Cylinder();

        ((Circle)c).radius = 1.0f;

        Cylinder cy = (Cylinder)c;
        cy.height = 1.0f;

        System.out.println(cy.getVolume());


    }
}
