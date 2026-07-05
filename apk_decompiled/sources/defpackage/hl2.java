package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hl2 {
    public static final ide a = new ide("!\\[[^\\]]*\\]\\([^)]+\\)");

    public static final String a(String str) {
        if (!bsg.u0(str, "![", false)) {
            return str;
        }
        return a.g(str, new c32(26));
    }
}
