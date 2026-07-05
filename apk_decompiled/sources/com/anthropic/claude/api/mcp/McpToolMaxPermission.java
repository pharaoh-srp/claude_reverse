package com.anthropic.claude.api.mcp;

import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.o4b;
import defpackage.onf;
import defpackage.oq5;
import defpackage.p4b;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/anthropic/claude/api/mcp/McpToolMaxPermission;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "o4b", "UNKNOWN", "ALLOW", "ASK", "BLOCKED", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = p4b.class)
public final class McpToolMaxPermission {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ McpToolMaxPermission[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final o4b Companion;
    public static final McpToolMaxPermission UNKNOWN = new McpToolMaxPermission("UNKNOWN", 0);
    public static final McpToolMaxPermission ALLOW = new McpToolMaxPermission("ALLOW", 1);
    public static final McpToolMaxPermission ASK = new McpToolMaxPermission("ASK", 2);
    public static final McpToolMaxPermission BLOCKED = new McpToolMaxPermission("BLOCKED", 3);

    private static final /* synthetic */ McpToolMaxPermission[] $values() {
        return new McpToolMaxPermission[]{UNKNOWN, ALLOW, ASK, BLOCKED};
    }

    static {
        McpToolMaxPermission[] mcpToolMaxPermissionArr$values = $values();
        $VALUES = mcpToolMaxPermissionArr$values;
        $ENTRIES = wd6.n0(mcpToolMaxPermissionArr$values);
        Companion = new o4b();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new rpa(16));
    }

    private McpToolMaxPermission(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.api.mcp.McpToolMaxPermission", values(), new String[]{"unknown", "allow", "ask", "blocked"}, new Annotation[][]{null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static McpToolMaxPermission valueOf(String str) {
        return (McpToolMaxPermission) Enum.valueOf(McpToolMaxPermission.class, str);
    }

    public static McpToolMaxPermission[] values() {
        return (McpToolMaxPermission[]) $VALUES.clone();
    }
}
