package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class vf1 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ sih G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vf1(sih sihVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = sihVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        sih sihVar = this.G;
        switch (i) {
            case 0:
                return new vf1(sihVar, tp4Var, 0);
            case 1:
                return new vf1(sihVar, tp4Var, 1);
            case 2:
                return new vf1(sihVar, tp4Var, 2);
            case 3:
                vf1 vf1Var = new vf1(sihVar, tp4Var, 3);
                long j = ((fcc) obj).a;
                return vf1Var;
            default:
                return new vf1(sihVar, tp4Var, 4);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                return ((vf1) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 1:
                return ((vf1) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 2:
                return ((vf1) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 3:
                long j = ((fcc) obj).a;
                return new vf1(this.G, (tp4) obj2, 3).invokeSuspend(ieiVar);
            default:
                return ((vf1) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
        }
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        sih sihVar = this.G;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    this.F = 1;
                    sihVar.j(true, this);
                    if (ieiVar == m45Var) {
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
                    if (sihVar.y(this) == m45Var) {
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
                    sihVar.k(this);
                    if (ieiVar == m45Var) {
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
                    sihVar.G();
                    if (ieiVar != m45Var) {
                    }
                } else if (i5 == 1) {
                    sf5.h0(obj);
                } else if (i5 != 2) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                p5d p5dVar = sihVar.g;
                i5i i5iVar = sihVar.a;
                if (p5dVar != null) {
                    CharSequence charSequence = i5iVar.d().G;
                    long j = i5iVar.d().H;
                    this.F = 2;
                    Object objC = p5dVar.c(charSequence, j, this);
                    if (objC != m45Var) {
                        objC = ieiVar;
                    }
                    if (objC != m45Var) {
                    }
                }
                break;
            default:
                int i6 = this.F;
                if (i6 == 0) {
                    sf5.h0(obj);
                    this.F = 1;
                    if (sihVar.F(this) == m45Var) {
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
