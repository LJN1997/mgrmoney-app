import com.uek.mgrmoney.entity.Product;
import com.uek.mgrmoney.enumeration.ProductStatus;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 实体测试类
 */
public class ProductTest {
    //--日志
    private static Logger log = Logger.getLogger(Product.class);

    @Test
    public void creatProduct(){
        Product p = new Product();
        p.setId("001");
        p.setName("月光贷");
        p.setStartAmount(BigDecimal.valueOf(1000));
        p.setStatus(ProductStatus.SALING); //--锁定 销售中 已结束
        p.setCreateAt(new Date());
        p.setCreateUser("ls");
        log.info(p);
    }
}
