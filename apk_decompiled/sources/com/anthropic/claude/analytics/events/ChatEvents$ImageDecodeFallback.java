package com.anthropic.claude.analytics.events;

import defpackage.dp2;
import defpackage.ep2;
import defpackage.fsh;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.onf;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000256B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bBG\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b!\u0010 JB\u0010\"\u001a\u00020\u00102\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b%\u0010 J\u001a\u0010(\u001a\u00020\u00042\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b.\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010 R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b1\u0010 R\u0014\u00103\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u001b¨\u00067"}, d2 = {"com/anthropic/claude/analytics/events/ChatEvents$ImageDecodeFallback", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "mime_type", "", "success", "original_error", "", "width", "height", "<init>", "(Ljava/lang/String;ZLjava/lang/String;II)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;ZLjava/lang/String;IILvnf;)V", "Lcom/anthropic/claude/analytics/events/ChatEvents$ImageDecodeFallback;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/ChatEvents$ImageDecodeFallback;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "component4", "()I", "component5", "copy", "(Ljava/lang/String;ZLjava/lang/String;II)Lcom/anthropic/claude/analytics/events/ChatEvents$ImageDecodeFallback;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMime_type", "Z", "getSuccess", "getOriginal_error", "I", "getWidth", "getHeight", "getEventName", "eventName", "Companion", "dp2", "ep2", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ChatEvents$ImageDecodeFallback implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final ep2 Companion = new ep2();
    private final int height;
    private final String mime_type;
    private final String original_error;
    private final boolean success;
    private final int width;

    public /* synthetic */ ChatEvents$ImageDecodeFallback(int i, String str, boolean z, String str2, int i2, int i3, vnf vnfVar) {
        if (31 != (i & 31)) {
            gvj.f(i, 31, dp2.a.getDescriptor());
            throw null;
        }
        this.mime_type = str;
        this.success = z;
        this.original_error = str2;
        this.width = i2;
        this.height = i3;
    }

    public static /* synthetic */ ChatEvents$ImageDecodeFallback copy$default(ChatEvents$ImageDecodeFallback chatEvents$ImageDecodeFallback, String str, boolean z, String str2, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = chatEvents$ImageDecodeFallback.mime_type;
        }
        if ((i3 & 2) != 0) {
            z = chatEvents$ImageDecodeFallback.success;
        }
        if ((i3 & 4) != 0) {
            str2 = chatEvents$ImageDecodeFallback.original_error;
        }
        if ((i3 & 8) != 0) {
            i = chatEvents$ImageDecodeFallback.width;
        }
        if ((i3 & 16) != 0) {
            i2 = chatEvents$ImageDecodeFallback.height;
        }
        int i4 = i2;
        String str3 = str2;
        return chatEvents$ImageDecodeFallback.copy(str, z, str3, i, i4);
    }

    public static final /* synthetic */ void write$Self$analytics(ChatEvents$ImageDecodeFallback self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.mime_type);
        output.p(serialDesc, 1, self.success);
        output.q(serialDesc, 2, self.original_error);
        output.l(3, self.width, serialDesc);
        output.l(4, self.height, serialDesc);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMime_type() {
        return this.mime_type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOriginal_error() {
        return this.original_error;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    public final ChatEvents$ImageDecodeFallback copy(String mime_type, boolean success, String original_error, int width, int height) {
        mime_type.getClass();
        original_error.getClass();
        return new ChatEvents$ImageDecodeFallback(mime_type, success, original_error, width, height);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatEvents$ImageDecodeFallback)) {
            return false;
        }
        ChatEvents$ImageDecodeFallback chatEvents$ImageDecodeFallback = (ChatEvents$ImageDecodeFallback) other;
        return x44.r(this.mime_type, chatEvents$ImageDecodeFallback.mime_type) && this.success == chatEvents$ImageDecodeFallback.success && x44.r(this.original_error, chatEvents$ImageDecodeFallback.original_error) && this.width == chatEvents$ImageDecodeFallback.width && this.height == chatEvents$ImageDecodeFallback.height;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_image_decode_fallback";
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getMime_type() {
        return this.mime_type;
    }

    public final String getOriginal_error() {
        return this.original_error;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return Integer.hashCode(this.height) + vb7.c(this.width, kgh.l(fsh.p(this.mime_type.hashCode() * 31, 31, this.success), 31, this.original_error), 31);
    }

    public String toString() {
        String str = this.mime_type;
        boolean z = this.success;
        String str2 = this.original_error;
        int i = this.width;
        int i2 = this.height;
        StringBuilder sb = new StringBuilder("ImageDecodeFallback(mime_type=");
        sb.append(str);
        sb.append(", success=");
        sb.append(z);
        sb.append(", original_error=");
        sb.append(str2);
        sb.append(", width=");
        sb.append(i);
        sb.append(", height=");
        return vb7.l(i2, ")", sb);
    }

    public ChatEvents$ImageDecodeFallback(String str, boolean z, String str2, int i, int i2) {
        str.getClass();
        str2.getClass();
        this.mime_type = str;
        this.success = z;
        this.original_error = str2;
        this.width = i;
        this.height = i2;
    }
}
