package com.anthropic.claude.api.chat;

import defpackage.e79;
import defpackage.gvj;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.wfb;
import defpackage.x44;
import defpackage.xfb;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'(B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0016J\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0018¨\u0006)"}, d2 = {"Lcom/anthropic/claude/api/chat/MessageDocumentAsset;", "", "", "url", "", "page_count", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Integer;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/chat/MessageDocumentAsset;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/anthropic/claude/api/chat/MessageDocumentAsset;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrl", "Ljava/lang/Integer;", "getPage_count", "Companion", "wfb", "xfb", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class MessageDocumentAsset {
    public static final int $stable = 0;
    public static final xfb Companion = new xfb();
    private final Integer page_count;
    private final String url;

    public /* synthetic */ MessageDocumentAsset(int i, String str, Integer num, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, wfb.a.getDescriptor());
            throw null;
        }
        this.url = str;
        if ((i & 2) == 0) {
            this.page_count = null;
        } else {
            this.page_count = num;
        }
    }

    public static /* synthetic */ MessageDocumentAsset copy$default(MessageDocumentAsset messageDocumentAsset, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = messageDocumentAsset.url;
        }
        if ((i & 2) != 0) {
            num = messageDocumentAsset.page_count;
        }
        return messageDocumentAsset.copy(str, num);
    }

    public static final /* synthetic */ void write$Self$api(MessageDocumentAsset self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.url);
        if (!output.E(serialDesc) && self.page_count == null) {
            return;
        }
        output.B(serialDesc, 1, e79.a, self.page_count);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getPage_count() {
        return this.page_count;
    }

    public final MessageDocumentAsset copy(String url, Integer page_count) {
        url.getClass();
        return new MessageDocumentAsset(url, page_count);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageDocumentAsset)) {
            return false;
        }
        MessageDocumentAsset messageDocumentAsset = (MessageDocumentAsset) other;
        return x44.r(this.url, messageDocumentAsset.url) && x44.r(this.page_count, messageDocumentAsset.page_count);
    }

    public final Integer getPage_count() {
        return this.page_count;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iHashCode = this.url.hashCode() * 31;
        Integer num = this.page_count;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "MessageDocumentAsset(url=" + this.url + ", page_count=" + this.page_count + ")";
    }

    public MessageDocumentAsset(String str, Integer num) {
        str.getClass();
        this.url = str;
        this.page_count = num;
    }

    public /* synthetic */ MessageDocumentAsset(String str, Integer num, int i, mq5 mq5Var) {
        this(str, (i & 2) != 0 ? null : num);
    }
}
