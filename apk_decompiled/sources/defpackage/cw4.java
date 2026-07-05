package defpackage;

import com.anthropic.claude.types.strings.ForkId;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class cw4 {
    public static final ide a = new ide("[\u202a-\u202e\u2066-\u2069]");

    public static final zv4 a(Map map, dw4 dw4Var, String str, String str2) {
        String str3;
        dr4 dr4Var = (dr4) map.get(ForkId.m1021boximpl(str));
        if (dr4Var == null || (str3 = dr4Var.b) == null) {
            String str4 = dr4Var != null ? dr4Var.a : null;
            str3 = x44.r(str4, "error") ? "error" : x44.r(str4, "running") ? "working" : null;
        }
        return new zv4(str, str2, str3, ForkId.m1026isMainimpl(str), ForkId.m1024equalsimpl0(str, dw4Var.b), x44.r(dr4Var != null ? dr4Var.a : null, "running"));
    }

    public static final String b(String str) {
        if (str == null) {
            return null;
        }
        String strH = a.h(bsg.j1(200, str), "");
        if (bsg.I0(strH)) {
            return null;
        }
        return strH;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0049 A[EDGE_INSN: B:20:0x0049->B:21:0x004a BREAK  A[LOOP:3: B:14:0x0030->B:68:?]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.dw4 c(defpackage.dw4 r14, java.util.List r15) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cw4.c(dw4, java.util.List):dw4");
    }
}
