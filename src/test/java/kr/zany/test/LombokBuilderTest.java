package kr.zany.test;

import org.apache.commons.lang3.builder.ToStringBuilder;
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
    public void initValuesFromConstructor() {

        // with @AllArgsConstructor

        Person person = new Person();

        Assert.assertNull(person.getFirstName());
        Assert.assertNull(person.getLastName());
        Assert.assertNotNull(person.getSex());

        Assert.assertEquals("male", person.getSex());

        System.out.println("-----------------------------------------");
        System.out.println(ToStringBuilder.reflectionToString(person));
        System.out.println("-----------------------------------------");


        Laptop laptop = new Laptop();

        Assert.assertNull(laptop.getManufacturer());
        Assert.assertNull(laptop.getModelNo());
        Assert.assertNull(laptop.getSerialNo());
        Assert.assertNull(laptop.getCpu());
        Assert.assertNull(laptop.getMem());
        Assert.assertNull(laptop.getVga());

        System.out.println("-----------------------------------------");
        System.out.println(ToStringBuilder.reflectionToString(laptop));
        System.out.println("-----------------------------------------");
    }

    @Test
    public void initValuesFromBuilder() {

        // provide a minimal Builder implementation containing the default values

        Person person = Person.builder().build();

        Assert.assertNotNull(person.getFirstName());
        Assert.assertNotNull(person.getLastName());
        Assert.assertNull(person.getSex());

        Assert.assertEquals("Doe", person.getFirstName());
        Assert.assertEquals("John", person.getLastName());

        System.out.println("-----------------------------------------");
        System.out.println(ToStringBuilder.reflectionToString(person));
        System.out.println("-----------------------------------------");

        // with @Builder.Default

        Laptop laptop = Laptop.builder().build();

        Assert.assertNotNull(laptop.getManufacturer());
        Assert.assertNull(laptop.getModelNo());
        Assert.assertNull(laptop.getSerialNo());
        Assert.assertNull(laptop.getCpu());
        Assert.assertNull(laptop.getMem());
        Assert.assertNull(laptop.getVga());

        Assert.assertEquals("Apple. Inc.", laptop.getManufacturer());

        System.out.println("-----------------------------------------");
        System.out.println(ToStringBuilder.reflectionToString(laptop));
        System.out.println("-----------------------------------------");
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
