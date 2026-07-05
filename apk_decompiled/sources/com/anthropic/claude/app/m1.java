package com.anthropic.claude.app;

import com.anthropic.claude.app.ClaudeAppDestination;
import defpackage.mq5;
import defpackage.nf7;
import defpackage.qzb;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class m1 {
    public static final ClaudeAppDestination.List a(nf7 nf7Var, qzb qzbVar) {
        nf7Var.getClass();
        return ((Boolean) nf7Var.a().getValue()).booleanValue() ? ClaudeAppDestination.List.AllChatsList.INSTANCE : qzbVar.d() ? ClaudeAppDestination.List.CodeRemote.INSTANCE : qzbVar.e() ? ClaudeAppDestination.List.CoworkRemote.INSTANCE : qzbVar.a() ? ClaudeAppDestination.List.AgentChat.INSTANCE : new ClaudeAppDestination.List.Settings(new SettingsScreenParams((List) null, 0L, 3, (mq5) null));
    }
}
