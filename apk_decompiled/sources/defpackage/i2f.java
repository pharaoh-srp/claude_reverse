package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i2f {
    public static final HashMap a;

    static {
        HashMap map = new HashMap(10);
        a = map;
        map.put("none", fdd.E);
        map.put("xMinYMin", fdd.F);
        map.put("xMidYMin", fdd.G);
        map.put("xMaxYMin", fdd.H);
        map.put("xMinYMid", fdd.I);
        map.put("xMidYMid", fdd.J);
        map.put("xMaxYMid", fdd.K);
        map.put("xMinYMax", fdd.L);
        map.put("xMidYMax", fdd.M);
        map.put("xMaxYMax", fdd.N);
    }
}
