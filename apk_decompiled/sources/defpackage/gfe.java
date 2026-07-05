package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class gfe {
    public final boolean a;
    public final int b;
    public final Object c;
    public final Object d;

    public gfe(long[] jArr, RemoteViews[] remoteViewsArr) {
        this.c = jArr;
        this.d = remoteViewsArr;
        this.a = false;
        this.b = 1;
        if (jArr.length != remoteViewsArr.length) {
            sz6.p("RemoteCollectionItems has different number of ids and views");
            throw null;
        }
        ArrayList arrayList = new ArrayList(remoteViewsArr.length);
        for (RemoteViews remoteViews : remoteViewsArr) {
            arrayList.add(Integer.valueOf(remoteViews.getLayoutId()));
        }
        int size = w44.p1(w44.s1(arrayList)).size();
        if (size <= 1) {
            return;
        }
        mr9.q(grc.u("View type count is set to 1, but the collection contains ", size, " different layout ids"));
        throw null;
    }

    public void a(ge0 ge0Var, j5h j5hVar) {
        ((dke) ((w1c) this.d).c).accept(ge0Var, j5hVar);
    }

    public gfe(w1c w1cVar, fba fbaVar, boolean z, int i) {
        this.d = w1cVar;
        this.c = fbaVar;
        this.a = z;
        this.b = i;
    }

    public gfe(Parcel parcel) {
        parcel.getClass();
        int i = parcel.readInt();
        long[] jArr = new long[i];
        this.c = jArr;
        parcel.readLongArray(jArr);
        Parcelable.Creator creator = RemoteViews.CREATOR;
        creator.getClass();
        RemoteViews[] remoteViewsArr = new RemoteViews[i];
        parcel.readTypedArray(remoteViewsArr, creator);
        for (int i2 = 0; i2 < i; i2++) {
            if (remoteViewsArr[i2] == null) {
                mr9.c(46, remoteViewsArr, "null element found in ");
                throw null;
            }
        }
        this.d = remoteViewsArr;
        this.a = parcel.readInt() == 1;
        this.b = parcel.readInt();
    }
}
