package rocks.zipcode.assessment2.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * Use a map to solve
 */
public class MonthConversion {
    Map<Integer, String> monthConversion;


    public MonthConversion() {
        monthConversion = new HashMap<>();
    }

    /**
     * @param monthNumber - ordinal of month in the year; i.e. January = 1, February = 2
     * @param monthName - name of month
     */

    public void add(Integer monthNumber, String monthName) {
        monthConversion.put(monthNumber, monthName);
    }

    /**
     * @param monthNumber - ordinal of month in the year
     * @return the name of the respective month
     */
    public String getName(Integer monthNumber) {
        return monthConversion.get(monthNumber);
//        throw new NullPointerException();
    }

    /**
     * @param monthName - name of month
     * @return - the ordinal of the month in the year
     */
    public Integer getNumber(String monthName) {

        Integer monthNumber = null;


        for (int i = 1; i <=12 ; i++) {
            if(monthConversion.get(i) == monthName) {
                monthNumber = i;
            }
        }
        return monthNumber;
    }

    /**
     * @param monthNumber
     * @return true if the monthNumber is in the keySet
     */
    public Boolean isValidNumber(Integer monthNumber) {
        return monthConversion.containsKey(monthNumber);
    }

    /**
     * @param monthName
     * @return true if the monthName is in the valueSet
     */
    public Boolean isValidMonth(String monthName) {
        return monthConversion.containsValue(monthName);
    }

    /**
     * @return number of entries in this mapping
     */
    public Integer size() {
        return monthConversion.size();
    }

    /**
     * @param monthNumber - number of month in year
     * @param monthName - name of month
     */
    public void update(Integer monthNumber, String monthName) {
        monthConversion.replace(monthNumber, monthName);
    }
}
