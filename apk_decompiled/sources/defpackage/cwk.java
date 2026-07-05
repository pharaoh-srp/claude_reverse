package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class cwk extends dmj implements lwk {
    public final awk O(cbc cbcVar, uwk uwkVar) {
        awk awkVar;
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.k);
        int i = hyj.a;
        parcelObtain.writeStrongBinder(cbcVar);
        parcelObtain.writeInt(1);
        uwkVar.writeToParcel(parcelObtain, 0);
        Parcel parcelJ = J(parcelObtain, 1);
        IBinder strongBinder = parcelJ.readStrongBinder();
        if (strongBinder == null) {
            awkVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.mlkit.nl.languageid.aidls.ILanguageIdentifier");
            awkVar = iInterfaceQueryLocalInterface instanceof awk ? (awk) iInterfaceQueryLocalInterface : new awk(strongBinder, "com.google.mlkit.nl.languageid.aidls.ILanguageIdentifier", 4);
        }
        parcelJ.recycle();
        return awkVar;
    }
}
