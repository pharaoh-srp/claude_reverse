package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class m1i extends w {
    public static final Parcelable.Creator<m1i> CREATOR = new v(2);
    public int G;
    public boolean H;

    public m1i(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.G = parcel.readInt();
        this.H = parcel.readInt() != 0;
    }

    @Override // defpackage.w, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.G);
        parcel.writeInt(this.H ? 1 : 0);
    }
}
