package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class i68 extends xzg implements sz7 {
    public final /* synthetic */ int E;
    public int F;
    public /* synthetic */ wm0 G;
    public final /* synthetic */ Object H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i68(Object obj, tp4 tp4Var, int i) {
        super(4, tp4Var);
        this.E = i;
        this.H = obj;
    }

    @Override // defpackage.sz7
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj5 = this.H;
        wm0 wm0Var = (wm0) obj2;
        ((Boolean) obj3).getClass();
        tp4 tp4Var = (tp4) obj4;
        switch (i) {
            case 0:
                i68 i68Var = new i68((Bundle) obj5, tp4Var, 0);
                i68Var.G = wm0Var;
                return i68Var.invokeSuspend(ieiVar);
            default:
                i68 i68Var2 = new i68((String) obj5, tp4Var, 1);
                i68Var2.G = wm0Var;
                return i68Var2.invokeSuspend(ieiVar);
        }
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        Object obj2 = this.H;
        m45 m45Var = m45.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    wm0 wm0Var = this.G;
                    this.F = 1;
                    wm0Var.getClass();
                    Object objE = wm0Var.e(new pm0((Bundle) obj2), this);
                    if (objE != m45Var) {
                        objE = ieiVar;
                    }
                    if (objE == m45Var) {
                        return m45Var;
                    }
                } else {
                    if (i2 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sf5.h0(obj);
                }
                return ieiVar;
            default:
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    wm0 wm0Var2 = this.G;
                    this.F = 1;
                    wm0Var2.getClass();
                    Object objE2 = wm0Var2.e(new om0((String) obj2), this);
                    if (objE2 != m45Var) {
                        objE2 = ieiVar;
                    }
                    if (objE2 == m45Var) {
                        return m45Var;
                    }
                } else {
                    if (i3 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sf5.h0(obj);
                }
                return ieiVar;
        }
    }
}
