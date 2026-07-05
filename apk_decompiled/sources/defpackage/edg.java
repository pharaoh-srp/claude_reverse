package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class edg extends kmg {
    public Object c;

    public edg(long j, Object obj) {
        super(j);
        this.c = obj;
    }

    @Override // defpackage.kmg
    public final void a(kmg kmgVar) {
        kmgVar.getClass();
        this.c = ((edg) kmgVar).c;
    }

    @Override // defpackage.kmg
    public final kmg b() {
        return new edg(ycg.j().g(), this.c);
    }

    @Override // defpackage.kmg
    public final kmg c(long j) {
        return new edg(ycg.j().g(), this.c);
    }
}
