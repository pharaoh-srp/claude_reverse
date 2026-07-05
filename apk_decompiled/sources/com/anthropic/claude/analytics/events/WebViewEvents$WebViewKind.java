package com.anthropic.claude.analytics.events;

import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.n7j;
import defpackage.onf;
import defpackage.oq5;
import defpackage.p3j;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"com/anthropic/claude/analytics/events/WebViewEvents$WebViewKind", "", "Lcom/anthropic/claude/analytics/events/WebViewEvents$WebViewKind;", "<init>", "(Ljava/lang/String;I)V", "Companion", "n7j", "UNSPECIFIED", "ARTIFACT_SANDBOX", "PDF", "MCP_APP", "CODE", "CONTENT", "OFFICE_PREVIEW", "MCP_APP_RUNTIME", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class WebViewEvents$WebViewKind {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ WebViewEvents$WebViewKind[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final n7j Companion;
    public static final WebViewEvents$WebViewKind UNSPECIFIED = new WebViewEvents$WebViewKind("UNSPECIFIED", 0);
    public static final WebViewEvents$WebViewKind ARTIFACT_SANDBOX = new WebViewEvents$WebViewKind("ARTIFACT_SANDBOX", 1);
    public static final WebViewEvents$WebViewKind PDF = new WebViewEvents$WebViewKind("PDF", 2);
    public static final WebViewEvents$WebViewKind MCP_APP = new WebViewEvents$WebViewKind("MCP_APP", 3);
    public static final WebViewEvents$WebViewKind CODE = new WebViewEvents$WebViewKind("CODE", 4);
    public static final WebViewEvents$WebViewKind CONTENT = new WebViewEvents$WebViewKind("CONTENT", 5);
    public static final WebViewEvents$WebViewKind OFFICE_PREVIEW = new WebViewEvents$WebViewKind("OFFICE_PREVIEW", 6);
    public static final WebViewEvents$WebViewKind MCP_APP_RUNTIME = new WebViewEvents$WebViewKind("MCP_APP_RUNTIME", 7);

    private static final /* synthetic */ WebViewEvents$WebViewKind[] $values() {
        return new WebViewEvents$WebViewKind[]{UNSPECIFIED, ARTIFACT_SANDBOX, PDF, MCP_APP, CODE, CONTENT, OFFICE_PREVIEW, MCP_APP_RUNTIME};
    }

    static {
        WebViewEvents$WebViewKind[] webViewEvents$WebViewKindArr$values = $values();
        $VALUES = webViewEvents$WebViewKindArr$values;
        $ENTRIES = wd6.n0(webViewEvents$WebViewKindArr$values);
        Companion = new n7j();
        $cachedSerializer$delegate = yb5.w(w1a.F, new p3j(14));
    }

    private WebViewEvents$WebViewKind(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.WebViewEvents.WebViewKind", values(), new String[]{"unspecified", "artifact_sandbox", "pdf", "mcp_app", "code", "content", "office_preview", "mcp_app_runtime"}, new Annotation[][]{null, null, null, null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static WebViewEvents$WebViewKind valueOf(String str) {
        return (WebViewEvents$WebViewKind) Enum.valueOf(WebViewEvents$WebViewKind.class, str);
    }

    public static WebViewEvents$WebViewKind[] values() {
        return (WebViewEvents$WebViewKind[]) $VALUES.clone();
    }
}
