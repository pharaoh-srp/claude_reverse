package com.anthropic.claude.sessions.api;

import defpackage.mdj;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/anthropic/claude/sessions/api/SessionWebSocketClosedException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
public final class SessionWebSocketClosedException extends Exception {
    public final int E;
    public final String F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionWebSocketClosedException(int i, String str) {
        super("WebSocket closed: code=" + i + " reason='" + str + "'");
        str.getClass();
        this.E = i;
        this.F = str;
    }
}
