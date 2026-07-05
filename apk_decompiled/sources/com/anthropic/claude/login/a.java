package com.anthropic.claude.login;

import com.anthropic.claude.login.OverlayScreens;
import defpackage.ae5;
import defpackage.iei;
import defpackage.jga;
import defpackage.pz7;
import defpackage.rwe;
import defpackage.sf5;
import defpackage.tp4;
import defpackage.xzg;

/* JADX INFO: loaded from: classes.dex */
public final class a extends xzg implements pz7 {
    public /* synthetic */ Object E;
    public final /* synthetic */ rwe F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(rwe rweVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.F = rweVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        a aVar = new a(this.F, tp4Var);
        aVar.E = obj;
        return aVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        a aVar = (a) create((MagicLinkIntentData) obj, (tp4) obj2);
        iei ieiVar = iei.a;
        aVar.invokeSuspend(ieiVar);
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        MagicLinkIntentData magicLinkIntentData = (MagicLinkIntentData) this.E;
        sf5.h0(obj);
        this.F.E.m(new jga(3, new OverlayScreens[]{OverlayScreens.None.INSTANCE, new OverlayScreens.MagicLinkVerify(magicLinkIntentData)}), new ae5(18));
        return iei.a;
    }
}
