package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class iq3 extends a4 {
    public static final Parcelable.Creator<iq3> CREATOR = new zmj(21);
    public final Intent E;

    public iq3(Intent intent) {
        this.E = intent;
    }

    public final String l0() {
        Intent intent = this.E;
        String stringExtra = intent.getStringExtra("google.message_id");
        return stringExtra == null ? intent.getStringExtra("message_id") : stringExtra;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK0 = xn5.K0(parcel, 20293);
        xn5.E0(parcel, 1, this.E, i);
        xn5.L0(parcel, iK0);
    }
}
