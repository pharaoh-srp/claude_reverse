package com.google.android.play.agesignals;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import defpackage.sz6;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class AgeSignalsException extends ApiException {
    public AgeSignalsException(int i) {
        super(new Status(i, String.format(Locale.getDefault(), "Age Signals Error: %d", Integer.valueOf(i)), null, null));
        if (i != 0) {
            return;
        }
        sz6.p("errorCode should not be 0.");
        throw null;
    }
}
