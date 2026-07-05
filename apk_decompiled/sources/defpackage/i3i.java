package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class i3i implements i4f {
    public final String a;
    public final String b;
    public final String c;
    public final Map d;
    public final double e;

    public i3i(String str, String str2, String str3, Map map, double d) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = map;
        this.e = d;
    }

    public static i3i b(jud judVar) {
        double d;
        String strA = i4f.a((String) judVar.b);
        String strA2 = i4f.a((String) judVar.c);
        String strA3 = i4f.a((String) judVar.d);
        Map map = (HashMap) judVar.e;
        if (map == null) {
            map = Collections.EMPTY_MAP;
        }
        Map map2 = map;
        String str = (String) judVar.g;
        if (str != null) {
            try {
                double d2 = Double.parseDouble(str);
                if (d2 < 0.0d || d2 > 1.0d) {
                    j3i.c.getClass();
                    return null;
                }
                d = d2;
            } catch (NumberFormatException unused) {
                j3i.c.getClass();
                return null;
            }
        } else {
            d = 1.0d;
        }
        return new i3i(strA, strA2, strA3, map2, d);
    }
}
