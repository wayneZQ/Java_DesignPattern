package ResponsibilityChainPattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName PurchaseRequest
 * @Description TODO
 * @Author Lenovo
 * @Date 2022/6/19 10:41
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseRequest {

    private double amount; //采购金额
    private int number;  //采购编号
    private String purpose;  //采购目的

}
