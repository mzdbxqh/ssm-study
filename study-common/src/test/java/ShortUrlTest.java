import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mzdbxqh on 2017/3/16.
 */
public class ShortUrlTest {

	@Test
	public void getShortUrl() throws Exception {
		String sourceUrl = "http://www.tinygroup.org";
		for(int i = 1;i <= 99;i++){
			System.out.println(ShortUrl.INSTANCE.getShortUrl());
		}
	}
}
