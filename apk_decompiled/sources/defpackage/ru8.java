package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ru8 extends hmj {
    public ru8() {
        super("com.google.android.gms.common.api.internal.IStatusCallback", 0);
    }

    @Override // defpackage.hmj
    public final boolean D(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Status status = (Status) rmj.a(parcel, Status.CREATOR);
        rmj.b(parcel);
        F(status);
        return true;
    }

    public abstract void F(Status status);
}
