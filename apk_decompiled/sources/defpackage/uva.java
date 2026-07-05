package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class uva extends w {
    public static final Parcelable.Creator<uva> CREATOR = new v(1);
    public boolean G;

    public uva(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            uva.class.getClassLoader();
        }
        this.G = parcel.readInt() == 1;
    }

    @Override // defpackage.w, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.G ? 1 : 0);
    }
}
