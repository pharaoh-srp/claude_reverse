package defpackage;

import com.anthropic.claude.home.d;

/* JADX INFO: loaded from: classes.dex */
public final class yf6 extends vp4 {
    public /* synthetic */ Object E;
    public int F;
    public final /* synthetic */ d G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yf6(d dVar, tp4 tp4Var) {
        super(tp4Var);
        this.G = dVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.F |= Integer.MIN_VALUE;
        return this.G.g(null, this);
    }
}
