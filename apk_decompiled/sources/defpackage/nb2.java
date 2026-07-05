package defpackage;

import com.anthropic.claude.analytics.events.MemoryEvents$MemoryReset;
import com.anthropic.claude.analytics.events.MemoryEvents$MemoryToggleFailure;
import com.anthropic.claude.api.memory.MemorySynthesisResponse;
import com.anthropic.claude.api.result.ApiResult;
import com.anthropic.claude.core.telemetry.SilentException;
import com.anthropic.claude.ui.components.snackbar.a;

/* JADX INFO: loaded from: classes2.dex */
public final class nb2 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ qb2 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nb2(qb2 qb2Var, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = qb2Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        qb2 qb2Var = this.G;
        switch (i) {
            case 0:
                return new nb2(qb2Var, tp4Var, 0);
            case 1:
                return new nb2(qb2Var, tp4Var, 1);
            case 2:
                return new nb2(qb2Var, tp4Var, 2);
            default:
                return new nb2(qb2Var, tp4Var, 3);
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
        return ((nb2) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        boolean z = false;
        iei ieiVar = iei.a;
        m45 m45Var = m45.E;
        qb2 qb2Var = this.G;
        tp4 tp4Var = null;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 != 0) {
                    if (i2 == 1) {
                        sf5.h0(obj);
                        return ieiVar;
                    }
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sf5.h0(obj);
                zy1 zy1Var = qb2Var.b.v;
                zy1 zy1Var2 = qb2Var.l;
                this.F = 1;
                return x44.I(zy1Var, zy1Var2, this) == m45Var ? m45Var : ieiVar;
            case 1:
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    qb2Var.p.setValue(Boolean.TRUE);
                    kab kabVar = qb2Var.f;
                    String strM116getUuidXjkXN6I = qb2Var.d.e().m116getUuidXjkXN6I();
                    this.F = 1;
                    obj = kabVar.a(strM116getUuidXjkXN6I, null, this);
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
                ApiResult apiResult = (ApiResult) obj;
                boolean z2 = apiResult instanceof of0;
                if (!z2) {
                    if (!(apiResult instanceof nf0)) {
                        wg6.i();
                    }
                    return null;
                }
                qb2Var.o.setValue((MemorySynthesisResponse) ((of0) apiResult).b);
                if (!z2) {
                    if (!(apiResult instanceof nf0)) {
                        wg6.i();
                        return null;
                    }
                    SilentException.a(new SilentException(((nf0) apiResult).toString()), null, false, 3);
                }
                qb2Var.p.setValue(Boolean.FALSE);
                return ieiVar;
            case 2:
                int i4 = this.F;
                if (i4 == 0) {
                    sf5.h0(obj);
                    q0i q0iVar = qb2Var.b;
                    this.F = 1;
                    return q0iVar.e(this) == m45Var ? m45Var : ieiVar;
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
                    bcb bcbVar = qb2Var.g;
                    this.F = 1;
                    obj = bcbVar.a(this);
                    if (obj == m45Var) {
                        return m45Var;
                    }
                } else {
                    if (i5 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sf5.h0(obj);
                }
                ApiResult apiResult2 = (ApiResult) obj;
                boolean z3 = apiResult2 instanceof of0;
                if (!z3) {
                    if (!(apiResult2 instanceof nf0)) {
                        wg6.i();
                    }
                    return null;
                }
                qb2Var.e.e(new MemoryEvents$MemoryReset(), MemoryEvents$MemoryReset.Companion.serializer());
                if (qb2Var.U()) {
                    gb9.D(qb2Var.a, null, null, new ob2(qb2Var, z, tp4Var, 7), 3);
                }
                if (!z3) {
                    if (!(apiResult2 instanceof nf0)) {
                        wg6.i();
                        return null;
                    }
                    qb2Var.e.e(new MemoryEvents$MemoryToggleFailure(true), MemoryEvents$MemoryToggleFailure.Companion.serializer());
                }
                a.a(apiResult2, qb2Var.l);
                return ieiVar;
        }
    }
}
