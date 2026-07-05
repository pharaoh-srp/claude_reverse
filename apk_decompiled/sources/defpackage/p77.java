package defpackage;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.view.View;
import io.sentry.android.replay.screenshot.h;
import io.sentry.android.replay.viewhierarchy.g;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class p77 implements Runnable {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;

    public /* synthetic */ p77(Context context, boolean z, v77 v77Var, z6d z6dVar) {
        this.G = context;
        this.F = z;
        this.H = v77Var;
        this.I = z6dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.E) {
            case 0:
                Context context = (Context) this.G;
                boolean z = this.F;
                v77 v77Var = (v77) this.H;
                z6d z6dVar = (z6d) this.I;
                MediaMetricsManager mediaMetricsManagerD = gb2.d(context.getSystemService("media_metrics"));
                q7b q7bVar = mediaMetricsManagerD == null ? null : new q7b(context, mediaMetricsManagerD.createPlaybackSession());
                if (q7bVar == null) {
                    ysj.u("ExoPlayerImpl", "MediaMetricsService unavailable.");
                    return;
                }
                if (z) {
                    hp5 hp5Var = v77Var.s;
                    hp5Var.getClass();
                    hp5Var.f.a(q7bVar);
                }
                LogSessionId sessionId = q7bVar.d.getSessionId();
                synchronized (z6dVar) {
                    ro6 ro6Var = z6dVar.b;
                    ro6Var.getClass();
                    LogSessionId logSessionId = (LogSessionId) ro6Var.F;
                    LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
                    fd9.M(logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE));
                    ro6Var.F = sessionId;
                }
                return;
            default:
                ((h) this.G).d((View) this.H, (g) this.I, !this.F);
                return;
        }
    }

    public /* synthetic */ p77(h hVar, View view, g gVar, boolean z) {
        this.G = hVar;
        this.H = view;
        this.I = gVar;
        this.F = z;
    }
}
