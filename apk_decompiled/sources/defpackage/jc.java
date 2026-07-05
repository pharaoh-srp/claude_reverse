package defpackage;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class jc extends vp4 {
    public Set E;
    public Map F;
    public Set G;
    public boolean H;
    public int I;
    public /* synthetic */ Object J;
    public final /* synthetic */ mc K;
    public int L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jc(mc mcVar, vp4 vp4Var) {
        super(vp4Var);
        this.K = mcVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.J = obj;
        this.L |= Integer.MIN_VALUE;
        return this.K.b(null, false, this);
    }
}
