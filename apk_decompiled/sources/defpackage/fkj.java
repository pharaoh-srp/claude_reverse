package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes3.dex */
public final class fkj extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ gkj G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fkj(gkj gkjVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = gkjVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                fkj fkjVar = new fkj(this.G, tp4Var, 0);
                fkjVar.F = obj;
                return fkjVar;
            default:
                fkj fkjVar2 = new fkj(this.G, tp4Var, 1);
                fkjVar2.F = obj;
                return fkjVar2;
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        l45 l45Var = (l45) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
            case 0:
                ((fkj) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                return ieiVar;
            default:
                return ((fkj) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
        }
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = 3;
        switch (this.E) {
            case 0:
                sf5.h0(obj);
                l45 l45Var = (l45) this.F;
                gkj gkjVar = this.G;
                fnf fnfVar = gkjVar.g;
                fnfVar.getClass();
                long jG = fnfVar.g(lvj.e(Float.MAX_VALUE, Float.MAX_VALUE));
                tp4 tp4Var = null;
                if (qsi.d(jG) != MTTypesetterKt.kLineSkipLimitMultiplier) {
                    gb9.D(l45Var, null, null, new bkj(gkjVar, jG, tp4Var, 2), 3);
                }
                if (qsi.e(jG) != MTTypesetterKt.kLineSkipLimitMultiplier) {
                    gb9.D(l45Var, null, null, new bkj(gkjVar, jG, tp4Var, 3), 3);
                }
                if (((Number) gkjVar.b.e()).floatValue() < 1.0f) {
                    gb9.D(l45Var, null, null, new nw8(gkjVar, tp4Var, 1), 3);
                }
                return iei.a;
            default:
                sf5.h0(obj);
                l45 l45Var2 = (l45) this.F;
                gkj gkjVar2 = this.G;
                tp4 tp4Var2 = null;
                gb9.D(l45Var2, null, null, new nw8(gkjVar2, tp4Var2, 2), 3);
                gkjVar2.c.i(new Float(MTTypesetterKt.kLineSkipLimitMultiplier), new Float(MTTypesetterKt.kLineSkipLimitMultiplier));
                gb9.D(l45Var2, null, null, new nw8(gkjVar2, tp4Var2, i), 3);
                gkjVar2.d.i(new Float(MTTypesetterKt.kLineSkipLimitMultiplier), new Float(MTTypesetterKt.kLineSkipLimitMultiplier));
                return gb9.D(l45Var2, null, null, new nw8(gkjVar2, tp4Var2, 4), 3);
        }
    }
}
