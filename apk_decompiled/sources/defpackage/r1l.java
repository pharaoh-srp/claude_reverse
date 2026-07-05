package defpackage;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class r1l implements Handler.Callback {
    public final /* synthetic */ o2l E;

    public /* synthetic */ r1l(o2l o2lVar) {
        this.E = o2lVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            o2l o2lVar = this.E;
            synchronized (o2lVar.a) {
                try {
                    tzk tzkVar = (tzk) message.obj;
                    w0l w0lVar = (w0l) o2lVar.a.get(tzkVar);
                    if (w0lVar != null && w0lVar.g()) {
                        if (w0lVar.d()) {
                            w0lVar.a();
                        }
                        o2lVar.a.remove(tzkVar);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i != 1) {
            return false;
        }
        o2l o2lVar2 = this.E;
        synchronized (o2lVar2.a) {
            try {
                tzk tzkVar2 = (tzk) message.obj;
                w0l w0lVar2 = (w0l) o2lVar2.a.get(tzkVar2);
                if (w0lVar2 != null && w0lVar2.e() == 3) {
                    String strValueOf = String.valueOf(tzkVar2);
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(strValueOf);
                    Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                    ComponentName componentNameI = w0lVar2.i();
                    if (componentNameI == null) {
                        tzkVar2.getClass();
                        componentNameI = null;
                    }
                    if (componentNameI == null) {
                        String strA = tzkVar2.a();
                        dgj.v(strA);
                        componentNameI = new ComponentName(strA, "unknown");
                    }
                    w0lVar2.onServiceDisconnected(componentNameI);
                }
            } finally {
            }
        }
        return true;
    }
}
