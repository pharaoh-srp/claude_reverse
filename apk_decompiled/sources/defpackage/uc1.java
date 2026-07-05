package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class uc1 {
    public static final wwc b = new wwc();
    public final HashMap a = new HashMap();

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (Map.Entry entry : new HashMap(this.a).entrySet()) {
            if (i > 0) {
                sb.append(',');
            }
            String str = (String) entry.getKey();
            boolean[] zArr = wwc.b;
            b.getClass();
            zf zfVarB = wwc.b(str, zArr);
            zf zfVarB2 = wwc.b((String) entry.getValue(), wwc.c);
            sb.append(zfVarB.F);
            sb.append('=');
            sb.append(zfVarB2.F);
            i++;
        }
        return sb.toString();
    }
}
