package com.sun.tools.javac;

import org.jmlspecs.openjml.Factory;
import org.jmlspecs.openjml.IAPI;

/**
 * @author Alexander Weigl
 * @version 1 (8/10/20)
 */
public class Test {
    public static void main(String[] args) throws Exception {
        IAPI api = Factory.makeAPI();
        api.parseExpression("\\new_elems_fresh(footprint)", true);
    }
}
