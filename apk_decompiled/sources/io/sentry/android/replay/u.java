package io.sentry.android.replay;

import android.view.View;
import defpackage.csg;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class u extends CopyOnWriteArrayList {
    public final /* synthetic */ v E;

    public u(v vVar) {
        this.E = vVar;
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
    public final boolean add(Object obj) throws Exception {
        g gVar = (g) obj;
        v vVar = this.E;
        io.sentry.v vVarA = vVar.F.a();
        try {
            for (View view : vVar.H) {
                if (gVar != null) {
                    gVar.c(view, true);
                }
            }
            csg.o(vVarA, null);
            return super.add(gVar);
        } finally {
        }
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof g) {
            return super.contains((g) obj);
        }
        return false;
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj == null ? true : obj instanceof g) {
            return super.indexOf((g) obj);
        }
        return -1;
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj == null ? true : obj instanceof g) {
            return super.lastIndexOf((g) obj);
        }
        return -1;
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null ? true : obj instanceof g) {
            return super.remove((g) obj);
        }
        return false;
    }
}
