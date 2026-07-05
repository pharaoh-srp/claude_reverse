package com.anthropic.claude.app.onboarding;

import com.anthropic.claude.analytics.events.GroveEvents$GroveLocation;
import com.anthropic.claude.analytics.events.GroveEvents$GrovePolicyToggled;
import defpackage.bz7;
import defpackage.iei;
import defpackage.m08;
import defpackage.tec;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d extends m08 implements bz7 {
    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        Boolean bool = (Boolean) obj;
        boolean zBooleanValue = bool.booleanValue();
        tec tecVar = (tec) this.receiver;
        if (tecVar.n) {
            tecVar.p.setValue(bool);
            tecVar.d.e(new GroveEvents$GrovePolicyToggled(zBooleanValue, GroveEvents$GroveLocation.ONBOARDING), GroveEvents$GrovePolicyToggled.Companion.serializer());
        }
        return iei.a;
    }
}
