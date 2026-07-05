package defpackage;

import com.anthropic.claude.api.events.EventLoggingRequest;

/* JADX INFO: loaded from: classes.dex */
public final class yf7 extends xzg implements pz7 {
    public int E;
    public final /* synthetic */ bg7 F;
    public final /* synthetic */ EventLoggingRequest.ExperimentExposure G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yf7(bg7 bg7Var, EventLoggingRequest.ExperimentExposure experimentExposure, tp4 tp4Var) {
        super(2, tp4Var);
        this.F = bg7Var;
        this.G = experimentExposure;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        return new yf7(this.F, this.G, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((yf7) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.E;
        if (i == 0) {
            sf5.h0(obj);
            jz6 jz6Var = this.F.R;
            this.E = 1;
            Object objF = jz6Var.f(this.G, this);
            m45 m45Var = m45.E;
            if (objF == m45Var) {
                return m45Var;
            }
        } else {
            if (i != 1) {
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sf5.h0(obj);
        }
        return iei.a;
    }
}
