package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mri extends ts9 implements bz7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ nri G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mri(nri nriVar, int i) {
        super(1);
        this.F = i;
        this.G = nriVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.F;
        iei ieiVar = iei.a;
        nri nriVar = this.G;
        switch (i) {
            case 0:
                nriVar.d = true;
                nriVar.f.a();
                return ieiVar;
            default:
                xd6 xd6Var = (xd6) obj;
                bb8 bb8Var = nriVar.b;
                float f = nriVar.k;
                float f2 = nriVar.l;
                fj0 fj0VarB0 = xd6Var.B0();
                long jW = fj0VarB0.w();
                fj0VarB0.p().g();
                try {
                    ((efe) fj0VarB0.E).C(0L, f, f2);
                    bb8Var.a(xd6Var);
                    return ieiVar;
                } finally {
                    grc.y(fj0VarB0, jW);
                }
        }
    }
}
