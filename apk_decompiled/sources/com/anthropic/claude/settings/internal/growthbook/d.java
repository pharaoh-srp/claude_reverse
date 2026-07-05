package com.anthropic.claude.settings.internal.growthbook;

import defpackage.cc8;
import defpackage.id8;
import defpackage.iei;
import defpackage.pz7;
import defpackage.sf5;
import defpackage.tp4;
import defpackage.xzg;
import defpackage.yvb;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends xzg implements pz7 {
    public /* synthetic */ Object E;
    public final /* synthetic */ Map F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Map map, tp4 tp4Var) {
        super(2, tp4Var);
        this.F = map;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        d dVar = new d(this.F, tp4Var);
        dVar.E = obj;
        return dVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        d dVar = (d) create((yvb) obj, (tp4) obj2);
        iei ieiVar = iei.a;
        dVar.invokeSuspend(ieiVar);
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        yvb yvbVar = (yvb) this.E;
        sf5.h0(obj);
        yvbVar.d(id8.k, cc8.a.d(new GrowthBookOverrideScreenData$Companion$PersistedCustomFeatures(this.F), GrowthBookOverrideScreenData$Companion$PersistedCustomFeatures.Companion.serializer()));
        return iei.a;
    }
}
