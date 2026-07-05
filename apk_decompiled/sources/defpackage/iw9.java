package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class iw9 extends hqb implements nsc {
    public float S;
    public boolean T;

    @Override // defpackage.nsc
    public final Object d(cz5 cz5Var, Object obj) {
        ywe yweVar = obj instanceof ywe ? (ywe) obj : null;
        if (yweVar == null) {
            yweVar = new ywe();
        }
        yweVar.a = this.S;
        yweVar.b = this.T;
        return yweVar;
    }
}
