package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ld2a;", "Lnqb;", "Le2a;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
final /* data */ class d2a extends nqb {
    public final y20 E;
    public final m2a F;
    public final zhh G;

    public d2a(y20 y20Var, m2a m2aVar, zhh zhhVar) {
        this.E = y20Var;
        this.F = m2aVar;
        this.G = zhhVar;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        return new e2a(this.E, this.F, this.G);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d2a) {
            d2a d2aVar = (d2a) obj;
            return x44.r(this.E, d2aVar.E) && this.F == d2aVar.F && this.G == d2aVar.G;
        }
        return false;
    }

    public final int hashCode() {
        return this.G.hashCode() + ((this.F.hashCode() + (this.E.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.E + ", legacyTextFieldState=" + this.F + ", textFieldSelectionManager=" + this.G + ')';
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) throws Throwable {
        e2a e2aVar = (e2a) hqbVar;
        if (e2aVar.R) {
            e2aVar.S.c();
            e2aVar.S.k(e2aVar);
        }
        y20 y20Var = this.E;
        e2aVar.S = y20Var;
        if (e2aVar.R) {
            if (y20Var.a != null) {
                e39.c("Expected textInputModifierNode to be null");
            }
            y20Var.a = e2aVar;
        }
        e2aVar.T = this.F;
        e2aVar.U = this.G;
    }
}
