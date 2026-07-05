package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public final class fs1 implements ServiceConnection {
    public boolean E = false;
    public final LinkedBlockingQueue F = new LinkedBlockingQueue();

    public final IBinder a() throws TimeoutException {
        dgj.u("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.E) {
            sz6.j("Cannot call get on this connection more than once");
            return null;
        }
        this.E = true;
        IBinder iBinder = (IBinder) this.F.poll(10000L, TimeUnit.MILLISECONDS);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.F.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
