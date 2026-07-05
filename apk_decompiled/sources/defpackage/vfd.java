package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public enum vfd {
    BOOLEAN("Boolean"),
    CHAR("Char"),
    BYTE("Byte"),
    SHORT("Short"),
    INT("Int"),
    FLOAT("Float"),
    LONG("Long"),
    DOUBLE("Double");

    public final sxb E;
    public final sxb F;
    public final kw9 G;
    public final kw9 H;
    public static final Set I = mp0.Z0(new vfd[]{CHAR, BYTE, SHORT, INT, FLOAT, LONG, DOUBLE});

    vfd(String str) {
        this.E = sxb.e(str);
        this.F = sxb.e(str.concat("Array"));
        ufd ufdVar = new ufd(this, 1);
        w1a w1aVar = w1a.F;
        this.G = yb5.w(w1aVar, ufdVar);
        this.H = yb5.w(w1aVar, new ufd(this, 0));
    }
}
