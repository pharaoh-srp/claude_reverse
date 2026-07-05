package com.anthropic.claude.core.telemetry;

import defpackage.mdj;
import defpackage.ozf;
import defpackage.xah;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/anthropic/claude/core/telemetry/SilentException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Claude.core:telemetry"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
public final class SilentException extends RuntimeException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SilentException(String str) {
        super(str);
        str.getClass();
    }

    public static void a(SilentException silentException, ozf ozfVar, boolean z, int i) {
        if ((i & 1) != 0) {
            ozfVar = ozf.G;
        }
        ozfVar.getClass();
        List list = xah.a;
        xah.f(silentException, null, ozfVar, null, 26);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SilentException(String str, Throwable th) {
        super(str, th);
        str.getClass();
    }
}
