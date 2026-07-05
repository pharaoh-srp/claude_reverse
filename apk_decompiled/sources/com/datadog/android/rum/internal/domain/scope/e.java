package com.datadog.android.rum.internal.domain.scope;

import com.datadog.android.rum.internal.domain.scope.RumRawEvent;
import defpackage.da9;
import defpackage.ts9;
import defpackage.zy7;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends ts9 implements zy7 {
    public final /* synthetic */ RumRawEvent F;
    public final /* synthetic */ boolean G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(RumRawEvent rumRawEvent, boolean z) {
        super(0);
        this.F = rumRawEvent;
        this.G = z;
    }

    @Override // defpackage.zy7
    public final Object a() {
        ((RumRawEvent.AddViewLoadingTime) this.F).getClass();
        boolean z = this.G;
        return new da9(false, z, !z);
    }
}
