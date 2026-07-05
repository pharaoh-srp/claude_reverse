package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yhc extends ln7 {
    public static final yhc d = new yhc(0, 2, 1);

    @Override // defpackage.ln7
    public final void c(gjc gjcVar, hn0 hn0Var, vag vagVar, p60 p60Var, fjc fjcVar) {
        y08 y08Var = (y08) gjcVar.b(0);
        Object objB = gjcVar.b(1);
        if (objB instanceof i18) {
            i18 i18Var = (i18) objB;
            ((wwb) p60Var.I).b(i18Var);
            ((fwb) p60Var.H).a(i18Var);
        }
        if (vagVar.n != 0) {
            pd4.a("Can only append a slot if not current inserting");
        }
        int i = vagVar.i;
        int i2 = vagVar.j;
        int iC = vagVar.c(y08Var);
        int iG = vagVar.g(vagVar.r(iC + 1), vagVar.b);
        vagVar.i = iG;
        vagVar.j = iG;
        vagVar.x(1, iC);
        if (i >= iG) {
            i++;
            i2++;
        }
        vagVar.c[iG] = objB;
        vagVar.i = i;
        vagVar.j = i2;
    }
}
