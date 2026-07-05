package defpackage;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;
import androidx.media3.exoplayer.ExoPlaybackException;

/* JADX INFO: loaded from: classes2.dex */
public final class w6b implements Handler.Callback {
    public final Handler E;
    public final /* synthetic */ x6b F;

    public w6b(x6b x6bVar, d6b d6bVar) {
        this.F = x6bVar;
        Handler handlerK = tpi.k(this);
        this.E = handlerK;
        d6bVar.w(this, handlerK);
    }

    public final void a(long j) {
        Surface surface;
        x6b x6bVar = this.F;
        dke dkeVar = x6bVar.n1;
        if (this != x6bVar.Y1 || x6bVar.r0 == null) {
            return;
        }
        if (j == Long.MAX_VALUE) {
            x6bVar.Y0 = true;
            return;
        }
        try {
            x6bVar.D0(j);
            yui yuiVar = x6bVar.T1;
            if (!yuiVar.equals(yui.d) && !yuiVar.equals(x6bVar.U1)) {
                x6bVar.U1 = yuiVar;
                dkeVar.E(yuiVar);
            }
            x6bVar.a1.e++;
            lui luiVar = x6bVar.q1;
            boolean z = luiVar.e != 3;
            luiVar.e = 3;
            luiVar.l.getClass();
            luiVar.g = tpi.C(SystemClock.elapsedRealtime());
            if (z && (surface = x6bVar.D1) != null) {
                Handler handler = (Handler) dkeVar.E;
                if (handler != null) {
                    handler.post(new uui(dkeVar, surface, SystemClock.elapsedRealtime(), 0));
                }
                x6bVar.G1 = true;
            }
            x6bVar.i0(j);
        } catch (ExoPlaybackException e) {
            x6bVar.Z0 = e;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i = message.arg1;
        int i2 = message.arg2;
        String str = tpi.a;
        a(((((long) i) & 4294967295L) << 32) | (4294967295L & ((long) i2)));
        return true;
    }
}
