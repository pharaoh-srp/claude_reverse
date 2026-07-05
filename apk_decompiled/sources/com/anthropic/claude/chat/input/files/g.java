package com.anthropic.claude.chat.input.files;

import com.agog.mathdisplay.render.MTTypesetterKt;
import defpackage.agj;
import defpackage.bz7;
import defpackage.iei;
import defpackage.pf5;
import defpackage.pz7;
import defpackage.sf5;
import defpackage.tp4;
import defpackage.xzg;
import defpackage.zfj;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends xzg implements pz7 {
    public /* synthetic */ Object E;
    public final /* synthetic */ bz7 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(tp4 tp4Var, bz7 bz7Var) {
        super(2, tp4Var);
        this.F = bz7Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        g gVar = new g(tp4Var, this.F);
        gVar.E = obj;
        return gVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        g gVar = (g) create((agj) obj, (tp4) obj2);
        iei ieiVar = iei.a;
        gVar.invokeSuspend(ieiVar);
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        agj agjVar = (agj) this.E;
        sf5.h0(obj);
        if (agjVar.b == zfj.F) {
            pf5 pf5Var = agjVar.e;
            pf5Var.getClass();
            Object objValueOf = Float.valueOf(Float.NaN);
            Object obj2 = pf5Var.a.get("progress");
            if (obj2 instanceof Float) {
                objValueOf = obj2;
            }
            Float f = new Float(((Number) objValueOf).floatValue());
            float fFloatValue = f.floatValue();
            if (MTTypesetterKt.kLineSkipLimitMultiplier > fFloatValue || fFloatValue > 1.0f) {
                f = null;
            }
            this.F.invoke(f);
        }
        return iei.a;
    }
}
