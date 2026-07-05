package defpackage;

import com.anthropic.claude.conway.protocol.b0;

/* JADX INFO: loaded from: classes2.dex */
public final class kz4 extends vp4 {
    public ih9 E;
    public s06 F;
    public /* synthetic */ Object G;
    public final /* synthetic */ b0 H;
    public int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kz4(b0 b0Var, vp4 vp4Var) {
        super(vp4Var);
        this.H = b0Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return this.H.g(null, this);
    }
}
