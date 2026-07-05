package defpackage;

import com.anthropic.claude.code.remote.i;
import com.anthropic.claude.sessions.types.PermissionMode;

/* JADX INFO: loaded from: classes2.dex */
public final class g24 extends vp4 {
    public PermissionMode E;
    public int F;
    public /* synthetic */ Object G;
    public final /* synthetic */ i H;
    public int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g24(i iVar, vp4 vp4Var) {
        super(vp4Var);
        this.H = iVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return i.S(this.H, null, this);
    }
}
