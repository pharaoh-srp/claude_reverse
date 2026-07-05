package defpackage;

import com.anthropic.claude.sessions.types.PermissionMode;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class irf extends vp4 {
    public String E;
    public PermissionMode F;
    public Map G;
    public String H;
    public String I;
    public String J;
    public boolean K;
    public boolean L;
    public /* synthetic */ Object M;
    public final /* synthetic */ jrf N;
    public int O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public irf(jrf jrfVar, vp4 vp4Var) {
        super(vp4Var);
        this.N = jrfVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.M = obj;
        this.O |= Integer.MIN_VALUE;
        return this.N.C(null, false, false, null, null, null, this);
    }
}
