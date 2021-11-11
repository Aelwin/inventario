package jlr.inventario.util

import groovy.transform.CompileStatic

@CompileStatic
enum SiNo {

    SI, NO

    static SiNo fromBoolean(boolean valor) {
        valor ? SI : NO
    }

    boolean toBoolean() {
        this == SI ? true : false
    }

}