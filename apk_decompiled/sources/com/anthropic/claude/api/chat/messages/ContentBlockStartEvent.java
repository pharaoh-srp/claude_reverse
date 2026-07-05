package com.anthropic.claude.api.chat.messages;

import defpackage.gvj;
import defpackage.hn4;
import defpackage.in4;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.rk3;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J$\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0016J\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0018¨\u0006+"}, d2 = {"Lcom/anthropic/claude/api/chat/messages/ContentBlockStartEvent;", "Lcom/anthropic/claude/api/chat/messages/StreamEvent;", "", "index", "Lcom/anthropic/claude/api/chat/messages/ContentBlock;", "content_block", "<init>", "(ILcom/anthropic/claude/api/chat/messages/ContentBlock;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(IILcom/anthropic/claude/api/chat/messages/ContentBlock;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/chat/messages/ContentBlockStartEvent;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Lcom/anthropic/claude/api/chat/messages/ContentBlock;", "copy", "(ILcom/anthropic/claude/api/chat/messages/ContentBlock;)Lcom/anthropic/claude/api/chat/messages/ContentBlockStartEvent;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getIndex", "Lcom/anthropic/claude/api/chat/messages/ContentBlock;", "getContent_block", "Companion", "hn4", "in4", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ContentBlockStartEvent implements StreamEvent {
    public static final int $stable = 0;
    private final ContentBlock content_block;
    private final int index;
    public static final in4 Companion = new in4();
    private static final kw9[] $childSerializers = {null, yb5.w(w1a.F, new rk3(13))};

    public /* synthetic */ ContentBlockStartEvent(int i, int i2, ContentBlock contentBlock, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, hn4.a.getDescriptor());
            throw null;
        }
        this.index = i2;
        this.content_block = contentBlock;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return ContentBlock.Companion.serializer();
    }

    public static /* synthetic */ ContentBlockStartEvent copy$default(ContentBlockStartEvent contentBlockStartEvent, int i, ContentBlock contentBlock, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = contentBlockStartEvent.index;
        }
        if ((i2 & 2) != 0) {
            contentBlock = contentBlockStartEvent.content_block;
        }
        return contentBlockStartEvent.copy(i, contentBlock);
    }

    public static final /* synthetic */ void write$Self$api(ContentBlockStartEvent self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.l(0, self.index, serialDesc);
        output.r(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.content_block);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ContentBlock getContent_block() {
        return this.content_block;
    }

    public final ContentBlockStartEvent copy(int index, ContentBlock content_block) {
        content_block.getClass();
        return new ContentBlockStartEvent(index, content_block);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContentBlockStartEvent)) {
            return false;
        }
        ContentBlockStartEvent contentBlockStartEvent = (ContentBlockStartEvent) other;
        return this.index == contentBlockStartEvent.index && x44.r(this.content_block, contentBlockStartEvent.content_block);
    }

    public final ContentBlock getContent_block() {
        return this.content_block;
    }

    public final int getIndex() {
        return this.index;
    }

    public int hashCode() {
        return this.content_block.hashCode() + (Integer.hashCode(this.index) * 31);
    }

    public String toString() {
        return "ContentBlockStartEvent(index=" + this.index + ", content_block=" + this.content_block + ")";
    }

    public ContentBlockStartEvent(int i, ContentBlock contentBlock) {
        contentBlock.getClass();
        this.index = i;
        this.content_block = contentBlock;
    }
}
