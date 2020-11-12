package TaxTypes;

import Tax.TaxType;

import java.math.BigDecimal;

public class IncomeTaxType extends TaxType {
    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {

        return (amount.multiply(BigDecimal.valueOf(0.13)));

    }

    @Override
    public void thisType() {
        System.out.println(" - это НДФЛ 13% ");
    }
}
