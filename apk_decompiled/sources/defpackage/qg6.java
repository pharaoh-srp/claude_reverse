package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class qg6 implements Parcelable {
    public static final Parcelable.Creator<qg6> CREATOR = new dpj(24);
    public int E;
    public final UUID F;
    public final String G;
    public final String H;
    public final byte[] I;

    public qg6(Parcel parcel) {
        this.F = new UUID(parcel.readLong(), parcel.readLong());
        this.G = parcel.readString();
        String string = parcel.readString();
        String str = tpi.a;
        this.H = string;
        this.I = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qg6)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        qg6 qg6Var = (qg6) obj;
        return Objects.equals(this.G, qg6Var.G) && Objects.equals(this.H, qg6Var.H) && Objects.equals(this.F, qg6Var.F) && Arrays.equals(this.I, qg6Var.I);
    }

    public final int hashCode() {
        if (this.E == 0) {
            int iHashCode = this.F.hashCode() * 31;
            String str = this.G;
            this.E = Arrays.hashCode(this.I) + kgh.l((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.H);
        }
        return this.E;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        UUID uuid = this.F;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.G);
        parcel.writeString(this.H);
        parcel.writeByteArray(this.I);
    }

    public qg6(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.F = uuid;
        this.G = str;
        str2.getClass();
        this.H = gkb.k(str2);
        this.I = bArr;
    }
}
