package com.anthropic.claude.chat.parse.sse;

import defpackage.bj3;
import defpackage.mdj;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/anthropic/claude/chat/parse/sse/ServerSentEventError;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Claude.chat:parse"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
public final class ServerSentEventError extends RuntimeException {
    public final bj3 E;

    public ServerSentEventError(bj3 bj3Var) {
        this.E = bj3Var;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final bj3 getE() {
        return this.E;
    }
}
