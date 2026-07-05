package com.anthropic.claude.app;

import com.anthropic.claude.app.ClaudeAppDestination;
import com.anthropic.claude.code.remote.CodeRemoteSessionScreenParams;
import com.anthropic.claude.code.remote.CodeSessionListScope;
import com.anthropic.claude.code.remote.NewCodeSessionPrefill;
import com.anthropic.claude.types.strings.SessionId;
import defpackage.bz7;
import defpackage.fwc;
import defpackage.iei;
import defpackage.iv1;
import defpackage.mq5;
import defpackage.zqc;

/* JADX INFO: loaded from: classes2.dex */
public final class h0 implements bz7 {
    public final /* synthetic */ zqc E;

    public h0(zqc zqcVar) {
        this.E = zqcVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        String strM1120unboximpl = ((SessionId) obj).m1120unboximpl();
        strM1120unboximpl.getClass();
        iv1.F(this.E, new ClaudeAppDestination.Detail.CodeRemoteSession(new CodeRemoteSessionScreenParams(strM1120unboximpl, false, (NewCodeSessionPrefill) null, (fwc) null, (CodeSessionListScope) null, 30, (mq5) null)));
        return iei.a;
    }
}
