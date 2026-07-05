package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class j2i implements u9d {
    public final int a;
    public final long b;

    public j2i(int i, long j) {
        this.a = i;
        this.b = j;
    }

    @Override // defpackage.u9d
    public final long a(c79 c79Var, long j, fu9 fu9Var, long j2) {
        int i = (int) (j2 >> 32);
        int iF = ((c79Var.f() - i) / 2) + c79Var.a;
        long j3 = this.b;
        if (iF < 0) {
            int i2 = c79Var.a;
            int i3 = (i + i2) - ((int) (j3 >> 32));
            iF = i2 - (i3 >= 0 ? i3 : 0);
        } else if (iF + i > ((int) (j3 >> 32)) && (iF = c79Var.c - i) < 0) {
            iF = 0;
        }
        int i4 = c79Var.b - ((int) (j2 & 4294967295L));
        int i5 = this.a;
        int i6 = i4 - i5;
        if (i6 < 0) {
            i6 = c79Var.d + i5;
        }
        return (((long) iF) << 32) | (((long) i6) & 4294967295L);
    }
}
