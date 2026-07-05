package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class emg extends kmg {
    public l3 c;
    public int d;
    public int e;

    public emg(long j, l3 l3Var) {
        super(j);
        this.c = l3Var;
    }

    @Override // defpackage.kmg
    public final void a(kmg kmgVar) {
        synchronized (oq5.H) {
            kmgVar.getClass();
            this.c = ((emg) kmgVar).c;
            this.d = ((emg) kmgVar).d;
            this.e = ((emg) kmgVar).e;
        }
    }

    @Override // defpackage.kmg
    public final kmg b() {
        return c(ycg.j().g());
    }

    @Override // defpackage.kmg
    public final kmg c(long j) {
        return new emg(j, this.c);
    }
}
