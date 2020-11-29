package tests.gui;

import baseEntities.BaseTest;
import models.Bar;
import models.ProjectBuilderLombok;
import models.TestCaseLombok;
import models.TestCaseLombokBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class LombokTest extends BaseTest {
    private static final Logger logger = LogManager.getLogger(LombokTest.class);

    @Test
    public void firstTest() {
        TestCaseLombok testCaseLombok = new TestCaseLombok();
        testCaseLombok.setTitle("sdfsdf");
        String title = testCaseLombok.getTitle();

        System.out.println(title);
        System.out.println(testCaseLombok.toString());
        System.out.println(testCaseLombok.equals(true));

        logger.fatal("Test message - FATAL");
        logger.error("Test message - ERROR");
        logger.warn("Test message - WARN");
        logger.info("Test message - INFORMATION");
        logger.debug("Test message - DEBUG");
        logger.trace("Test message - TRACE");

        logger.trace("Entering application");
        Bar bar = new Bar();
        if (!bar.doIt()) {
            logger.error("Didn't do it.");
        }
        logger.trace("Exit application");
    }

    @Test
    public void secondTest() {
        TestCaseLombokBuilder testCaseLombokBuilder = TestCaseLombokBuilder.builder()
                .title("sdf")
                .estimate(10)
                .build();
        testCaseLombokBuilder.getTitle();

        String title = testCaseLombokBuilder.getTitle();

        System.out.println(title);
        System.out.println(testCaseLombokBuilder.getEstimate());
        System.out.println(testCaseLombokBuilder.toString());
        System.out.println(testCaseLombokBuilder.hashCode());
        System.out.println(testCaseLombokBuilder.equals(true));
    }

    @Test
    public void thirdTest() {
        ProjectBuilderLombok projectBuilderLombok = ProjectBuilderLombok.builder()
                .name("name")
                .announcement("announcement")
                .isShowAnnouncement(true)
                .typeOfProject(3)
                .isCompleted(true)
                .build();



        System.out.println(projectBuilderLombok.getName());
        System.out.println(projectBuilderLombok.getAnnouncement());
        System.out.println(projectBuilderLombok.isShowAnnouncement());
        System.out.println(projectBuilderLombok.getTypeOfProject());
        System.out.println(projectBuilderLombok.isCompleted());


    }
}
