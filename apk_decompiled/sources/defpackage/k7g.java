package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class k7g extends j7g {
    public final u9i F;
    public final List G;
    public final boolean H;
    public final fab I;
    public final bz7 J;

    public k7g(u9i u9iVar, List list, boolean z, fab fabVar, bz7 bz7Var) {
        u9iVar.getClass();
        list.getClass();
        fabVar.getClass();
        this.F = u9iVar;
        this.G = list;
        this.H = z;
        this.I = fabVar;
        this.J = bz7Var;
        if (!(fabVar instanceof gu6) || (fabVar instanceof dph)) {
            return;
        }
        throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + fabVar + '\n' + u9iVar);
    }

    @Override // defpackage.yr9
    public final fab G() {
        return this.I;
    }

    @Override // defpackage.yr9
    public final List H() {
        return this.G;
    }

    @Override // defpackage.yr9
    public final r9i K() {
        r9i.F.getClass();
        return r9i.G;
    }

    @Override // defpackage.yr9
    public final u9i O() {
        return this.F;
    }

    @Override // defpackage.yr9
    public final boolean b0() {
        return this.H;
    }

    @Override // defpackage.yr9
    public final yr9 j0(es9 es9Var) {
        es9Var.getClass();
        j7g j7gVar = (j7g) this.J.invoke(es9Var);
        return j7gVar == null ? this : j7gVar;
    }

    @Override // defpackage.fhi
    /* JADX INFO: renamed from: m0 */
    public final fhi j0(es9 es9Var) {
        es9Var.getClass();
        j7g j7gVar = (j7g) this.J.invoke(es9Var);
        return j7gVar == null ? this : j7gVar;
    }

    @Override // defpackage.j7g
    /* JADX INFO: renamed from: o0 */
    public final j7g l0(boolean z) {
        return z == this.H ? this : z ? new v6c(this, 1) : new v6c(this, 0);
    }

    @Override // defpackage.j7g
    /* JADX INFO: renamed from: p0 */
    public final j7g n0(r9i r9iVar) {
        r9iVar.getClass();
        return r9iVar.isEmpty() ? this : new m7g(this, r9iVar);
    }
}
