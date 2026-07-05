package androidx.lifecycle;

import android.os.Handler;
import defpackage.c4a;
import defpackage.m4a;
import defpackage.mdj;
import defpackage.n78;
import defpackage.p4a;
import defpackage.y0;
import defpackage.y3a;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleOwner;", "Lm4a;", "<init>", "()V", "d59", "lifecycle-process"}, k = 1, mv = {2, 0, 0}, xi = mdj.f)
public final class ProcessLifecycleOwner implements m4a {
    public static final ProcessLifecycleOwner M = new ProcessLifecycleOwner();
    public int E;
    public int F;
    public Handler I;
    public boolean G = true;
    public boolean H = true;
    public final p4a J = new p4a(this, true);
    public final y0 K = new y0(8, this);
    public final n78 L = new n78(20, this);

    private ProcessLifecycleOwner() {
    }

    @Override // defpackage.m4a
    public final c4a a() {
        return this.J;
    }

    public final void b() {
        int i = this.F + 1;
        this.F = i;
        if (i == 1) {
            if (this.G) {
                this.J.f(y3a.ON_RESUME);
                this.G = false;
            } else {
                Handler handler = this.I;
                handler.getClass();
                handler.removeCallbacks(this.K);
            }
        }
    }
}
