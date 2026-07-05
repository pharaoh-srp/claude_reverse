package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class sx7 implements Parcelable {
    public static final Parcelable.Creator<sx7> CREATOR = new dpj(28);
    public ArrayList E;
    public ArrayList F;
    public ub1[] G;
    public int H;
    public String I = null;
    public ArrayList J = new ArrayList();
    public ArrayList K = new ArrayList();
    public ArrayList L;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.E);
        parcel.writeStringList(this.F);
        parcel.writeTypedArray(this.G, i);
        parcel.writeInt(this.H);
        parcel.writeString(this.I);
        parcel.writeStringList(this.J);
        parcel.writeTypedList(this.K);
        parcel.writeTypedList(this.L);
    }
}
