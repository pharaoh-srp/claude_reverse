package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class xh0 extends View.BaseSavedState {
    public static final Parcelable.Creator<xh0> CREATOR = new dpj(4);
    public boolean E;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.E ? (byte) 1 : (byte) 0);
    }
}
