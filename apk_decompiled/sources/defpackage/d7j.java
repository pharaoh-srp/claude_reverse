package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class d7j {
    public static final String a(String str) {
        str.getClass();
        if (isg.q0(str, "https://", false)) {
            return "wss://".concat(bsg.R0(str, "https://"));
        }
        if (isg.q0(str, "http://", false)) {
            return "ws://".concat(bsg.R0(str, "http://"));
        }
        sz6.p("Unknown protocol in URL: ".concat(str));
        return null;
    }

    public static long b(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static int c(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }
}
