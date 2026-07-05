package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class u79 implements Parcelable {
    public static final Parcelable.Creator<u79> CREATOR = new s38(5);
    public final IntentSender E;
    public final Intent F;
    public final int G;
    public final int H;

    public u79(IntentSender intentSender, Intent intent, int i, int i2) {
        intentSender.getClass();
        this.E = intentSender;
        this.F = intent;
        this.G = i;
        this.H = i2;
    }

    public final Intent a() {
        return this.F;
    }

    public final int b() {
        return this.G;
    }

    public final int c() {
        return this.H;
    }

    public final IntentSender d() {
        return this.E;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.E, i);
        parcel.writeParcelable(this.F, i);
        parcel.writeInt(this.G);
        parcel.writeInt(this.H);
    }
}
