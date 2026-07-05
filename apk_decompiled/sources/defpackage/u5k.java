package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class u5k extends dmj implements o5k {
    public u5k(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy", 8);
    }

    public final int O() {
        Parcel parcelI = I(b(), 2);
        int i = parcelI.readInt();
        parcelI.recycle();
        return i;
    }
}
