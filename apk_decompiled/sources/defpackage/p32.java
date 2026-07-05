package defpackage;

import com.anthropic.claude.code.remote.notification.CCRPermissionActionWorker;

/* JADX INFO: loaded from: classes2.dex */
public final class p32 extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ CCRPermissionActionWorker F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p32(CCRPermissionActionWorker cCRPermissionActionWorker, vp4 vp4Var) {
        super(vp4Var);
        this.F = cCRPermissionActionWorker;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.d(this);
    }
}
