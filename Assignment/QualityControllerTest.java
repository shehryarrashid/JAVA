package Assignment;

import org.testng.annotations.Test;
import static org.junit.Assert.*;

class QualityControllerTest {

    QualityController qualityController;
    @Test
    void getWage() throws Exception {
        // Uses same constructor as Employee
        // Previously tested in EmployeeTest
        qualityController = new QualityController("qc",50);
        assertEquals(5.6,qualityController.getWage(),0.1);
    }
}