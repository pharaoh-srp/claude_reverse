package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class x83 implements pz7 {
    public final /* synthetic */ xhb E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ m83 G;

    public x83(xhb xhbVar, boolean z, m83 m83Var) {
        this.E = xhbVar;
        this.F = z;
        this.G = m83Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        ld4 ld4Var = (ld4) obj;
        int iIntValue = ((Number) obj2).intValue();
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
            bok.b(this.E, this.F, this.G.r, e18Var, 0);
        } else {
            e18Var.T();
        }
        return iei.a;
    }
}
