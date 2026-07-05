package defpackage;

import com.anthropic.claude.conway.protocol.b0;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ey4 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public /* synthetic */ Object G;
    public final /* synthetic */ b0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ey4(b0 b0Var, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.H = b0Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        b0 b0Var = this.H;
        switch (i) {
            case 0:
                ey4 ey4Var = new ey4(b0Var, tp4Var, 0);
                ey4Var.G = obj;
                return ey4Var;
            default:
                ey4 ey4Var2 = new ey4(b0Var, tp4Var, 1);
                ey4Var2.G = obj;
                return ey4Var2;
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
        return ((ey4) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        Object hreVar;
        Object hreVar2;
        int i = this.E;
        b0 b0Var = this.H;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                int i2 = this.F;
                try {
                    if (i2 == 0) {
                        sf5.h0(obj);
                        this.G = null;
                        this.F = 1;
                        obj = gb9.c0(b0Var.d.b(), new mz4(b0Var, null, 0), this);
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
                    hreVar = (List) obj;
                    break;
                } catch (Throwable th) {
                    hreVar = new hre(th);
                }
                return new jre(hreVar);
            default:
                int i3 = this.F;
                try {
                    if (i3 == 0) {
                        sf5.h0(obj);
                        this.G = null;
                        this.F = 1;
                        obj = b0Var.l(this);
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
                    hreVar2 = (List) obj;
                    break;
                } catch (Throwable th2) {
                    hreVar2 = new hre(th2);
                }
                return new jre(hreVar2);
        }
    }
}
