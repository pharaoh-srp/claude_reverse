package com.anthropic.claude.app;

import com.anthropic.claude.app.ClaudeAppDestination;
import com.anthropic.claude.project.details.ProjectDetailsScreenParams;
import com.anthropic.claude.types.strings.ChatId;
import defpackage.iei;
import defpackage.iv1;
import defpackage.pz7;
import defpackage.z93;
import defpackage.zqc;

/* JADX INFO: loaded from: classes2.dex */
public final class d0 implements pz7 {
    public final /* synthetic */ zqc E;
    public final /* synthetic */ z93 F;
    public final /* synthetic */ ProjectDetailsScreenParams G;

    public d0(zqc zqcVar, z93 z93Var, ProjectDetailsScreenParams projectDetailsScreenParams) {
        this.E = zqcVar;
        this.F = z93Var;
        this.G = projectDetailsScreenParams;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        String strM984unboximpl = ((ChatId) obj).m984unboximpl();
        strM984unboximpl.getClass();
        iv1.F(this.E, new ClaudeAppDestination.Detail.Chat(z93.a(this.F, strM984unboximpl, this.G.m789getProjectId5pmjbU(), null, 12)));
        return iei.a;
    }
}
