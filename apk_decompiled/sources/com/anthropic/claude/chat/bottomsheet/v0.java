package com.anthropic.claude.chat.bottomsheet;

import com.anthropic.claude.analytics.events.SearchEvents$InlineSourcesSheetSeen;
import com.anthropic.claude.analytics.events.SearchEvents$SearchType;
import com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination;
import defpackage.bz7;
import defpackage.iei;
import defpackage.sf5;
import defpackage.t53;
import defpackage.tp4;
import defpackage.xzg;

/* JADX INFO: loaded from: classes2.dex */
public final class v0 extends xzg implements bz7 {
    public final /* synthetic */ t53 E;
    public final /* synthetic */ ChatScreenModalBottomSheetDestination F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(t53 t53Var, ChatScreenModalBottomSheetDestination chatScreenModalBottomSheetDestination, tp4 tp4Var) {
        super(1, tp4Var);
        this.E = t53Var;
        this.F = chatScreenModalBottomSheetDestination;
    }

    @Override // defpackage.vd1
    public final tp4 create(tp4 tp4Var) {
        return new v0(this.E, this.F, tp4Var);
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        v0 v0Var = (v0) create((tp4) obj);
        iei ieiVar = iei.a;
        v0Var.invokeSuspend(ieiVar);
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        sf5.h0(obj);
        int size = ((ChatScreenModalBottomSheetDestination.ViewSources) this.F).getSources().size();
        t53 t53Var = this.E;
        t53Var.w.e(new SearchEvents$InlineSourcesSheetSeen(t53Var.d.e, SearchEvents$SearchType.WEB, size), SearchEvents$InlineSourcesSheetSeen.Companion.serializer());
        return iei.a;
    }
}
