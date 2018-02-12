import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.ejb.EJB;

@RunWith(Arquillian.class)
public class CategoryEjbTest {
    @Deployment
    public static JavaArchive createDeployment() {

        return ShrinkWrap.create(JavaArchive.class)
                .addPackages(true, "D:\\Java\\Skol\\Projects\\exercises_new\\stirfry")
                .addAsResource("META-INF/persistence.xml");
    }

    @EJB
    private CategoryEjb ctgEjb;

    @EJB
    private ResetEjb resetEjb;

    @Before
    public void init(){
        resetEjb.resetDatabase();
    }

    @Test
    public void testNoCategory()
    {

    }

    @Test
    public void testCreateCategory()
    {

    }

    @Test
    public void testGetCategory()
    {

    }

    @Test
    public void testCreateSubCategory()
    {

    }

    @Test
    public void testGetAllCategories()
    {

    }

    @Test
    public void testCreateTwice()
    {

    }
}
