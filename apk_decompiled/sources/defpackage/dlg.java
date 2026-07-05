package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dlg implements dsi {
    public final dsi E;
    public final long F;

    public dlg(dsi dsiVar, long j) {
        this.E = dsiVar;
        this.F = j;
    }

    @Override // defpackage.dsi
    public final boolean a() {
        return this.E.a();
    }

    @Override // defpackage.dsi
    public final long e(sb0 sb0Var, sb0 sb0Var2, sb0 sb0Var3) {
        return this.E.e(sb0Var, sb0Var2, sb0Var3) + this.F;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dlg)) {
            return false;
        }
        dlg dlgVar = (dlg) obj;
        return dlgVar.F == this.F && x44.r(dlgVar.E, this.E);
    }

    @Override // defpackage.dsi
    public final sb0 f(long j, sb0 sb0Var, sb0 sb0Var2, sb0 sb0Var3) {
        long j2 = this.F;
        return j < j2 ? sb0Var3 : this.E.f(j - j2, sb0Var, sb0Var2, sb0Var3);
    }

    public final int hashCode() {
        return Long.hashCode(this.F) + (this.E.hashCode() * 31);
    }

    @Override // defpackage.dsi
    public final sb0 p(long j, sb0 sb0Var, sb0 sb0Var2, sb0 sb0Var3) {
        long j2 = this.F;
        return j < j2 ? sb0Var : this.E.p(j - j2, sb0Var, sb0Var2, sb0Var3);
    }
}
