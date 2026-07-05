package defpackage;

import com.anthropic.claude.code.remote.stores.b;

/* JADX INFO: loaded from: classes2.dex */
public final class ir6 extends vp4 {
    public String E;
    public /* synthetic */ Object F;
    public final /* synthetic */ b G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ir6(b bVar, vp4 vp4Var) {
        super(vp4Var);
        this.G = bVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        Object objC = this.G.c(null, this);
        return objC == m45.E ? objC : new jre(objC);
    }
}
