package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public abstract class w48 {
    public static final ide a;

    static {
        Pattern.compile("^diff --git a/(.+) b/(.+)$").getClass();
        a = new ide("^@@ -(\\d+)(?:,(\\d+))? \\+(\\d+)(?:,(\\d+))? @@(.*)$");
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x018a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.v48 a(java.lang.String r18, java.lang.String r19) {
        /*
            Method dump skipped, instruction units count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w48.a(java.lang.String, java.lang.String):v48");
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x013f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.v48 b(kotlinx.serialization.json.JsonArray r16, java.lang.String r17) {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w48.b(kotlinx.serialization.json.JsonArray, java.lang.String):v48");
    }

    public static v48 c(List list, r36 r36Var) {
        n36 n36Var;
        List list2 = list;
        ArrayList arrayList = new ArrayList(x44.y(list2, 10));
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                x44.n0();
                throw null;
            }
            String str = (String) obj;
            int iOrdinal = r36Var.ordinal();
            if (iOrdinal == 0) {
                n36Var = new n36(r36Var, str, Integer.valueOf(i2), Integer.valueOf(i2));
            } else if (iOrdinal == 1) {
                n36Var = new n36(r36Var, str, null, Integer.valueOf(i2));
            } else {
                if (iOrdinal != 2) {
                    wg6.i();
                    return null;
                }
                n36Var = new n36(r36Var, str, Integer.valueOf(i2), null);
            }
            arrayList.add(n36Var);
            i = i2;
        }
        return new v48(x44.W(new fi7(null, null, jj7.E, x44.W(new l36(1, r36Var == r36.F ? 0 : list.size(), 1, r36Var == r36.G ? 0 : list.size(), null, arrayList)))));
    }

    public static List d(String str) {
        str.getClass();
        List listN0 = bsg.N0(str);
        return (listN0.size() <= 1 || ((CharSequence) w44.U0(listN0)).length() != 0) ? listN0 : w44.J0(1, listN0);
    }
}
