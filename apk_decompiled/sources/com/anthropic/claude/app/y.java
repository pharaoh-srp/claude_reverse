package com.anthropic.claude.app;

import com.anthropic.claude.app.ClaudeAppOverlay;
import com.anthropic.claude.types.strings.ChatId;
import com.anthropic.claude.types.strings.ModelId;
import com.anthropic.claude.types.strings.ProjectId;
import com.anthropic.claude.types.strings.ThinkingEffort;
import com.anthropic.claude.types.strings.ThinkingMode;
import defpackage.cv;
import defpackage.iei;
import defpackage.j83;
import defpackage.rwe;
import defpackage.uz7;

/* JADX INFO: loaded from: classes.dex */
public final class y implements uz7 {
    public final /* synthetic */ rwe E;

    public y(rwe rweVar) {
        this.E = rweVar;
    }

    @Override // defpackage.uz7
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        String strM984unboximpl = ((ChatId) obj).m984unboximpl();
        ProjectId projectId = (ProjectId) obj2;
        String strM1085unboximpl = projectId != null ? projectId.m1085unboximpl() : null;
        ModelId modelId = (ModelId) obj3;
        String strM1064unboximpl = modelId != null ? modelId.m1064unboximpl() : null;
        ThinkingEffort thinkingEffort = (ThinkingEffort) obj4;
        String strM1141unboximpl = thinkingEffort != null ? thinkingEffort.m1141unboximpl() : null;
        ThinkingMode thinkingMode = (ThinkingMode) obj5;
        String strM1149unboximpl = thinkingMode != null ? thinkingMode.m1149unboximpl() : null;
        boolean zBooleanValue = ((Boolean) obj6).booleanValue();
        strM984unboximpl.getClass();
        cv cvVar = new cv(18, new ClaudeAppOverlay.BellMode(strM984unboximpl, strM1085unboximpl, strM1064unboximpl, zBooleanValue, strM1141unboximpl, strM1149unboximpl, null));
        j83 j83Var = new j83(15);
        rwe rweVar = this.E;
        rweVar.getClass();
        rweVar.E.m(cvVar, j83Var);
        return iei.a;
    }
}
