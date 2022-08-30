package com.lns.SimpleDB.exec;

import java.util.List;

public class SelectOp implements Operator{

    @Override
    public boolean open() {
        return false;
    }

    @Override
    public List<Object> next() {
        return null;
    }
}
