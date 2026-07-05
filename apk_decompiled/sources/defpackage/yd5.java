package defpackage;

import io.sentry.j5;
import io.sentry.j6;
import io.sentry.n0;
import io.sentry.protocol.v;
import io.sentry.t5;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class yd5 implements j6 {
    public final /* synthetic */ int a;

    public /* synthetic */ yd5(int i) {
        this.a = i;
    }

    @Override // io.sentry.j6
    public final j5 a(j5 j5Var, n0 n0Var) {
        Throwable thB;
        ArrayList<v> arrayListE;
        String str;
        switch (this.a) {
            case 0:
                String strA = j5Var.a();
                Boolean boolValueOf = strA != null ? Boolean.valueOf(Boolean.parseBoolean(strA)) : null;
                if (j5Var.Y != t5.FATAL && x44.r(boolValueOf, Boolean.FALSE) && h1e.F.c() >= 0.25d) {
                }
                break;
            case 1:
                if (j5Var.Y != t5.FATAL && (thB = j5Var.b()) != null && r0c.b(thB)) {
                }
                break;
            case 2:
                String strA2 = j5Var.a();
                if (!(strA2 != null ? Boolean.parseBoolean(strA2) : false) && (arrayListE = j5Var.e()) != null) {
                    for (v vVar : arrayListE) {
                        String str2 = vVar.F;
                        vVar.F = str2 != null ? aph.d(str2) : null;
                    }
                }
                break;
            case 3:
                AbstractMap abstractMap = j5Var.S;
                if (abstractMap != null) {
                    Object obj = abstractMap.get("redacted_request_url");
                    str = obj instanceof String ? (String) obj : null;
                    if (str != null) {
                        j5Var.i(x44.X(str, "{{ default }}"));
                    }
                }
                break;
            default:
                AbstractMap abstractMap2 = j5Var.S;
                if (abstractMap2 != null) {
                    String strA3 = j5Var.a();
                    boolean z = strA3 != null ? Boolean.parseBoolean(strA3) : false;
                    Object obj2 = abstractMap2.get("json_parse_failed_content");
                    str = obj2 instanceof String ? (String) obj2 : null;
                    if (str != null && !z && str.length() > 0) {
                        String strS = t9e.s(str);
                        if (j5Var.S == null) {
                            j5Var.S = new HashMap();
                        }
                        j5Var.S.put("json_parse_failed_content", strS);
                    }
                }
                break;
        }
        return j5Var;
    }
}
