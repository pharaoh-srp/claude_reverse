package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vy8 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;
    public final /* synthetic */ int G;
    public final /* synthetic */ uy8 H;

    public /* synthetic */ vy8(uy8 uy8Var, int i, int i2) {
        this.E = 0;
        this.H = uy8Var;
        this.F = i;
        this.G = i2;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        uy8 uy8Var = this.H;
        int i2 = this.G;
        int i3 = this.F;
        dfh dfhVar = (dfh) obj;
        switch (i) {
            case 0:
                long jI = uy8Var.i(mwa.m(0, dfhVar.F.length()));
                int iG = kkh.g(jI);
                int iF = kkh.f(jI);
                if (i3 < iG) {
                    i3 = iG;
                }
                if (i3 <= iF) {
                    iF = i3;
                }
                int iG2 = kkh.g(jI);
                int iF2 = kkh.f(jI);
                if (i2 < iG2) {
                    i2 = iG2;
                }
                if (i2 <= iF2) {
                    iF2 = i2;
                }
                dfhVar.f(uy8Var.d(mwa.m(iF, iF2)));
                break;
            case 1:
                if (i3 < 0 || i2 < 0) {
                    e39.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i3 + " and " + i2 + " respectively.");
                }
                long jI2 = uy8Var.i(dfhVar.H);
                int iF3 = kkh.f(jI2);
                int iB = iF3 + i2;
                if (((iF3 ^ iB) & (i2 ^ iB)) < 0) {
                    iB = uy8Var.b();
                }
                long jD = uy8Var.d(mwa.m(kkh.f(jI2), Math.min(iB, uy8Var.b())));
                vuk.j(dfhVar, kkh.g(jD), kkh.f(jD));
                int iG3 = kkh.g(jI2);
                int i4 = iG3 - i3;
                if (((i3 ^ iG3) & (iG3 ^ i4)) < 0) {
                    i4 = 0;
                }
                long jD2 = uy8Var.d(mwa.m(Math.max(0, i4), kkh.g(jI2)));
                vuk.j(dfhVar, kkh.g(jD2), kkh.f(jD2));
                break;
            default:
                kkh kkhVar = dfhVar.I;
                euc eucVar = dfhVar.F;
                if (kkhVar != null) {
                    dfhVar.e(null);
                }
                if (i3 < 0) {
                    i3 = 0;
                }
                if (i2 < 0) {
                    i2 = 0;
                }
                long jD3 = uy8Var.d(mwa.m(i3, i2));
                int iE0 = wd6.e0(kkh.g(jD3), 0, eucVar.length());
                int iE02 = wd6.e0(kkh.f(jD3), 0, eucVar.length());
                if (iE0 != iE02) {
                    if (iE0 >= iE02) {
                        dfhVar.d(iE02, iE0, null);
                    } else {
                        dfhVar.d(iE0, iE02, null);
                    }
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ vy8(int i, int i2, uy8 uy8Var, int i3) {
        this.E = i3;
        this.F = i;
        this.G = i2;
        this.H = uy8Var;
    }
}
