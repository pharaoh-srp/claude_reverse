package defpackage;

import android.app.Notification;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class j8c {
    public final String a;
    public final Notification b;

    public j8c(String str, Notification notification) {
        this.a = str;
        this.b = notification;
    }

    public final void a(ku8 ku8Var) {
        String str = this.a;
        Notification notification = this.b;
        iu8 iu8Var = (iu8) ku8Var;
        iu8Var.getClass();
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(ku8.h);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(9200);
            parcelObtain.writeString(null);
            parcelObtain.writeTypedObject(notification, 0);
            iu8Var.i.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    public final String toString() {
        return ij0.m(new StringBuilder("NotifyTask[packageName:"), this.a, ", id:9200, tag:null]");
    }
}
