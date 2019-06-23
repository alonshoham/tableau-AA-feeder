package model;

import com.gigaspaces.annotation.pojo.SpaceClass;
import com.gigaspaces.annotation.pojo.SpaceId;
import com.gigaspaces.annotation.pojo.SpaceRouting;
import com.opencsv.bean.CsvBindByPosition;
import com.opencsv.bean.CsvDate;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;


@SpaceClass
public class Data implements Serializable {
    private String id;

    @CsvBindByPosition(position = 0)
    @CsvDate(value = "MM/dd/yyyy")
    private Date adj_ticket_date;

    @CsvBindByPosition(position = 1)
    private String analyst;

    @CsvBindByPosition(position = 2)
    private String bkg_src_cd;

    @CsvBindByPosition(position = 3)
    private String cart_nbr;

    @CsvBindByPosition(position = 4)
    private String coach_competitive_group;

    @CsvBindByPosition(position = 5)
    private String codeshare;

    @CsvBindByPosition(position = 6)
    private String connect_pt;

    @CsvBindByPosition(position = 7)
    private String customer_type;

    @CsvBindByPosition(position = 8)
    private String max_adj_ticket_date;

    @CsvBindByPosition(position = 9)
    private String inventory;

    @CsvBindByPosition(position = 10)
    private double ly_revenue;

    @CsvBindByPosition(position = 11)
    private double ly_pax;

    @CsvBindByPosition(position = 12)
    private double ty_pax;

    @CsvBindByPosition(position = 13)
    private String inventorymdf;

    @CsvBindByPosition(position = 14)
    private double Revenue_to_pax;

    @CsvBindByPosition(position = 15)
    @CsvDate(value = "MM/dd/yyyy")
    private Date departure_date;

    @CsvBindByPosition(position = 16)
    private String deptseason;

    @CsvBindByPosition(position = 17)
    private String elite_status;

    @CsvBindByPosition(position = 18)
    private String fare_type;

    @CsvBindByPosition(position = 19)
    private String fbc;

    @CsvBindByPosition(position = 20)
    private String hub;

    @CsvBindByPosition(position = 21)
    private double ty_revenue;

    @CsvBindByPosition(position = 22)
    private String lylty_level_cd;

    @CsvBindByPosition(position = 23)
    private String lytydept;

    @CsvBindByPosition(position = 24)
    private String lyty;

    @CsvBindByPosition(position = 25)
    private String market;

    @CsvBindByPosition(position = 26)
    private String market_metro;

    @CsvBindByPosition(position = 27)
    private String metro_od;

    @CsvBindByPosition(position = 28)
    private String mileage_band;

    @CsvBindByPosition(position = 29)
    private String mkt_type;

    @CsvBindByPosition(position = 30)
    private String ns_flow;

    @CsvBindByPosition(position = 31)
    private double number_of_records;

    @CsvBindByPosition(position = 32)
    private String op_airline;

    @CsvBindByPosition(position = 33)
    private String op_cabin_type;

    @CsvBindByPosition(position = 34)
    private double pax;

    @CsvBindByPosition(position = 35)
    private String pax_type;

    @CsvBindByPosition(position = 36)
    private String premium_mkt_type;

    @CsvBindByPosition(position = 37)
    private String pricing_od;

    @CsvBindByPosition(position = 38)
    private String prime_chanl_type_cd;

    @CsvBindByPosition(position = 39)
    private String region;

    @CsvBindByPosition(position = 40)
    private double revenue;

    @CsvBindByPosition(position = 41)
    private double rpms;

    @CsvBindByPosition(position = 42)
    private String spoke;

    @CsvBindByPosition(position = 43)
    private String spoke_test;

    @CsvBindByPosition(position = 44)
    private String tariff;

    @CsvBindByPosition(position = 45)
    private String terty_chanl_type_cd;

    @CsvBindByPosition(position = 46)
    private String test_name;

    @CsvBindByPosition(position = 47)
    @CsvDate(value = "MM/dd/yyyy")
    private Date ticket_date;

    @CsvBindByPosition(position = 48)
    private String tkt_ap;

    @CsvBindByPosition(position = 49)
    private String ym_hub_nm;

    @SpaceRouting
    @SpaceId(autoGenerate = true)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Data() {
    }

    public Date getAdj_ticket_date() {
        return adj_ticket_date;
    }

    public void setAdj_ticket_date(Date adj_ticket_date) {
        this.adj_ticket_date = adj_ticket_date;
    }

    public String getAnalyst() {
        return analyst;
    }

    public void setAnalyst(String analyst) {
        this.analyst = analyst;
    }

    public String getBkg_src_cd() {
        return bkg_src_cd;
    }

    public void setBkg_src_cd(String bkg_src_cd) {
        this.bkg_src_cd = bkg_src_cd;
    }

    public String getCart_nbr() {
        return cart_nbr;
    }

    public void setCart_nbr(String cart_nbr) {
        this.cart_nbr = cart_nbr;
    }

    public String getCoach_competitive_group() {
        return coach_competitive_group;
    }

    public void setCoach_competitive_group(String coach_competitive_group) {
        this.coach_competitive_group = coach_competitive_group;
    }

    public String getCodeshare() {
        return codeshare;
    }

    public void setCodeshare(String codeshare) {
        this.codeshare = codeshare;
    }

    public String getConnect_pt() {
        return connect_pt;
    }

    public void setConnect_pt(String connect_pt) {
        this.connect_pt = connect_pt;
    }

    public String getCustomer_type() {
        return customer_type;
    }

    public void setCustomer_type(String customer_type) {
        this.customer_type = customer_type;
    }

    public String getMax_adj_ticket_date() {
        return max_adj_ticket_date;
    }

    public void setMax_adj_ticket_date(String max_adj_ticket_date) {
        this.max_adj_ticket_date = max_adj_ticket_date;
    }

    public String getInventory() {
        return inventory;
    }

    public void setInventory(String inventory) {
        this.inventory = inventory;
    }

    public double getLy_revenue() {
        return ly_revenue;
    }

    public void setLy_revenue(double ly_revenue) {
        this.ly_revenue = ly_revenue;
    }

    public double getLy_pax() {
        return ly_pax;
    }

    public void setLy_pax(double ly_pax) {
        this.ly_pax = ly_pax;
    }

    public double getTy_pax() {
        return ty_pax;
    }

    public void setTy_pax(double ty_pax) {
        this.ty_pax = ty_pax;
    }

    public String getInventorymdf() {
        return inventorymdf;
    }

    public void setInventorymdf(String inventorymdf) {
        this.inventorymdf = inventorymdf;
    }

    public double getRevenue_to_pax() {
        return Revenue_to_pax;
    }

    public void setRevenue_to_pax(double revenue_to_pax) {
        Revenue_to_pax = revenue_to_pax;
    }

    public Date getDeparture_date() {
        return departure_date;
    }

    public void setDeparture_date(Date departure_date) {
        this.departure_date = departure_date;
    }

    public String getDeptseason() {
        return deptseason;
    }

    public void setDeptseason(String deptseason) {
        this.deptseason = deptseason;
    }

    public String getElite_status() {
        return elite_status;
    }

    public void setElite_status(String elite_status) {
        this.elite_status = elite_status;
    }

    public String getFare_type() {
        return fare_type;
    }

    public void setFare_type(String fare_type) {
        this.fare_type = fare_type;
    }

    public String getFbc() {
        return fbc;
    }

    public void setFbc(String fbc) {
        this.fbc = fbc;
    }

    public String getHub() {
        return hub;
    }

    public void setHub(String hub) {
        this.hub = hub;
    }

    public double getTy_revenue() {
        return ty_revenue;
    }

    public void setTy_revenue(double ty_revenue) {
        this.ty_revenue = ty_revenue;
    }

    public String getLylty_level_cd() {
        return lylty_level_cd;
    }

    public void setLylty_level_cd(String lylty_level_cd) {
        this.lylty_level_cd = lylty_level_cd;
    }

    public String getLytydept() {
        return lytydept;
    }

    public void setLytydept(String lytydept) {
        this.lytydept = lytydept;
    }

    public String getLyty() {
        return lyty;
    }

    public void setLyty(String lyty) {
        this.lyty = lyty;
    }

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public String getMarket_metro() {
        return market_metro;
    }

    public void setMarket_metro(String market_metro) {
        this.market_metro = market_metro;
    }

    public String getMetro_od() {
        return metro_od;
    }

    public void setMetro_od(String metro_od) {
        this.metro_od = metro_od;
    }

    public String getMileage_band() {
        return mileage_band;
    }

    public void setMileage_band(String mileage_band) {
        this.mileage_band = mileage_band;
    }

    public String getMkt_type() {
        return mkt_type;
    }

    public void setMkt_type(String mkt_type) {
        this.mkt_type = mkt_type;
    }

    public String getNs_flow() {
        return ns_flow;
    }

    public void setNs_flow(String ns_flow) {
        this.ns_flow = ns_flow;
    }

    public double getNumber_of_records() {
        return number_of_records;
    }

    public void setNumber_of_records(double number_of_records) {
        this.number_of_records = number_of_records;
    }

    public String getOp_airline() {
        return op_airline;
    }

    public void setOp_airline(String op_airline) {
        this.op_airline = op_airline;
    }

    public String getOp_cabin_type() {
        return op_cabin_type;
    }

    public void setOp_cabin_type(String op_cabin_type) {
        this.op_cabin_type = op_cabin_type;
    }

    public double getPax() {
        return pax;
    }

    public void setPax(double pax) {
        this.pax = pax;
    }

    public String getPax_type() {
        return pax_type;
    }

    public void setPax_type(String pax_type) {
        this.pax_type = pax_type;
    }

    public String getPremium_mkt_type() {
        return premium_mkt_type;
    }

    public void setPremium_mkt_type(String premium_mkt_type) {
        this.premium_mkt_type = premium_mkt_type;
    }

    public String getPricing_od() {
        return pricing_od;
    }

    public void setPricing_od(String pricing_od) {
        this.pricing_od = pricing_od;
    }

    public String getPrime_chanl_type_cd() {
        return prime_chanl_type_cd;
    }

    public void setPrime_chanl_type_cd(String prime_chanl_type_cd) {
        this.prime_chanl_type_cd = prime_chanl_type_cd;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public double getRpms() {
        return rpms;
    }

    public void setRpms(double rpms) {
        this.rpms = rpms;
    }

    public String getSpoke() {
        return spoke;
    }

    public void setSpoke(String spoke) {
        this.spoke = spoke;
    }

    public String getSpoke_test() {
        return spoke_test;
    }

    public void setSpoke_test(String spoke_test) {
        this.spoke_test = spoke_test;
    }

    public String getTariff() {
        return tariff;
    }

    public void setTariff(String tariff) {
        this.tariff = tariff;
    }

    public String getTerty_chanl_type_cd() {
        return terty_chanl_type_cd;
    }

    public void setTerty_chanl_type_cd(String terty_chanl_type_cd) {
        this.terty_chanl_type_cd = terty_chanl_type_cd;
    }

    public String getTest_name() {
        return test_name;
    }

    public void setTest_name(String test_name) {
        this.test_name = test_name;
    }

    public Date getTicket_date() {
        return ticket_date;
    }

    public void setTicket_date(Date ticket_date) {
        this.ticket_date = ticket_date;
    }

    public String getTkt_ap() {
        return tkt_ap;
    }

    public void setTkt_ap(String tkt_ap) {
        this.tkt_ap = tkt_ap;
    }

    public String getYm_hub_nm() {
        return ym_hub_nm;
    }

    public void setYm_hub_nm(String ym_hub_nm) {
        this.ym_hub_nm = ym_hub_nm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Data data = (Data) o;
        return ly_revenue == data.ly_revenue &&
                ly_pax == data.ly_pax &&
                ty_pax == data.ty_pax &&
                Revenue_to_pax == data.Revenue_to_pax &&
                ty_revenue == data.ty_revenue &&
                number_of_records == data.number_of_records &&
                pax == data.pax &&
                Double.compare(data.revenue, revenue) == 0 &&
                rpms == data.rpms &&
                Objects.equals(adj_ticket_date, data.adj_ticket_date) &&
                Objects.equals(analyst, data.analyst) &&
                Objects.equals(bkg_src_cd, data.bkg_src_cd) &&
                Objects.equals(cart_nbr, data.cart_nbr) &&
                Objects.equals(coach_competitive_group, data.coach_competitive_group) &&
                Objects.equals(codeshare, data.codeshare) &&
                Objects.equals(connect_pt, data.connect_pt) &&
                Objects.equals(customer_type, data.customer_type) &&
                Objects.equals(max_adj_ticket_date, data.max_adj_ticket_date) &&
                Objects.equals(inventory, data.inventory) &&
                Objects.equals(inventorymdf, data.inventorymdf) &&
                Objects.equals(departure_date, data.departure_date) &&
                Objects.equals(deptseason, data.deptseason) &&
                Objects.equals(elite_status, data.elite_status) &&
                Objects.equals(fare_type, data.fare_type) &&
                Objects.equals(fbc, data.fbc) &&
                Objects.equals(hub, data.hub) &&
                Objects.equals(lylty_level_cd, data.lylty_level_cd) &&
                Objects.equals(lytydept, data.lytydept) &&
                Objects.equals(lyty, data.lyty) &&
                Objects.equals(market, data.market) &&
                Objects.equals(market_metro, data.market_metro) &&
                Objects.equals(metro_od, data.metro_od) &&
                Objects.equals(mileage_band, data.mileage_band) &&
                Objects.equals(mkt_type, data.mkt_type) &&
                Objects.equals(ns_flow, data.ns_flow) &&
                Objects.equals(op_airline, data.op_airline) &&
                Objects.equals(op_cabin_type, data.op_cabin_type) &&
                Objects.equals(pax_type, data.pax_type) &&
                Objects.equals(premium_mkt_type, data.premium_mkt_type) &&
                Objects.equals(pricing_od, data.pricing_od) &&
                Objects.equals(prime_chanl_type_cd, data.prime_chanl_type_cd) &&
                Objects.equals(region, data.region) &&
                Objects.equals(spoke, data.spoke) &&
                Objects.equals(spoke_test, data.spoke_test) &&
                Objects.equals(tariff, data.tariff) &&
                Objects.equals(terty_chanl_type_cd, data.terty_chanl_type_cd) &&
                Objects.equals(test_name, data.test_name) &&
                Objects.equals(ticket_date, data.ticket_date) &&
                Objects.equals(tkt_ap, data.tkt_ap) &&
                Objects.equals(ym_hub_nm, data.ym_hub_nm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adj_ticket_date, analyst, bkg_src_cd, cart_nbr, coach_competitive_group, codeshare, connect_pt, customer_type, max_adj_ticket_date, inventory, ly_revenue, ly_pax, ty_pax, inventorymdf, Revenue_to_pax, departure_date, deptseason, elite_status, fare_type, fbc, hub, ty_revenue, lylty_level_cd, lytydept, lyty, market, market_metro, metro_od, mileage_band, mkt_type, ns_flow, number_of_records, op_airline, op_cabin_type, pax, pax_type, premium_mkt_type, pricing_od, prime_chanl_type_cd, region, revenue, rpms, spoke, spoke_test, tariff, terty_chanl_type_cd, test_name, ticket_date, tkt_ap, ym_hub_nm);
    }
}
