package com.anthropic.claude.app;

import com.anthropic.claude.app.ClaudeAppDestination;
import com.anthropic.claude.types.strings.ChatId;
import defpackage.iei;
import defpackage.iv1;
import defpackage.pz7;
import defpackage.z93;
import defpackage.zqc;

/* JADX INFO: loaded from: classes2.dex */
public final class g0 implements pz7 {
    public final /* synthetic */ zqc E;
    public final /* synthetic */ z93 F;

    public g0(zqc zqcVar, z93 z93Var) {
        this.E = zqcVar;
        this.F = z93Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        String strM984unboximpl = ((ChatId) obj).m984unboximpl();
        strM984unboximpl.getClass();
        iv1.H(this.E, new ClaudeAppDestination.Detail.Chat(z93.a(this.F, strM984unboximpl, null, null, 12)));
        return iei.a;
    }
}
