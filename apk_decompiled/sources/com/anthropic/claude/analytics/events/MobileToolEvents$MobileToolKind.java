package com.anthropic.claude.analytics.events;

import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.ulb;
import defpackage.vmb;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"com/anthropic/claude/analytics/events/MobileToolEvents$MobileToolKind", "", "Lcom/anthropic/claude/analytics/events/MobileToolEvents$MobileToolKind;", "<init>", "(Ljava/lang/String;I)V", "Companion", "vmb", "UNSPECIFIED", "LOCAL", "REMOTE", "MCP_TOOL", "MCP_APP", "THIRD_PARTY_APP", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class MobileToolEvents$MobileToolKind {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ MobileToolEvents$MobileToolKind[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final vmb Companion;
    public static final MobileToolEvents$MobileToolKind UNSPECIFIED = new MobileToolEvents$MobileToolKind("UNSPECIFIED", 0);
    public static final MobileToolEvents$MobileToolKind LOCAL = new MobileToolEvents$MobileToolKind("LOCAL", 1);
    public static final MobileToolEvents$MobileToolKind REMOTE = new MobileToolEvents$MobileToolKind("REMOTE", 2);
    public static final MobileToolEvents$MobileToolKind MCP_TOOL = new MobileToolEvents$MobileToolKind("MCP_TOOL", 3);
    public static final MobileToolEvents$MobileToolKind MCP_APP = new MobileToolEvents$MobileToolKind("MCP_APP", 4);
    public static final MobileToolEvents$MobileToolKind THIRD_PARTY_APP = new MobileToolEvents$MobileToolKind("THIRD_PARTY_APP", 5);

    private static final /* synthetic */ MobileToolEvents$MobileToolKind[] $values() {
        return new MobileToolEvents$MobileToolKind[]{UNSPECIFIED, LOCAL, REMOTE, MCP_TOOL, MCP_APP, THIRD_PARTY_APP};
    }

    static {
        MobileToolEvents$MobileToolKind[] mobileToolEvents$MobileToolKindArr$values = $values();
        $VALUES = mobileToolEvents$MobileToolKindArr$values;
        $ENTRIES = wd6.n0(mobileToolEvents$MobileToolKindArr$values);
        Companion = new vmb();
        $cachedSerializer$delegate = yb5.w(w1a.F, new ulb(12));
    }

    private MobileToolEvents$MobileToolKind(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.MobileToolEvents.MobileToolKind", values(), new String[]{"unknown", "local", "remote", "mcp_tool", "mcp_app", "third_party_app"}, new Annotation[][]{null, null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static MobileToolEvents$MobileToolKind valueOf(String str) {
        return (MobileToolEvents$MobileToolKind) Enum.valueOf(MobileToolEvents$MobileToolKind.class, str);
    }

    public static MobileToolEvents$MobileToolKind[] values() {
        return (MobileToolEvents$MobileToolKind[]) $VALUES.clone();
    }
}
