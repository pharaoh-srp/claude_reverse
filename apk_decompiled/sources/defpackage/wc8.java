package defpackage;

import com.anthropic.claude.api.account.GrowthBookSchema;

/* JADX INFO: loaded from: classes.dex */
public final class wc8 extends vp4 {
    public GrowthBookSchema E;
    public /* synthetic */ Object F;
    public final /* synthetic */ ad8 G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wc8(ad8 ad8Var, vp4 vp4Var) {
        super(vp4Var);
        this.G = ad8Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.c(null, this);
    }
}
