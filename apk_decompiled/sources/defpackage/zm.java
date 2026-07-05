package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class zm extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ an G;
    public final /* synthetic */ String H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zm(an anVar, String str, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = anVar;
        this.H = str;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        String str = this.H;
        an anVar = this.G;
        switch (i) {
            case 0:
                return new zm(anVar, str, tp4Var, 0);
            case 1:
                return new zm(anVar, str, tp4Var, 1);
            case 2:
                return new zm(anVar, str, tp4Var, 2);
            case 3:
                return new zm(anVar, str, tp4Var, 3);
            default:
                return new zm(anVar, str, tp4Var, 4);
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
        return ((zm) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        String str = this.H;
        an anVar = this.G;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    sl slVar = anVar.b;
                    this.F = 1;
                    if (((vm) slVar).l(str, true, true, this) == m45Var) {
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
                    sl slVar2 = anVar.b;
                    this.F = 1;
                    if (((vm) slVar2).l(str, true, false, this) == m45Var) {
                    }
                } else if (i3 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            case 2:
                int i4 = this.F;
                if (i4 == 0) {
                    sf5.h0(obj);
                    sl slVar3 = anVar.b;
                    this.F = 1;
                    if (((vm) slVar3).l(str, false, false, this) == m45Var) {
                    }
                } else if (i4 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            case 3:
                int i5 = this.F;
                if (i5 == 0) {
                    sf5.h0(obj);
                    sl slVar4 = anVar.b;
                    this.F = 1;
                    if (((vm) slVar4).n(str, this) == m45Var) {
                    }
                } else if (i5 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            default:
                int i6 = this.F;
                if (i6 == 0) {
                    sf5.h0(obj);
                    sl slVar5 = anVar.b;
                    this.F = 1;
                    if (((vm) slVar5).o(str, this) == m45Var) {
                    }
                } else if (i6 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
        }
        return m45Var;
    }
}
