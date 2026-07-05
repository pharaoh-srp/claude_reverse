package defpackage;

import com.anthropic.claude.settings.internal.growthbook.a;

/* JADX INFO: loaded from: classes3.dex */
public final class gd8 extends vp4 {
    public /* synthetic */ Object E;
    public int F;
    public final /* synthetic */ a G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gd8(a aVar, tp4 tp4Var) {
        super(tp4Var);
        this.G = aVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.F |= Integer.MIN_VALUE;
        return this.G.g(null, this);
    }
}
