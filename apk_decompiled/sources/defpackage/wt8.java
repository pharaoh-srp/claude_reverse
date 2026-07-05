package defpackage;

import android.content.res.AssetFileDescriptor;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final class wt8 implements yt8 {
    public IBinder i;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.i;
    }

    public final void b() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(yt8.a);
            if (!this.i.transact(2, parcelObtain, parcelObtain2, 0)) {
                throw new RemoteException("Method close is unimplemented.");
            }
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final void c(String str, ec9 ec9Var) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(yt8.a);
            parcelObtain.writeString(str);
            parcelObtain.writeStrongInterface(ec9Var);
            if (!this.i.transact(1, parcelObtain, parcelObtain2, 0)) {
                throw new RemoteException("Method evaluateJavascript is unimplemented.");
            }
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final void d(AssetFileDescriptor assetFileDescriptor, fc9 fc9Var) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(yt8.a);
            parcelObtain.writeTypedObject(assetFileDescriptor, 0);
            parcelObtain.writeStrongInterface(fc9Var);
            if (!this.i.transact(4, parcelObtain, parcelObtain2, 0)) {
                throw new RemoteException("Method evaluateJavascriptWithFd is unimplemented.");
            }
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
