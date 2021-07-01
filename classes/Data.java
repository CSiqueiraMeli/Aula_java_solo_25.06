import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Data {
    private GregorianCalendar gregorian;
    private Date data;
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

    public Data(Date data) {
        this.gregorian = new GregorianCalendar();
        this.gregorian.setTime(data);
        this.data = data;
    }

    public Data(String data) throws ParseException {
        this.gregorian = new GregorianCalendar();
        this.gregorian.setTime(formatter.parse(data));

    }

    public Date getData() {
        return this.data;
    }

    private void add(int quantity, int unit) {
        gregorian.add(quantity, unit);
        data = gregorian.getTime();
    }

    public void addDays(int quantity) {
        add(quantity, Calendar.DAY_OF_MONTH);
    }

    public Integer compare(String data) {
        try {
            return compare(formatter.parse(data));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public int compare(Date data) {
        Calendar c = new GregorianCalendar();
        c.setTime(data);
        return gregorian.compareTo(c);
    }

    @Override
    public String toString() {
        return formatter.format(data);
    }
}