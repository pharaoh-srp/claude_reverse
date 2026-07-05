package io.sentry.android.core;

import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class d0 extends CopyOnWriteArrayList {
    public final /* synthetic */ e0 E;

    public d0(e0 e0Var) {
        this.E = e0Var;
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        c0 c0Var = (c0) obj;
        boolean zAdd = super.add(c0Var);
        if (Boolean.FALSE.equals(this.E.F.H)) {
            c0Var.i();
            return zAdd;
        }
        if (Boolean.TRUE.equals(this.E.F.H)) {
            c0Var.x();
        }
        return zAdd;
    }
}
