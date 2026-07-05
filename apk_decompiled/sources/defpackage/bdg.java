package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bdg extends kmg {
    public int c;

    public bdg(long j, int i) {
        super(j);
        this.c = i;
    }

    @Override // defpackage.kmg
    public final void a(kmg kmgVar) {
        kmgVar.getClass();
        this.c = ((bdg) kmgVar).c;
    }

    @Override // defpackage.kmg
    public final kmg b() {
        return c(ycg.j().g());
    }

    @Override // defpackage.kmg
    public final kmg c(long j) {
        return new bdg(j, this.c);
    }
}
