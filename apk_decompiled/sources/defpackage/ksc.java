package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class ksc implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int a;

    public /* synthetic */ ksc(int i) {
        this.a = i;
    }

    public static lsc a(Parcel parcel, ClassLoader classLoader) {
        fdg fdgVar;
        if (classLoader == null) {
            classLoader = ksc.class.getClassLoader();
        }
        Object value = parcel.readValue(classLoader);
        int i = parcel.readInt();
        if (i == 0) {
            fdgVar = ql8.J;
        } else if (i == 1) {
            fdgVar = a5.N;
        } else {
            if (i != 2) {
                sz6.j(grc.u("Unsupported MutableState policy ", i, " was restored"));
                return null;
            }
            fdgVar = zp3.X;
        }
        return new lsc(value, fdgVar);
    }

    public static pdg b(Parcel parcel, ClassLoader classLoader) {
        pdg pdgVar = new pdg();
        if (classLoader == null) {
            classLoader = pdg.class.getClassLoader();
        }
        int i = parcel.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            pdgVar.add(parcel.readValue(classLoader));
        }
        return pdgVar;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                return a(parcel, classLoader);
            default:
                return b(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new lsc[i];
            default:
                return new pdg[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return a(parcel, null);
            default:
                return b(parcel, null);
        }
    }
}
