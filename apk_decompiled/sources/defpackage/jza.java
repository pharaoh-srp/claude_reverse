package defpackage;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes3.dex */
public final class jza extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ vza G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jza(vza vzaVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = vzaVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        vza vzaVar = this.G;
        switch (i) {
            case 0:
                return new jza(vzaVar, tp4Var, 0);
            default:
                return new jza(vzaVar, tp4Var, 1);
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
        return ((jza) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        m45 m45Var = m45.E;
        vza vzaVar = this.G;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 != 0) {
                    if (i2 == 1) {
                        sf5.h0(obj);
                        return obj;
                    }
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sf5.h0(obj);
                b3f b3fVarD0 = mpk.d0(new fza(vzaVar, 2));
                f41 f41Var = new f41(2, null, 4);
                this.F = 1;
                Object objH = j8.H(b3fVarD0, f41Var, this);
                return objH == m45Var ? m45Var : objH;
            default:
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    b3f b3fVarD02 = mpk.d0(new fza(vzaVar, 3));
                    zl2 zl2Var = new zl2(2, null, 14);
                    this.F = 1;
                    if (j8.H(b3fVarD02, zl2Var, this) == m45Var) {
                        return m45Var;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            sf5.h0(obj);
                            return iei.a;
                        }
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sf5.h0(obj);
                }
                long jElapsedRealtime = 15000 - (SystemClock.elapsedRealtime() - vzaVar.o);
                if (jElapsedRealtime > 0) {
                    this.F = 2;
                    if (d4c.K(jElapsedRealtime, this) == m45Var) {
                        return m45Var;
                    }
                }
                return iei.a;
        }
    }
}
