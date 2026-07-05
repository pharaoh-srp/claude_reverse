package com.anthropic.claude.configs.flags;

import defpackage.kib;
import defpackage.lz1;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.uh6;
import defpackage.v40;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.zh6;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0005\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J$\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0015J\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u0015R\u0011\u0010'\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006+"}, d2 = {"Lcom/anthropic/claude/configs/flags/MessageQueueConfig;", "", "", "ttl_hours", "max_active", "<init>", "(II)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(IIILvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$configs", "(Lcom/anthropic/claude/configs/flags/MessageQueueConfig;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "copy", "(II)Lcom/anthropic/claude/configs/flags/MessageQueueConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getTtl_hours", "getMax_active", "Luh6;", "getTtl-UwyO8pc", "()J", "ttl", "Companion", "kib", "jib", "configs"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class MessageQueueConfig {
    public static final int $stable = 0;
    public static final kib Companion = new kib();
    public static final String FEATURE_KEY = "mobile_message_queue";
    private final int max_active;
    private final int ttl_hours;

    public /* synthetic */ MessageQueueConfig(int i, int i2, int i3, vnf vnfVar) {
        this.ttl_hours = (i & 1) == 0 ? 12 : i2;
        if ((i & 2) == 0) {
            this.max_active = 3;
        } else {
            this.max_active = i3;
        }
    }

    public static /* synthetic */ MessageQueueConfig copy$default(MessageQueueConfig messageQueueConfig, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = messageQueueConfig.ttl_hours;
        }
        if ((i3 & 2) != 0) {
            i2 = messageQueueConfig.max_active;
        }
        return messageQueueConfig.copy(i, i2);
    }

    public static final /* synthetic */ void write$Self$configs(MessageQueueConfig self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.ttl_hours != 12) {
            output.l(0, self.ttl_hours, serialDesc);
        }
        if (!output.E(serialDesc) && self.max_active == 3) {
            return;
        }
        output.l(1, self.max_active, serialDesc);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTtl_hours() {
        return this.ttl_hours;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMax_active() {
        return this.max_active;
    }

    public final MessageQueueConfig copy(int ttl_hours, int max_active) {
        return new MessageQueueConfig(ttl_hours, max_active);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageQueueConfig)) {
            return false;
        }
        MessageQueueConfig messageQueueConfig = (MessageQueueConfig) other;
        return this.ttl_hours == messageQueueConfig.ttl_hours && this.max_active == messageQueueConfig.max_active;
    }

    public final int getMax_active() {
        return this.max_active;
    }

    /* JADX INFO: renamed from: getTtl-UwyO8pc, reason: not valid java name */
    public final long m728getTtlUwyO8pc() {
        lz1 lz1Var = uh6.F;
        return v40.Q(this.ttl_hours, zh6.HOURS);
    }

    public final int getTtl_hours() {
        return this.ttl_hours;
    }

    public int hashCode() {
        return Integer.hashCode(this.max_active) + (Integer.hashCode(this.ttl_hours) * 31);
    }

    public String toString() {
        return vb7.q("MessageQueueConfig(ttl_hours=", ", max_active=", this.ttl_hours, this.max_active, ")");
    }

    public MessageQueueConfig(int i, int i2) {
        this.ttl_hours = i;
        this.max_active = i2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MessageQueueConfig() {
        int i = 0;
        this(i, i, 3, (mq5) null);
    }

    public /* synthetic */ MessageQueueConfig(int i, int i2, int i3, mq5 mq5Var) {
        this((i3 & 1) != 0 ? 12 : i, (i3 & 2) != 0 ? 3 : i2);
    }
}
