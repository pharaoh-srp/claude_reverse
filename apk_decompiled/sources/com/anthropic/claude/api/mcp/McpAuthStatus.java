package com.anthropic.claude.api.mcp;

import defpackage.c0b;
import defpackage.d0b;
import defpackage.e0b;
import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mr9;
import defpackage.onf;
import defpackage.oq5;
import defpackage.rpa;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0005\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/anthropic/claude/api/mcp/McpAuthStatus;", "", "<init>", "(Ljava/lang/String;I)V", "", "isExplicitTokenError", "()Z", "Companion", "c0b", "UNKNOWN", "NOT_REQUIRED", "AUTHENTICATED", "AUTH_REQUIRED", "TOKEN_INVALID", "REFRESH_FAILED", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = e0b.class)
public final class McpAuthStatus {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ McpAuthStatus[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final c0b Companion;
    public static final McpAuthStatus UNKNOWN = new McpAuthStatus("UNKNOWN", 0);
    public static final McpAuthStatus NOT_REQUIRED = new McpAuthStatus("NOT_REQUIRED", 1);
    public static final McpAuthStatus AUTHENTICATED = new McpAuthStatus("AUTHENTICATED", 2);
    public static final McpAuthStatus AUTH_REQUIRED = new McpAuthStatus("AUTH_REQUIRED", 3);
    public static final McpAuthStatus TOKEN_INVALID = new McpAuthStatus("TOKEN_INVALID", 4);
    public static final McpAuthStatus REFRESH_FAILED = new McpAuthStatus("REFRESH_FAILED", 5);

    private static final /* synthetic */ McpAuthStatus[] $values() {
        return new McpAuthStatus[]{UNKNOWN, NOT_REQUIRED, AUTHENTICATED, AUTH_REQUIRED, TOKEN_INVALID, REFRESH_FAILED};
    }

    static {
        McpAuthStatus[] mcpAuthStatusArr$values = $values();
        $VALUES = mcpAuthStatusArr$values;
        $ENTRIES = wd6.n0(mcpAuthStatusArr$values);
        Companion = new c0b();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new rpa(10));
    }

    private McpAuthStatus(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.api.mcp.McpAuthStatus", values(), new String[]{"unknown", "not_required", "authenticated", "auth_required", "token_invalid", "refresh_failed"}, new Annotation[][]{null, null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static McpAuthStatus valueOf(String str) {
        return (McpAuthStatus) Enum.valueOf(McpAuthStatus.class, str);
    }

    public static McpAuthStatus[] values() {
        return (McpAuthStatus[]) $VALUES.clone();
    }

    public final boolean isExplicitTokenError() {
        switch (d0b.a[ordinal()]) {
            case 1:
            case 2:
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                break;
            default:
                mr9.b();
                break;
        }
        return false;
    }
}
