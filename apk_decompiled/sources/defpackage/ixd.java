package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final class ixd extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ lxd G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ixd(lxd lxdVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = lxdVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        lxd lxdVar = this.G;
        switch (i) {
            case 0:
                return new ixd(lxdVar, tp4Var, 0);
            default:
                return new ixd(lxdVar, tp4Var, 1);
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
        return ((ixd) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        lxd lxdVar = this.G;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    mxd mxdVar = lxdVar.X;
                    float f = lxdVar.U ? 1.0f : MTTypesetterKt.kLineSkipLimitMultiplier;
                    this.F = 1;
                    Object objG = mxdVar.a.g(this, new Float(f));
                    if (objG != m45Var) {
                        objG = ieiVar;
                    }
                    if (objG == m45Var) {
                    }
                } else if (i2 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            default:
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    if (lxdVar.U) {
                        this.F = 2;
                        if (lxd.s1(lxdVar, this) != m45Var) {
                        }
                    } else {
                        this.F = 1;
                        if (lxdVar.t1(this) != m45Var) {
                        }
                    }
                } else if (i3 == 1 || i3 == 2) {
                    sf5.h0(obj);
                } else {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                }
                break;
        }
        return m45Var;
    }
}
