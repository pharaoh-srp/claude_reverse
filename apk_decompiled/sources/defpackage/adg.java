package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class adg extends kmg {
    public float c;

    public adg(long j, float f) {
        super(j);
        this.c = f;
    }

    @Override // defpackage.kmg
    public final void a(kmg kmgVar) {
        kmgVar.getClass();
        this.c = ((adg) kmgVar).c;
    }

    @Override // defpackage.kmg
    public final kmg b() {
        return c(ycg.j().g());
    }

    @Override // defpackage.kmg
    public final kmg c(long j) {
        return new adg(j, this.c);
    }
}
