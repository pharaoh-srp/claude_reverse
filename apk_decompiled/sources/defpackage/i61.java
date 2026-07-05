package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.media.Spatializer;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.audio.AudioOutputProvider$InitializationException;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class i61 {
    public final Context a;
    public final hj6 b;
    public final qb5 c;
    public final poj d;
    public final float e;
    public kba f;
    public g1h g;
    public u31 h;
    public x31 i;
    public Looper j;
    public Context k;

    public i61(h61 h61Var) {
        Context context = (Context) h61Var.b;
        this.a = context;
        qb5 qb5Var = (qb5) h61Var.c;
        qb5Var.getClass();
        this.c = qb5Var;
        this.b = (hj6) h61Var.d;
        this.h = (u31) h61Var.e;
        this.d = context == null ? null : new poj(this);
        this.e = h61Var.a;
        this.g = g1h.a;
    }

    public final g61 a(f51 f51Var) throws AudioOutputProvider$InitializationException {
        Context context;
        Context context2;
        try {
            int i = f51Var.h;
            int i2 = f51Var.i;
            if (i2 == -1 || (context2 = this.a) == null || Build.VERSION.SDK_INT < 34) {
                context = null;
            } else {
                Context context3 = this.k;
                if (context3 == null || context3.getDeviceId() != i2) {
                    this.k = context2.createDeviceContext(i2);
                }
                context = this.k;
                i = 0;
            }
            try {
                AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(f51Var.d ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : f51Var.g.a()).setAudioFormat(new AudioFormat.Builder().setSampleRate(f51Var.b).setChannelMask(f51Var.c).setEncoding(f51Var.a).build()).setTransferMode(1).setBufferSizeInBytes(f51Var.f).setSessionId(i);
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 29) {
                    sessionId.setOffloadedPlayback(f51Var.e);
                }
                if (i3 >= 34 && context != null) {
                    sessionId.setContext(context);
                }
                AudioTrack audioTrackBuild = sessionId.build();
                if (audioTrackBuild.getState() == 1) {
                    return new g61(audioTrackBuild, f51Var, this.d, this.e, this.g);
                }
                try {
                    audioTrackBuild.release();
                } catch (Exception unused) {
                }
                throw new AudioOutputProvider$InitializationException();
            } catch (IllegalArgumentException e) {
                e = e;
                throw new AudioOutputProvider$InitializationException(e);
            }
        } catch (IllegalArgumentException | UnsupportedOperationException e2) {
            e = e2;
        }
    }

    public final d51 b(b51 b51Var) {
        e(b51Var);
        jw7 jw7Var = b51Var.a;
        p31 p31Var = b51Var.b;
        a51 a51VarM = this.c.m(jw7Var, p31Var);
        c51 c51Var = new c51();
        String str = jw7Var.o;
        int i = jw7Var.I;
        int i2 = 0;
        if (!Objects.equals(str, "audio/raw") ? this.h.c(jw7Var, p31Var) != null : i == 2) {
            i2 = 2;
        }
        c51Var.d = i2;
        c51Var.a = a51VarM.a;
        c51Var.b = a51VarM.b;
        c51Var.c = a51VarM.c;
        return c51Var.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0167  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.f51 c(defpackage.b51 r24) throws androidx.media3.exoplayer.audio.AudioOutputProvider$ConfigurationException {
        /*
            Method dump skipped, instruction units count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i61.c(b51):f51");
    }

    public final void d() {
        s31 s31Var;
        lgg lggVar;
        kba kbaVar = this.f;
        if (kbaVar != null) {
            kbaVar.d();
        }
        x31 x31Var = this.i;
        if (x31Var != null) {
            Context context = (Context) x31Var.F;
            if (x31Var.E) {
                x31Var.M = null;
                x41.j(context).unregisterAudioDeviceCallback((v31) x31Var.I);
                if (Build.VERSION.SDK_INT >= 32 && (s31Var = (s31) x31Var.L) != null) {
                    Handler handler = (Handler) s31Var.H;
                    Spatializer spatializer = (Spatializer) s31Var.G;
                    if (spatializer != null && (lggVar = (lgg) s31Var.I) != null && handler != null) {
                        spatializer.removeOnSpatializerStateChangedListener(lggVar);
                        handler.removeCallbacksAndMessages(null);
                    }
                    x31Var.L = null;
                }
                context.unregisterReceiver((xg0) x31Var.J);
                w31 w31Var = (w31) x31Var.K;
                if (w31Var != null) {
                    w31Var.a.unregisterContentObserver(w31Var);
                }
                x31Var.E = false;
            }
        }
    }

    public final void e(b51 b51Var) {
        Context context;
        u31 u31VarB;
        AudioDeviceInfo audioDeviceInfo = b51Var.c;
        p31 p31Var = b51Var.b;
        f();
        x31 x31Var = this.i;
        if (x31Var == null && (context = this.a) != null) {
            x31 x31Var2 = new x31(context, new do0(1, this), p31Var, audioDeviceInfo);
            this.i = x31Var2;
            Handler handler = (Handler) x31Var2.H;
            Context context2 = (Context) x31Var2.F;
            if (x31Var2.E) {
                u31VarB = (u31) x31Var2.M;
                u31VarB.getClass();
            } else {
                x31Var2.E = true;
                w31 w31Var = (w31) x31Var2.K;
                if (w31Var != null) {
                    w31Var.a.registerContentObserver(w31Var.b, false, w31Var);
                }
                x41.j(context2).registerAudioDeviceCallback((v31) x31Var2.I, handler);
                if (Build.VERSION.SDK_INT >= 32 && ((s31) x31Var2.L) == null) {
                    x31Var2.L = new s31(context2, new fc(4, x31Var2), Boolean.valueOf(tpi.A(context2)));
                }
                u31VarB = u31.b(context2, context2.registerReceiver((xg0) x31Var2.J, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), (p31) x31Var2.O, (AudioDeviceInfo) x31Var2.N, x31Var2.a());
                x31Var2.M = u31VarB;
            }
            this.h = u31VarB;
        } else if (x31Var != null) {
            if (audioDeviceInfo != null && !audioDeviceInfo.equals((AudioDeviceInfo) x31Var.N)) {
                x31Var.N = audioDeviceInfo;
                Context context3 = (Context) x31Var.F;
                p31 p31Var2 = (p31) x31Var.O;
                List listA = x31Var.a();
                vde vdeVar = u31.e;
                x31Var.b(u31.b(context3, context3.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), p31Var2, audioDeviceInfo, listA));
            }
            x31 x31Var3 = this.i;
            if (!Objects.equals(p31Var, (p31) x31Var3.O)) {
                x31Var3.O = p31Var;
                Context context4 = (Context) x31Var3.F;
                AudioDeviceInfo audioDeviceInfo2 = (AudioDeviceInfo) x31Var3.N;
                List listA2 = x31Var3.a();
                vde vdeVar2 = u31.e;
                x31Var3.b(u31.b(context4, context4.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), p31Var, audioDeviceInfo2, listA2));
            }
        }
        this.h.getClass();
    }

    public final void f() {
        if (this.a == null) {
            return;
        }
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.j;
        boolean z = looper == null || looper == looperMyLooper;
        String name = looper == null ? "null" : looper.getThread().getName();
        String name2 = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null";
        if (z) {
            this.j = looperMyLooper;
        } else {
            sz6.j(iik.g("AudioTrackAudioOutputProvider accessed on multiple threads: %s and %s", name, name2));
        }
    }
}
