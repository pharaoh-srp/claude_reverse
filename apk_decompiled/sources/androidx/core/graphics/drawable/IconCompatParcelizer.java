package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.pti;
import defpackage.qti;
import defpackage.sz6;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(pti ptiVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.a = -1;
        iconCompat.c = null;
        iconCompat.d = null;
        iconCompat.e = 0;
        iconCompat.f = 0;
        iconCompat.g = null;
        iconCompat.h = IconCompat.k;
        iconCompat.i = null;
        iconCompat.a = !ptiVar.e(1) ? -1 : ((qti) ptiVar).e.readInt();
        byte[] bArr = iconCompat.c;
        if (ptiVar.e(2)) {
            Parcel parcel = ((qti) ptiVar).e;
            int i = parcel.readInt();
            if (i < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.c = bArr;
        iconCompat.d = ptiVar.f(iconCompat.d, 3);
        int i2 = iconCompat.e;
        if (ptiVar.e(4)) {
            i2 = ((qti) ptiVar).e.readInt();
        }
        iconCompat.e = i2;
        int i3 = iconCompat.f;
        if (ptiVar.e(5)) {
            i3 = ((qti) ptiVar).e.readInt();
        }
        iconCompat.f = i3;
        iconCompat.g = (ColorStateList) ptiVar.f(iconCompat.g, 6);
        String string = iconCompat.i;
        if (ptiVar.e(7)) {
            string = ((qti) ptiVar).e.readString();
        }
        iconCompat.i = string;
        String string2 = iconCompat.j;
        if (ptiVar.e(8)) {
            string2 = ((qti) ptiVar).e.readString();
        }
        iconCompat.j = string2;
        iconCompat.h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.a) {
            case -1:
                Parcelable parcelable = iconCompat.d;
                if (parcelable != null) {
                    iconCompat.b = parcelable;
                    return iconCompat;
                }
                sz6.p("Invalid icon");
                return null;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.d;
                if (parcelable2 != null) {
                    iconCompat.b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.c;
                iconCompat.b = bArr3;
                iconCompat.a = 3;
                iconCompat.e = 0;
                iconCompat.f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.c, Charset.forName("UTF-16"));
                iconCompat.b = str;
                if (iconCompat.a == 2 && iconCompat.j == null) {
                    iconCompat.j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.b = iconCompat.c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, pti ptiVar) {
        ptiVar.getClass();
        iconCompat.i = iconCompat.h.name();
        switch (iconCompat.a) {
            case -1:
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case 1:
            case 5:
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case 2:
                iconCompat.c = ((String) iconCompat.b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.c = (byte[]) iconCompat.b;
                break;
            case 4:
            case 6:
                iconCompat.c = iconCompat.b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.a;
        if (-1 != i) {
            ptiVar.h(1);
            ((qti) ptiVar).e.writeInt(i);
        }
        byte[] bArr = iconCompat.c;
        if (bArr != null) {
            ptiVar.h(2);
            Parcel parcel = ((qti) ptiVar).e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            ptiVar.h(3);
            ((qti) ptiVar).e.writeParcelable(parcelable, 0);
        }
        int i2 = iconCompat.e;
        if (i2 != 0) {
            ptiVar.h(4);
            ((qti) ptiVar).e.writeInt(i2);
        }
        int i3 = iconCompat.f;
        if (i3 != 0) {
            ptiVar.h(5);
            ((qti) ptiVar).e.writeInt(i3);
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            ptiVar.h(6);
            ((qti) ptiVar).e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.i;
        if (str != null) {
            ptiVar.h(7);
            ((qti) ptiVar).e.writeString(str);
        }
        String str2 = iconCompat.j;
        if (str2 != null) {
            ptiVar.h(8);
            ((qti) ptiVar).e.writeString(str2);
        }
    }
}
