package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r5a {
    public static final /* synthetic */ wn9[] a = {jce.a.d(new awb(r5a.class, "lineCartesianLayerWrapper", "<v#0>"))};

    public static final o5a a(j5a j5aVar, ogg oggVar, ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        Object objN = e18Var.N();
        lz1 lz1Var = jd4.a;
        Object obj = objN;
        if (objN == lz1Var) {
            gq5 gq5Var = new gq5();
            gq5Var.a = lm6.E;
            e18Var.k0(gq5Var);
            obj = gq5Var;
        }
        gq5 gq5Var2 = (gq5) obj;
        e18 e18Var2 = (e18) ld4Var;
        Object objN2 = e18Var2.N();
        if (objN2 == lz1Var) {
            objN2 = new gri(null);
            e18Var2.k0(objN2);
        }
        gri griVar = (gri) objN2;
        boolean zF = e18Var2.f(null) | e18Var2.f(j5aVar) | e18Var2.c(32.0f) | e18Var2.f(oggVar) | e18Var2.f(gq5Var2);
        Object objN3 = e18Var2.N();
        if (zF || objN3 == lz1Var) {
            wn9[] wn9VarArr = a;
            wn9 wn9Var = wn9VarArr[0];
            griVar.getClass();
            wn9Var.getClass();
            o5a o5aVar = (o5a) griVar.a;
            if (o5aVar != null) {
                j5aVar.getClass();
                oggVar.getClass();
                gq5Var2.getClass();
                objN3 = new o5a(j5aVar, oggVar, gq5Var2, o5aVar.f);
            } else {
                j5aVar.getClass();
                oggVar.getClass();
                gq5Var2.getClass();
                objN3 = new o5a(j5aVar, oggVar, gq5Var2, new yl4());
            }
            wn9VarArr[0].getClass();
            griVar.a = objN3;
            e18Var2.k0(objN3);
        }
        return (o5a) objN3;
    }
}
