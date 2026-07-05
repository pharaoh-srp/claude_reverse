package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class i2c extends j7g implements lc2 {
    public final int F;
    public final l2c G;
    public final fhi H;
    public final r9i I;
    public final boolean J;
    public final boolean K;

    /* JADX WARN: Illegal instructions before constructor call */
    public i2c(int i, l2c l2cVar, fhi fhiVar, r9i r9iVar, boolean z, int i2) {
        if ((i2 & 8) != 0) {
            r9i.F.getClass();
            r9iVar = r9i.G;
        }
        this(i, l2cVar, fhiVar, r9iVar, (i2 & 16) != 0 ? false : z, false);
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
        return this.J;
    }

    @Override // defpackage.j7g, defpackage.fhi
    public final fhi l0(boolean z) {
        return new i2c(this.F, this.G, this.H, this.I, z, 32);
    }

    @Override // defpackage.j7g
    /* JADX INFO: renamed from: o0 */
    public final j7g l0(boolean z) {
        return new i2c(this.F, this.G, this.H, this.I, z, 32);
    }

    @Override // defpackage.j7g
    /* JADX INFO: renamed from: p0 */
    public final j7g n0(r9i r9iVar) {
        r9iVar.getClass();
        return new i2c(this.F, this.G, this.H, r9iVar, this.J, this.K);
    }

    @Override // defpackage.fhi
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final i2c j0(es9 es9Var) {
        es9Var.getClass();
        l2c l2cVar = this.G;
        l2cVar.getClass();
        vai vaiVarD = l2cVar.a.d(es9Var);
        xz xzVar = l2cVar.b != null ? new xz(l2cVar, 16, es9Var) : null;
        l2c l2cVar2 = l2cVar.c;
        if (l2cVar2 == null) {
            l2cVar2 = l2cVar;
        }
        l2c l2cVar3 = new l2c(vaiVarD, xzVar, l2cVar2, l2cVar.d);
        fhi fhiVar = this.H;
        return new i2c(this.F, l2cVar3, fhiVar != null ? fhiVar : null, this.I, this.J, 32);
    }

    public i2c(int i, l2c l2cVar, fhi fhiVar, r9i r9iVar, boolean z, boolean z2) {
        if (i != 0) {
            l2cVar.getClass();
            r9iVar.getClass();
            this.F = i;
            this.G = l2cVar;
            this.H = fhiVar;
            this.I = r9iVar;
            this.J = z;
            this.K = z2;
            return;
        }
        throw null;
    }
}
