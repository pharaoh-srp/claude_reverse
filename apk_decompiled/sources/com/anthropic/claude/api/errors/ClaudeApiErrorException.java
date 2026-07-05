package com.anthropic.claude.api.errors;

import defpackage.bj3;
import defpackage.mdj;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/anthropic/claude/api/errors/ClaudeApiErrorException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
public final class ClaudeApiErrorException extends RuntimeException {
    public final bj3 E;

    /* JADX WARN: Illegal instructions before constructor call */
    public ClaudeApiErrorException(bj3 bj3Var, String str) {
        String string;
        bj3Var.getClass();
        if (str != null) {
            string = str + ": " + bj3Var;
        } else {
            string = bj3Var.toString();
        }
        super(string);
        this.E = bj3Var;
    }
}
