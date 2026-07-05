package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class fu8 implements gu8 {
    public IBinder i;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.i;
    }

    @Override // defpackage.gu8
    public final void j(String[] strArr) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(gu8.f);
            parcelObtain.writeStringArray(strArr);
            this.i.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
