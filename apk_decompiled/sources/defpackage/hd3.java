package defpackage;

import com.anthropic.claude.api.common.ConsistencyLevel;

/* JADX INFO: loaded from: classes.dex */
public final class hd3 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ vd3 G;
    public final /* synthetic */ ConsistencyLevel H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hd3(vd3 vd3Var, ConsistencyLevel consistencyLevel, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = vd3Var;
        this.H = consistencyLevel;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                return new hd3(this.G, this.H, tp4Var, 0);
            default:
                return new hd3(this.G, this.H, tp4Var, 1);
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
        return ((hd3) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        vd3 vd3Var = this.G;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    dl2 dl2Var = vd3Var.a;
                    String str = vd3Var.b.e;
                    Integer num = new Integer(100);
                    this.F = 1;
                    Object objU = dl2Var.u(str, this.H, null, (36 & 8) != 0 ? null : num, (36 & 16) != 0 ? null : null, (36 & 32) != 0 ? null : Boolean.TRUE, this);
                    if (objU == m45Var) {
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
                    dl2 dl2Var2 = vd3Var.a;
                    String str2 = vd3Var.b.e;
                    this.F = 1;
                    Object objU2 = dl2Var2.u(str2, this.H, null, (36 & 8) != 0 ? null : null, (36 & 16) != 0 ? null : null, (36 & 32) != 0 ? null : Boolean.TRUE, this);
                    if (objU2 == m45Var) {
                    }
                } else if (i3 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
        }
        return m45Var;
    }
}
