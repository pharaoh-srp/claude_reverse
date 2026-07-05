package com.google.android.gms.common.internal;

import defpackage.dgj;
import defpackage.hh4;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaf extends Exception {
    public final hh4 E;

    public zzaf(hh4 hh4Var) {
        dgj.n("ResolvableConnectionException can only be created with a connection result containing a resolution.", (hh4Var.F == 0 || hh4Var.G == null) ? false : true);
        this.E = hh4Var;
    }
}
