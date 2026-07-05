package defpackage;

import com.anthropic.claude.tool.model.HealthConnectQueryV0Input;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class bj8 extends vp4 {
    public HealthConnectQueryV0Input E;
    public txc F;
    public cj8 G;
    public Collection H;
    public Iterator I;
    public Collection J;
    public boolean K;
    public int L;
    public /* synthetic */ Object M;
    public final /* synthetic */ n78 N;
    public int O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj8(n78 n78Var, vp4 vp4Var) {
        super(vp4Var);
        this.N = n78Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.M = obj;
        this.O |= Integer.MIN_VALUE;
        return this.N.I(null, this);
    }
}
