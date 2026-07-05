package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes3.dex */
public final class i3k implements cbk, IInterface {
    public final IBinder i;

    public i3k(IBinder iBinder) {
        this.i = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.i;
    }
}
