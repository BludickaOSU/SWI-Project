package cz.osu.billionaires.data;

import cz.osu.billionaires.model.Billionaire;
import cz.osu.billionaires.model.Record;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BillionairesProvider {

    private static Billionaire parseBillionaire(String[] items) {
        String name = items[0];
        String company = items[3];
        String country = items[4];

        return new Billionaire(name, company, country);
    }

    private static Record parseRecord(String[] items) {
        int rank = Integer.parseInt(items[1]);
        int year = Integer.parseInt(items[2]);
        double worth = Double.parseDouble(items[5].replace(',', '.'));

        return new Record(rank, year, worth);
    }

    public static List<Billionaire> getBillionaires() {
        HashMap<String, Billionaire> billionaires = new HashMap<>();
        List<String> lines = FileProvider.fileToStringLines("./billionaires.csv");

        for (String line : lines.subList(1, lines.size())) {
            String[] items = line.split(";");
            String name = items[0];

            if (billionaires.containsKey(name)) {
                billionaires.get(name).getRecords().add(parseRecord(items));
            } else {
                Billionaire billionaire = parseBillionaire(items);
                billionaire.getRecords().add(parseRecord(items));
                billionaires.put(name, billionaire);
            }
        }

        return new ArrayList<>(billionaires.values());
    }
}
