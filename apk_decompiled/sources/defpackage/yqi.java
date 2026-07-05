package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.arkivanov.essenty.statekeeper.SerializableContainer;

/* JADX INFO: loaded from: classes3.dex */
public final class yqi implements Parcelable {
    public static final xqi CREATOR = new xqi();
    public final Object E;
    public final kw9 F;

    public yqi(SerializableContainer serializableContainer, kw9 kw9Var) {
        this.E = serializableContainer;
        this.F = kw9Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeByteArray((byte[]) this.F.getValue());
    }
}
