package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class c03 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ f03 G;
    public final /* synthetic */ String H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c03(f03 f03Var, String str, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = f03Var;
        this.H = str;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        String str = this.H;
        f03 f03Var = this.G;
        switch (i) {
            case 0:
                return new c03(f03Var, str, tp4Var, 0);
            default:
                return new c03(f03Var, str, tp4Var, 1);
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
        return ((c03) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        String str = this.H;
        f03 f03Var = this.G;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    wqd wqdVar = f03Var.h;
                    gnd gndVar = (gnd) f03Var.r.getValue();
                    this.F = 1;
                    obj = wqdVar.p(gndVar, str, this);
                    if (obj == m45Var) {
                        return m45Var;
                    }
                } else {
                    if (i2 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sf5.h0(obj);
                }
                List list = (List) obj;
                if (list == null || !x44.r(f03Var.P(), str)) {
                    return ieiVar;
                }
                f03Var.Q(list);
                return ieiVar;
            default:
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    f9 f9Var = f03Var.b;
                    this.F = 1;
                    return f9Var.i(str, this) == m45Var ? m45Var : ieiVar;
                }
                if (i3 == 1) {
                    sf5.h0(obj);
                    return ieiVar;
                }
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
