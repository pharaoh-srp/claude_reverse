package com.anthropic.claude.analytics.events;

import defpackage.g9b;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.sgb;
import defpackage.srg;
import defpackage.tgb;
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
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/0B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ0\u0010\u001d\u001a\u00020\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001bJ\u0010\u0010 \u001a\u00020\tHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b+\u0010\u001bR\u0014\u0010-\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u001b¨\u00061"}, d2 = {"com/anthropic/claude/analytics/events/MessageFileEvents$FilePreviewRendered", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "Lcom/anthropic/claude/analytics/events/MessageFileEvents$FilePreviewResult;", "result", "", "file_extension", "error_reason", "<init>", "(Lcom/anthropic/claude/analytics/events/MessageFileEvents$FilePreviewResult;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/analytics/events/MessageFileEvents$FilePreviewResult;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/MessageFileEvents$FilePreviewRendered;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/MessageFileEvents$FilePreviewRendered;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/analytics/events/MessageFileEvents$FilePreviewResult;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Lcom/anthropic/claude/analytics/events/MessageFileEvents$FilePreviewResult;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/analytics/events/MessageFileEvents$FilePreviewRendered;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/analytics/events/MessageFileEvents$FilePreviewResult;", "getResult", "Ljava/lang/String;", "getFile_extension", "getError_reason", "getEventName", "eventName", "Companion", "sgb", "tgb", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class MessageFileEvents$FilePreviewRendered implements AnalyticsEvent {
    public static final int $stable = 0;
    private final String error_reason;
    private final String file_extension;
    private final MessageFileEvents$FilePreviewResult result;
    public static final tgb Companion = new tgb();
    private static final kw9[] $childSerializers = {yb5.w(w1a.F, new g9b(14)), null, null};

    public /* synthetic */ MessageFileEvents$FilePreviewRendered(int i, MessageFileEvents$FilePreviewResult messageFileEvents$FilePreviewResult, String str, String str2, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, sgb.a.getDescriptor());
            throw null;
        }
        this.result = messageFileEvents$FilePreviewResult;
        this.file_extension = str;
        if ((i & 4) == 0) {
            this.error_reason = null;
        } else {
            this.error_reason = str2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return MessageFileEvents$FilePreviewResult.Companion.serializer();
    }

    public static /* synthetic */ MessageFileEvents$FilePreviewRendered copy$default(MessageFileEvents$FilePreviewRendered messageFileEvents$FilePreviewRendered, MessageFileEvents$FilePreviewResult messageFileEvents$FilePreviewResult, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            messageFileEvents$FilePreviewResult = messageFileEvents$FilePreviewRendered.result;
        }
        if ((i & 2) != 0) {
            str = messageFileEvents$FilePreviewRendered.file_extension;
        }
        if ((i & 4) != 0) {
            str2 = messageFileEvents$FilePreviewRendered.error_reason;
        }
        return messageFileEvents$FilePreviewRendered.copy(messageFileEvents$FilePreviewResult, str, str2);
    }

    public static final /* synthetic */ void write$Self$analytics(MessageFileEvents$FilePreviewRendered self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, (znf) $childSerializers[0].getValue(), self.result);
        output.q(serialDesc, 1, self.file_extension);
        if (!output.E(serialDesc) && self.error_reason == null) {
            return;
        }
        output.B(serialDesc, 2, srg.a, self.error_reason);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final MessageFileEvents$FilePreviewResult getResult() {
        return this.result;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFile_extension() {
        return this.file_extension;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getError_reason() {
        return this.error_reason;
    }

    public final MessageFileEvents$FilePreviewRendered copy(MessageFileEvents$FilePreviewResult result, String file_extension, String error_reason) {
        result.getClass();
        file_extension.getClass();
        return new MessageFileEvents$FilePreviewRendered(result, file_extension, error_reason);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageFileEvents$FilePreviewRendered)) {
            return false;
        }
        MessageFileEvents$FilePreviewRendered messageFileEvents$FilePreviewRendered = (MessageFileEvents$FilePreviewRendered) other;
        return this.result == messageFileEvents$FilePreviewRendered.result && x44.r(this.file_extension, messageFileEvents$FilePreviewRendered.file_extension) && x44.r(this.error_reason, messageFileEvents$FilePreviewRendered.error_reason);
    }

    public final String getError_reason() {
        return this.error_reason;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "message_file.preview.rendered";
    }

    public final String getFile_extension() {
        return this.file_extension;
    }

    public final MessageFileEvents$FilePreviewResult getResult() {
        return this.result;
    }

    public int hashCode() {
        int iL = kgh.l(this.result.hashCode() * 31, 31, this.file_extension);
        String str = this.error_reason;
        return iL + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        MessageFileEvents$FilePreviewResult messageFileEvents$FilePreviewResult = this.result;
        String str = this.file_extension;
        String str2 = this.error_reason;
        StringBuilder sb = new StringBuilder("FilePreviewRendered(result=");
        sb.append(messageFileEvents$FilePreviewResult);
        sb.append(", file_extension=");
        sb.append(str);
        sb.append(", error_reason=");
        return ij0.m(sb, str2, ")");
    }

    public MessageFileEvents$FilePreviewRendered(MessageFileEvents$FilePreviewResult messageFileEvents$FilePreviewResult, String str, String str2) {
        messageFileEvents$FilePreviewResult.getClass();
        str.getClass();
        this.result = messageFileEvents$FilePreviewResult;
        this.file_extension = str;
        this.error_reason = str2;
    }

    public /* synthetic */ MessageFileEvents$FilePreviewRendered(MessageFileEvents$FilePreviewResult messageFileEvents$FilePreviewResult, String str, String str2, int i, mq5 mq5Var) {
        this(messageFileEvents$FilePreviewResult, str, (i & 4) != 0 ? null : str2);
    }
}
