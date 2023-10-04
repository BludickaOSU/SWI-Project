package cz.osu.billionaires.manager;

import cz.osu.billionaires.data.BillionairesProvider;
import cz.osu.billionaires.model.Billionaire;
import cz.osu.billionaires.model.Record;

import java.util.List;

public class BillionairesManager {
    private List<Billionaire> billionaires;

    public BillionairesManager() {
        billionaires = BillionairesProvider.getBillionaires();
    }

    public List<Billionaire> getBillionaires() {
        return billionaires;
    }

    public Billionaire getMostRichInYear(int year) {
        Billionaire result = null;

        for (Billionaire billionaire : billionaires) {
            Record record = billionaire.getRecordFromYear(year);

            if (record != null && (result == null || record.getWorth() > result.getRecordFromYear(year).getWorth())) {
                result = billionaire;
            }
        }

        return result;
    }
}
