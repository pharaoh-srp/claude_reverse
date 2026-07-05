package defpackage;

import com.anthropic.claude.code.remote.stores.b;

/* JADX INFO: loaded from: classes2.dex */
public final class or6 extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ b F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public or6(b bVar, vp4 vp4Var) {
        super(vp4Var);
        this.F = bVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.l(this);
    }
}
