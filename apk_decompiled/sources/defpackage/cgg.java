package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class cgg implements i4f {
    public static cgg b(h2f h2fVar) {
        i4f.a((String) h2fVar.b);
        i4f.a((String) h2fVar.c);
        i4f.a((String) h2fVar.d);
        if (((HashMap) h2fVar.e) == null) {
            Map map = Collections.EMPTY_MAP;
        }
        String str = (String) h2fVar.f;
        if (str != null) {
            try {
                double d = Double.parseDouble(str);
                if (d < 0.0d || d > 1.0d) {
                    dgg.c.getClass();
                    return null;
                }
            } catch (NumberFormatException unused) {
                dgg.c.getClass();
                return null;
            }
        }
        String str2 = (String) h2fVar.g;
        if (str2 != null) {
            try {
                double d2 = Double.parseDouble(str2);
                if (d2 <= 0.0d) {
                    dgg.c.getClass();
                    return null;
                }
                Math.max((int) d2, 1);
            } catch (NumberFormatException unused2) {
                dgg.c.getClass();
                return null;
            }
        }
        return new cgg();
    }
}
