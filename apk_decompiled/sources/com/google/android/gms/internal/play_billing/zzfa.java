package com.google.android.gms.internal.play_billing;

import defpackage.grc;
import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfa extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    public zzfa(long j, long j2, int i, IndexOutOfBoundsException indexOutOfBoundsException) {
        Locale locale = Locale.US;
        StringBuilder sbW = grc.w(j, "Pos: ", ", limit: ");
        sbW.append(j2);
        sbW.append(", len: ");
        sbW.append(i);
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(sbW.toString()), indexOutOfBoundsException);
    }

    public zzfa(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }
}
