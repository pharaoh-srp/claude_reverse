package com.anthropic.claude.api.mcp;

import defpackage.fq6;
import defpackage.k62;
import defpackage.kw9;
import defpackage.l62;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.rc1;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/anthropic/claude/api/mcp/CaiMcpFlag;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "k62", "UNKNOWN", "AUTO_ACCEPT_PERMISSIONS", "HIDE_TOOL_CHROME_IN_CHAT", "HIDE_FROM_CONNECTORS_LIST", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = l62.class)
public final class CaiMcpFlag {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ CaiMcpFlag[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final k62 Companion;
    public static final CaiMcpFlag UNKNOWN = new CaiMcpFlag("UNKNOWN", 0);
    public static final CaiMcpFlag AUTO_ACCEPT_PERMISSIONS = new CaiMcpFlag("AUTO_ACCEPT_PERMISSIONS", 1);
    public static final CaiMcpFlag HIDE_TOOL_CHROME_IN_CHAT = new CaiMcpFlag("HIDE_TOOL_CHROME_IN_CHAT", 2);
    public static final CaiMcpFlag HIDE_FROM_CONNECTORS_LIST = new CaiMcpFlag("HIDE_FROM_CONNECTORS_LIST", 3);

    private static final /* synthetic */ CaiMcpFlag[] $values() {
        return new CaiMcpFlag[]{UNKNOWN, AUTO_ACCEPT_PERMISSIONS, HIDE_TOOL_CHROME_IN_CHAT, HIDE_FROM_CONNECTORS_LIST};
    }

    static {
        CaiMcpFlag[] caiMcpFlagArr$values = $values();
        $VALUES = caiMcpFlagArr$values;
        $ENTRIES = wd6.n0(caiMcpFlagArr$values);
        Companion = new k62();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new rc1(8));
    }

    private CaiMcpFlag(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.api.mcp.CaiMcpFlag", values(), new String[]{"unknown", "auto_accept_permissions", "hide_tool_chrome_in_chat", "hide_from_connectors_list"}, new Annotation[][]{null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static CaiMcpFlag valueOf(String str) {
        return (CaiMcpFlag) Enum.valueOf(CaiMcpFlag.class, str);
    }

    public static CaiMcpFlag[] values() {
        return (CaiMcpFlag[]) $VALUES.clone();
    }
}
