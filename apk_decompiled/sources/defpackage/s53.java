package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class s53 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ t53 G;
    public final /* synthetic */ w1i H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s53(t53 t53Var, w1i w1iVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = t53Var;
        this.H = w1iVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        w1i w1iVar = this.H;
        t53 t53Var = this.G;
        switch (i) {
            case 0:
                return new s53(t53Var, w1iVar, tp4Var, 0);
            case 1:
                return new s53(t53Var, w1iVar, tp4Var, 1);
            default:
                return new s53(t53Var, w1iVar, tp4Var, 2);
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
        return ((s53) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        w1i w1iVar = this.H;
        t53 t53Var = this.G;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    x97 x97Var = t53Var.K;
                    String str = w1iVar.a;
                    this.F = 1;
                    if (x97Var.e(x97Var.k, "android-chat-tooltip", str, lm6.E, true, this) == m45Var) {
                    }
                } else if (i2 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            case 1:
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    x97 x97Var2 = t53Var.K;
                    String str2 = w1iVar.a;
                    this.F = 1;
                    if (x97Var2.f(x97Var2.k, "android-chat-tooltip", str2, this) == m45Var) {
                    }
                } else if (i3 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            default:
                int i4 = this.F;
                if (i4 == 0) {
                    sf5.h0(obj);
                    x97 x97Var3 = t53Var.K;
                    String str3 = w1iVar.a;
                    this.F = 1;
                    if (x97.j(x97Var3, str3, this) == m45Var) {
                    }
                } else if (i4 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
        }
        return m45Var;
    }
}
