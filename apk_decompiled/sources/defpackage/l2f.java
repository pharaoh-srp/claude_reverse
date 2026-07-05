package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l2f {
    public static final HashMap a;

    static {
        HashMap map = new HashMap(13);
        a = map;
        map.put("normal", 400);
        map.put("bold", 700);
        qy1.l(1, map, "bolder", -1, "lighter");
        qy1.l(100, map, "100", 200, "200");
        map.put("300", 300);
        map.put("400", 400);
        qy1.l(500, map, "500", 600, "600");
        qy1.q(map, "700", 700, 800, "800");
        map.put("900", 900);
    }
}
