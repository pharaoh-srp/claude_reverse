package defpackage;

import androidx.glance.session.SessionWorker;

/* JADX INFO: loaded from: classes2.dex */
public final class yvf extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ SessionWorker F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yvf(SessionWorker sessionWorker, vp4 vp4Var) {
        super(vp4Var);
        this.F = sessionWorker;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.d(this);
    }
}
