package defpackage;

import android.widget.RemoteViews;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class tee {
    public static final tee d = new tee(new long[0], new RemoteViews[0], 1);
    public final long[] a;
    public final RemoteViews[] b;
    public final int c;

    public tee(long[] jArr, RemoteViews[] remoteViewsArr, int i) {
        this.a = jArr;
        this.b = remoteViewsArr;
        this.c = i;
        if (jArr.length != remoteViewsArr.length) {
            sz6.p("RemoteCollectionItems has different number of ids and views");
            throw null;
        }
        if (i < 1) {
            sz6.p("View type count must be >= 1");
            throw null;
        }
        ArrayList arrayList = new ArrayList(remoteViewsArr.length);
        for (RemoteViews remoteViews : remoteViewsArr) {
            arrayList.add(Integer.valueOf(remoteViews.getLayoutId()));
        }
        int size = w44.p1(w44.s1(arrayList)).size();
        if (size <= this.c) {
            return;
        }
        throw new IllegalArgumentException(("View type count is set to " + this.c + ", but the collection contains " + size + " different layout ids").toString());
    }
}
