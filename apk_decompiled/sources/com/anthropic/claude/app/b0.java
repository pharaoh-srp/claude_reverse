package com.anthropic.claude.app;

import com.anthropic.claude.app.ClaudeAppDestination;
import com.anthropic.claude.project.details.ProjectDetailsScreenParams;
import com.anthropic.claude.types.strings.ProjectId;
import defpackage.bz7;
import defpackage.iei;
import defpackage.iv1;
import defpackage.mq5;
import defpackage.zqc;

/* JADX INFO: loaded from: classes2.dex */
public final class b0 implements bz7 {
    public final /* synthetic */ zqc E;

    public b0(zqc zqcVar) {
        this.E = zqcVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        String strM1085unboximpl = ((ProjectId) obj).m1085unboximpl();
        strM1085unboximpl.getClass();
        iv1.G(this.E, new ClaudeAppDestination.List.ProjectDetails(new ProjectDetailsScreenParams(strM1085unboximpl, false, 2, (mq5) null)));
        return iei.a;
    }
}
