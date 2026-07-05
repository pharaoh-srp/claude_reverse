package com.arkivanov.decompose.mainthread;

import defpackage.mdj;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/arkivanov/decompose/mainthread/NotOnMainThreadException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "decompose_release"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class NotOnMainThreadException extends Exception {
    public NotOnMainThreadException(String str) {
        super("Expected to be called on the main thread, but was ".concat(str == null ? "unknown" : str));
    }
}
