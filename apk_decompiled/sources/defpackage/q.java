package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends dx5 {
    public final j7g F;
    public final j7g G;

    public q(j7g j7gVar, j7g j7gVar2) {
        j7gVar.getClass();
        j7gVar2.getClass();
        this.F = j7gVar;
        this.G = j7gVar2;
    }

    @Override // defpackage.j7g
    /* JADX INFO: renamed from: p0 */
    public final j7g n0(r9i r9iVar) {
        r9iVar.getClass();
        return new q(this.F.n0(r9iVar), this.G);
    }

    @Override // defpackage.dx5
    public final j7g q0() {
        return this.F;
    }

    @Override // defpackage.dx5
    public final dx5 s0(j7g j7gVar) {
        return new q(j7gVar, this.G);
    }

    public final j7g t0() {
        return this.G;
    }

    public final j7g u0() {
        return this.F;
    }

    @Override // defpackage.j7g
    /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
    public final q l0(boolean z) {
        return new q(this.F.l0(z), this.G.l0(z));
    }

    @Override // defpackage.dx5
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final q j0(es9 es9Var) {
        es9Var.getClass();
        j7g j7gVar = this.F;
        j7gVar.getClass();
        j7g j7gVar2 = this.G;
        j7gVar2.getClass();
        return new q(j7gVar, j7gVar2);
    }
}
