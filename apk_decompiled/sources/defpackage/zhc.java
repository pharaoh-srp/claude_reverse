package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class zhc extends ln7 {
    public static final zhc d = new zhc(0, 2, 1);

    @Override // defpackage.ln7
    public final void c(gjc gjcVar, hn0 hn0Var, vag vagVar, p60 p60Var, fjc fjcVar) {
        d79 d79Var = (d79) gjcVar.b(1);
        boolean z = false;
        int i = d79Var != null ? d79Var.a : 0;
        ch2 ch2Var = (ch2) gjcVar.b(0);
        if (i > 0) {
            ucc uccVar = new ucc();
            uccVar.G = hn0Var;
            uccVar.E = i;
            hn0Var = uccVar;
        }
        ch2Var.M0(hn0Var, vagVar, p60Var, fjcVar != null ? new qb5(fjcVar, vagVar, z) : null);
    }
}
