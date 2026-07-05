package defpackage;

import android.content.Context;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class j98 extends vp4 {
    public hwg E;
    public Context F;
    public dp1 G;
    public dae H;
    public Iterator I;
    public int J;
    public int K;
    public boolean L;
    public /* synthetic */ Object M;
    public final /* synthetic */ m98 N;
    public int O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j98(m98 m98Var, vp4 vp4Var) {
        super(vp4Var);
        this.N = m98Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.M = obj;
        this.O |= Integer.MIN_VALUE;
        return this.N.g(null, null, this);
    }
}
