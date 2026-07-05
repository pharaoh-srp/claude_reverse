package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class mmi extends vp4 {
    public Iterator E;
    public /* synthetic */ Object F;
    public final /* synthetic */ nmi G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mmi(nmi nmiVar, vp4 vp4Var) {
        super(vp4Var);
        this.G = nmiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.a(this);
    }
}
