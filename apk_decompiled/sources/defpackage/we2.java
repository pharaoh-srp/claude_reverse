package defpackage;

import com.anthropic.claude.sessions.types.SessionResource;
import com.anthropic.claude.types.strings.SessionId;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class we2 {
    public static final we2 a = new we2();
    public static final LinkedHashSet b = new LinkedHashSet();
    public static String c;
    public static Long d;
    public static SessionResource e;
    public static Integer f;
    public static Integer g;

    public static void b(String str, long j, boolean z, String str2) {
        str2.getClass();
        long jNanoTime = (System.nanoTime() - j) / 1000000;
        Integer num = f;
        if (!z) {
            num = null;
        }
        Integer num2 = g;
        if (!z) {
            num2 = null;
        }
        f = null;
        g = null;
        boolean z2 = jNanoTime > 60000;
        List list = xah.a;
        lqa lqaVar = new lqa();
        if (jNanoTime > 60000) {
            jNanoTime = 60000;
        }
        lqaVar.put("duration_ms", Long.valueOf(jNanoTime));
        lqaVar.put("timed_out", Boolean.valueOf(z2));
        lqaVar.put("surface", "android");
        lqaVar.put("session_type", "remote");
        lqaVar.put("is_new_session", Boolean.FALSE);
        lqaVar.put("nav_temp", c(str));
        lqaVar.put("entry_point", z ? "list_tap" : "deeplink");
        lqaVar.put("first_content_source", str2);
        if (num != null) {
            lqaVar.put("list_position", Integer.valueOf(num.intValue()));
        }
        if (num2 != null) {
            lqaVar.put("list_size", Integer.valueOf(num2.intValue()));
        }
        xah.d("page.code_session_open_time", "perf", lqaVar.c());
        b.add(SessionId.m1114boximpl(str));
    }

    public static String c(String str) {
        str.getClass();
        return b.contains(SessionId.m1114boximpl(str)) ? "warm_mem" : "cold";
    }

    public final void a(int i, int i2, ld4 ld4Var, zy7 zy7Var) {
        int i3;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(266671999);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (e18Var.h(zy7Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = 1;
        if (e18Var.Q(i3 & 1, (i3 & 3) != 2)) {
            lz1 lz1Var = jd4.a;
            if (i4 != 0) {
                Object objN = e18Var.N();
                if (objN == lz1Var) {
                    objN = new ll1(23);
                    e18Var.k0(objN);
                }
                zy7Var = (zy7) objN;
            }
            boolean z = (i3 & 14) == 4;
            Object objN2 = e18Var.N();
            if (z || objN2 == lz1Var) {
                objN2 = new rd2(zy7Var, null, i5);
                e18Var.k0(objN2);
            }
            fd9.i(e18Var, (pz7) objN2, iei.a);
        } else {
            e18Var.T();
        }
        zy7 zy7Var2 = zy7Var;
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ve2(i, i2, 0, this, zy7Var2);
        }
    }
}
