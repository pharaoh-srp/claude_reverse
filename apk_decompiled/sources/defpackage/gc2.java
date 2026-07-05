package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class gc2 extends j7g implements lc2 {
    public final vai F;
    public final jc2 G;
    public final boolean H;
    public final r9i I;

    public gc2(vai vaiVar, jc2 jc2Var, boolean z, r9i r9iVar) {
        vaiVar.getClass();
        r9iVar.getClass();
        this.F = vaiVar;
        this.G = jc2Var;
        this.H = z;
        this.I = r9iVar;
    }

    @Override // defpackage.yr9
    public final fab G() {
        return nu6.a(1, true, new String[0]);
    }

    @Override // defpackage.yr9
    public final List H() {
        return lm6.E;
    }

    @Override // defpackage.yr9
    public final r9i K() {
        return this.I;
    }

    @Override // defpackage.yr9
    public final u9i O() {
        return this.G;
    }

    @Override // defpackage.yr9
    public final boolean b0() {
        return this.H;
    }

    @Override // defpackage.yr9
    public final yr9 j0(es9 es9Var) {
        es9Var.getClass();
        return new gc2(this.F.d(es9Var), this.G, this.H, this.I);
    }

    @Override // defpackage.j7g, defpackage.fhi
    public final fhi l0(boolean z) {
        if (z == this.H) {
            return this;
        }
        return new gc2(this.F, this.G, z, this.I);
    }

    @Override // defpackage.fhi
    /* JADX INFO: renamed from: m0 */
    public final fhi j0(es9 es9Var) {
        es9Var.getClass();
        return new gc2(this.F.d(es9Var), this.G, this.H, this.I);
    }

    @Override // defpackage.j7g
    /* JADX INFO: renamed from: o0 */
    public final j7g l0(boolean z) {
        if (z == this.H) {
            return this;
        }
        return new gc2(this.F, this.G, z, this.I);
    }

    @Override // defpackage.j7g
    /* JADX INFO: renamed from: p0 */
    public final j7g n0(r9i r9iVar) {
        r9iVar.getClass();
        return new gc2(this.F, this.G, this.H, r9iVar);
    }

    @Override // defpackage.j7g
    public final String toString() {
        StringBuilder sb = new StringBuilder("Captured(");
        sb.append(this.F);
        sb.append(')');
        sb.append(this.H ? "?" : "");
        return sb.toString();
    }
}
