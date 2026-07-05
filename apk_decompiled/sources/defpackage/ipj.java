package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class ipj implements IInterface {
    public final IBinder i;

    public ipj(IBinder iBinder) {
        this.i = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.i;
    }

    public final void b(m3k m3kVar, g48 g48Var) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(m3kVar);
            parcelObtain.writeInt(1);
            xok.a(g48Var, parcelObtain, 0);
            this.i.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
