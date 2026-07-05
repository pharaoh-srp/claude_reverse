package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class h8d extends ts9 implements rz7 {
    public final /* synthetic */ bz7 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h8d(bz7 bz7Var) {
        super(3);
        this.F = bz7Var;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        e18 e18Var = (e18) ((ld4) obj2);
        e18Var.a0(374375707);
        Object objN = e18Var.N();
        if (objN == jd4.a) {
            objN = new g8d();
            e18Var.k0(objN);
        }
        g8d g8dVar = (g8d) objN;
        g8dVar.E = this.F;
        u3a u3aVar = g8dVar.F;
        if (u3aVar != null) {
            u3aVar.F = null;
        }
        g8dVar.F = null;
        e18Var.p(false);
        return g8dVar;
    }
}
