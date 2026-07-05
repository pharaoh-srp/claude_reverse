package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class drf extends vp4 {
    public Iterator E;
    public /* synthetic */ Object F;
    public final /* synthetic */ jrf G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drf(jrf jrfVar, vp4 vp4Var) {
        super(vp4Var);
        this.G = jrfVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.x(null, this);
    }
}
