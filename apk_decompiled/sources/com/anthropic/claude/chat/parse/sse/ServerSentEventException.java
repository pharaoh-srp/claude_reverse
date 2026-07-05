package com.anthropic.claude.chat.parse.sse;

import defpackage.mdj;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/anthropic/claude/chat/parse/sse/ServerSentEventException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Claude.chat:parse"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
public final class ServerSentEventException extends RuntimeException {
    public final Throwable E;

    public ServerSentEventException(Throwable th) {
        super(th);
        this.E = th;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Throwable getE() {
        return this.E;
    }
}
