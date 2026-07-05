package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes3.dex */
public final class gt8 implements it8, IInterface {
    public final IBinder i;

    public gt8(IBinder iBinder) {
        this.i = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.i;
    }
}
