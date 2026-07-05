package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class s implements u9d {
    public final int a;

    public s(int i) {
        this.a = i;
    }

    @Override // defpackage.u9d
    public final long a(c79 c79Var, long j, fu9 fu9Var, long j2) {
        int i;
        c79Var.getClass();
        fu9Var.getClass();
        int iOrdinal = fu9Var.ordinal();
        if (iOrdinal == 0) {
            i = c79Var.a;
        } else {
            if (iOrdinal != 1) {
                wg6.i();
                return 0L;
            }
            i = c79Var.c - ((int) (j2 >> 32));
        }
        int i2 = ((int) (j >> 32)) - ((int) (j2 >> 32));
        if (i2 < 0) {
            i2 = 0;
        }
        int iE0 = wd6.e0(i, 0, i2);
        int i3 = (c79Var.b - ((int) (j2 & 4294967295L))) - this.a;
        return (((long) iE0) << 32) | (((long) (i3 >= 0 ? i3 : 0)) & 4294967295L);
    }
}
