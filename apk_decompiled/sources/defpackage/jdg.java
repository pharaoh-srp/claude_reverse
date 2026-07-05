package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class jdg implements Parcelable.ClassLoaderCreator {
    public static kdg a(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = jdg.class.getClassLoader();
        }
        int i = parcel.readInt();
        nif nifVar = new nif(parcel, 7, classLoader);
        if (i == 0) {
            return new kdg();
        }
        pzc pzcVarH = cbg.F.h();
        for (int i2 = 0; i2 < i; i2++) {
            pzcVarH.add(nifVar.invoke(Integer.valueOf(i2)));
        }
        return new kdg(pzcVarH.a());
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return a(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new kdg[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return a(parcel, classLoader);
    }
}
