package com.anthropic.claude.api.notice;

import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.wc5;
import defpackage.x44;
import defpackage.x9e;
import defpackage.yc5;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/0B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ0\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0003\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u001bR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010*\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010\u001d¨\u00061"}, d2 = {"Lcom/anthropic/claude/api/notice/Cta;", "", "", "copy", "Lcom/anthropic/claude/api/notice/CtaIntent;", "intent", "Lcom/anthropic/claude/api/notice/RedirectHint;", "redirectHint", "<init>", "(Ljava/lang/String;Lcom/anthropic/claude/api/notice/CtaIntent;Lcom/anthropic/claude/api/notice/RedirectHint;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/anthropic/claude/api/notice/CtaIntent;Lcom/anthropic/claude/api/notice/RedirectHint;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/notice/Cta;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/anthropic/claude/api/notice/CtaIntent;", "component3", "()Lcom/anthropic/claude/api/notice/RedirectHint;", "(Ljava/lang/String;Lcom/anthropic/claude/api/notice/CtaIntent;Lcom/anthropic/claude/api/notice/RedirectHint;)Lcom/anthropic/claude/api/notice/Cta;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCopy", "Lcom/anthropic/claude/api/notice/CtaIntent;", "getIntent", "Lcom/anthropic/claude/api/notice/RedirectHint;", "getRedirectHint", "getRedirectHint$annotations", "()V", "Companion", "vc5", "wc5", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class Cta {
    public static final int $stable = 0;
    public static final wc5 Companion = new wc5();
    private final String copy;
    private final CtaIntent intent;
    private final RedirectHint redirectHint;

    public /* synthetic */ Cta(int i, String str, CtaIntent ctaIntent, RedirectHint redirectHint, vnf vnfVar) {
        this.copy = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.intent = CtaIntent.UNKNOWN;
        } else {
            this.intent = ctaIntent;
        }
        if ((i & 4) == 0) {
            this.redirectHint = null;
        } else {
            this.redirectHint = redirectHint;
        }
    }

    public static /* synthetic */ Cta copy$default(Cta cta, String str, CtaIntent ctaIntent, RedirectHint redirectHint, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cta.copy;
        }
        if ((i & 2) != 0) {
            ctaIntent = cta.intent;
        }
        if ((i & 4) != 0) {
            redirectHint = cta.redirectHint;
        }
        return cta.copy(str, ctaIntent, redirectHint);
    }

    public static /* synthetic */ void getRedirectHint$annotations() {
    }

    public static final /* synthetic */ void write$Self$api(Cta self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || !x44.r(self.copy, "")) {
            output.q(serialDesc, 0, self.copy);
        }
        if (output.E(serialDesc) || self.intent != CtaIntent.UNKNOWN) {
            output.r(serialDesc, 1, yc5.d, self.intent);
        }
        if (!output.E(serialDesc) && self.redirectHint == null) {
            return;
        }
        output.B(serialDesc, 2, x9e.d, self.redirectHint);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCopy() {
        return this.copy;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CtaIntent getIntent() {
        return this.intent;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final RedirectHint getRedirectHint() {
        return this.redirectHint;
    }

    public final Cta copy(String copy, CtaIntent intent, RedirectHint redirectHint) {
        copy.getClass();
        intent.getClass();
        return new Cta(copy, intent, redirectHint);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Cta)) {
            return false;
        }
        Cta cta = (Cta) other;
        return x44.r(this.copy, cta.copy) && this.intent == cta.intent && this.redirectHint == cta.redirectHint;
    }

    public final String getCopy() {
        return this.copy;
    }

    public final CtaIntent getIntent() {
        return this.intent;
    }

    public final RedirectHint getRedirectHint() {
        return this.redirectHint;
    }

    public int hashCode() {
        int iHashCode = (this.intent.hashCode() + (this.copy.hashCode() * 31)) * 31;
        RedirectHint redirectHint = this.redirectHint;
        return iHashCode + (redirectHint == null ? 0 : redirectHint.hashCode());
    }

    public String toString() {
        return "Cta(copy=" + this.copy + ", intent=" + this.intent + ", redirectHint=" + this.redirectHint + ")";
    }

    public Cta() {
        this((String) null, (CtaIntent) null, (RedirectHint) null, 7, (mq5) null);
    }

    public Cta(String str, CtaIntent ctaIntent, RedirectHint redirectHint) {
        str.getClass();
        ctaIntent.getClass();
        this.copy = str;
        this.intent = ctaIntent;
        this.redirectHint = redirectHint;
    }

    public /* synthetic */ Cta(String str, CtaIntent ctaIntent, RedirectHint redirectHint, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CtaIntent.UNKNOWN : ctaIntent, (i & 4) != 0 ? null : redirectHint);
    }
}
