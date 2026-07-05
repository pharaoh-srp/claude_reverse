package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.pti;
import defpackage.qti;
import defpackage.rti;

/* JADX INFO: loaded from: classes2.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(pti ptiVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        rti rtiVarG = remoteActionCompat.a;
        boolean z = true;
        if (ptiVar.e(1)) {
            rtiVarG = ptiVar.g();
        }
        remoteActionCompat.a = (IconCompat) rtiVarG;
        CharSequence charSequence = remoteActionCompat.b;
        if (ptiVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((qti) ptiVar).e);
        }
        remoteActionCompat.b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.c;
        if (ptiVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((qti) ptiVar).e);
        }
        remoteActionCompat.c = charSequence2;
        remoteActionCompat.d = (PendingIntent) ptiVar.f(remoteActionCompat.d, 4);
        boolean z2 = remoteActionCompat.e;
        if (ptiVar.e(5)) {
            z2 = ((qti) ptiVar).e.readInt() != 0;
        }
        remoteActionCompat.e = z2;
        boolean z3 = remoteActionCompat.f;
        if (!ptiVar.e(6)) {
            z = z3;
        } else if (((qti) ptiVar).e.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.f = z;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, pti ptiVar) {
        ptiVar.getClass();
        IconCompat iconCompat = remoteActionCompat.a;
        ptiVar.h(1);
        ptiVar.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.b;
        ptiVar.h(2);
        Parcel parcel = ((qti) ptiVar).e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.c;
        ptiVar.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.d;
        ptiVar.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z = remoteActionCompat.e;
        ptiVar.h(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f;
        ptiVar.h(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
