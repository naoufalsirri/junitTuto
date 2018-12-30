package fr.naf.tu;



import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class})
public class MachineLearningTest {

    @Autowired
    @Qualifier("ml")
    DataModelService ml;

    @Test
    public void test_ml_always_return_true() {

        assertTrue(ml.isValid("springtest"));

      

    }

}
