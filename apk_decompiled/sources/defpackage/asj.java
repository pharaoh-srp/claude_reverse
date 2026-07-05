package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final class asj extends dmj implements ksj {
    public final int O(String str, int i, String str2) {
        Parcel parcelM = M();
        parcelM.writeInt(i);
        parcelM.writeString(str);
        parcelM.writeString(str2);
        Parcel parcelN = N(parcelM, 1);
        int i2 = parcelN.readInt();
        parcelN.recycle();
        return i2;
    }

    public final int P(int i, String str, String str2, Bundle bundle) {
        Parcel parcelM = M();
        parcelM.writeInt(i);
        parcelM.writeString(str);
        parcelM.writeString(str2);
        int i2 = atj.a;
        parcelM.writeInt(1);
        bundle.writeToParcel(parcelM, 0);
        Parcel parcelN = N(parcelM, 10);
        int i3 = parcelN.readInt();
        parcelN.recycle();
        return i3;
    }

    public final Bundle Q(String str, String str2, String str3) {
        Parcel parcelM = M();
        parcelM.writeInt(3);
        parcelM.writeString(str);
        parcelM.writeString(str2);
        parcelM.writeString(str3);
        parcelM.writeString(null);
        Parcel parcelN = N(parcelM, 3);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) atj.a(parcelN);
        parcelN.recycle();
        return bundle;
    }

    public final Bundle R(int i, String str, String str2, String str3, Bundle bundle) {
        Parcel parcelM = M();
        parcelM.writeInt(i);
        parcelM.writeString(str);
        parcelM.writeString(str2);
        parcelM.writeString(str3);
        parcelM.writeString(null);
        int i2 = atj.a;
        parcelM.writeInt(1);
        bundle.writeToParcel(parcelM, 0);
        Parcel parcelN = N(parcelM, 8);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) atj.a(parcelN);
        parcelN.recycle();
        return bundle2;
    }

    public final Bundle S(String str, String str2, String str3) {
        Parcel parcelM = M();
        parcelM.writeInt(3);
        parcelM.writeString(str);
        parcelM.writeString(str2);
        parcelM.writeString(str3);
        Parcel parcelN = N(parcelM, 4);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) atj.a(parcelN);
        parcelN.recycle();
        return bundle;
    }

    public final Bundle T(int i, String str, String str2, String str3, Bundle bundle) {
        Parcel parcelM = M();
        parcelM.writeInt(i);
        parcelM.writeString(str);
        parcelM.writeString(str2);
        parcelM.writeString(str3);
        int i2 = atj.a;
        parcelM.writeInt(1);
        bundle.writeToParcel(parcelM, 0);
        Parcel parcelN = N(parcelM, 11);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) atj.a(parcelN);
        parcelN.recycle();
        return bundle2;
    }

    public final Bundle U(int i, String str, String str2, Bundle bundle, Bundle bundle2) {
        Parcel parcelM = M();
        parcelM.writeInt(i);
        parcelM.writeString(str);
        parcelM.writeString(str2);
        int i2 = atj.a;
        parcelM.writeInt(1);
        bundle.writeToParcel(parcelM, 0);
        parcelM.writeInt(1);
        bundle2.writeToParcel(parcelM, 0);
        Parcel parcelN = N(parcelM, MTTypesetterKt.kDelimiterFactor);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle3 = (Bundle) atj.a(parcelN);
        parcelN.recycle();
        return bundle3;
    }

    public final void V(String str, Bundle bundle, hzj hzjVar) {
        Parcel parcelM = M();
        parcelM.writeInt(18);
        parcelM.writeString(str);
        int i = atj.a;
        parcelM.writeInt(1);
        bundle.writeToParcel(parcelM, 0);
        parcelM.writeStrongBinder(hzjVar);
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.j.transact(1301, parcelM, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcelM.recycle();
            parcelObtain.recycle();
        }
    }
}
