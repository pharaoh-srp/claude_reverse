package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class tg4 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public zhd F;
    public int G;
    public /* synthetic */ Object H;
    public final /* synthetic */ Context I;
    public final /* synthetic */ String J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tg4(Context context, String str, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.I = context;
        this.J = str;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                tg4 tg4Var = new tg4(this.I, this.J, tp4Var, 0);
                tg4Var.H = obj;
                return tg4Var;
            default:
                tg4 tg4Var2 = new tg4(this.I, this.J, tp4Var, 1);
                tg4Var2.H = obj;
                return tg4Var2;
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        zhd zhdVar = (zhd) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
        }
        return ((tg4) create(zhdVar, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.E;
        iei ieiVar = iei.a;
        String str = this.J;
        Context context = this.I;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                zhd zhdVar = (zhd) this.H;
                int i2 = this.G;
                if (i2 == 0) {
                    sf5.h0(obj);
                    ft5 ft5Var = g86.a;
                    vr5 vr5Var = vr5.G;
                    sg4 sg4Var = new sg4(context, str, null, 0);
                    this.H = null;
                    this.F = zhdVar;
                    this.G = 1;
                    obj = gb9.c0(vr5Var, sg4Var, this);
                    if (obj == m45Var) {
                    }
                } else if (i2 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    zhdVar = this.F;
                    sf5.h0(obj);
                }
                zhdVar.setValue(obj);
                break;
            default:
                zhd zhdVar2 = (zhd) this.H;
                int i3 = this.G;
                if (i3 == 0) {
                    sf5.h0(obj);
                    ft5 ft5Var2 = g86.a;
                    vr5 vr5Var2 = vr5.G;
                    sg4 sg4Var2 = new sg4(context, str, null, 1);
                    this.H = null;
                    this.F = zhdVar2;
                    this.G = 1;
                    obj = gb9.c0(vr5Var2, sg4Var2, this);
                    if (obj == m45Var) {
                    }
                } else if (i3 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    zhdVar2 = this.F;
                    sf5.h0(obj);
                }
                zhdVar2.setValue(obj);
                break;
        }
        return ieiVar;
    }
}
