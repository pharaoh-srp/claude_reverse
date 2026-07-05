package com.datadog.android.rum.internal.domain.scope;

import defpackage.bz7;
import defpackage.hf;
import defpackage.iei;
import defpackage.sxe;
import defpackage.ts9;
import defpackage.xn5;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends ts9 implements bz7 {
    public final /* synthetic */ sxe F;
    public final /* synthetic */ xn5 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(sxe sxeVar, xn5 xn5Var) {
        super(1);
        this.F = sxeVar;
        this.G = xn5Var;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        hf hfVar = (hf) obj;
        hfVar.getClass();
        String str = this.F.d;
        if (str == null) {
            str = "";
        }
        hfVar.i(str, this.G);
        return iei.a;
    }
}
