package com.google.android.gms.internal.measurement;

import defpackage.grc;

/* JADX INFO: loaded from: classes.dex */
final class zzog extends IllegalArgumentException {
    public zzog(int i, int i2) {
        super(grc.o(i, i2, "Unpaired surrogate at index ", " of "));
    }
}
