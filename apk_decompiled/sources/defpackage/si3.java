package defpackage;

import com.anthropic.claude.analytics.b;

/* JADX INFO: loaded from: classes.dex */
public final class si3 extends vp4 {
    public String E;
    public pvg F;
    public /* synthetic */ Object G;
    public final /* synthetic */ b H;
    public int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public si3(b bVar, vp4 vp4Var) {
        super(vp4Var);
        this.H = bVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return this.H.b(null, null, this);
    }
}
