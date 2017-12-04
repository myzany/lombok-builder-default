package kr.zany.test;

import org.junit.Assert;
import org.junit.Test;

/**
 * <p><b></b></p>
 * <p>Copyright (c) 2017 zany.kr all rights reserved</p>
 *
 * @author Sang-hyun Lee (zanylove@gmail.com)
 * @since 2017. 11. 21. PM 4:11
 */
public class LombokBuilderTest {

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Inject Beans
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Member Variables
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Constructors
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Public Methods
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    @Test
    public void constructorInitValue() {

        // with @AllArgsConstructor

        Person person = new Person();

        Assert.assertNull(person.getFirstName());
        Assert.assertNull(person.getLastName());
        Assert.assertNotNull(person.getSex());

        Assert.assertEquals("male", person.getSex());


        Laptop laptop = new Laptop();

        Assert.assertNull(laptop.getManufacturer());
        Assert.assertNull(laptop.getModelNo());
        Assert.assertNull(laptop.getSerialNo());
        Assert.assertNull(laptop.getCpu());
        Assert.assertNull(laptop.getMem());
        Assert.assertNull(laptop.getVga());
    }

    @Test
    public void builderInitValue() {

        // provide a minimal Builder implementation containing the default values

        Person person = Person.builder().build();

        Assert.assertNotNull(person.getFirstName());
        Assert.assertNotNull(person.getLastName());
        Assert.assertNull(person.getSex());

        Assert.assertEquals("Doe", person.getFirstName());
        Assert.assertEquals("John", person.getLastName());

        // with @Builder.Default

        Laptop laptop = Laptop.builder().build();

        Assert.assertNotNull(laptop.getManufacturer());
        Assert.assertNull(laptop.getModelNo());
        Assert.assertNull(laptop.getSerialNo());
        Assert.assertNull(laptop.getCpu());
        Assert.assertNull(laptop.getMem());
        Assert.assertNull(laptop.getVga());

        Assert.assertEquals("Apple. Inc.", laptop.getManufacturer());
    }



    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Protected Methods
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Private Methods
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Overrided Methods
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Inner Classes
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

}
