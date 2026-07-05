package defpackage;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class o2l {
    public static final Object g = new Object();
    public static o2l h;
    public static HandlerThread i;
    public final HashMap a = new HashMap();
    public final Context b;
    public volatile xnj c;
    public final n78 d;
    public final long e;
    public final long f;

    public o2l(Context context, Looper looper) {
        r1l r1lVar = new r1l(this);
        this.b = context.getApplicationContext();
        xnj xnjVar = new xnj(looper, r1lVar);
        Looper.getMainLooper();
        this.c = xnjVar;
        this.d = n78.K();
        this.e = 5000L;
        this.f = 300000L;
    }

    public static o2l a(Context context) {
        synchronized (g) {
            try {
                if (h == null) {
                    h = new o2l(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return h;
    }

    public final hh4 b(tzk tzkVar, h7k h7kVar, String str, Executor executor) {
        hh4 hh4VarJ;
        HashMap map = this.a;
        synchronized (map) {
            try {
                w0l w0lVar = (w0l) map.get(tzkVar);
                if (executor == null) {
                    executor = null;
                }
                if (w0lVar == null) {
                    w0lVar = new w0l(this, tzkVar);
                    w0lVar.b(h7kVar, h7kVar);
                    hh4VarJ = w0lVar.j(str, executor);
                    map.put(tzkVar, w0lVar);
                } else {
                    this.c.removeMessages(0, tzkVar);
                    if (w0lVar.f(h7kVar)) {
                        String string = tzkVar.toString();
                        StringBuilder sb = new StringBuilder(string.length() + 81);
                        sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb.append(string);
                        throw new IllegalStateException(sb.toString());
                    }
                    w0lVar.b(h7kVar, h7kVar);
                    int iE = w0lVar.e();
                    if (iE == 1) {
                        h7kVar.onServiceConnected(w0lVar.i(), w0lVar.h());
                    } else if (iE == 2) {
                        hh4VarJ = w0lVar.j(str, executor);
                    }
                    hh4VarJ = null;
                }
                if (w0lVar.d()) {
                    return hh4.J;
                }
                if (hh4VarJ == null) {
                    hh4VarJ = new hh4(-1, null, null);
                }
                return hh4VarJ;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(String str, String str2, ServiceConnection serviceConnection, boolean z) {
        tzk tzkVar = new tzk(str, str2, z);
        dgj.w("ServiceConnection must not be null", serviceConnection);
        HashMap map = this.a;
        synchronized (map) {
            try {
                w0l w0lVar = (w0l) map.get(tzkVar);
                if (w0lVar == null) {
                    String string = tzkVar.toString();
                    StringBuilder sb = new StringBuilder(string.length() + 50);
                    sb.append("Nonexistent connection status for service config: ");
                    sb.append(string);
                    throw new IllegalStateException(sb.toString());
                }
                if (!w0lVar.f(serviceConnection)) {
                    String string2 = tzkVar.toString();
                    StringBuilder sb2 = new StringBuilder(string2.length() + 76);
                    sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb2.append(string2);
                    throw new IllegalStateException(sb2.toString());
                }
                w0lVar.c(serviceConnection);
                if (w0lVar.g()) {
                    this.c.sendMessageDelayed(this.c.obtainMessage(0, tzkVar), this.e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
