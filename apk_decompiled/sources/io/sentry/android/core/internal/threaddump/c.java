package io.sentry.android.core.internal.threaddump;

import io.sentry.p;
import io.sentry.p2;
import io.sentry.protocol.d0;
import io.sentry.u5;
import io.sentry.w6;
import io.sentry.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class c {
    public static final Pattern g = Pattern.compile("\"(.*)\" (.*) ?prio=(\\d+)\\s+tid=(\\d+)\\s*(.*)");
    public static final Pattern h = Pattern.compile("\"(.*)\" (.*) ?sysTid=(\\d+)");
    public static final Pattern i = Pattern.compile(" *(?:native: )?#(\\d+) \\S+ ([0-9a-fA-F]+)\\s+((.*?)(?:\\s+\\(deleted\\))?(?:\\s+\\(offset (.*?)\\))?)(?:\\s+\\((?:\\?\\?\\?|(.*?)(?:\\+(\\d+))?)\\))?(?:\\s+\\(BuildId: (.*?)\\))?");
    public static final Pattern j = Pattern.compile(" *at (?:(.+)\\.)?([^.]+)\\.([^.]+)\\((.*):([\\d-]+)\\)");
    public static final Pattern k = Pattern.compile(" *at (?:(.+)\\.)?([^.]+)\\.([^.]+)\\(Native method\\)");
    public static final Pattern l = Pattern.compile(" *- locked \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");
    public static final Pattern m = Pattern.compile(" *- sleeping on \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");
    public static final Pattern n = Pattern.compile(" *- waiting on \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");
    public static final Pattern o = Pattern.compile(" *- waiting to lock \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");
    public static final Pattern p = Pattern.compile(" *- waiting to lock \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)(?: held by thread (\\d+))");
    public static final Pattern q = Pattern.compile(" *- waiting to lock an unknown object");
    public static final Pattern r = Pattern.compile("\\s+");
    public final w6 a;
    public final boolean b;
    public final x c;
    public final p2 f = new p2(1);
    public final HashMap d = new HashMap();
    public final ArrayList e = new ArrayList();

    public c(w6 w6Var, boolean z) {
        this.a = w6Var;
        this.b = z;
        this.c = new x(w6Var);
    }

    public static void a(d0 d0Var, u5 u5Var) {
        Map map = d0Var.N;
        if (map == null) {
            map = new HashMap();
        }
        u5 u5Var2 = (u5) map.get(u5Var.F);
        if (u5Var2 != null) {
            u5Var2.E = Math.max(u5Var2.E, u5Var.E);
        } else {
            String str = u5Var.F;
            u5 u5Var3 = new u5();
            u5Var3.E = u5Var.E;
            u5Var3.F = str;
            u5Var3.G = u5Var.G;
            u5Var3.H = u5Var.H;
            u5Var3.I = u5Var.I;
            u5Var3.J = p.r(u5Var.J);
            map.put(str, u5Var3);
        }
        d0Var.N = map;
    }

    public static Long d(Matcher matcher, int i2) {
        String strGroup = matcher.group(i2);
        if (strGroup == null || strGroup.length() == 0) {
            return null;
        }
        return Long.valueOf(Long.parseLong(strGroup));
    }

    public static boolean f(Matcher matcher, String str) {
        matcher.reset(str);
        return matcher.matches();
    }

    public final io.sentry.protocol.c b() {
        return (io.sentry.protocol.c) this.f.b;
    }

    public final ArrayList c() {
        return new ArrayList(this.d.values());
    }

    public final ArrayList e() {
        return this.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0536 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02b8 A[EDGE_INSN: B:191:0x02b8->B:98:0x02b8 BREAK  A[LOOP:1: B:93:0x02a2->B:171:0x050e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(io.sentry.android.core.internal.threaddump.b r31) {
        /*
            Method dump skipped, instruction units count: 1351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.internal.threaddump.c.g(io.sentry.android.core.internal.threaddump.b):void");
    }
}
