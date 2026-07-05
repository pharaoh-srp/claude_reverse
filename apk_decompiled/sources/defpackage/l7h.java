package defpackage;

import com.anthropic.claude.R;
import com.anthropic.claude.api.result.ApiResult;
import com.anthropic.claude.api.tasks.ApproveTaskAgentOverrides;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class l7h extends xzg implements pz7 {
    public int E;
    public final /* synthetic */ nfb F;
    public final /* synthetic */ String G;
    public final /* synthetic */ nwb H;
    public final /* synthetic */ nwb I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ lvh K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l7h(nfb nfbVar, String str, nwb nwbVar, nwb nwbVar2, boolean z, lvh lvhVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.F = nfbVar;
        this.G = str;
        this.H = nwbVar;
        this.I = nwbVar2;
        this.J = z;
        this.K = lvhVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        return new l7h(this.F, this.G, this.H, this.I, this.J, this.K, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((l7h) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        nwb nwbVar = this.H;
        try {
            if (i == 0) {
                sf5.h0(obj);
                if (((qrd) nwbVar.getValue()) != null) {
                    return ieiVar;
                }
                nwbVar.setValue(qrd.E);
                ApproveTaskAgentOverrides approveTaskAgentOverrides = (ApproveTaskAgentOverrides) this.I.getValue();
                if (!this.J || approveTaskAgentOverrides.isEmpty()) {
                    approveTaskAgentOverrides = null;
                }
                kah kahVar = (kah) this.F.i;
                String str = this.G;
                this.E = 1;
                obj = ((uah) kahVar).c(str, approveTaskAgentOverrides, this);
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
            ApiResult apiResult = (ApiResult) obj;
            boolean z = apiResult instanceof of0;
            lvh lvhVar = this.K;
            if (z) {
                lvhVar.n.a();
            } else if (!(apiResult instanceof nf0)) {
                throw new NoWhenBranchMatchedException();
            }
            if (!(apiResult instanceof of0)) {
                if (!(apiResult instanceof nf0)) {
                    throw new NoWhenBranchMatchedException();
                }
                gh2 gh2Var = lvhVar.b;
                if (gh2Var != null) {
                    gh2Var.r(new pt6(R.string.task_propose_approve_failed));
                }
            }
            return ieiVar;
        } finally {
            nwbVar.setValue(null);
        }
    }
}
