package defpackage;

import com.anthropic.claude.api.tasks.TaskSessionEvent;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class es5 {
    public static final vde r;
    public final kqh a;
    public final jqh b;
    public final cp5 c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final int l;
    public final boolean m;
    public final long n;
    public final aee o;
    public final ConcurrentHashMap p;
    public long q;

    static {
        iz8 iz8Var = nz8.F;
        Object[] objArr = {"file", "content", "data", "android.resource", "rawresource", "asset"};
        bvk.e(6, objArr);
        r = nz8.m(6, objArr);
    }

    public es5() {
        cp5 cp5Var = new cp5();
        a(1000, 0, "bufferForPlaybackMs", TaskSessionEvent.REPLAY_FROM_START);
        a(1000, 0, "bufferForPlaybackForLocalPlaybackMs", TaskSessionEvent.REPLAY_FROM_START);
        a(2000, 0, "bufferForPlaybackAfterRebufferMs", TaskSessionEvent.REPLAY_FROM_START);
        a(1000, 0, "bufferForPlaybackAfterRebufferForLocalPlaybackMs", TaskSessionEvent.REPLAY_FROM_START);
        a(50000, 1000, "minBufferMs", "bufferForPlaybackMs");
        a(1000, 1000, "minBufferForLocalPlaybackMs", "bufferForPlaybackForLocalPlaybackMs");
        a(50000, 2000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(1000, 1000, "minBufferForLocalPlaybackMs", "bufferForPlaybackAfterRebufferForLocalPlaybackMs");
        a(50000, 50000, "maxBufferMs", "minBufferMs");
        a(50000, 1000, "maxBufferForLocalPlaybackMs", "minBufferForLocalPlaybackMs");
        a(0, 0, "backBufferDurationMs", TaskSessionEvent.REPLAY_FROM_START);
        this.a = new kqh();
        this.b = new jqh();
        this.c = cp5Var;
        long jC = tpi.C(50000L);
        this.d = jC;
        long jC2 = tpi.C(1000L);
        this.e = jC2;
        this.f = jC;
        this.g = jC;
        this.h = jC2;
        this.i = jC2;
        this.j = tpi.C(2000L);
        this.k = jC2;
        this.l = -1;
        this.m = true;
        this.n = tpi.C(0L);
        this.p = new ConcurrentHashMap();
        this.o = aee.a(aee.K);
        this.q = -1L;
    }

    public static void a(int i, int i2, String str, String str2) {
        if (i >= i2) {
            return;
        }
        sz6.p(iik.g("%s cannot be less than %s", str, str2));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(defpackage.tba r15) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.es5.b(tba):boolean");
    }

    public final void c() {
        boolean zIsEmpty = this.p.isEmpty();
        cp5 cp5Var = this.c;
        int i = 0;
        if (zIsEmpty) {
            synchronized (cp5Var) {
                if (cp5Var.a) {
                    cp5Var.c(0);
                }
            }
        } else {
            Iterator it = this.p.values().iterator();
            while (it.hasNext()) {
                i += ((ds5) it.next()).c;
            }
            cp5Var.c(i);
        }
    }
}
