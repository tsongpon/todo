package net.songpon.todo;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TodoApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void makeFail() {
		Assert.assertEquals(1,2);
	}

}
