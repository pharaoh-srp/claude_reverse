package defpackage;

import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes3.dex */
public final class yi9 extends gre implements rz7 {
    public int F;
    public /* synthetic */ bp5 G;
    public final /* synthetic */ aj9 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yi9(aj9 aj9Var, tp4 tp4Var) {
        super(3, tp4Var);
        this.H = aj9Var;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        yi9 yi9Var = new yi9(this.H, (tp4) obj3);
        yi9Var.G = (bp5) obj;
        return yi9Var.invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        aj9 aj9Var = this.H;
        y1 y1Var = aj9Var.a;
        bp5 bp5Var = this.G;
        int i = this.F;
        if (i == 0) {
            sf5.h0(obj);
            byte bV = y1Var.v();
            if (bV == 1) {
                return aj9Var.d(true);
            }
            if (bV == 0) {
                return aj9Var.d(false);
            }
            if (bV != 6) {
                if (bV == 8) {
                    return aj9Var.c();
                }
                y1.q(y1Var, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
            this.G = null;
            this.F = 1;
            obj = aj9.a(aj9Var, bp5Var, this);
            m45 m45Var = m45.E;
            if (obj == m45Var) {
                return m45Var;
            }
        } else {
            if (i != 1) {
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sf5.h0(obj);
        }
        return (JsonElement) obj;
    }
}
