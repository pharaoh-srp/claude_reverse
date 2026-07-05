package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class ln7 {
    public final /* synthetic */ int a;
    public final int b;
    public final int c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ln7(int i, int i2, int i3) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, 1, (byte) 0);
        this.a = 1;
    }

    public static in7 a(ln7 ln7Var) {
        byte b = 0;
        return new in7(ln7Var.b + ln7Var.c, 1, b, b);
    }

    public static in7 b() {
        return new in7(0, 1, 0, (byte) 0);
    }

    public abstract void c(gjc gjcVar, hn0 hn0Var, vag vagVar, p60 p60Var, fjc fjcVar);

    public y08 d(gjc gjcVar) {
        return null;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                String strF = jce.a.b(getClass()).f();
                return strF == null ? "" : strF;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ ln7(int i, int i2, int i3, byte b) {
        this.a = i3;
        this.b = i;
        this.c = i2;
    }
}
