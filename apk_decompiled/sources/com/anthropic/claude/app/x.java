package com.anthropic.claude.app;

import com.anthropic.claude.app.ClaudeAppDestination;
import com.anthropic.claude.project.details.ProjectDetailsScreenParams;
import com.anthropic.claude.types.strings.ProjectId;
import defpackage.bz7;
import defpackage.iei;
import defpackage.iv1;
import defpackage.mq5;
import defpackage.te3;
import defpackage.ye3;
import defpackage.zqc;

/* JADX INFO: loaded from: classes.dex */
public final class x implements bz7 {
    public final /* synthetic */ zqc E;

    public x(zqc zqcVar) {
        this.E = zqcVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        String strM1085unboximpl = ((ProjectId) obj).m1085unboximpl();
        strM1085unboximpl.getClass();
        zqc zqcVar = this.E;
        if (((te3) zqcVar.F.getValue()).d == ye3.E) {
            iv1.F(zqcVar, new ClaudeAppDestination.Detail.ProjectDetails(new ProjectDetailsScreenParams(strM1085unboximpl, false, 2, (mq5) null)));
        } else {
            iv1.G(zqcVar, new ClaudeAppDestination.List.ProjectDetails(new ProjectDetailsScreenParams(strM1085unboximpl, false, 2, (mq5) null)));
        }
        return iei.a;
    }
}
