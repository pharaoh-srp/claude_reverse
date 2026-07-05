package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ex5 extends dx5 {
    public final j7g F;

    public ex5(j7g j7gVar) {
        this.F = j7gVar;
    }

    @Override // defpackage.j7g
    /* JADX INFO: renamed from: o0 */
    public final j7g l0(boolean z) {
        return z == b0() ? this : this.F.l0(z).n0(K());
    }

    @Override // defpackage.j7g
    /* JADX INFO: renamed from: p0 */
    public final j7g n0(r9i r9iVar) {
        r9iVar.getClass();
        return r9iVar != K() ? new m7g(this, r9iVar) : this;
    }

    @Override // defpackage.dx5
    public final j7g q0() {
        return this.F;
    }
}
