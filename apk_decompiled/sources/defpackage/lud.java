package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SharedMemory;
import android.system.ErrnoException;
import android.system.OsConstants;
import androidx.health.platform.client.proto.a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lud implements Parcelable {
    public final u0h E = new u0h(new k2c(3, this));

    public abstract a a();

    @Override // android.os.Parcelable
    public final int describeContents() {
        Object value = this.E.getValue();
        value.getClass();
        return (((byte[]) value).length <= 16384 ? 1 : 0) ^ 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        return x44.r(a(), ((lud) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) throws ErrnoException {
        parcel.getClass();
        u0h u0hVar = this.E;
        Object value = u0hVar.getValue();
        value.getClass();
        if (((byte[]) value).length <= 16384) {
            parcel.writeInt(0);
            Object value2 = u0hVar.getValue();
            value2.getClass();
            parcel.writeByteArray((byte[]) value2);
            return;
        }
        parcel.writeInt(1);
        Object value3 = u0hVar.getValue();
        value3.getClass();
        byte[] bArr = (byte[]) value3;
        SharedMemory sharedMemoryCreate = SharedMemory.create("ProtoParcelable", bArr.length);
        try {
            SharedMemory sharedMemoryE = u2g.e(sharedMemoryCreate);
            sharedMemoryE.setProtect(OsConstants.PROT_READ | OsConstants.PROT_WRITE);
            sharedMemoryE.mapReadWrite().put(bArr);
            sharedMemoryE.setProtect(OsConstants.PROT_READ);
            sharedMemoryE.writeToParcel(parcel, i);
            wd6.Z(sharedMemoryCreate, null);
        } finally {
        }
    }
}
