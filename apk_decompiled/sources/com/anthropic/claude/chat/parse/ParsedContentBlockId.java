package com.anthropic.claude.chat.parse;

import com.anthropic.claude.types.strings.MessageId;
import defpackage.ehb;
import defpackage.gvj;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.ntc;
import defpackage.onf;
import defpackage.otc;
import defpackage.sq6;
import defpackage.vd4;
import defpackage.vnf;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0016J\u0010\u0010\u001f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0019¨\u0006+"}, d2 = {"Lcom/anthropic/claude/chat/parse/ParsedContentBlockId;", "", "Lcom/anthropic/claude/types/strings/MessageId;", "messageId", "", "index", "<init>", "(Ljava/lang/String;ILmq5;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;ILvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_chat_parse", "(Lcom/anthropic/claude/chat/parse/ParsedContentBlockId;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-PStrttk", "()Ljava/lang/String;", "component1", "component2", "()I", "copy-uJgbY8Q", "(Ljava/lang/String;I)Lcom/anthropic/claude/chat/parse/ParsedContentBlockId;", "copy", "", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessageId-PStrttk", "I", "getIndex", "Companion", "ntc", "otc", "Claude.chat:parse"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ParsedContentBlockId {
    public static final int $stable = 0;
    public static final otc Companion = new otc();
    private final int index;
    private final String messageId;

    private /* synthetic */ ParsedContentBlockId(int i, String str, int i2, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, ntc.a.getDescriptor());
            throw null;
        }
        this.messageId = str;
        this.index = i2;
    }

    /* JADX INFO: renamed from: copy-uJgbY8Q$default, reason: not valid java name */
    public static /* synthetic */ ParsedContentBlockId m683copyuJgbY8Q$default(ParsedContentBlockId parsedContentBlockId, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = parsedContentBlockId.messageId;
        }
        if ((i2 & 2) != 0) {
            i = parsedContentBlockId.index;
        }
        return parsedContentBlockId.m685copyuJgbY8Q(str, i);
    }

    public static final /* synthetic */ void write$Self$Claude_chat_parse(ParsedContentBlockId self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, ehb.a, MessageId.m1051boximpl(self.messageId));
        output.l(1, self.index, serialDesc);
    }

    /* JADX INFO: renamed from: component1-PStrttk, reason: not valid java name and from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: copy-uJgbY8Q, reason: not valid java name */
    public final ParsedContentBlockId m685copyuJgbY8Q(String messageId, int index) {
        messageId.getClass();
        return new ParsedContentBlockId(messageId, index, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ParsedContentBlockId)) {
            return false;
        }
        ParsedContentBlockId parsedContentBlockId = (ParsedContentBlockId) other;
        return MessageId.m1054equalsimpl0(this.messageId, parsedContentBlockId.messageId) && this.index == parsedContentBlockId.index;
    }

    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: getMessageId-PStrttk, reason: not valid java name */
    public final String m686getMessageIdPStrttk() {
        return this.messageId;
    }

    public int hashCode() {
        return Integer.hashCode(this.index) + (MessageId.m1055hashCodeimpl(this.messageId) * 31);
    }

    public String toString() {
        return sq6.u("ParsedContentBlockId(messageId=", MessageId.m1056toStringimpl(this.messageId), this.index, ", index=", ")");
    }

    public /* synthetic */ ParsedContentBlockId(String str, int i, mq5 mq5Var) {
        this(str, i);
    }

    public /* synthetic */ ParsedContentBlockId(int i, String str, int i2, vnf vnfVar, mq5 mq5Var) {
        this(i, str, i2, vnfVar);
    }

    private ParsedContentBlockId(String str, int i) {
        str.getClass();
        this.messageId = str;
        this.index = i;
    }
}
