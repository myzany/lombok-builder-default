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

        LombokBuilderTest1Vo lombokBuilderTest1Vo = new LombokBuilderTest1Vo();

        Assert.assertNull(lombokBuilderTest1Vo.getFirstName());
        Assert.assertNull(lombokBuilderTest1Vo.getLastName());
        Assert.assertNotNull(lombokBuilderTest1Vo.getSex());

        Assert.assertEquals("male", lombokBuilderTest1Vo.getSex());
    }

    @Test
    public void builderInitValue() {

        // provide a minimal Builder implementation containing the default values

        LombokBuilderTest1Vo lombokBuilderTest1Vo = LombokBuilderTest1Vo.builder().build();

        Assert.assertNotNull(lombokBuilderTest1Vo.getFirstName());
        Assert.assertNotNull(lombokBuilderTest1Vo.getLastName());
        Assert.assertNull(lombokBuilderTest1Vo.getSex());

        Assert.assertEquals("Doe", lombokBuilderTest1Vo.getFirstName());
        Assert.assertEquals("John", lombokBuilderTest1Vo.getLastName());

        // with @Builder.Default

        LombokBuilderTest2Vo lombokBuilderTest2Vo = LombokBuilderTest2Vo.builder().build();

        Assert.assertNotNull(lombokBuilderTest2Vo.getFirstName());
        Assert.assertNotNull(lombokBuilderTest2Vo.getLastName());
        Assert.assertNotNull(lombokBuilderTest2Vo.getSex());

        Assert.assertEquals("Doe", lombokBuilderTest2Vo.getFirstName());
        Assert.assertEquals("John", lombokBuilderTest2Vo.getLastName());
        Assert.assertEquals("male", lombokBuilderTest2Vo.getSex());
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
