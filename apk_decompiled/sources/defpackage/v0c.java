package defpackage;

import okio.Buffer;

/* JADX INFO: loaded from: classes2.dex */
public final class v0c extends vp4 {
    public Buffer E;
    public /* synthetic */ Object F;
    public final /* synthetic */ x0c G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0c(x0c x0cVar, vp4 vp4Var) {
        super(vp4Var);
        this.G = x0cVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return x0c.c(this.G, null, this);
    }
}
