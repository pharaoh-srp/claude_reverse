package com.anthropic.claude.configs.flags;

import defpackage.grc;
import defpackage.hjg;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$%B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0015¨\u0006&"}, d2 = {"Lcom/anthropic/claude/configs/flags/SseConfig;", "", "", "read_timeout_seconds", "<init>", "(J)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(IJLvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$configs", "(Lcom/anthropic/claude/configs/flags/SseConfig;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()J", "copy", "(J)Lcom/anthropic/claude/configs/flags/SseConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getRead_timeout_seconds", "Companion", "hjg", "gjg", "configs"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class SseConfig {
    public static final int $stable = 0;
    public static final hjg Companion = new hjg();
    public static final long DEFAULT_READ_TIMEOUT_SECONDS = 300;
    public static final String FEATURE_KEY = "android_sse_config";
    private final long read_timeout_seconds;

    public /* synthetic */ SseConfig(int i, long j, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.read_timeout_seconds = 300L;
        } else {
            this.read_timeout_seconds = j;
        }
    }

    public static /* synthetic */ SseConfig copy$default(SseConfig sseConfig, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = sseConfig.read_timeout_seconds;
        }
        return sseConfig.copy(j);
    }

    public static final /* synthetic */ void write$Self$configs(SseConfig self, vd4 output, SerialDescriptor serialDesc) {
        if (!output.E(serialDesc) && self.read_timeout_seconds == 300) {
            return;
        }
        output.D(serialDesc, 0, self.read_timeout_seconds);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getRead_timeout_seconds() {
        return this.read_timeout_seconds;
    }

    public final SseConfig copy(long read_timeout_seconds) {
        return new SseConfig(read_timeout_seconds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SseConfig) && this.read_timeout_seconds == ((SseConfig) other).read_timeout_seconds;
    }

    public final long getRead_timeout_seconds() {
        return this.read_timeout_seconds;
    }

    public int hashCode() {
        return Long.hashCode(this.read_timeout_seconds);
    }

    public String toString() {
        return grc.q(this.read_timeout_seconds, "SseConfig(read_timeout_seconds=", ")");
    }

    public SseConfig() {
        this(0L, 1, (mq5) null);
    }

    public SseConfig(long j) {
        this.read_timeout_seconds = j;
    }

    public /* synthetic */ SseConfig(long j, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? 300L : j);
    }
}
