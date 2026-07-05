package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nec extends m08 implements rz7 {
    public static final nec E = new nec(3, oec.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        oec oecVar = (oec) obj;
        agf agfVar = (agf) obj2;
        long j = oecVar.a;
        iei ieiVar = iei.a;
        if (j <= 0) {
            ((zff) agfVar).I = ieiVar;
            return ieiVar;
        }
        j01 j01Var = new j01(agfVar, 12, oecVar);
        agfVar.getClass();
        zff zffVar = (zff) agfVar;
        c45 c45Var = zffVar.E;
        zffVar.G = d4c.R(c45Var).P(j, j01Var, c45Var);
        return ieiVar;
    }
}
