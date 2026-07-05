package com.anthropic.claude.chat.bottomsheet;

import com.anthropic.claude.analytics.events.SearchEvents$CombinedSourcesSheetSeen;
import com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination;
import defpackage.bz7;
import defpackage.iei;
import defpackage.sf5;
import defpackage.t53;
import defpackage.tp4;
import defpackage.xzg;

/* JADX INFO: loaded from: classes2.dex */
public final class w0 extends xzg implements bz7 {
    public final /* synthetic */ t53 E;
    public final /* synthetic */ ChatScreenModalBottomSheetDestination F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(t53 t53Var, ChatScreenModalBottomSheetDestination chatScreenModalBottomSheetDestination, tp4 tp4Var) {
        super(1, tp4Var);
        this.E = t53Var;
        this.F = chatScreenModalBottomSheetDestination;
    }

    @Override // defpackage.vd1
    public final tp4 create(tp4 tp4Var) {
        return new w0(this.E, this.F, tp4Var);
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        w0 w0Var = (w0) create((tp4) obj);
        iei ieiVar = iei.a;
        w0Var.invokeSuspend(ieiVar);
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        sf5.h0(obj);
        ChatScreenModalBottomSheetDestination.ViewCombinedSources viewCombinedSources = (ChatScreenModalBottomSheetDestination.ViewCombinedSources) this.F;
        int size = viewCombinedSources.getCitations().size();
        int size2 = viewCombinedSources.getOtherSources().size();
        t53 t53Var = this.E;
        t53Var.w.e(new SearchEvents$CombinedSourcesSheetSeen(t53Var.d.e, size, size2), SearchEvents$CombinedSourcesSheetSeen.Companion.serializer());
        return iei.a;
    }
}
