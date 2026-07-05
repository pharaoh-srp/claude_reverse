package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class v9e {
    public static final List a = x44.X(new ide("[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}", jde.IGNORE_CASE), new ide("\\d{4,}(?=/|$)"), new ide("[A-Za-z0-9_-]{22,}"));

    public static final String a(String str) {
        long jHashCode = ((long) str.hashCode()) & 4294967295L;
        gb9.q(16);
        String string = Long.toString(jHashCode, 16);
        string.getClass();
        return ij0.j("<redacted: ", bsg.O0(8, string), ">");
    }

    public static final String b(String str) {
        str.getClass();
        return bsg.I0(str) ? str : w44.S0(bsg.X0(str, new char[]{'&'}, 6), "&", null, null, new u9e(0), 30);
    }
}
