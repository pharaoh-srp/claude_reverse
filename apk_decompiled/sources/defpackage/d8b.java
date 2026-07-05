package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d8b implements gm4 {
    public final /* synthetic */ tg6 E;
    public final /* synthetic */ uba F;
    public final /* synthetic */ l7b G;
    public final /* synthetic */ IOException H;
    public final /* synthetic */ boolean I;

    public /* synthetic */ d8b(tg6 tg6Var, uba ubaVar, l7b l7bVar, IOException iOException, boolean z) {
        this.E = tg6Var;
        this.F = ubaVar;
        this.G = l7bVar;
        this.H = iOException;
        this.I = z;
    }

    @Override // defpackage.gm4
    public final void accept(Object obj) {
        f8b f8bVar = (f8b) obj;
        tg6 tg6Var = this.E;
        f8bVar.k(tg6Var.a, tg6Var.b, this.F, this.G, this.H, this.I);
    }
}
