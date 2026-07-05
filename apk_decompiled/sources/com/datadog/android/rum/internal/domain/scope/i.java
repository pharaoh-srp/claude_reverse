package com.datadog.android.rum.internal.domain.scope;

import defpackage.bz7;
import defpackage.hf;
import defpackage.iei;
import defpackage.sog;
import defpackage.sxe;
import defpackage.ts9;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends ts9 implements bz7 {
    public final /* synthetic */ sxe F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(sxe sxeVar) {
        super(1);
        this.F = sxeVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        hf hfVar = (hf) obj;
        hfVar.getClass();
        String str = this.F.d;
        if (str == null) {
            str = "";
        }
        hfVar.h(str, new sog(null, null));
        return iei.a;
    }
}
