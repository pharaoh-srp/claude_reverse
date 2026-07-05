package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nma implements mma {
    public zu9 E;

    @Override // defpackage.mma
    public final cu9 d(cu9 cu9Var) {
        ima imaVar;
        ima imaVar2 = cu9Var instanceof ima ? (ima) cu9Var : null;
        if (imaVar2 != null) {
            return imaVar2;
        }
        cu9Var.getClass();
        m5c m5cVar = (m5c) cu9Var;
        hma hmaVarF1 = m5cVar.f1();
        return (hmaVarF1 == null || (imaVar = hmaVarF1.V) == null) ? m5cVar : imaVar;
    }

    @Override // defpackage.mma
    public final cu9 j(b3d b3dVar) {
        zu9 zu9Var = this.E;
        zu9Var.getClass();
        return (cu9) zu9Var.a();
    }
}
