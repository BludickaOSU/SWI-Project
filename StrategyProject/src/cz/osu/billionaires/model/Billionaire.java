package cz.osu.billionaires.model;

import java.util.ArrayList;
import java.util.List;

public class Billionaire {
    private String name;
    private String company;
    private String country;
    private List<Record> records;

    public Billionaire(String name, String company, String country) {
        this.name = name;
        this.company = company;
        this.country = country;
        this.records = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public String getCountry() {
        return country;
    }

    public List<Record> getRecords() {
        return records;
    }

    public Record getRecordFromYear(int year) {
        Record result = null;

        for (Record record : records) {
            if (record.getYear() == year) {
                result = record;
                break;
            }
        }

        return result;
    }

    @Override
    public String toString() {
        return String.format("%s, společnost: %s, země: %s, záznamy: %s", name, company, company, records);
    }
}
