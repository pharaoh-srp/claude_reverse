package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lxma;", "Lnqb;", "Lyma;", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = mdj.f)
public final /* data */ class xma extends nqb {
    public final int E;
    public final int F;

    public xma(int i, int i2) {
        this.E = i;
        this.F = i2;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        yma ymaVar = new yma();
        ymaVar.S = this.E;
        ymaVar.T = this.F;
        return ymaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xma)) {
            return false;
        }
        xma xmaVar = (xma) obj;
        return this.E == xmaVar.E && this.F == xmaVar.F;
    }

    public final int hashCode() {
        return Integer.hashCode(this.F) + (Integer.hashCode(this.E) * 31);
    }

    public final String toString() {
        return vb7.q("LottieAnimationSizeElement(width=", ", height=", this.E, this.F, ")");
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        yma ymaVar = (yma) hqbVar;
        ymaVar.getClass();
        ymaVar.S = this.E;
        ymaVar.T = this.F;
    }
}
