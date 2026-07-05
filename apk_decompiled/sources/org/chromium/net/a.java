package org.chromium.net;

import defpackage.cc5;
import java.util.Comparator;
import org.chromium.net.CronetEngine;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        cc5 cc5Var = (cc5) obj;
        cc5 cc5Var2 = (cc5) obj2;
        if (CronetProvider.PROVIDER_NAME_FALLBACK.equals(cc5Var.a.getName())) {
            return 1;
        }
        if (CronetProvider.PROVIDER_NAME_FALLBACK.equals(cc5Var2.a.getName())) {
            return -1;
        }
        return -CronetEngine.Builder.compareVersions(cc5Var.a.getVersion(), cc5Var2.a.getVersion());
    }
}
