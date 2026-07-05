package defpackage;

import com.anthropic.claude.conway.protocol.b0;

/* JADX INFO: loaded from: classes2.dex */
public final class sz4 extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ b0 F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sz4(b0 b0Var, vp4 vp4Var) {
        super(vp4Var);
        this.F = b0Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.o(null, this);
    }
}
