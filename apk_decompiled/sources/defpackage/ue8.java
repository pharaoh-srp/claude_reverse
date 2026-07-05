package defpackage;

import com.anthropic.claude.R;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class ue8 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public /* synthetic */ Object G;
    public final /* synthetic */ pz7 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ue8(pz7 pz7Var, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.H = pz7Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                ue8 ue8Var = new ue8(this.H, tp4Var, 0);
                ue8Var.G = obj;
                return ue8Var;
            case 1:
                ue8 ue8Var2 = new ue8(this.H, tp4Var, 1);
                ue8Var2.G = obj;
                return ue8Var2;
            default:
                ue8 ue8Var3 = new ue8(this.H, tp4Var, 2);
                ue8Var3.G = obj;
                return ue8Var3;
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                return ((ue8) create((f09) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 1:
                return ((ue8) create((yvb) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            default:
                return ((ue8) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
        }
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        pz7 pz7Var = this.H;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                f09 f09Var = (f09) this.G;
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    if (x44.r(f09Var, e09.a) || x44.r(f09Var, d09.a)) {
                        pt6 pt6Var = new pt6(R.string.incomingshare_error_unknown_attachment);
                        this.G = null;
                        this.F = 1;
                        return pz7Var.invoke(pt6Var, this) == m45Var ? m45Var : ieiVar;
                    }
                    mr9.b();
                } else {
                    if (i2 == 1) {
                        sf5.h0(obj);
                        return ieiVar;
                    }
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 1:
                yvb yvbVar = (yvb) this.G;
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    this.G = null;
                    this.F = 1;
                    obj = pz7Var.invoke(yvbVar, this);
                    if (obj == m45Var) {
                        return m45Var;
                    }
                } else {
                    if (i3 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sf5.h0(obj);
                }
                yvb yvbVar2 = (yvb) obj;
                yvbVar2.getClass();
                ((AtomicBoolean) yvbVar2.b.F).set(true);
                return yvbVar2;
            default:
                int i4 = this.F;
                if (i4 == 0) {
                    sf5.h0(obj);
                    l45 l45Var = (l45) this.G;
                    this.F = 1;
                    return pz7Var.invoke(l45Var, this) == m45Var ? m45Var : ieiVar;
                }
                if (i4 == 1) {
                    sf5.h0(obj);
                    return ieiVar;
                }
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
