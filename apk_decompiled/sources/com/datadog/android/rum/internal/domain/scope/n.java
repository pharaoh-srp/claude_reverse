package com.datadog.android.rum.internal.domain.scope;

import com.datadog.android.rum.internal.domain.scope.RumRawEvent;
import defpackage.ts9;
import defpackage.zy7;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends ts9 implements zy7 {
    public final /* synthetic */ RumRawEvent.StartAction F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(RumRawEvent.StartAction startAction) {
        super(0);
        this.F = startAction;
    }

    @Override // defpackage.zy7
    public final Object a() {
        Locale locale = Locale.US;
        RumRawEvent.StartAction startAction = this.F;
        return String.format(locale, "RUM Action (%s on %s) was dropped, because another action is still active for the same view", Arrays.copyOf(new Object[]{startAction.a, startAction.b}, 2));
    }
}
