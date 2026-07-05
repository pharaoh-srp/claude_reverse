package defpackage;

import com.anthropic.claude.analytics.events.ThirdPartyToolEvents$ThirdPartyToolExecutionFailed;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class vmh implements pz7 {
    public final /* synthetic */ n4 E;
    public final /* synthetic */ AtomicBoolean F;
    public final /* synthetic */ xmh G;
    public final /* synthetic */ ua2 H;

    public vmh(n4 n4Var, AtomicBoolean atomicBoolean, xmh xmhVar, ua2 ua2Var) {
        this.E = n4Var;
        this.F = atomicBoolean;
        this.G = xmhVar;
        this.H = ua2Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        str.getClass();
        str2.getClass();
        this.E.a();
        if (this.F.compareAndSet(false, true)) {
            xmh xmhVar = this.G;
            xmhVar.i.e(new ThirdPartyToolEvents$ThirdPartyToolExecutionFailed(xmhVar.e, xmhVar.k, str), ThirdPartyToolEvents$ThirdPartyToolExecutionFailed.Companion.serializer());
            this.H.resumeWith(new exh(str2, false));
        }
        return iei.a;
    }
}
