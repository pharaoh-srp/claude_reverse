package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class gwf extends vp4 {
    public String E;
    public Collection F;
    public Iterator G;
    public Collection H;
    public /* synthetic */ Object I;
    public final /* synthetic */ jwf J;
    public int K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gwf(jwf jwfVar, vp4 vp4Var) {
        super(vp4Var);
        this.J = jwfVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.I = obj;
        this.K |= Integer.MIN_VALUE;
        return this.J.l(null, null, this);
    }
}
