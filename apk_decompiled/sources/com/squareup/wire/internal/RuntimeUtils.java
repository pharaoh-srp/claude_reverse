package com.squareup.wire.internal;

import defpackage.mdj;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0080\f\u001a\u0015\u0010\u0000\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0080\f\u001a\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0080\f¨\u0006\u0006"}, d2 = {"and", "", "", "other", "", "shl", "wire-runtime"}, k = 2, mv = {2, 0, 0}, xi = mdj.f)
public final class RuntimeUtils {
    public static final long and(byte b, long j) {
        return ((long) b) & j;
    }

    public static final int shl(byte b, int i) {
        return b << i;
    }

    public static final int and(byte b, int i) {
        return b & i;
    }
}
