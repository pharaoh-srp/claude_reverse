package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mkb extends hqb implements nsc {
    public float S;

    @Override // defpackage.nsc
    public final Object d(cz5 cz5Var, Object obj) {
        lqc lqcVar = obj instanceof lqc ? (lqc) obj : null;
        if (lqcVar == null) {
            lqcVar = new lqc();
        }
        lqcVar.e = this.S;
        return lqcVar;
    }
}
