package defpackage;

import androidx.compose.material3.internal.ripple.RippleNode;

/* JADX INFO: loaded from: classes2.dex */
public final class kj1 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ float H;
    public final /* synthetic */ Object I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kj1(iwe iweVar, dhg dhgVar, float f, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.I = iweVar;
        this.G = dhgVar;
        this.H = f;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Object obj2 = this.G;
        Object obj3 = this.I;
        switch (i) {
            case 0:
                return new kj1((mj1) obj3, (dhg) obj2, this.H, tp4Var, 0);
            case 1:
                return new kj1((a09) obj3, (dhg) obj2, this.H, tp4Var, 1);
            case 2:
                return new kj1((RippleNode) obj3, this.H, (mb0) obj2, tp4Var, 2);
            case 3:
                return new kj1((l5j) obj3, (dhg) obj2, this.H, tp4Var, 3);
            default:
                return new kj1((gkj) obj3, this.H, (yig) obj2, tp4Var, 4);
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
        return ((kj1) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj2 = this.G;
        float f = this.H;
        Object obj3 = this.I;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    this.F = 1;
                    if (((mj1) obj3).h.b((dhg) obj2, f, this) == m45Var) {
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
                    if (((a09) obj3).d.b((dhg) obj2, f, this) == m45Var) {
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
                    if (a80.c(((RippleNode) obj3).a0, new Float(f), (mb0) obj2, null, this, 12) == m45Var) {
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
                    if (((l5j) obj3).b.b((dhg) obj2, f, this) == m45Var) {
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
                    this.F = 1;
                    if (a80.c(((gkj) obj3).b, new Float(f), (yig) obj2, null, this, 12) == m45Var) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kj1(Object obj, float f, mb0 mb0Var, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.I = obj;
        this.H = f;
        this.G = mb0Var;
    }
}
