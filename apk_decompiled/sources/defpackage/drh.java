package defpackage;

import androidx.glance.session.TimeoutCancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class drh implements l45 {
    public final /* synthetic */ l45 E;
    public final AtomicReference F = new AtomicReference(null);
    public final /* synthetic */ poc G;
    public final /* synthetic */ l45 H;
    public final /* synthetic */ pz7 I;
    public final /* synthetic */ AtomicReference J;

    public drh(l45 l45Var, poc pocVar, l45 l45Var2, pz7 pz7Var, AtomicReference atomicReference) {
        this.G = pocVar;
        this.H = l45Var2;
        this.I = pz7Var;
        this.J = atomicReference;
        this.E = l45Var;
    }

    public final long a() {
        Long l = (Long) this.F.get();
        if (l == null) {
            lz1 lz1Var = uh6.F;
            return uh6.G;
        }
        long jLongValue = l.longValue();
        this.G.getClass();
        long jCurrentTimeMillis = jLongValue - System.currentTimeMillis();
        lz1 lz1Var2 = uh6.F;
        return v40.R(jCurrentTimeMillis, zh6.MILLISECONDS);
    }

    public final void b(long j) {
        if (uh6.f(j) <= 0) {
            fd9.z(this.H, new TimeoutCancellationException("Timed out immediately", this.I.hashCode()));
            return;
        }
        if (uh6.d(a(), j) < 0) {
            return;
        }
        this.G.getClass();
        this.F.set(Long.valueOf(uh6.f(j) + System.currentTimeMillis()));
        pz7 pz7Var = this.I;
        poc pocVar = this.G;
        l45 l45Var = this.H;
        lf9 lf9Var = (lf9) this.J.getAndSet(gb9.D(l45Var, null, null, new lza(this, pocVar, l45Var, pz7Var, (tp4) null), 3));
        if (lf9Var != null) {
            lf9Var.d(null);
        }
    }

    @Override // defpackage.l45
    public final c45 getCoroutineContext() {
        return this.E.getCoroutineContext();
    }
}
