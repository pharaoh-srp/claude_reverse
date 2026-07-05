package com.anthropic.claude.app;

import com.anthropic.claude.app.ClaudeAppDestination;
import com.anthropic.claude.types.strings.ChatId;
import com.anthropic.claude.types.strings.ProjectId;
import defpackage.hr0;
import defpackage.iei;
import defpackage.iv1;
import defpackage.pz7;
import defpackage.rwe;
import defpackage.tj3;
import defpackage.z93;
import defpackage.zqc;

/* JADX INFO: loaded from: classes2.dex */
public final class h1 implements pz7 {
    public final /* synthetic */ rwe E;
    public final /* synthetic */ zqc F;
    public final /* synthetic */ z93 G;

    public h1(rwe rweVar, zqc zqcVar, z93 z93Var) {
        this.E = rweVar;
        this.F = zqcVar;
        this.G = z93Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        String strM984unboximpl = ((ChatId) obj).m984unboximpl();
        ProjectId projectId = (ProjectId) obj2;
        String strM1085unboximpl = projectId != null ? projectId.m1085unboximpl() : null;
        strM984unboximpl.getClass();
        this.E.E.m(hr0.Q, new tj3(6));
        iv1.F(this.F, new ClaudeAppDestination.Detail.Chat(z93.a(this.G, strM984unboximpl, strM1085unboximpl, null, 12)));
        return iei.a;
    }
}
