package com.company.Models;

import com.company.services.AcceptServices;
import com.company.services.AddProductServices;
import com.company.services.DelProductServices;
import com.company.services.WrireGoodsServices;

public class HeadOfWarehouse extends Person implements AcceptServices, AddProductServices, DelProductServices, WrireGoodsServices {


    @Override
    public void accept() {

    }

    @Override
    public void addProduct() {

    }

    @Override
    public void delProduct() {

    }

    @Override
    public void wrireGoods() {

    }
}
