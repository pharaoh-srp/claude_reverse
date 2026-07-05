package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class bp4 implements u9d {
    public final zy7 a;

    public bp4(long j) {
        this(new ap4(j, 0));
    }

    @Override // defpackage.u9d
    public final long a(c79 c79Var, long j, fu9 fu9Var, long j2) {
        long j3 = ((y69) this.a.a()).a;
        int iL = prk.l(fu9Var == fu9.E, c79Var.a + ((int) (j3 >> 32)), (int) (j2 >> 32), (int) (j >> 32));
        return (((long) prk.l(true, c79Var.b + ((int) (j3 & 4294967295L)), (int) (j2 & 4294967295L), (int) (j & 4294967295L))) & 4294967295L) | (((long) iL) << 32);
    }

    public bp4(zy7 zy7Var) {
        this.a = zy7Var;
    }
}
