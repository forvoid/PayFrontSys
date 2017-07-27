import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.PayFrontServiceInterface;
import po.PayFrontInfo;

/**
 * Created by forvoid on 7/24/2017.
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("/application-mybatis-test.xml");
        PayFrontServiceInterface payFrontServiceInterface =
                applicationContext.getBean(PayFrontServiceInterface.class);
        PayFrontInfo payFrontInfo = new PayFrontInfo();
        payFrontInfo.setAppType("你好");
        payFrontServiceInterface.addInfo(payFrontInfo);
//        PayFrontInfo payFrontInfo1 = payFrontServiceInterface.getInfoById(23);
        System.out.println(payFrontInfo.toString());

    }
}
