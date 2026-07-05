package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class eeh implements beh {
    public final long E;
    public final /* synthetic */ feh F;

    public eeh(feh fehVar, long j) {
        this.F = fehVar;
        this.E = j;
    }

    @Override // defpackage.beh
    public final aeh d0() {
        return xnk.e(this.F);
    }

    @Override // defpackage.beh
    public final long j(cu9 cu9Var) {
        cu9 cu9Var2 = (cu9) this.F.V.getValue();
        if (cu9Var2 != null) {
            return cu9Var.G(cu9Var2, this.E);
        }
        e39.d("Tried to open context menu before the anchor was placed.");
        sz6.r();
        return 0L;
    }

    @Override // defpackage.beh
    public final l9e m(cu9 cu9Var) {
        return d4c.x(j(cu9Var), 0L);
    }
}
