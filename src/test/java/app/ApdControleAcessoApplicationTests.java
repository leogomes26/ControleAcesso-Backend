package app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import br.com.infobyte.ControleAcesso.ApsControleAcessoApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ApsControleAcessoApplication.class)
@WebAppConfiguration
public class ApdControleAcessoApplicationTests {

	@Test
	public void contextLoads() {
	}

}
