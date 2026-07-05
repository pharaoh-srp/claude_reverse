package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class y99 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ ybg G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y99(ybg ybgVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = ybgVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                return new y99(this.G, tp4Var, 0);
            case 1:
                return new y99(this.G, tp4Var, 1);
            case 2:
                return new y99(this.G, tp4Var, 2);
            case 3:
                return new y99(this.G, tp4Var, 3);
            case 4:
                return new y99(this.G, tp4Var, 4);
            case 5:
                return new y99(this.G, tp4Var, 5);
            default:
                return new y99(this.G, tp4Var, 6);
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
        return ((y99) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        ybg ybgVar = this.G;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    this.F = 1;
                    if (ybg.b(ybgVar, "Account ID copied", null, this, 14) == m45Var) {
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
                    this.F = 1;
                    if (ybg.b(ybgVar, "Organization ID copied", null, this, 14) == m45Var) {
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
                    this.F = 1;
                    if (ybg.b(ybgVar, "App restart required", null, this, 14) == m45Var) {
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
                    this.F = 1;
                    if (ybg.b(ybgVar, "Restart required. Caution: if there is no available play store update you will be locked in upgrade screen until clearing app data.", null, this, 14) == m45Var) {
                    }
                } else if (i5 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            case 4:
                int i6 = this.F;
                if (i6 == 0) {
                    sf5.h0(obj);
                    this.F = 1;
                    if (ybg.b(ybgVar, "Model notices reset", null, this, 14) == m45Var) {
                    }
                } else if (i6 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            case 5:
                int i7 = this.F;
                if (i7 == 0) {
                    sf5.h0(obj);
                    this.F = 1;
                    if (ybg.b(ybgVar, "NUX states reset", null, this, 14) == m45Var) {
                    }
                } else if (i7 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            default:
                int i8 = this.F;
                if (i8 == 0) {
                    sf5.h0(obj);
                    this.F = 1;
                    if (ybg.b(ybgVar, "Trusted device cleared. Next ELEVATED request will re-enroll.", null, this, 14) == m45Var) {
                    }
                } else if (i8 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
        }
        return m45Var;
    }
}
