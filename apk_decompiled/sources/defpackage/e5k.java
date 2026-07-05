package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class e5k extends dmj implements x4k {
    public e5k(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver", 8);
    }

    @Override // defpackage.x4k
    public final void f(Bundle bundle) {
        Parcel parcelB = b();
        qxj.d(parcelB, bundle);
        K(parcelB, 1);
    }
}
