package defpackage;

import android.os.BadParcelableException;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class qxj {
    public static final ClassLoader a = qxj.class.getClassLoader();

    public static Parcelable a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static HashMap b(Parcel parcel) {
        return parcel.readHashMap(a);
    }

    public static void c(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }

    public static void d(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static void e(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(grc.p(iDataAvail, "Parcel data not fully consumed, unread size: "));
        }
    }

    public static void f(Parcel parcel, lrj lrjVar) {
        if (lrjVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            lrjVar.writeToParcel(parcel, 1);
        }
    }

    public static boolean g(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
