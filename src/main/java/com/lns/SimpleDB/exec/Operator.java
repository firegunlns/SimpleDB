package com.lns.SimpleDB.exec;

import java.util.List;

public interface Operator {
    boolean open();
    List<Object> next();
}
