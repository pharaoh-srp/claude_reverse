package defpackage;

import com.anthropic.claude.conway.send.OutboxItem;

/* JADX INFO: loaded from: classes3.dex */
public final class jz4 extends vp4 {
    public OutboxItem E;
    public /* synthetic */ Object F;
    public final /* synthetic */ g81 G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jz4(g81 g81Var, vp4 vp4Var) {
        super(vp4Var);
        this.G = g81Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return g81.a(this.G, this);
    }
}
