package com.lixiang.jvm.day1;

import java.util.ArrayList;
import java.util.List;

/** HeapDumpOnOutOfMemoryError
 * Created by lixiang on 16-9-28.
 */
public class HeapOOM {

    static class OOMObject{

    }

    public static void main(String[] args) {
        List<OOMObject> oomObjects = new ArrayList<>();
        while (true){
            oomObjects.add(new OOMObject());
        }
    }
}
