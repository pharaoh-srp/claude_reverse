package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class mu8 implements ou8, IInterface {
    public final IBinder i;

    public mu8(IBinder iBinder) {
        this.i = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.i;
    }

    public final void b(Parcel parcel, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.i.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
