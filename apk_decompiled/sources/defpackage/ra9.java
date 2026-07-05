package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ra9 {
    public final int a;
    public final int b;
    public final yy9 c;

    public ra9(int i, int i2, yy9 yy9Var) {
        this.a = i;
        this.b = i2;
        this.c = yy9Var;
        if (i < 0) {
            e39.a("startIndex should be >= 0");
        }
        if (i2 > 0) {
            return;
        }
        e39.a("size should be > 0");
    }
}
