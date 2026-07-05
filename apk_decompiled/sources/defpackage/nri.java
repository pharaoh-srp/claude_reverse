package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nri extends oqi {
    public final bb8 b;
    public String c;
    public boolean d;
    public final sd6 e;
    public zy7 f;
    public final lsc g;
    public hr1 h;
    public final lsc i;
    public long j;
    public float k;
    public float l;
    public final mri m;

    public nri(bb8 bb8Var) {
        this.b = bb8Var;
        bb8Var.i = new mri(this, 0);
        this.c = "";
        this.d = true;
        this.e = new sd6();
        this.f = re4.g0;
        this.g = mpk.P(null);
        this.i = mpk.P(new k8g(0L));
        this.j = 9205357640488583168L;
        this.k = 1.0f;
        this.l = 1.0f;
        this.m = new mri(this, 1);
    }

    @Override // defpackage.oqi
    public final void a(xd6 xd6Var) {
        e(xd6Var, 1.0f, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(defpackage.xd6 r36, float r37, defpackage.hr1 r38) {
        /*
            Method dump skipped, instruction units count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nri.e(xd6, float, hr1):void");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.c);
        sb.append("\n\tviewportWidth: ");
        lsc lscVar = this.i;
        sb.append(Float.intBitsToFloat((int) (((k8g) lscVar.getValue()).a >> 32)));
        sb.append("\n\tviewportHeight: ");
        sb.append(Float.intBitsToFloat((int) (((k8g) lscVar.getValue()).a & 4294967295L)));
        sb.append("\n");
        return sb.toString();
    }
}
