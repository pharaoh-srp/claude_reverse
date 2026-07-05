package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes3.dex */
public final class bkj extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ gkj G;
    public /* synthetic */ long H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bkj(gkj gkjVar, long j, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = gkjVar;
        this.H = j;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                return new bkj(this.G, this.H, tp4Var, 0);
            case 1:
                return new bkj(this.G, this.H, tp4Var, 1);
            case 2:
                return new bkj(this.G, this.H, tp4Var, 2);
            case 3:
                return new bkj(this.G, this.H, tp4Var, 3);
            default:
                bkj bkjVar = new bkj(this.G, tp4Var);
                bkjVar.H = ((fcc) obj).a;
                return bkjVar;
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                return ((bkj) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 1:
                return ((bkj) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 2:
                return ((bkj) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 3:
                return ((bkj) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            default:
                long j = ((fcc) obj).a;
                bkj bkjVar = new bkj(this.G, (tp4) obj2);
                bkjVar.H = j;
                return bkjVar.invokeSuspend(ieiVar);
        }
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        gkj gkjVar = this.G;
        m45 m45Var = m45.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 != 0) {
                    if (i2 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        sf5.h0(obj);
                    }
                    break;
                } else {
                    sf5.h0(obj);
                    a80 a80Var = gkjVar.c;
                    Float f = new Float(fcc.f(this.H));
                    this.F = 1;
                    if (a80Var.g(this, f) == m45Var) {
                    }
                }
                break;
            case 1:
                int i3 = this.F;
                if (i3 != 0) {
                    if (i3 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        sf5.h0(obj);
                    }
                    break;
                } else {
                    sf5.h0(obj);
                    a80 a80Var2 = gkjVar.d;
                    Float f2 = new Float(fcc.g(this.H));
                    this.F = 1;
                    if (a80Var2.g(this, f2) == m45Var) {
                    }
                }
                break;
            case 2:
                int i4 = this.F;
                if (i4 != 0) {
                    if (i4 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        sf5.h0(obj);
                    }
                    break;
                } else {
                    sf5.h0(obj);
                    a80 a80Var3 = gkjVar.c;
                    Float f3 = new Float(qsi.d(this.H));
                    zn5 zn5Var = gkjVar.a;
                    this.F = 1;
                    if (a80.b(a80Var3, f3, zn5Var, this) == m45Var) {
                    }
                }
                break;
            case 3:
                int i5 = this.F;
                if (i5 != 0) {
                    if (i5 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        sf5.h0(obj);
                    }
                    break;
                } else {
                    sf5.h0(obj);
                    a80 a80Var4 = gkjVar.d;
                    Float f4 = new Float(qsi.e(this.H));
                    zn5 zn5Var2 = gkjVar.a;
                    this.F = 1;
                    if (a80.b(a80Var4, f4, zn5Var2, this) == m45Var) {
                    }
                }
                break;
            default:
                int i6 = this.F;
                if (i6 != 0) {
                    if (i6 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        sf5.h0(obj);
                    }
                    break;
                } else {
                    sf5.h0(obj);
                    long j = this.H;
                    this.F = 1;
                    yig yigVarK = kxk.K(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, null, 7);
                    gkj gkjVar2 = this.G;
                    Object objN = fd9.N(new ekj(gkjVar2.c() == 1.0f ? 2.5f : 1.0f, gkjVar2, j, yigVarK, null), this);
                    if (objN != m45Var) {
                        objN = ieiVar;
                    }
                    if (objN == m45Var) {
                    }
                }
                break;
        }
        return ieiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bkj(gkj gkjVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 4;
        this.G = gkjVar;
    }
}
