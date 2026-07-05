package defpackage;

import android.content.Context;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.common.PlaybackException;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class q7b {
    public int A;
    public boolean B;
    public final Context a;
    public final bt5 c;
    public final PlaybackSession d;
    public String j;
    public PlaybackMetrics.Builder k;
    public int l;
    public PlaybackException o;
    public qb5 p;
    public qb5 q;
    public qb5 r;
    public jw7 s;
    public jw7 t;
    public jw7 u;
    public boolean v;
    public int w;
    public boolean x;
    public int y;
    public int z;
    public final Executor b = ac1.d();
    public final kqh f = new kqh();
    public final jqh g = new jqh();
    public final HashMap i = new HashMap();
    public final HashMap h = new HashMap();
    public final long e = SystemClock.elapsedRealtime();
    public int m = 0;
    public int n = 0;

    public q7b(Context context, PlaybackSession playbackSession) {
        this.a = context.getApplicationContext();
        this.d = playbackSession;
        bt5 bt5Var = new bt5();
        this.c = bt5Var;
        bt5Var.d = this;
    }

    public final boolean a(qb5 qb5Var) {
        String str;
        if (qb5Var == null) {
            return false;
        }
        String str2 = (String) qb5Var.F;
        bt5 bt5Var = this.c;
        synchronized (bt5Var) {
            str = bt5Var.f;
        }
        return str2.equals(str);
    }

    public final void b() {
        PlaybackMetrics.Builder builder = this.k;
        if (builder != null && this.B) {
            builder.setAudioUnderrunCount(this.A);
            this.k.setVideoFramesDropped(this.y);
            this.k.setVideoFramesPlayed(this.z);
            Long l = (Long) this.h.get(this.j);
            this.k.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            Long l2 = (Long) this.i.get(this.j);
            this.k.setNetworkBytesRead(l2 == null ? 0L : l2.longValue());
            this.k.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            this.b.execute(new yw5(this, 16, this.k.build()));
        }
        this.k = null;
        this.j = null;
        this.A = 0;
        this.y = 0;
        this.z = 0;
        this.s = null;
        this.t = null;
        this.u = null;
        this.B = false;
    }

    public final void c(mqh mqhVar, z7b z7bVar) {
        int iB;
        PlaybackMetrics.Builder builder = this.k;
        if (z7bVar == null || (iB = mqhVar.b(z7bVar.a)) == -1) {
            return;
        }
        jqh jqhVar = this.g;
        int i = 0;
        mqhVar.f(iB, jqhVar, false);
        int i2 = jqhVar.c;
        kqh kqhVar = this.f;
        mqhVar.n(i2, kqhVar);
        g7b g7bVar = kqhVar.b.b;
        if (g7bVar != null) {
            int iV = tpi.v(g7bVar.a, g7bVar.b);
            i = iV != 0 ? iV != 1 ? iV != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i);
        if (kqhVar.k != -9223372036854775807L && !kqhVar.i && !kqhVar.g && !kqhVar.a()) {
            builder.setMediaDurationMillis(tpi.M(kqhVar.k));
        }
        builder.setPlaybackType(kqhVar.a() ? 2 : 1);
        this.B = true;
    }

    public final void d(kx kxVar, String str) {
        z7b z7bVar = kxVar.d;
        if ((z7bVar == null || !z7bVar.b()) && str.equals(this.j)) {
            b();
        }
        this.h.remove(str);
        this.i.remove(str);
    }

    public final void e(int i, long j, jw7 jw7Var) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = p7b.h(i).setTimeSinceCreatedMillis(j - this.e);
        if (jw7Var != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(2);
            String str = jw7Var.n;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = jw7Var.o;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = jw7Var.k;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i2 = jw7Var.j;
            if (i2 != -1) {
                timeSinceCreatedMillis.setBitrate(i2);
            }
            int i3 = jw7Var.v;
            if (i3 != -1) {
                timeSinceCreatedMillis.setWidth(i3);
            }
            int i4 = jw7Var.w;
            if (i4 != -1) {
                timeSinceCreatedMillis.setHeight(i4);
            }
            int i5 = jw7Var.G;
            if (i5 != -1) {
                timeSinceCreatedMillis.setChannelCount(i5);
            }
            int i6 = jw7Var.H;
            if (i6 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i6);
            }
            String str4 = jw7Var.d;
            if (str4 != null) {
                String str5 = tpi.a;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = jw7Var.z;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.B = true;
        this.b.execute(new yw5(this, 13, timeSinceCreatedMillis.build()));
    }
}
