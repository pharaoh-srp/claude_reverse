package com.anthropic.claude.analytics.events;

import defpackage.gvj;
import defpackage.kw9;
import defpackage.l7j;
import defpackage.m7j;
import defpackage.mdj;
import defpackage.onf;
import defpackage.p3j;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.yb5;
import defpackage.znf;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-.B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ$\u0010\u001b\u001a\u00020\r2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\bHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u00042\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u001aR\u0014\u0010+\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u001f¨\u0006/"}, d2 = {"com/anthropic/claude/analytics/events/WebViewEvents$WebViewErrorStateShown", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "Lcom/anthropic/claude/analytics/events/WebViewEvents$WebViewKind;", "webview_kind", "", "did_crash", "<init>", "(Lcom/anthropic/claude/analytics/events/WebViewEvents$WebViewKind;Z)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/analytics/events/WebViewEvents$WebViewKind;ZLvnf;)V", "Lcom/anthropic/claude/analytics/events/WebViewEvents$WebViewErrorStateShown;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/WebViewEvents$WebViewErrorStateShown;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/analytics/events/WebViewEvents$WebViewKind;", "component2", "()Z", "copy", "(Lcom/anthropic/claude/analytics/events/WebViewEvents$WebViewKind;Z)Lcom/anthropic/claude/analytics/events/WebViewEvents$WebViewErrorStateShown;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/analytics/events/WebViewEvents$WebViewKind;", "getWebview_kind", "Z", "getDid_crash", "getEventName", "eventName", "Companion", "l7j", "m7j", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class WebViewEvents$WebViewErrorStateShown implements AnalyticsEvent {
    public static final int $stable = 0;
    private final boolean did_crash;
    private final WebViewEvents$WebViewKind webview_kind;
    public static final m7j Companion = new m7j();
    private static final kw9[] $childSerializers = {yb5.w(w1a.F, new p3j(13)), null};

    public /* synthetic */ WebViewEvents$WebViewErrorStateShown(int i, WebViewEvents$WebViewKind webViewEvents$WebViewKind, boolean z, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, l7j.a.getDescriptor());
            throw null;
        }
        this.webview_kind = webViewEvents$WebViewKind;
        this.did_crash = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return WebViewEvents$WebViewKind.Companion.serializer();
    }

    public static /* synthetic */ WebViewEvents$WebViewErrorStateShown copy$default(WebViewEvents$WebViewErrorStateShown webViewEvents$WebViewErrorStateShown, WebViewEvents$WebViewKind webViewEvents$WebViewKind, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            webViewEvents$WebViewKind = webViewEvents$WebViewErrorStateShown.webview_kind;
        }
        if ((i & 2) != 0) {
            z = webViewEvents$WebViewErrorStateShown.did_crash;
        }
        return webViewEvents$WebViewErrorStateShown.copy(webViewEvents$WebViewKind, z);
    }

    public static final /* synthetic */ void write$Self$analytics(WebViewEvents$WebViewErrorStateShown self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, (znf) $childSerializers[0].getValue(), self.webview_kind);
        output.p(serialDesc, 1, self.did_crash);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final WebViewEvents$WebViewKind getWebview_kind() {
        return this.webview_kind;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getDid_crash() {
        return this.did_crash;
    }

    public final WebViewEvents$WebViewErrorStateShown copy(WebViewEvents$WebViewKind webview_kind, boolean did_crash) {
        webview_kind.getClass();
        return new WebViewEvents$WebViewErrorStateShown(webview_kind, did_crash);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WebViewEvents$WebViewErrorStateShown)) {
            return false;
        }
        WebViewEvents$WebViewErrorStateShown webViewEvents$WebViewErrorStateShown = (WebViewEvents$WebViewErrorStateShown) other;
        return this.webview_kind == webViewEvents$WebViewErrorStateShown.webview_kind && this.did_crash == webViewEvents$WebViewErrorStateShown.did_crash;
    }

    public final boolean getDid_crash() {
        return this.did_crash;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "claudeai.webview.error_state.viewed";
    }

    public final WebViewEvents$WebViewKind getWebview_kind() {
        return this.webview_kind;
    }

    public int hashCode() {
        return Boolean.hashCode(this.did_crash) + (this.webview_kind.hashCode() * 31);
    }

    public String toString() {
        return "WebViewErrorStateShown(webview_kind=" + this.webview_kind + ", did_crash=" + this.did_crash + ")";
    }

    public WebViewEvents$WebViewErrorStateShown(WebViewEvents$WebViewKind webViewEvents$WebViewKind, boolean z) {
        webViewEvents$WebViewKind.getClass();
        this.webview_kind = webViewEvents$WebViewKind;
        this.did_crash = z;
    }
}
