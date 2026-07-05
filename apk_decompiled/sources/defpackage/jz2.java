package defpackage;

import com.anthropic.claude.api.chat.messages.ToolResultBlock;

/* JADX INFO: loaded from: classes2.dex */
public final class jz2 extends vp4 {
    public ToolResultBlock E;
    public ftc F;
    public /* synthetic */ Object G;
    public final /* synthetic */ nz2 H;
    public int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jz2(nz2 nz2Var, vp4 vp4Var) {
        super(vp4Var);
        this.H = nz2Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return this.H.e(null, null, this);
    }
}
