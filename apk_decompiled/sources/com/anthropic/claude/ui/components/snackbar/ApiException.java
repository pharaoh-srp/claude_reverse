package com.anthropic.claude.ui.components.snackbar;

import defpackage.mdj;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/anthropic/claude/ui/components/snackbar/ApiException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "ui"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
final class ApiException extends RuntimeException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApiException(Throwable th) {
        super(th);
        th.getClass();
    }
}
