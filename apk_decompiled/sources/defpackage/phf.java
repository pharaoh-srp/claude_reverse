package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class phf {
    public final /* synthetic */ int a;

    public /* synthetic */ phf(int i) {
        this.a = i;
    }

    public final ohf a(iif iifVar) {
        nhf nhfVarB;
        nhf nhfVarE;
        nhf nhfVarC;
        nhf nhfVarB2;
        int i = this.a;
        hc5 hc5Var = hc5.E;
        switch (i) {
            case 0:
                return new ohf(iifVar.j().a(iifVar.j().d()), iifVar.h().a(iifVar.h().c()), iifVar.i() == hc5Var);
            case 1:
                return wvk.i(new ohf(iifVar.j().a(iifVar.j().d()), iifVar.h().a(iifVar.h().c()), iifVar.i() == hc5Var), iifVar);
            case 2:
                return wvk.c(iifVar, lyk.V);
            case 3:
                return wvk.c(iifVar, tqh.S);
            default:
                ohf ohfVarD = iifVar.d();
                if (ohfVarD == null) {
                    return wvk.c(iifVar, lyk.V);
                }
                if (iifVar.a()) {
                    nhfVarB = ohfVarD.c();
                    nhfVarE = wvk.e(iifVar, iifVar.j(), nhfVarB);
                    nhfVarB2 = ohfVarD.b();
                    nhfVarC = nhfVarE;
                } else {
                    nhfVarB = ohfVarD.b();
                    nhfVarE = wvk.e(iifVar, iifVar.h(), nhfVarB);
                    nhfVarC = ohfVarD.c();
                    nhfVarB2 = nhfVarE;
                }
                if (x44.r(nhfVarE, nhfVarB)) {
                    return ohfVarD;
                }
                if (iifVar.i() != hc5Var && (iifVar.i() != hc5.G || nhfVarC.a() <= nhfVarB2.a())) {
                    z = false;
                }
                return wvk.i(new ohf(nhfVarC, nhfVarB2, z), iifVar);
        }
    }
}
