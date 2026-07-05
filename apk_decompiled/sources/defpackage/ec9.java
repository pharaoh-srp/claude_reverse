package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import androidx.concurrent.futures.b;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class ec9 extends Binder implements zt8 {
    public final b i;
    public final /* synthetic */ ig0 j;

    public ec9(ig0 ig0Var, b bVar) {
        this.j = ig0Var;
        attachInterface(this, zt8.b);
        this.i = bVar;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        long jClearCallingIdentity;
        String str = zt8.b;
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
        b bVar = this.i;
        ig0 ig0Var = this.j;
        if (i == 1) {
            String string = parcel.readString();
            Objects.requireNonNull(string);
            ig0Var.o(bVar);
            jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                bVar.a(string);
                return true;
            } finally {
            }
        }
        if (i != 2) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        int i3 = parcel.readInt();
        String string2 = parcel.readString();
        Objects.requireNonNull(string2);
        ig0Var.o(bVar);
        jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            ig0Var.j(bVar, i3, string2);
            return true;
        } finally {
        }
    }
}
