package com.anthropic.claude.app;

import com.anthropic.claude.app.ClaudeAppDestination;
import com.anthropic.claude.project.details.ProjectDetailsScreenParams;
import com.anthropic.claude.types.strings.ProjectId;
import defpackage.bz7;
import defpackage.iei;
import defpackage.pj3;
import defpackage.xj3;
import defpackage.zqc;

/* JADX INFO: loaded from: classes.dex */
public final class l0 implements bz7 {
    public final /* synthetic */ zqc E;

    public l0(zqc zqcVar) {
        this.E = zqcVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        String strM1085unboximpl = ((ProjectId) obj).m1085unboximpl();
        strM1085unboximpl.getClass();
        ClaudeAppDestination.List.ProjectDetails projectDetails = new ClaudeAppDestination.List.ProjectDetails(new ProjectDetailsScreenParams(strM1085unboximpl, true, null));
        pj3 pj3Var = pj3.W;
        zqc zqcVar = this.E;
        zqcVar.E.m(new xj3(projectDetails, zqcVar, 2), pj3Var);
        return iei.a;
    }
}
