package defpackage;

import com.anthropic.claude.code.remote.stores.b;
import com.anthropic.claude.sessions.types.EnvironmentResource;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class fr6 extends vp4 {
    public int E;
    public int F;
    public int G;
    public dae H;
    public List I;
    public Iterator J;
    public EnvironmentResource K;
    public /* synthetic */ Object L;
    public final /* synthetic */ b M;
    public int N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fr6(b bVar, vp4 vp4Var) {
        super(vp4Var);
        this.M = bVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.L = obj;
        this.N |= Integer.MIN_VALUE;
        return this.M.a(this);
    }
}
