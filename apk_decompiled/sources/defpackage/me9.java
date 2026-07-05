package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class me9 extends Binder implements au8 {
    public final /* synthetic */ ne9 i;

    public me9(ne9 ne9Var) {
        this.i = ne9Var;
        attachInterface(this, au8.c);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = au8.c;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i == 16777215) {
            parcel2.writeNoException();
            parcel2.writeInt(1);
            return true;
        }
        if (i != 2) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        int i3 = parcel.readInt();
        String string = parcel.readString();
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            this.i.f(new ep1(i3, string));
            Binder.restoreCallingIdentity(jClearCallingIdentity);
            parcel2.writeNoException();
            return true;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
            throw th;
        }
    }
}
