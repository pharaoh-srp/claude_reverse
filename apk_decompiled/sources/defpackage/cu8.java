package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final class cu8 implements eu8 {
    public IBinder i;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.i;
    }

    public final yt8 b() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(eu8.e);
            if (!this.i.transact(1, parcelObtain, parcelObtain2, 0)) {
                throw new RemoteException("Method createIsolate is unimplemented.");
            }
            parcelObtain2.readException();
            return xt8.b(parcelObtain2.readStrongBinder());
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final yt8 c(au8 au8Var) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(eu8.e);
            parcelObtain.writeLong(0L);
            parcelObtain.writeStrongInterface(au8Var);
            if (!this.i.transact(4, parcelObtain, parcelObtain2, 0)) {
                throw new RemoteException("Method createIsolate2 is unimplemented.");
            }
            parcelObtain2.readException();
            return xt8.b(parcelObtain2.readStrongBinder());
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final yt8 d() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(eu8.e);
            parcelObtain.writeLong(0L);
            if (!this.i.transact(3, parcelObtain, parcelObtain2, 0)) {
                throw new RemoteException("Method createIsolateWithMaxHeapSizeBytes is unimplemented.");
            }
            parcelObtain2.readException();
            return xt8.b(parcelObtain2.readStrongBinder());
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
