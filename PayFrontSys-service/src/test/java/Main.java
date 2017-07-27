import com.jiupai.payFrontSys.mybatis.mapper.PayFrontInfoMapper;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.net.ApplicationProxy;

/**
 * Created by forvoid on 7/21/2017.
 */
public class Main {
    public static void main(String[] args) {
       ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("classpath:application-mybatis-test.xml");
        applicationContext.start();
//        PayFrontInfoMapper mapper = (PayFrontInfoMapper)applicationContext
//                .getBean("payFrontInfoMapper");
//        System.out.println(((PayFrontInfo)mapper.selectByPrimaryKey(2)).toString());
        while (true);
    }
}
