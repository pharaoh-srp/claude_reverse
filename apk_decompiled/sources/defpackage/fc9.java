package defpackage;

import android.content.res.AssetFileDescriptor;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import androidx.concurrent.futures.b;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes2.dex */
public final class fc9 extends Binder implements bu8 {
    public final b i;
    public final /* synthetic */ ig0 j;

    public fc9(ig0 ig0Var, b bVar) {
        this.j = ig0Var;
        attachInterface(this, bu8.d);
        this.i = bVar;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        ne9 ne9Var = (ne9) this.j.F;
        String str = bu8.d;
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
        if (i == 3) {
            AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) parcel.readTypedObject(AssetFileDescriptor.CREATOR);
            Objects.requireNonNull(assetFileDescriptor);
            try {
                try {
                    ne9Var.G.L.execute(new yw5(this, 6, assetFileDescriptor));
                } catch (RejectedExecutionException unused) {
                    assetFileDescriptor.close();
                }
            } catch (IOException unused2) {
            }
            parcel2.writeNoException();
        } else {
            if (i != 4) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            int i3 = parcel.readInt();
            AssetFileDescriptor assetFileDescriptor2 = (AssetFileDescriptor) parcel.readTypedObject(AssetFileDescriptor.CREATOR);
            Objects.requireNonNull(assetFileDescriptor2);
            try {
                try {
                    ne9Var.G.L.execute(new y94(this, assetFileDescriptor2, i3));
                } catch (RejectedExecutionException unused3) {
                    assetFileDescriptor2.close();
                }
            } catch (IOException unused4) {
            }
            parcel2.writeNoException();
        }
        return true;
    }
}
