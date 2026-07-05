package com.anthropic.claude.api.mcp;

import defpackage.a5b;
import defpackage.b5b;
import defpackage.fq6;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/anthropic/claude/api/mcp/McpToolVisibility;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a5b", "UNKNOWN", "MODEL", "APP", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = b5b.class)
public final class McpToolVisibility {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ McpToolVisibility[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final a5b Companion;
    public static final McpToolVisibility UNKNOWN = new McpToolVisibility("UNKNOWN", 0);
    public static final McpToolVisibility MODEL = new McpToolVisibility("MODEL", 1);
    public static final McpToolVisibility APP = new McpToolVisibility("APP", 2);

    private static final /* synthetic */ McpToolVisibility[] $values() {
        return new McpToolVisibility[]{UNKNOWN, MODEL, APP};
    }

    static {
        McpToolVisibility[] mcpToolVisibilityArr$values = $values();
        $VALUES = mcpToolVisibilityArr$values;
        $ENTRIES = wd6.n0(mcpToolVisibilityArr$values);
        Companion = new a5b();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new mia(27));
    }

    private McpToolVisibility(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.api.mcp.McpToolVisibility", values(), new String[]{"unknown", "model", "app"}, new Annotation[][]{null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static McpToolVisibility valueOf(String str) {
        return (McpToolVisibility) Enum.valueOf(McpToolVisibility.class, str);
    }

    public static McpToolVisibility[] values() {
        return (McpToolVisibility[]) $VALUES.clone();
    }
}
