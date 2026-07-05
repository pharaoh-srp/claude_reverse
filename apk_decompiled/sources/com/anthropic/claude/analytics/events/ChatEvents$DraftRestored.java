package com.anthropic.claude.analytics.events;

import defpackage.ao2;
import defpackage.ap2;
import defpackage.gvj;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.yb5;
import defpackage.znf;
import defpackage.zo2;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000212B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ.\u0010\u001e\u001a\u00020\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b#\u0010\u001bJ\u001a\u0010&\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u001dR\u0014\u0010/\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\"¨\u00063"}, d2 = {"com/anthropic/claude/analytics/events/ChatEvents$DraftRestored", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "had_attachments", "", "age_seconds", "Lcom/anthropic/claude/analytics/events/ChatEvents$DraftRestoreTrigger;", "trigger", "<init>", "(ZILcom/anthropic/claude/analytics/events/ChatEvents$DraftRestoreTrigger;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(IZILcom/anthropic/claude/analytics/events/ChatEvents$DraftRestoreTrigger;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/ChatEvents$DraftRestored;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/ChatEvents$DraftRestored;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Z", "component2", "()I", "component3", "()Lcom/anthropic/claude/analytics/events/ChatEvents$DraftRestoreTrigger;", "copy", "(ZILcom/anthropic/claude/analytics/events/ChatEvents$DraftRestoreTrigger;)Lcom/anthropic/claude/analytics/events/ChatEvents$DraftRestored;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getHad_attachments", "I", "getAge_seconds", "Lcom/anthropic/claude/analytics/events/ChatEvents$DraftRestoreTrigger;", "getTrigger", "getEventName", "eventName", "Companion", "zo2", "ap2", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ChatEvents$DraftRestored implements AnalyticsEvent {
    public static final int $stable = 0;
    private final int age_seconds;
    private final boolean had_attachments;
    private final ChatEvents$DraftRestoreTrigger trigger;
    public static final ap2 Companion = new ap2();
    private static final kw9[] $childSerializers = {null, null, yb5.w(w1a.F, new ao2(11))};

    public /* synthetic */ ChatEvents$DraftRestored(int i, boolean z, int i2, ChatEvents$DraftRestoreTrigger chatEvents$DraftRestoreTrigger, vnf vnfVar) {
        if (7 != (i & 7)) {
            gvj.f(i, 7, zo2.a.getDescriptor());
            throw null;
        }
        this.had_attachments = z;
        this.age_seconds = i2;
        this.trigger = chatEvents$DraftRestoreTrigger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return ChatEvents$DraftRestoreTrigger.Companion.serializer();
    }

    public static /* synthetic */ ChatEvents$DraftRestored copy$default(ChatEvents$DraftRestored chatEvents$DraftRestored, boolean z, int i, ChatEvents$DraftRestoreTrigger chatEvents$DraftRestoreTrigger, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = chatEvents$DraftRestored.had_attachments;
        }
        if ((i2 & 2) != 0) {
            i = chatEvents$DraftRestored.age_seconds;
        }
        if ((i2 & 4) != 0) {
            chatEvents$DraftRestoreTrigger = chatEvents$DraftRestored.trigger;
        }
        return chatEvents$DraftRestored.copy(z, i, chatEvents$DraftRestoreTrigger);
    }

    public static final /* synthetic */ void write$Self$analytics(ChatEvents$DraftRestored self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.p(serialDesc, 0, self.had_attachments);
        output.l(1, self.age_seconds, serialDesc);
        output.r(serialDesc, 2, (znf) kw9VarArr[2].getValue(), self.trigger);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getHad_attachments() {
        return this.had_attachments;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getAge_seconds() {
        return this.age_seconds;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ChatEvents$DraftRestoreTrigger getTrigger() {
        return this.trigger;
    }

    public final ChatEvents$DraftRestored copy(boolean had_attachments, int age_seconds, ChatEvents$DraftRestoreTrigger trigger) {
        trigger.getClass();
        return new ChatEvents$DraftRestored(had_attachments, age_seconds, trigger);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatEvents$DraftRestored)) {
            return false;
        }
        ChatEvents$DraftRestored chatEvents$DraftRestored = (ChatEvents$DraftRestored) other;
        return this.had_attachments == chatEvents$DraftRestored.had_attachments && this.age_seconds == chatEvents$DraftRestored.age_seconds && this.trigger == chatEvents$DraftRestored.trigger;
    }

    public final int getAge_seconds() {
        return this.age_seconds;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_draft_restored";
    }

    public final boolean getHad_attachments() {
        return this.had_attachments;
    }

    public final ChatEvents$DraftRestoreTrigger getTrigger() {
        return this.trigger;
    }

    public int hashCode() {
        return this.trigger.hashCode() + vb7.c(this.age_seconds, Boolean.hashCode(this.had_attachments) * 31, 31);
    }

    public String toString() {
        return "DraftRestored(had_attachments=" + this.had_attachments + ", age_seconds=" + this.age_seconds + ", trigger=" + this.trigger + ")";
    }

    public ChatEvents$DraftRestored(boolean z, int i, ChatEvents$DraftRestoreTrigger chatEvents$DraftRestoreTrigger) {
        chatEvents$DraftRestoreTrigger.getClass();
        this.had_attachments = z;
        this.age_seconds = i;
        this.trigger = chatEvents$DraftRestoreTrigger;
    }
}
