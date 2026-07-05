package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class yi4 extends xzg implements sz7 {
    public int E;
    public /* synthetic */ String F;
    public /* synthetic */ g56 G;
    public /* synthetic */ String H;
    public final /* synthetic */ swa I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yi4(swa swaVar, tp4 tp4Var) {
        super(4, tp4Var);
        this.I = swaVar;
    }

    @Override // defpackage.sz7
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        yi4 yi4Var = new yi4(this.I, (tp4) obj4);
        yi4Var.F = (String) obj;
        yi4Var.G = (g56) obj2;
        yi4Var.H = (String) obj3;
        return yi4Var.invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        String str = this.F;
        g56 g56Var = this.G;
        String str2 = this.H;
        int i = this.E;
        if (i != 0) {
            if (i == 1) {
                sf5.h0(obj);
                return obj;
            }
            sz6.j("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        sf5.h0(obj);
        String str3 = g56Var.a.E;
        Integer num = new Integer(50);
        String str4 = g56Var.b;
        if (bsg.I0(str4)) {
            str4 = null;
        }
        f56 f56Var = g56Var.c;
        String str5 = f56Var != null ? f56Var.E : null;
        this.F = null;
        this.G = null;
        this.H = null;
        this.E = 1;
        Object objB = this.I.b("https://api.anthropic.com/api/directory/servers", str, str3, num, str4, str2, str5, "remote", this);
        m45 m45Var = m45.E;
        return objB == m45Var ? m45Var : objB;
    }
}
