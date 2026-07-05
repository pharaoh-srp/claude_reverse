package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mmg extends kmg {
    public gzc c;
    public int d;

    public mmg(long j, gzc gzcVar) {
        super(j);
        this.c = gzcVar;
    }

    @Override // defpackage.kmg
    public final void a(kmg kmgVar) {
        synchronized (x44.c) {
            kmgVar.getClass();
            this.c = ((mmg) kmgVar).c;
            this.d = ((mmg) kmgVar).d;
        }
    }

    @Override // defpackage.kmg
    public final kmg b() {
        return new mmg(ycg.j().g(), this.c);
    }

    @Override // defpackage.kmg
    public final kmg c(long j) {
        return new mmg(j, this.c);
    }
}
