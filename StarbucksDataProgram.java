//Yuvan Singh

//How many Starbucks are in a certain County and have a given Ownership type of "Licensed"?

public int countLicensedStarbucksInCounty(List<StarbucksRecord> records, String county) {
    int count = 0;
    for (StarbucksRecord record : records) {
        if (record.getCounty().equalsIgnoreCase(county) && record.getOwnershipType().equalsIgnoreCase("Licensed")) {
            count++;
        }
    }
    return count;
}


//Which Starbucks in Merced County is the farthest North?

public StarbucksRecord farthestNorthStarbucksInMerced(List<StarbucksRecord> records) {
    StarbucksRecord farthestNorth = null;
    for (StarbucksRecord record : records) {
        if (record.getCounty().equalsIgnoreCase("Merced")) {
            if (farthestNorth == null || record.getLatitude() > farthestNorth.getLatitude()) {
                farthestNorth = record;
            }
        }
    }
    return farthestNorth;
}

//What percent of Starbucks are closed on Saturdays? Sundays?

public double percentClosedOnDay(List<StarbucksRecord> records, String day) {
    int closedCount = 0;
    for (StarbucksRecord record : records) {
        if ((day.equalsIgnoreCase("Saturday") && record.isClosedOnSaturday()) ||
            (day.equalsIgnoreCase("Sunday") && record.isClosedOnSunday())) {
            closedCount++;
        }
    }
    return 100.0 * closedCount / records.size();
}
