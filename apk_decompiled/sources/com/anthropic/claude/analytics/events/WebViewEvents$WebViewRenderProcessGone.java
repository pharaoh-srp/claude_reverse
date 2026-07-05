package com.anthropic.claude.analytics.events;

import defpackage.e79;
import defpackage.fsh;
import defpackage.gvj;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.o7j;
import defpackage.onf;
import defpackage.p3j;
import defpackage.p7j;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000245B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ:\u0010 \u001a\u00020\u000f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020\u00042\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b\b\u0010\u001cR\u0014\u00102\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010$¨\u00066"}, d2 = {"com/anthropic/claude/analytics/events/WebViewEvents$WebViewRenderProcessGone", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "Lcom/anthropic/claude/analytics/events/WebViewEvents$WebViewKind;", "webview_kind", "", "did_crash", "", "renderer_priority", "is_foreground", "<init>", "(Lcom/anthropic/claude/analytics/events/WebViewEvents$WebViewKind;ZLjava/lang/Integer;Z)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/analytics/events/WebViewEvents$WebViewKind;ZLjava/lang/Integer;ZLvnf;)V", "Lcom/anthropic/claude/analytics/events/WebViewEvents$WebViewRenderProcessGone;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/WebViewEvents$WebViewRenderProcessGone;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/analytics/events/WebViewEvents$WebViewKind;", "component2", "()Z", "component3", "()Ljava/lang/Integer;", "component4", "copy", "(Lcom/anthropic/claude/analytics/events/WebViewEvents$WebViewKind;ZLjava/lang/Integer;Z)Lcom/anthropic/claude/analytics/events/WebViewEvents$WebViewRenderProcessGone;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/analytics/events/WebViewEvents$WebViewKind;", "getWebview_kind", "Z", "getDid_crash", "Ljava/lang/Integer;", "getRenderer_priority", "getEventName", "eventName", "Companion", "o7j", "p7j", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class WebViewEvents$WebViewRenderProcessGone implements AnalyticsEvent {
    public static final int $stable = 0;
    private final boolean did_crash;
    private final boolean is_foreground;
    private final Integer renderer_priority;
    private final WebViewEvents$WebViewKind webview_kind;
    public static final p7j Companion = new p7j();
    private static final kw9[] $childSerializers = {yb5.w(w1a.F, new p3j(15)), null, null, null};

    public /* synthetic */ WebViewEvents$WebViewRenderProcessGone(int i, WebViewEvents$WebViewKind webViewEvents$WebViewKind, boolean z, Integer num, boolean z2, vnf vnfVar) {
        if (11 != (i & 11)) {
            gvj.f(i, 11, o7j.a.getDescriptor());
            throw null;
        }
        this.webview_kind = webViewEvents$WebViewKind;
        this.did_crash = z;
        if ((i & 4) == 0) {
            this.renderer_priority = null;
        } else {
            this.renderer_priority = num;
        }
        this.is_foreground = z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return WebViewEvents$WebViewKind.Companion.serializer();
    }

    public static /* synthetic */ WebViewEvents$WebViewRenderProcessGone copy$default(WebViewEvents$WebViewRenderProcessGone webViewEvents$WebViewRenderProcessGone, WebViewEvents$WebViewKind webViewEvents$WebViewKind, boolean z, Integer num, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            webViewEvents$WebViewKind = webViewEvents$WebViewRenderProcessGone.webview_kind;
        }
        if ((i & 2) != 0) {
            z = webViewEvents$WebViewRenderProcessGone.did_crash;
        }
        if ((i & 4) != 0) {
            num = webViewEvents$WebViewRenderProcessGone.renderer_priority;
        }
        if ((i & 8) != 0) {
            z2 = webViewEvents$WebViewRenderProcessGone.is_foreground;
        }
        return webViewEvents$WebViewRenderProcessGone.copy(webViewEvents$WebViewKind, z, num, z2);
    }

    public static final /* synthetic */ void write$Self$analytics(WebViewEvents$WebViewRenderProcessGone self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, (znf) $childSerializers[0].getValue(), self.webview_kind);
        output.p(serialDesc, 1, self.did_crash);
        if (output.E(serialDesc) || self.renderer_priority != null) {
            output.B(serialDesc, 2, e79.a, self.renderer_priority);
        }
        output.p(serialDesc, 3, self.is_foreground);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final WebViewEvents$WebViewKind getWebview_kind() {
        return this.webview_kind;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getDid_crash() {
        return this.did_crash;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getRenderer_priority() {
        return this.renderer_priority;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIs_foreground() {
        return this.is_foreground;
    }

    public final WebViewEvents$WebViewRenderProcessGone copy(WebViewEvents$WebViewKind webview_kind, boolean did_crash, Integer renderer_priority, boolean is_foreground) {
        webview_kind.getClass();
        return new WebViewEvents$WebViewRenderProcessGone(webview_kind, did_crash, renderer_priority, is_foreground);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WebViewEvents$WebViewRenderProcessGone)) {
            return false;
        }
        WebViewEvents$WebViewRenderProcessGone webViewEvents$WebViewRenderProcessGone = (WebViewEvents$WebViewRenderProcessGone) other;
        return this.webview_kind == webViewEvents$WebViewRenderProcessGone.webview_kind && this.did_crash == webViewEvents$WebViewRenderProcessGone.did_crash && x44.r(this.renderer_priority, webViewEvents$WebViewRenderProcessGone.renderer_priority) && this.is_foreground == webViewEvents$WebViewRenderProcessGone.is_foreground;
    }

    public final boolean getDid_crash() {
        return this.did_crash;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_webview_render_process_gone";
    }

    public final Integer getRenderer_priority() {
        return this.renderer_priority;
    }

    public final WebViewEvents$WebViewKind getWebview_kind() {
        return this.webview_kind;
    }

    public int hashCode() {
        int iP = fsh.p(this.webview_kind.hashCode() * 31, 31, this.did_crash);
        Integer num = this.renderer_priority;
        return Boolean.hashCode(this.is_foreground) + ((iP + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final boolean is_foreground() {
        return this.is_foreground;
    }

    public String toString() {
        return "WebViewRenderProcessGone(webview_kind=" + this.webview_kind + ", did_crash=" + this.did_crash + ", renderer_priority=" + this.renderer_priority + ", is_foreground=" + this.is_foreground + ")";
    }

    public WebViewEvents$WebViewRenderProcessGone(WebViewEvents$WebViewKind webViewEvents$WebViewKind, boolean z, Integer num, boolean z2) {
        webViewEvents$WebViewKind.getClass();
        this.webview_kind = webViewEvents$WebViewKind;
        this.did_crash = z;
        this.renderer_priority = num;
        this.is_foreground = z2;
    }

    public /* synthetic */ WebViewEvents$WebViewRenderProcessGone(WebViewEvents$WebViewKind webViewEvents$WebViewKind, boolean z, Integer num, boolean z2, int i, mq5 mq5Var) {
        this(webViewEvents$WebViewKind, z, (i & 4) != 0 ? null : num, z2);
    }
}
