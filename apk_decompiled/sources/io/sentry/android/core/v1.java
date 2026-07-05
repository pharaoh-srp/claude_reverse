package io.sentry.android.core;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v1 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        io.sentry.p1 p1Var = (io.sentry.p1) obj;
        io.sentry.p1 p1Var2 = (io.sentry.p1) obj2;
        if (p1Var == p1Var2) {
            return 0;
        }
        int iCompareTo = p1Var.D().compareTo(p1Var2.D());
        return iCompareTo != 0 ? iCompareTo : p1Var.y().F.toString().compareTo(p1Var2.y().F.toString());
    }
}
