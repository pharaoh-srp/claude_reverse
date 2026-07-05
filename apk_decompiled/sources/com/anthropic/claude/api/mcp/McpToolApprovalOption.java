package com.anthropic.claude.api.mcp;

import defpackage.fq6;
import defpackage.j4b;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mia;
import defpackage.onf;
import defpackage.oq5;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/anthropic/claude/api/mcp/McpToolApprovalOption;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "j4b", "ONCE", "ALWAYS", "PER_CHAT", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class McpToolApprovalOption {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ McpToolApprovalOption[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final j4b Companion;
    public static final McpToolApprovalOption ONCE = new McpToolApprovalOption("ONCE", 0);
    public static final McpToolApprovalOption ALWAYS = new McpToolApprovalOption("ALWAYS", 1);
    public static final McpToolApprovalOption PER_CHAT = new McpToolApprovalOption("PER_CHAT", 2);

    private static final /* synthetic */ McpToolApprovalOption[] $values() {
        return new McpToolApprovalOption[]{ONCE, ALWAYS, PER_CHAT};
    }

    static {
        McpToolApprovalOption[] mcpToolApprovalOptionArr$values = $values();
        $VALUES = mcpToolApprovalOptionArr$values;
        $ENTRIES = wd6.n0(mcpToolApprovalOptionArr$values);
        Companion = new j4b();
        $cachedSerializer$delegate = yb5.w(w1a.F, new mia(26));
    }

    private McpToolApprovalOption(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.api.mcp.McpToolApprovalOption", values(), new String[]{"once", "always", "perChat"}, new Annotation[][]{null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static McpToolApprovalOption valueOf(String str) {
        return (McpToolApprovalOption) Enum.valueOf(McpToolApprovalOption.class, str);
    }

    public static McpToolApprovalOption[] values() {
        return (McpToolApprovalOption[]) $VALUES.clone();
    }
}
