package com.anthropic.claude.api.chat;

import com.anthropic.claude.types.strings.MessageId;
import defpackage.e79;
import defpackage.ehb;
import defpackage.ghb;
import defpackage.gvj;
import defpackage.hhb;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000223B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ>\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001aJ\u0010\u0010$\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b.\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b/\u0010\u001aR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b0\u0010\u001a¨\u00064"}, d2 = {"Lcom/anthropic/claude/api/chat/MessageImageAsset;", "", "", "url", "", "image_width", "image_height", "Lcom/anthropic/claude/types/strings/MessageId;", "messageId", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lmq5;)V", "seen0", "cacheKey", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/chat/MessageImageAsset;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Integer;", "component3", "component4-saiyK68", "component4", "copy-oxImds8", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/anthropic/claude/api/chat/MessageImageAsset;", "copy", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrl", "Ljava/lang/Integer;", "getImage_width", "getImage_height", "getMessageId-saiyK68", "getCacheKey", "Companion", "ghb", "hhb", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class MessageImageAsset {
    public static final int $stable = 0;
    public static final hhb Companion = new hhb();
    private final String cacheKey;
    private final Integer image_height;
    private final Integer image_width;
    private final String messageId;
    private final String url;

    private /* synthetic */ MessageImageAsset(int i, String str, Integer num, Integer num2, String str2, String str3, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, ghb.a.getDescriptor());
            throw null;
        }
        this.url = str;
        if ((i & 2) == 0) {
            this.image_width = null;
        } else {
            this.image_width = num;
        }
        if ((i & 4) == 0) {
            this.image_height = null;
        } else {
            this.image_height = num2;
        }
        if ((i & 8) == 0) {
            this.messageId = null;
        } else {
            this.messageId = str2;
        }
        if ((i & 16) != 0) {
            this.cacheKey = str3;
            return;
        }
        String str4 = this.messageId;
        this.cacheKey = (str4 != null ? MessageId.m1051boximpl(str4) : "null") + "_" + str;
    }

    /* JADX INFO: renamed from: copy-oxImds8$default, reason: not valid java name */
    public static /* synthetic */ MessageImageAsset m240copyoxImds8$default(MessageImageAsset messageImageAsset, String str, Integer num, Integer num2, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = messageImageAsset.url;
        }
        if ((i & 2) != 0) {
            num = messageImageAsset.image_width;
        }
        if ((i & 4) != 0) {
            num2 = messageImageAsset.image_height;
        }
        if ((i & 8) != 0) {
            str2 = messageImageAsset.messageId;
        }
        return messageImageAsset.m242copyoxImds8(str, num, num2, str2);
    }

    public static final /* synthetic */ void write$Self$api(MessageImageAsset self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.url);
        if (output.E(serialDesc) || self.image_width != null) {
            output.B(serialDesc, 1, e79.a, self.image_width);
        }
        if (output.E(serialDesc) || self.image_height != null) {
            output.B(serialDesc, 2, e79.a, self.image_height);
        }
        if (output.E(serialDesc) || self.messageId != null) {
            ehb ehbVar = ehb.a;
            String str = self.messageId;
            output.B(serialDesc, 3, ehbVar, str != null ? MessageId.m1051boximpl(str) : null);
        }
        if (!output.E(serialDesc)) {
            String str2 = self.cacheKey;
            String str3 = self.messageId;
            if (x44.r(str2, (str3 != null ? MessageId.m1051boximpl(str3) : "null") + "_" + self.url)) {
                return;
            }
        }
        output.q(serialDesc, 4, self.cacheKey);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getImage_width() {
        return this.image_width;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getImage_height() {
        return this.image_height;
    }

    /* JADX INFO: renamed from: component4-saiyK68, reason: not valid java name and from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    /* JADX INFO: renamed from: copy-oxImds8, reason: not valid java name */
    public final MessageImageAsset m242copyoxImds8(String url, Integer image_width, Integer image_height, String messageId) {
        url.getClass();
        return new MessageImageAsset(url, image_width, image_height, messageId, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.anthropic.claude.api.chat.MessageImageAsset
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.anthropic.claude.api.chat.MessageImageAsset r5 = (com.anthropic.claude.api.chat.MessageImageAsset) r5
            java.lang.String r1 = r4.url
            java.lang.String r3 = r5.url
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.Integer r1 = r4.image_width
            java.lang.Integer r3 = r5.image_width
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.Integer r1 = r4.image_height
            java.lang.Integer r3 = r5.image_height
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r4 = r4.messageId
            java.lang.String r5 = r5.messageId
            if (r4 != 0) goto L39
            if (r5 != 0) goto L37
            r4 = r0
            goto L40
        L37:
            r4 = r2
            goto L40
        L39:
            if (r5 != 0) goto L3c
            goto L37
        L3c:
            boolean r4 = com.anthropic.claude.types.strings.MessageId.m1054equalsimpl0(r4, r5)
        L40:
            if (r4 != 0) goto L43
            return r2
        L43:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.api.chat.MessageImageAsset.equals(java.lang.Object):boolean");
    }

    public final String getCacheKey() {
        return this.cacheKey;
    }

    public final Integer getImage_height() {
        return this.image_height;
    }

    public final Integer getImage_width() {
        return this.image_width;
    }

    /* JADX INFO: renamed from: getMessageId-saiyK68, reason: not valid java name */
    public final String m243getMessageIdsaiyK68() {
        return this.messageId;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iHashCode = this.url.hashCode() * 31;
        Integer num = this.image_width;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.image_height;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.messageId;
        return iHashCode3 + (str != null ? MessageId.m1055hashCodeimpl(str) : 0);
    }

    public String toString() {
        String str = this.url;
        Integer num = this.image_width;
        Integer num2 = this.image_height;
        String str2 = this.messageId;
        return "MessageImageAsset(url=" + str + ", image_width=" + num + ", image_height=" + num2 + ", messageId=" + (str2 == null ? "null" : MessageId.m1056toStringimpl(str2)) + ")";
    }

    public /* synthetic */ MessageImageAsset(String str, Integer num, Integer num2, String str2, mq5 mq5Var) {
        this(str, num, num2, str2);
    }

    public /* synthetic */ MessageImageAsset(int i, String str, Integer num, Integer num2, String str2, String str3, vnf vnfVar, mq5 mq5Var) {
        this(i, str, num, num2, str2, str3, vnfVar);
    }

    private MessageImageAsset(String str, Integer num, Integer num2, String str2) {
        str.getClass();
        this.url = str;
        this.image_width = num;
        this.image_height = num2;
        this.messageId = str2;
        this.cacheKey = (str2 != null ? MessageId.m1051boximpl(str2) : "null") + "_" + str;
    }

    public /* synthetic */ MessageImageAsset(String str, Integer num, Integer num2, String str2, int i, mq5 mq5Var) {
        this(str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : str2, null);
    }
}
