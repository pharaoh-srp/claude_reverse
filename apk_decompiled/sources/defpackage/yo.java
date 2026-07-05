package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class yo extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ ep G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yo(ep epVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = epVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        ep epVar = this.G;
        switch (i) {
            case 0:
                return new yo(epVar, tp4Var, 0);
            case 1:
                return new yo(epVar, tp4Var, 1);
            case 2:
                return new yo(epVar, tp4Var, 2);
            default:
                return new yo(epVar, tp4Var, 3);
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
        return ((yo) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        m45 m45Var = m45.E;
        ep epVar = this.G;
        tp4 tp4Var = null;
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
                jwf jwfVar = epVar.b;
                this.F = 1;
                Object objJ = jwf.j(jwfVar, null, null, null, false, this, 31);
                return objJ == m45Var ? m45Var : objJ;
            case 1:
                int i3 = this.F;
                if (i3 != 0) {
                    if (i3 == 1) {
                        sf5.h0(obj);
                        return obj;
                    }
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sf5.h0(obj);
                jwf jwfVar2 = epVar.b;
                List listW = x44.W("cowork-local");
                this.F = 1;
                Object objJ2 = jwf.j(jwfVar2, null, null, listW, false, this, 23);
                return objJ2 == m45Var ? m45Var : objJ2;
            case 2:
                int i4 = this.F;
                if (i4 == 0) {
                    sf5.h0(obj);
                    this.F = 1;
                    return ep.O(epVar, this) == m45Var ? m45Var : ieiVar;
                }
                if (i4 == 1) {
                    sf5.h0(obj);
                    return ieiVar;
                }
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                int i5 = this.F;
                if (i5 == 0) {
                    sf5.h0(obj);
                    this.F = 1;
                    if (epVar.R(this) == m45Var) {
                        return m45Var;
                    }
                } else {
                    if (i5 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sf5.h0(obj);
                }
                if (epVar.m) {
                    return ieiVar;
                }
                epVar.m = true;
                gb9.D(epVar.a, null, null, new yo(epVar, tp4Var, 2), 3);
                return ieiVar;
        }
    }
}
