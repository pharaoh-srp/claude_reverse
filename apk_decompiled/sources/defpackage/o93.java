package defpackage;

import com.anthropic.claude.api.model.ThinkingState;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class o93 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ r93 G;
    public final /* synthetic */ String H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o93(r93 r93Var, String str, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = r93Var;
        this.H = str;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        String str = this.H;
        r93 r93Var = this.G;
        switch (i) {
            case 0:
                return new o93(r93Var, str, tp4Var, 0);
            default:
                return new o93(r93Var, str, tp4Var, 1);
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
        return ((o93) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        String str = this.H;
        r93 r93Var = this.G;
        m45 m45Var = m45.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 != 0) {
                    if (i2 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        sf5.h0(obj);
                    }
                    break;
                } else {
                    sf5.h0(obj);
                    this.F = 1;
                    if (r93Var.l(str, this) == m45Var) {
                    }
                }
                break;
            default:
                int i3 = this.F;
                if (i3 != 0) {
                    if (i3 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        sf5.h0(obj);
                    }
                    break;
                } else {
                    sf5.h0(obj);
                    this.F = 1;
                    if ((((List) r93Var.z.getValue()).isEmpty() ? ieiVar : r93Var.k(new ThinkingState.Effort(str, null), this)) == m45Var) {
                    }
                }
                break;
        }
        return ieiVar;
    }
}
