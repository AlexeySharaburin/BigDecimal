package Tax;

import java.math.BigDecimal;

public class TaxService {
    public void payOut(BigDecimal taxAmount) {
        System.out.format("Уплачен налог в размере %.8f%n", taxAmount);
    }
}
