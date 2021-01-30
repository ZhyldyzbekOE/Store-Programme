package com.company.Models;

import com.company.services.CloseWorkingServices;
import com.company.services.OrderServices;

public class HeadSeller extends Seller implements CloseWorkingServices, OrderServices {


    @Override
    public void closeWorking() {

    }

    @Override
    public void order() {

    }
}
