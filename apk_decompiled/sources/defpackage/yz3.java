package defpackage;

import com.anthropic.claude.code.remote.c;

/* JADX INFO: loaded from: classes2.dex */
public final class yz3 extends vp4 {
    public z9e E;
    public cae F;
    public /* synthetic */ Object G;
    public final /* synthetic */ c H;
    public int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yz3(c cVar, vp4 vp4Var) {
        super(vp4Var);
        this.H = cVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return c.R(this.H, this);
    }
}
