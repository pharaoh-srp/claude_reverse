package com.datadog.android.rum.internal.domain.scope;

import defpackage.ts9;
import defpackage.zy7;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class q extends ts9 implements zy7 {
    public final /* synthetic */ long F;
    public final /* synthetic */ String G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(long j, String str) {
        super(0);
        this.F = j;
        this.G = str;
    }

    @Override // defpackage.zy7
    public final Object a() {
        return String.format(Locale.US, "View loading time %dns added to the view %s", Arrays.copyOf(new Object[]{Long.valueOf(this.F), this.G}, 2));
    }
}
