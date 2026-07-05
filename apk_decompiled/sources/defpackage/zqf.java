package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zqf extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ jrf G;
    public final /* synthetic */ String H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zqf(jrf jrfVar, String str, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = jrfVar;
        this.H = str;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        String str = this.H;
        jrf jrfVar = this.G;
        switch (i) {
            case 0:
                return new zqf(jrfVar, str, tp4Var, 0);
            default:
                return new zqf(jrfVar, str, tp4Var, 1);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        l45 l45Var = (l45) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
        }
        return ((zqf) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.E;
        jrf jrfVar = this.G;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 != 0) {
                    if (i2 == 1) {
                        sf5.h0(obj);
                        return obj;
                    }
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sf5.h0(obj);
                jwf jwfVar = jrfVar.a;
                Integer num = new Integer(((jf0) jrfVar.g).c());
                this.F = 1;
                Object objI = jwf.i(jwfVar, this.H, null, null, num, this, 6);
                return objI == m45Var ? m45Var : objI;
            default:
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    v84 v84Var = (v84) jrfVar.n.get(this.H);
                    if (v84Var != null) {
                        this.F = 1;
                        obj = v84Var.w(this);
                        if (obj == m45Var) {
                            return m45Var;
                        }
                    }
                    return vb7.i();
                }
                if (i3 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sf5.h0(obj);
                String str = (String) obj;
                if (str != null) {
                    return str;
                }
                return vb7.i();
        }
    }
}
