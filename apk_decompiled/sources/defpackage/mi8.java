package defpackage;

import com.anthropic.claude.tool.model.HealthConnectQueryV0InputQueriesItem;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class mi8 extends vp4 {
    public HealthConnectQueryV0InputQueriesItem E;
    public bqh F;
    public sk8 G;
    public List H;
    public /* synthetic */ Object I;
    public final /* synthetic */ oi8 J;
    public int K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mi8(oi8 oi8Var, vp4 vp4Var) {
        super(vp4Var);
        this.J = oi8Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.I = obj;
        this.K |= Integer.MIN_VALUE;
        return this.J.h(null, this);
    }
}
