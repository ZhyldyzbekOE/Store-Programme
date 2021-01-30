package com.company.Models;

import com.company.services.CancelSaleServices;
import com.company.services.ReportServices;
import com.company.services.SellServices;

public class Seller extends Person implements SellServices, CancelSaleServices, ReportServices {


    @Override
    public void cancelSale() {

    }

    @Override
    public void report() {

    }

    @Override
    public void sell() {

    }
}
