package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lim8;", "Lnqb;", "Ljm8;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
final class im8 extends nqb {
    public final tkh E;
    public final int F;
    public final int G;

    public im8(tkh tkhVar, int i, int i2) {
        this.E = tkhVar;
        this.F = i;
        this.G = i2;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        jm8 jm8Var = new jm8();
        jm8Var.S = this.E;
        jm8Var.T = this.F;
        jm8Var.U = this.G;
        jm8Var.W = -1;
        jm8Var.X = -1;
        return jm8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof im8)) {
            return false;
        }
        im8 im8Var = (im8) obj;
        return x44.r(this.E, im8Var.E) && this.F == im8Var.F && this.G == im8Var.G;
    }

    public final int hashCode() {
        return (((this.E.hashCode() * 31) + this.F) * 31) + this.G;
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        jm8 jm8Var = (jm8) hqbVar;
        tkh tkhVar = jm8Var.S;
        tkh tkhVar2 = this.E;
        boolean zR = x44.r(tkhVar, tkhVar2);
        int i = this.F;
        int i2 = this.G;
        if (zR && jm8Var.T == i && jm8Var.U == i2) {
            return;
        }
        jm8Var.S = tkhVar2;
        jm8Var.T = i;
        jm8Var.U = i2;
        jm8Var.Y = yfd.Y(tkhVar2, yfd.W(jm8Var).e0);
        jm8Var.V = true;
        yfd.W(jm8Var).T();
    }
}
