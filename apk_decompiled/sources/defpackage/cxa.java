package defpackage;

import com.anthropic.claude.mcpapps.b;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class cxa extends vp4 {
    public ConcurrentHashMap E;
    public Object F;
    public bz7 G;
    public Object H;
    public boolean I;
    public boolean J;
    public /* synthetic */ Object K;
    public final /* synthetic */ b L;
    public int M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxa(b bVar, vp4 vp4Var) {
        super(vp4Var);
        this.L = bVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.K = obj;
        this.M |= Integer.MIN_VALUE;
        return this.L.m(null, null, false, null, this);
    }
}
