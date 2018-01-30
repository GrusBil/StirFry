import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CategoryEntityTest extends EntityTestBase{
    @Test
    public void testTooLongName()
    {
        String testName="";
        for (int i =0;i<150;i++)
        {
            testName+="s";
        }

        Category category = new Category();
        category.setName("Enterprise 1");

        SubCategory subCategory = new SubCategory();
        subCategory.setName(testName);

        category.getSubCategories().add(subCategory);
        subCategory.setParent(category);

        Quiz quiz = new Quiz();
        quiz.setQuestion("Will this test pass?");
        quiz.setAnswer1("Yes");
        quiz.setAnswer2("No");
        quiz.setAnswer3("Maybe");
        quiz.setAnswer4("No idea");
        quiz.setCorrectAnswerIndex(0);

        quiz.setSubCategory(subCategory);
        assertFalse(persistInATransaction(category,subCategory,quiz));
    }

    @Test
    public void testUniqueName()
    {
        String name="sdfsdfds";
        Category cat= new Category();
        cat.setName(name);
        persistInATransaction(cat);
        Category gory= new Category();
        gory.setName(name);
        assertFalse(persistInATransaction(gory));
    }
}
