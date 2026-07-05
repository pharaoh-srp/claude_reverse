package com.datadog.android.rum.internal.domain.scope;

import defpackage.iei;
import defpackage.sta;
import defpackage.ts9;
import defpackage.zy7;

/* JADX INFO: loaded from: classes.dex */
public final class o extends ts9 implements zy7 {
    public final /* synthetic */ r F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(r rVar) {
        super(0);
        this.F = rVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        r rVar = this.F;
        rVar.y = sta.q0(rVar.a.b());
        return iei.a;
    }
}
