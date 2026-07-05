package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tti extends hqb implements nsc {
    public wo1 S;

    @Override // defpackage.nsc
    public final Object d(cz5 cz5Var, Object obj) {
        ywe yweVar = obj instanceof ywe ? (ywe) obj : null;
        if (yweVar == null) {
            yweVar = new ywe();
        }
        yweVar.c = new gc5(this.S);
        return yweVar;
    }
}
