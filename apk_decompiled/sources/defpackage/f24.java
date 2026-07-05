package defpackage;

import com.anthropic.claude.code.remote.i;

/* JADX INFO: loaded from: classes2.dex */
public final class f24 extends vp4 {
    public dae E;
    public /* synthetic */ Object F;
    public final /* synthetic */ i G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f24(i iVar, vp4 vp4Var) {
        super(vp4Var);
        this.G = iVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return i.R(this.G, false, this);
    }
}
