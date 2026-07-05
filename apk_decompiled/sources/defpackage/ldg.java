package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ldg extends kmg {
    public jyc c;
    public int d;

    public ldg(long j, jyc jycVar) {
        super(j);
        this.c = jycVar;
    }

    @Override // defpackage.kmg
    public final void a(kmg kmgVar) {
        kmgVar.getClass();
        ldg ldgVar = (ldg) kmgVar;
        synchronized (gb9.b) {
            this.c = ldgVar.c;
            this.d = ldgVar.d;
        }
    }

    @Override // defpackage.kmg
    public final kmg b() {
        return new ldg(ycg.j().g(), this.c);
    }

    @Override // defpackage.kmg
    public final kmg c(long j) {
        return new ldg(j, this.c);
    }
}
