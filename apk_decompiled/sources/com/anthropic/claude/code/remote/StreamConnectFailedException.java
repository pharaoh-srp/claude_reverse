package com.anthropic.claude.code.remote;

import defpackage.mdj;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/anthropic/claude/code/remote/StreamConnectFailedException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "remote"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
final class StreamConnectFailedException extends Exception {
    public StreamConnectFailedException(Exception exc) {
        super(exc.getMessage(), exc);
    }
}
