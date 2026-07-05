package com.anthropic.claude.analytics.events;

import com.anthropic.claude.api.chat.MessageFile;
import defpackage.g9b;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vgb;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.wgb;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/0B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ0\u0010\u001d\u001a\u00020\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\tHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u001cR\u0014\u0010-\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u0019¨\u00061"}, d2 = {"com/anthropic/claude/analytics/events/MessageFileEvents$FilePreviewSeen", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "file_uuid", MessageFile.DISCRIMINATOR, "Lcom/anthropic/claude/analytics/events/MessageFileEvents$FilePreviewSurface;", "surface", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/MessageFileEvents$FilePreviewSurface;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/MessageFileEvents$FilePreviewSurface;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/MessageFileEvents$FilePreviewSeen;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/MessageFileEvents$FilePreviewSeen;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/anthropic/claude/analytics/events/MessageFileEvents$FilePreviewSurface;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/MessageFileEvents$FilePreviewSurface;)Lcom/anthropic/claude/analytics/events/MessageFileEvents$FilePreviewSeen;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFile_uuid", "getFile_kind", "Lcom/anthropic/claude/analytics/events/MessageFileEvents$FilePreviewSurface;", "getSurface", "getEventName", "eventName", "Companion", "vgb", "wgb", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class MessageFileEvents$FilePreviewSeen implements AnalyticsEvent {
    public static final int $stable = 0;
    private final String file_kind;
    private final String file_uuid;
    private final MessageFileEvents$FilePreviewSurface surface;
    public static final wgb Companion = new wgb();
    private static final kw9[] $childSerializers = {null, null, yb5.w(w1a.F, new g9b(16))};

    public /* synthetic */ MessageFileEvents$FilePreviewSeen(int i, String str, String str2, MessageFileEvents$FilePreviewSurface messageFileEvents$FilePreviewSurface, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, vgb.a.getDescriptor());
            throw null;
        }
        this.file_uuid = str;
        this.file_kind = str2;
        if ((i & 4) == 0) {
            this.surface = null;
        } else {
            this.surface = messageFileEvents$FilePreviewSurface;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return MessageFileEvents$FilePreviewSurface.Companion.serializer();
    }

    public static /* synthetic */ MessageFileEvents$FilePreviewSeen copy$default(MessageFileEvents$FilePreviewSeen messageFileEvents$FilePreviewSeen, String str, String str2, MessageFileEvents$FilePreviewSurface messageFileEvents$FilePreviewSurface, int i, Object obj) {
        if ((i & 1) != 0) {
            str = messageFileEvents$FilePreviewSeen.file_uuid;
        }
        if ((i & 2) != 0) {
            str2 = messageFileEvents$FilePreviewSeen.file_kind;
        }
        if ((i & 4) != 0) {
            messageFileEvents$FilePreviewSurface = messageFileEvents$FilePreviewSeen.surface;
        }
        return messageFileEvents$FilePreviewSeen.copy(str, str2, messageFileEvents$FilePreviewSurface);
    }

    public static final /* synthetic */ void write$Self$analytics(MessageFileEvents$FilePreviewSeen self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.file_uuid);
        output.q(serialDesc, 1, self.file_kind);
        if (!output.E(serialDesc) && self.surface == null) {
            return;
        }
        output.B(serialDesc, 2, (znf) kw9VarArr[2].getValue(), self.surface);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFile_uuid() {
        return this.file_uuid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFile_kind() {
        return this.file_kind;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final MessageFileEvents$FilePreviewSurface getSurface() {
        return this.surface;
    }

    public final MessageFileEvents$FilePreviewSeen copy(String file_uuid, String file_kind, MessageFileEvents$FilePreviewSurface surface) {
        file_uuid.getClass();
        file_kind.getClass();
        return new MessageFileEvents$FilePreviewSeen(file_uuid, file_kind, surface);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageFileEvents$FilePreviewSeen)) {
            return false;
        }
        MessageFileEvents$FilePreviewSeen messageFileEvents$FilePreviewSeen = (MessageFileEvents$FilePreviewSeen) other;
        return x44.r(this.file_uuid, messageFileEvents$FilePreviewSeen.file_uuid) && x44.r(this.file_kind, messageFileEvents$FilePreviewSeen.file_kind) && this.surface == messageFileEvents$FilePreviewSeen.surface;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "message_file.preview.seen";
    }

    public final String getFile_kind() {
        return this.file_kind;
    }

    public final String getFile_uuid() {
        return this.file_uuid;
    }

    public final MessageFileEvents$FilePreviewSurface getSurface() {
        return this.surface;
    }

    public int hashCode() {
        int iL = kgh.l(this.file_uuid.hashCode() * 31, 31, this.file_kind);
        MessageFileEvents$FilePreviewSurface messageFileEvents$FilePreviewSurface = this.surface;
        return iL + (messageFileEvents$FilePreviewSurface == null ? 0 : messageFileEvents$FilePreviewSurface.hashCode());
    }

    public String toString() {
        String str = this.file_uuid;
        String str2 = this.file_kind;
        MessageFileEvents$FilePreviewSurface messageFileEvents$FilePreviewSurface = this.surface;
        StringBuilder sbR = kgh.r("FilePreviewSeen(file_uuid=", str, ", file_kind=", str2, ", surface=");
        sbR.append(messageFileEvents$FilePreviewSurface);
        sbR.append(")");
        return sbR.toString();
    }

    public MessageFileEvents$FilePreviewSeen(String str, String str2, MessageFileEvents$FilePreviewSurface messageFileEvents$FilePreviewSurface) {
        str.getClass();
        str2.getClass();
        this.file_uuid = str;
        this.file_kind = str2;
        this.surface = messageFileEvents$FilePreviewSurface;
    }

    public /* synthetic */ MessageFileEvents$FilePreviewSeen(String str, String str2, MessageFileEvents$FilePreviewSurface messageFileEvents$FilePreviewSurface, int i, mq5 mq5Var) {
        this(str, str2, (i & 4) != 0 ? null : messageFileEvents$FilePreviewSurface);
    }
}
