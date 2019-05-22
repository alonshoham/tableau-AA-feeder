import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import model.AAData;
import org.openspaces.core.GigaSpace;
import org.openspaces.core.GigaSpaceConfigurer;
import org.openspaces.core.space.UrlSpaceConfigurer;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main{

    private final static String SPACE_NAME = "sql-test-space";
    private final static String CSV_FILE = "Pax11.csv";

    public static void main(String[] args) {
        GigaSpace space = new GigaSpaceConfigurer(new UrlSpaceConfigurer("jini://*/*/" + SPACE_NAME)).create();

        InputStream is = Main.class.getClassLoader().getResourceAsStream(CSV_FILE);
        try {
            ColumnPositionMappingStrategy strategy = new ColumnPositionMappingStrategy();
            strategy.setType(AAData.class);
            Map<Integer, String> columnMapping = createColumnMapping();
            String[] fields = new String[columnMapping.values().size()];
            for (int i = 0; i < 50; i++) {
                fields[i] = columnMapping.get(i);
            }
            strategy.setColumnMapping(fields);
            CsvToBean csvToBean = new CsvToBeanBuilder<AAData>(new InputStreamReader(is)).withSkipLines(1).withType(AAData.class).withMappingStrategy(strategy).withIgnoreLeadingWhiteSpace(true).build();
            List<AAData> dataList = csvToBean.parse();
            space.writeMultiple(dataList.toArray());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static Map<Integer,String> createColumnMapping(){
        HashMap<Integer, String> columnMapping = new HashMap<Integer, String>();
        columnMapping.put(0, "adj_ticket_date");
        columnMapping.put(1, "analyst");
        columnMapping.put(2, "bkg_src_cd");
        columnMapping.put(3, "cart_nbr");
        columnMapping.put(4, "coach_competitive_group");
        columnMapping.put(5, "codeshare");
        columnMapping.put(6, "connect_pt");
        columnMapping.put(7, "customer_type");
        columnMapping.put(8, "max_adj_ticket_date");
        columnMapping.put(9, "inventory");
        columnMapping.put(10, "ly_revenue");
        columnMapping.put(11, "ly_pax");
        columnMapping.put(12, "ty_pax");
        columnMapping.put(13, "inventorymdf");
        columnMapping.put(14, "Revenue_to_pax");
        columnMapping.put(15, "departure_date");
        columnMapping.put(16, "deptseason");
        columnMapping.put(17, "elite_status");
        columnMapping.put(18, "fare_type");
        columnMapping.put(19, "fcb");
        columnMapping.put(20, "hub");
        columnMapping.put(21, "ty_revenue");
        columnMapping.put(22, "lylty_level_cd");
        columnMapping.put(23, "lytydept");
        columnMapping.put(24, "lyty");
        columnMapping.put(25, "market");
        columnMapping.put(26, "market_metro");
        columnMapping.put(27, "metro_od");
        columnMapping.put(28, "mileage_band");
        columnMapping.put(29, "mkt_type");
        columnMapping.put(30, "ns_flow");
        columnMapping.put(31, "number_of_records");
        columnMapping.put(32, "op_airline");
        columnMapping.put(33, "op_cabin_type");
        columnMapping.put(34, "pax");
        columnMapping.put(35, "pax_type");
        columnMapping.put(36, "premium_mkt_type");
        columnMapping.put(37, "pricing_od");
        columnMapping.put(38, "prime_chanl_type_cd");
        columnMapping.put(39, "region");
        columnMapping.put(40, "revenue");
        columnMapping.put(41, "rpms");
        columnMapping.put(42, "spoke");
        columnMapping.put(43, "spoke_test");
        columnMapping.put(44, "tariff");
        columnMapping.put(45, "terty_chanl_type_cd");
        columnMapping.put(46, "test_name");
        columnMapping.put(47, "ticket_date");
        columnMapping.put(48, "tkt_ap");
        columnMapping.put(49, "ym_hub_nm");
        return columnMapping;
    }


}
