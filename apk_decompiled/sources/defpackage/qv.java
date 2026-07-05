package defpackage;

import com.anthropic.claude.types.strings.ResearchTaskId;
import java.io.Serializable;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class qv extends xzg implements rz7 {
    public final /* synthetic */ int E = 0;
    public /* synthetic */ Serializable F;
    public /* synthetic */ Object G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qv(t53 t53Var, tp4 tp4Var, String str) {
        super(3, tp4Var);
        this.G = t53Var;
        this.F = str;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                qv qvVar = new qv(3, (tp4) obj3);
                qvVar.F = (String) obj;
                qvVar.G = (gnd) obj2;
                break;
            case 1:
                new qv((t53) this.G, (tp4) obj3, (String) this.F).invokeSuspend(ieiVar);
                break;
            case 2:
                qv qvVar2 = new qv((a0f) this.G, (tp4) obj3);
                qvVar2.F = (Throwable) obj2;
                qvVar2.invokeSuspend(ieiVar);
                break;
            default:
                new qv((z9e) this.F, (iqf) this.G, (tp4) obj3).invokeSuspend(ieiVar);
                break;
        }
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                String str = (String) this.F;
                gnd gndVar = (gnd) this.G;
                sf5.h0(obj);
                break;
            case 1:
                sf5.h0(obj);
                ((t53) this.G).F1.remove(ResearchTaskId.m1100boximpl((String) this.F));
                break;
            case 2:
                Throwable th = (Throwable) this.F;
                sf5.h0(obj);
                boolean z = th instanceof CancellationException;
                a0f a0fVar = (a0f) this.G;
                if (!z) {
                    a0fVar.g.m(null);
                    ((p5e) a0fVar.s()).a();
                } else {
                    a0f.r(a0fVar);
                }
                break;
            default:
                sf5.h0(obj);
                if (!((z9e) this.F).E) {
                    amg amgVar = ((iqf) this.G).f;
                    amgVar.getClass();
                    amgVar.n(null, mh4.a);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ qv(int i, tp4 tp4Var) {
        super(i, tp4Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qv(z9e z9eVar, iqf iqfVar, tp4 tp4Var) {
        super(3, tp4Var);
        this.F = z9eVar;
        this.G = iqfVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qv(a0f a0fVar, tp4 tp4Var) {
        super(3, tp4Var);
        this.G = a0fVar;
    }
}
