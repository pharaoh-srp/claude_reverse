package defpackage;

import com.anthropic.claude.chat.input.draft.DraftMessage;

/* JADX INFO: loaded from: classes2.dex */
public final class aw2 extends vp4 {
    public DraftMessage E;
    public /* synthetic */ Object F;
    public final /* synthetic */ hw2 G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aw2(hw2 hw2Var, vp4 vp4Var) {
        super(vp4Var);
        this.G = hw2Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.k0(null, this);
    }
}
