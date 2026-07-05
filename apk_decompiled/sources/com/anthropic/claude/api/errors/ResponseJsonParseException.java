package com.anthropic.claude.api.errors;

import defpackage.mdj;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/anthropic/claude/api/errors/ResponseJsonParseException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
public final class ResponseJsonParseException extends RuntimeException {
    public final String E;

    public ResponseJsonParseException(String str, Exception exc, Integer num) {
        super("Failed to parse json " + ((Object) ("http code: " + num)), exc);
        this.E = str;
    }
}
