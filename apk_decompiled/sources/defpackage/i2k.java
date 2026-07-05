package defpackage;

import android.os.BadParcelableException;
import android.os.Parcel;
import com.google.android.gms.internal.play_billing.e;

/* JADX INFO: loaded from: classes3.dex */
public final class i2k extends rlj {
    public final e j;

    public i2k(e eVar) {
        super("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideServiceCallback", 2);
        this.j = eVar;
    }

    @Override // defpackage.rlj
    public final boolean b(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        int i2 = parcel.readInt();
        int i3 = atj.a;
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(grc.p(iDataAvail, "Parcel data not fully consumed, unread size: "));
        }
        this.j.a(Integer.valueOf(i2));
        return true;
    }
}
