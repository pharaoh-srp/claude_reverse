package com.anthropic.claude.api.chat.tool;

import defpackage.gvj;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.sse;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.wse;
import defpackage.x44;
import defpackage.xse;
import defpackage.zt1;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b\u0005\u0010\u0019¨\u0006+"}, d2 = {"Lcom/anthropic/claude/api/chat/tool/RichLinkDisplayContent;", "Lcom/anthropic/claude/api/chat/tool/ToolDisplayContent;", "Lcom/anthropic/claude/api/chat/tool/RichItem;", "link", "", "is_trusted", "<init>", "(Lcom/anthropic/claude/api/chat/tool/RichItem;Ljava/lang/Boolean;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/api/chat/tool/RichItem;Ljava/lang/Boolean;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/chat/tool/RichLinkDisplayContent;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/api/chat/tool/RichItem;", "component2", "()Ljava/lang/Boolean;", "copy", "(Lcom/anthropic/claude/api/chat/tool/RichItem;Ljava/lang/Boolean;)Lcom/anthropic/claude/api/chat/tool/RichLinkDisplayContent;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/api/chat/tool/RichItem;", "getLink", "Ljava/lang/Boolean;", "Companion", "wse", "xse", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class RichLinkDisplayContent implements ToolDisplayContent {
    public static final int $stable = 0;
    public static final xse Companion = new xse();
    private final Boolean is_trusted;
    private final RichItem link;

    public /* synthetic */ RichLinkDisplayContent(int i, RichItem richItem, Boolean bool, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, wse.a.getDescriptor());
            throw null;
        }
        this.link = richItem;
        if ((i & 2) == 0) {
            this.is_trusted = null;
        } else {
            this.is_trusted = bool;
        }
    }

    public static /* synthetic */ RichLinkDisplayContent copy$default(RichLinkDisplayContent richLinkDisplayContent, RichItem richItem, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            richItem = richLinkDisplayContent.link;
        }
        if ((i & 2) != 0) {
            bool = richLinkDisplayContent.is_trusted;
        }
        return richLinkDisplayContent.copy(richItem, bool);
    }

    public static final /* synthetic */ void write$Self$api(RichLinkDisplayContent self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, sse.a, self.link);
        if (!output.E(serialDesc) && self.is_trusted == null) {
            return;
        }
        output.B(serialDesc, 1, zt1.a, self.is_trusted);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final RichItem getLink() {
        return this.link;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getIs_trusted() {
        return this.is_trusted;
    }

    public final RichLinkDisplayContent copy(RichItem link, Boolean is_trusted) {
        link.getClass();
        return new RichLinkDisplayContent(link, is_trusted);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RichLinkDisplayContent)) {
            return false;
        }
        RichLinkDisplayContent richLinkDisplayContent = (RichLinkDisplayContent) other;
        return x44.r(this.link, richLinkDisplayContent.link) && x44.r(this.is_trusted, richLinkDisplayContent.is_trusted);
    }

    public final RichItem getLink() {
        return this.link;
    }

    public int hashCode() {
        int iHashCode = this.link.hashCode() * 31;
        Boolean bool = this.is_trusted;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final Boolean is_trusted() {
        return this.is_trusted;
    }

    public String toString() {
        return "RichLinkDisplayContent(link=" + this.link + ", is_trusted=" + this.is_trusted + ")";
    }

    public RichLinkDisplayContent(RichItem richItem, Boolean bool) {
        richItem.getClass();
        this.link = richItem;
        this.is_trusted = bool;
    }

    public /* synthetic */ RichLinkDisplayContent(RichItem richItem, Boolean bool, int i, mq5 mq5Var) {
        this(richItem, (i & 2) != 0 ? null : bool);
    }
}
