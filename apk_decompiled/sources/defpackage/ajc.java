package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ajc extends ln7 {
    public static final ajc d = new ajc(1, 0, 2);

    @Override // defpackage.ln7
    public final void c(gjc gjcVar, hn0 hn0Var, vag vagVar, p60 p60Var, fjc fjcVar) {
        int iA = gjcVar.a(0);
        int i = vagVar.v;
        int iN = vagVar.N(vagVar.r(i), vagVar.b);
        int iG = vagVar.g(vagVar.r(i + 1), vagVar.b);
        for (int iMax = Math.max(iN, iG - iA); iMax < iG; iMax++) {
            Object obj = vagVar.c[vagVar.h(iMax)];
            if (obj instanceof i18) {
                p60Var.n((i18) obj);
            } else if (obj instanceof r7e) {
                ((r7e) obj).c();
            }
        }
        if (iA <= 0) {
            pd4.a("Check failed");
        }
        int i2 = vagVar.v;
        int iN2 = vagVar.N(vagVar.r(i2), vagVar.b);
        int iG2 = vagVar.g(vagVar.r(i2 + 1), vagVar.b) - iA;
        if (iG2 < iN2) {
            pd4.a("Check failed");
        }
        vagVar.J(iG2, iA, i2);
        int i3 = vagVar.i;
        if (i3 >= iN2) {
            vagVar.i = i3 - iA;
        }
    }
}
