package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k2f {
    public static final HashMap a;

    static {
        HashMap map = new HashMap(9);
        a = map;
        map.put("xx-small", new n0f(7, 0.694f));
        map.put("x-small", new n0f(7, 0.833f));
        map.put("small", new n0f(7, 10.0f));
        map.put("medium", new n0f(7, 12.0f));
        map.put("large", new n0f(7, 14.4f));
        map.put("x-large", new n0f(7, 17.3f));
        map.put("xx-large", new n0f(7, 20.7f));
        map.put("smaller", new n0f(9, 83.33f));
        map.put("larger", new n0f(9, 120.0f));
    }
}
