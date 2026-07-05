package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class snj extends e88 implements q08, iyf {
    public static final nyj k = new nyj("ClientTelemetry.API", new rnj(0), new lz1(13));
    public static final nyj l = new nyj("LocationServices.API", new rnj(1), new lz1(13));

    public r5l d(int i, fnf fnfVar) {
        x9c x9cVar = new x9c();
        x9cVar.i(i);
        jd5 jd5VarD = x9cVar.d();
        if (fnfVar != null) {
            dgj.n("cancellationToken may not be already canceled", !fnfVar.i());
        }
        w19 w19VarB = w19.b();
        w19VarB.c = new ire(jd5VarD, 10, fnfVar);
        w19VarB.b = 2415;
        r5l r5lVarC = c(0, w19VarB.a());
        if (fnfVar == null) {
            return r5lVarC;
        }
        j5h j5hVar = new j5h(fnfVar);
        xzd xzdVar = new xzd(28, j5hVar);
        r5lVarC.getClass();
        r5lVarC.j(y5h.a, xzdVar);
        return j5hVar.a;
    }

    public r5l e(ibh ibhVar) {
        w19 w19VarB = w19.b();
        w19VarB.d = new jf7[]{j8.h};
        w19VarB.a = false;
        w19VarB.c = new bnh(4, ibhVar);
        return c(2, w19VarB.a());
    }
}
