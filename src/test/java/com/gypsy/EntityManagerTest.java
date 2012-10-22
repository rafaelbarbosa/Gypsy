package com.gypsy;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.gypsy.entities.Child;
import com.gypsy.entities.Parent;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;


@ContextConfiguration(locations = { "classpath:EntityManagerTestContext.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class EntityManagerTest {

    private Parent parent;
    private Child child1;
    private Child child2;

    @Before
    public void setUp() throws Exception {
        parent = new Parent();

        parent.setName("Parent name");

        child1 = new Child();

        child1.setName("Child 1 name");

        child2 = new Child();
        child2.setName("Child 2 Name");


        parent.getChildren().add(child1);
        parent.getChildren().add(child2);
        child1.setParent(parent);
        child2.setParent(parent);

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    @Transactional
    public void testPersist() throws Exception {

    }

    @Test
    public void testMerge() throws Exception {

    }

    @Test
    public void testRemove() throws Exception {

    }

    @Test
    public void testFind() throws Exception {

    }



    @Test
    public void testGetReference() throws Exception {

    }

    @Test
    public void testFlush() throws Exception {

    }

    @Test
    public void testSetFlushMode() throws Exception {

    }

    @Test
    public void testGetFlushMode() throws Exception {

    }

    @Test
    public void testLock() throws Exception {

    }

    @Test
    public void testRefresh() throws Exception {

    }

    @Test
    public void testClear() throws Exception {

    }

    @Test
    public void testDetach() throws Exception {

    }

    @Test
    public void testContains() throws Exception {

    }

    @Test
    public void testGetLockMode() throws Exception {

    }

    @Test
    public void testSetProperty() throws Exception {

    }

    @Test
    public void testGetProperties() throws Exception {

    }

    @Test
    public void testCreateQuery() throws Exception {

    }


    @Test
    public void testCreateNamedQuery() throws Exception {

    }


    @Test
    public void testJoinTransaction() throws Exception {

    }

    @Test
    public void testUnwrap() throws Exception {

    }

    @Test
    public void testGetDelegate() throws Exception {

    }

    @Test
    public void testClose() throws Exception {

    }

    @Test
    public void testIsOpen() throws Exception {

    }

    @Test
    public void testGetTransaction() throws Exception {

    }

    @Test
    public void testGetEntityManagerFactory() throws Exception {

    }

    @Test
    public void testGetCriteriaBuilder() throws Exception {

    }

    @Test
    public void testGetMetamodel() throws Exception {

    }
}
