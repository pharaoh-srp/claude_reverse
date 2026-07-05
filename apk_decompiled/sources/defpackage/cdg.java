package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cdg extends kmg {
    public long c;

    public cdg(long j, long j2) {
        super(j);
        this.c = j2;
    }

    @Override // defpackage.kmg
    public final void a(kmg kmgVar) {
        kmgVar.getClass();
        this.c = ((cdg) kmgVar).c;
    }

    @Override // defpackage.kmg
    public final kmg b() {
        return c(ycg.j().g());
    }

    @Override // defpackage.kmg
    public final kmg c(long j) {
        return new cdg(j, this.c);
    }
}
