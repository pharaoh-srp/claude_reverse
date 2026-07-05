package defpackage;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.media.PlaybackParams;
import com.anthropic.claude.R;
import com.anthropic.claude.bell.PlaybackPace;
import com.anthropic.claude.bell.api.VoiceSelection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class xm1 {
    public final Context a;
    public final x4j b;
    public final h86 c;
    public final fn0 d;
    public final LinkedHashMap e = new LinkedHashMap();
    public PlaybackPace f;
    public final AudioAttributes g;
    public final Map h;

    public xm1(Context context, x4j x4jVar, h86 h86Var, fn0 fn0Var) {
        this.a = context;
        this.b = x4jVar;
        this.c = h86Var;
        this.d = fn0Var;
        PlaybackPace.Companion.getClass();
        this.f = k6d.b();
        this.g = new AudioAttributes.Builder().setUsage(1).setContentType(1).build();
        VoiceSelection.Companion.getClass();
        this.h = sta.h0(new cpc(VoiceSelection.m573boximpl(z4j.c()), Integer.valueOf(R.raw.buttery)), new cpc(VoiceSelection.m573boximpl(z4j.b()), Integer.valueOf(R.raw.airy)), new cpc(VoiceSelection.m573boximpl(z4j.f()), Integer.valueOf(R.raw.mellow)), new cpc(VoiceSelection.m573boximpl(z4j.e()), Integer.valueOf(R.raw.glassy)), new cpc(VoiceSelection.m573boximpl(z4j.g()), Integer.valueOf(R.raw.rounded)));
    }

    public final void a(MediaPlayer mediaPlayer) {
        boolean zIsPlaying = mediaPlayer.isPlaying();
        try {
            mediaPlayer.setPlaybackParams(new PlaybackParams().setSpeed(this.f.getSpeedFactor()));
        } catch (Exception e) {
            List list = xah.a;
            xah.f(e, "Bell Mode: Error setting playback params", null, null, 28);
        }
        if (zIsPlaying) {
            return;
        }
        mediaPlayer.pause();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0066 A[Catch: Exception -> 0x0073, TRY_ENTER, TryCatch #0 {Exception -> 0x0073, blocks: (B:29:0x0066, B:31:0x006c, B:34:0x0075, B:36:0x007b, B:37:0x007f, B:38:0x008b, B:40:0x0091, B:42:0x00a9, B:44:0x00af, B:45:0x00b6), top: B:63:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0075 A[Catch: Exception -> 0x0073, TryCatch #0 {Exception -> 0x0073, blocks: (B:29:0x0066, B:31:0x006c, B:34:0x0075, B:36:0x007b, B:37:0x007f, B:38:0x008b, B:40:0x0091, B:42:0x00a9, B:44:0x00af, B:45:0x00b6), top: B:63:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.dhg r6, float r7, defpackage.vp4 r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xm1.b(dhg, float, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.dhg r8, defpackage.vp4 r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.wm1
            if (r0 == 0) goto L13
            r0 = r9
            wm1 r0 = (defpackage.wm1) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            wm1 r0 = new wm1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.F
            int r1 = r0.H
            r2 = 3
            r3 = 0
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L32
            if (r1 != r4) goto L2c
            dhg r8 = r0.E
            defpackage.sf5.h0(r9)     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L74
            goto L4f
        L2a:
            r7 = move-exception
            goto L69
        L2c:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r7)
            return r5
        L32:
            defpackage.sf5.h0(r9)
            h86 r9 = r7.c     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L74
            e45 r9 = r9.b()     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L74
            o0 r1 = new o0     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L74
            r6 = 27
            r1.<init>(r8, r7, r5, r6)     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L74
            r0.E = r8     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L74
            r0.H = r4     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L74
            java.lang.Object r9 = defpackage.gb9.c0(r9, r1, r0)     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L74
            m45 r0 = defpackage.m45.E
            if (r9 != r0) goto L4f
            return r0
        L4f:
            android.media.MediaPlayer r9 = (android.media.MediaPlayer) r9     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L74
            if (r9 != 0) goto L59
            java.lang.String r7 = "MediaPlayer.create returned null"
            defpackage.ij0.y(r7, r5, r3, r2)
            return r5
        L59:
            r9.setLooping(r4)
            r7.a(r9)
            java.util.LinkedHashMap r7 = r7.e
            java.lang.String r8 = r8.a()
            r7.put(r8, r9)
            return r9
        L69:
            com.anthropic.claude.core.telemetry.SilentException r8 = new com.anthropic.claude.core.telemetry.SilentException
            java.lang.String r9 = "Failed to prepare voice preview"
            r8.<init>(r9, r7)
            com.anthropic.claude.core.telemetry.SilentException.a(r8, r5, r3, r2)
            return r5
        L74:
            r7 = move-exception
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xm1.c(dhg, vp4):java.lang.Object");
    }

    public final void d(zy7 zy7Var) {
        LinkedHashMap linkedHashMap = this.e;
        List listP1 = w44.p1(linkedHashMap.values());
        linkedHashMap.clear();
        if (listP1.isEmpty()) {
            zy7Var.a();
            return;
        }
        gb9.D(this.d, this.c.b(), null, new zn(listP1, zy7Var, (tp4) null, 4), 2);
    }

    public final void e(PlaybackPace playbackPace) {
        playbackPace.getClass();
        this.f = playbackPace;
        Iterator it = this.e.values().iterator();
        while (it.hasNext()) {
            a((MediaPlayer) it.next());
        }
    }
}
