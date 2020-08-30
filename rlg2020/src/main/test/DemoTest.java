import com.itdr.utils.BigDecimalUtil;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * ClassName: DemoTest
 * 日期: 2020/2/18 11:04
 *
 * @author Air张
 * @since JDK 1.8
 */
public class DemoTest {

    @Test
    public void test1(){
        int i = 2;
        int i2 = 1;
        int xc = 0;
        for(int y = 0;y<21;y++){
            int x = i/i2;
            int i3 = i;
            i=i-1;
            i = i3+i;
            int i4 = i2;
            i2 = i2-1;
            i2 = i4+i2;
            xc = xc+x;
        }
        System.out.println(xc);
    }
}
