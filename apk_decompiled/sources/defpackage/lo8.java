package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lo8 extends hqb implements nsc {
    public vo1 S;

    @Override // defpackage.nsc
    public final Object d(cz5 cz5Var, Object obj) {
        ywe yweVar = obj instanceof ywe ? (ywe) obj : null;
        if (yweVar == null) {
            yweVar = new ywe();
        }
        yweVar.c = new fc5(this.S);
        return yweVar;
    }
}
