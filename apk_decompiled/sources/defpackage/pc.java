package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class pc implements Parcelable {
    public static final Parcelable.Creator<pc> CREATOR = new dpj(1);
    public final int E;
    public final Intent F;

    public pc(Intent intent, int i) {
        this.E = i;
        this.F = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "ActivityResult{resultCode=" + pmk.k(this.E) + ", data=" + this.F + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.E);
        Intent intent = this.F;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }
}
