import Tax.Bill;
import Tax.TaxService;
import TaxTypes.IncomeTaxType;
import TaxTypes.ProgressiveTaxType;
import TaxTypes.VATaxType;

import java.math.BigDecimal;

public class Main {


    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        Bill[] payments = new Bill[]{new Bill(BigDecimal.valueOf(100_000), new ProgressiveTaxType(), taxService), new Bill(BigDecimal.valueOf(100_001), new ProgressiveTaxType(), taxService), new Bill(BigDecimal.valueOf(100_000), new IncomeTaxType(), taxService), new Bill(BigDecimal.valueOf(999_999.999), new VATaxType(), taxService)
                // TODO создать платежи с различным типами налогообложения
        };
        for (int i = 0; i < payments.length; ++i) {
            Bill bill = payments[i];
            bill.payTaxes();
            bill.getType();
        }
    }
}
