package com.testdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = PropertyTestDataDemo.class)
public class DemoApplicationTests {

	@Test
	public void contextLoads() {

	}

//	@Test
//	public void should_be_able_get_read_properties_from_file() throws IOException {
//      中文乱码
//		InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("homeTestData.properties","UTF-8");
//		Properties properties = new Properties();
//		properties.load(inputStream);

//		Properties properties=new Properties();
//		properties.load(new InputStreamReader(this.getClass().getClassLoader().getResourceAsStream("homeTestData.properties"), "UTF-8"));
//		assertThat(properties.getProperty("searchKey"), is("软件测试"));
//	}

}
