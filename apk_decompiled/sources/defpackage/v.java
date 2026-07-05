package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class v implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int a;

    public /* synthetic */ v(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                if (parcel.readParcelable(classLoader) == null) {
                    return w.F;
                }
                sz6.j("superState must be null");
                return null;
            case 1:
                return new uva(parcel, classLoader);
            default:
                return new m1i(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new w[i];
            case 1:
                return new uva[i];
            default:
                return new m1i[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                if (parcel.readParcelable(null) == null) {
                    return w.F;
                }
                sz6.j("superState must be null");
                return null;
            case 1:
                return new uva(parcel, null);
            default:
                return new m1i(parcel, null);
        }
    }
}
