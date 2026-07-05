package defpackage;

import com.anthropic.claude.conway.ConwayWakeWorker;
import com.anthropic.claude.conway.protocol.b0;

/* JADX INFO: loaded from: classes2.dex */
public final class o15 extends vp4 {
    public String E;
    public ConwayWakeWorker F;
    public yz4 G;
    public f8 H;
    public String I;
    public b0 J;
    public bae K;
    public dae L;
    public z9e M;
    public Throwable N;
    public /* synthetic */ Object O;
    public final /* synthetic */ ConwayWakeWorker P;
    public int Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o15(ConwayWakeWorker conwayWakeWorker, vp4 vp4Var) {
        super(vp4Var);
        this.P = conwayWakeWorker;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.O = obj;
        this.Q |= Integer.MIN_VALUE;
        return this.P.d(this);
    }
}
