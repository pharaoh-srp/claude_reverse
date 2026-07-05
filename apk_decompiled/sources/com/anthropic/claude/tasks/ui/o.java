package com.anthropic.claude.tasks.ui;

import com.anthropic.claude.api.tasks.TaskResponse;
import com.anthropic.claude.tasks.ui.TasksBottomSheetDestination;
import com.anthropic.claude.tool.model.RequestFormInputFromUserInput;
import com.anthropic.claude.types.strings.ToolUseId;
import defpackage.iei;
import defpackage.pz7;
import defpackage.t4g;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements pz7 {
    public final /* synthetic */ t4g E;
    public final /* synthetic */ TaskResponse F;

    public o(t4g t4gVar, TaskResponse taskResponse) {
        this.E = t4gVar;
        this.F = taskResponse;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        String strM1163unboximpl = ((ToolUseId) obj).m1163unboximpl();
        RequestFormInputFromUserInput requestFormInputFromUserInput = (RequestFormInputFromUserInput) obj2;
        strM1163unboximpl.getClass();
        requestFormInputFromUserInput.getClass();
        this.E.d(new TasksBottomSheetDestination.FormInput(this.F.m450getUuidFxcw9s(), strM1163unboximpl, requestFormInputFromUserInput, null));
        return iei.a;
    }
}
