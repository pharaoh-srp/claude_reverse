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
public final class e0 implements bz7 {
    public final /* synthetic */ zqc E;
    public final /* synthetic */ ClaudeAppDestination F;

    public e0(zqc zqcVar, ClaudeAppDestination claudeAppDestination) {
        this.E = zqcVar;
        this.F = claudeAppDestination;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        String strM1085unboximpl = ((ProjectId) obj).m1085unboximpl();
        strM1085unboximpl.getClass();
        ClaudeAppDestination.List.ProjectDetails projectDetails = new ClaudeAppDestination.List.ProjectDetails(new ProjectDetailsScreenParams(strM1085unboximpl, false, 2, (mq5) null));
        zqc zqcVar = this.E;
        iv1.G(zqcVar, projectDetails);
        i0.c(zqcVar, this.F);
        return iei.a;
    }
}
