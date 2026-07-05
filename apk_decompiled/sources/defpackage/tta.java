package defpackage;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class tta extends gb9 {
    public static int d0(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map e0(cpc cpcVar) {
        cpcVar.getClass();
        Map mapSingletonMap = Collections.singletonMap(cpcVar.E, cpcVar.F);
        mapSingletonMap.getClass();
        return mapSingletonMap;
    }
}
