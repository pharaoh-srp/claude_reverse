package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class w9f extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ z9f G;
    public final /* synthetic */ long H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w9f(z9f z9fVar, long j, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = z9fVar;
        this.H = j;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                return new w9f(this.G, this.H, tp4Var, 0);
            case 1:
                return new w9f(this.G, this.H, tp4Var, 1);
            default:
                return new w9f(this.G, this.H, tp4Var, 2);
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
        return ((w9f) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        long j = this.H;
        z9f z9fVar = this.G;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    raf rafVar = z9fVar.r0;
                    n61 n61Var = new n61(j, null);
                    this.F = 1;
                    if (rafVar.f(zwb.F, n61Var, this) == m45Var) {
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
                    raf rafVar2 = z9fVar.r0;
                    this.F = 1;
                    if (rafVar2.b(j, false, this) == m45Var) {
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
                    raf rafVar3 = z9fVar.r0;
                    this.F = 1;
                    if (rafVar3.b(j, true, this) == m45Var) {
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
