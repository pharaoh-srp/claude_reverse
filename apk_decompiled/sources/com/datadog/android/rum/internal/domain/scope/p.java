package com.datadog.android.rum.internal.domain.scope;

import com.datadog.android.rum.internal.domain.scope.RumRawEvent;
import defpackage.iei;
import defpackage.sta;
import defpackage.ts9;
import defpackage.zy7;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends ts9 implements zy7 {
    public final /* synthetic */ r F;
    public final /* synthetic */ RumRawEvent.StopView G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(r rVar, RumRawEvent.StopView stopView) {
        super(0);
        this.F = rVar;
        this.G = stopView;
    }

    @Override // defpackage.zy7
    public final Object a() {
        r rVar = this.F;
        rVar.w.putAll(this.G.b);
        rVar.y = sta.q0(rVar.a.b());
        return iei.a;
    }
}
