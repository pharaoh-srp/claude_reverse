package com.anthropic.claude.configs.flags;

import defpackage.kqg;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.qy1;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002./B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018JB\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u0018J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b*\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b+\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b,\u0010\u0018¨\u00060"}, d2 = {"Lcom/anthropic/claude/configs/flags/StreamSmoothingConfig;", "", "", "smoother_tick_interval_ms", "min_markdown_group_size_chars", "fade_in_tail_chars", "fade_in_duration_ms", "fade_in_settle_delay_ms", "<init>", "(IIIII)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(IIIIIILvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$configs", "(Lcom/anthropic/claude/configs/flags/StreamSmoothingConfig;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "component3", "component4", "component5", "copy", "(IIIII)Lcom/anthropic/claude/configs/flags/StreamSmoothingConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getSmoother_tick_interval_ms", "getMin_markdown_group_size_chars", "getFade_in_tail_chars", "getFade_in_duration_ms", "getFade_in_settle_delay_ms", "Companion", "kqg", "jqg", "configs"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class StreamSmoothingConfig {
    public static final int $stable = 0;
    public static final kqg Companion = new kqg();
    public static final String FEATURE_KEY = "android_chat_stream_smoothing";
    private final int fade_in_duration_ms;
    private final int fade_in_settle_delay_ms;
    private final int fade_in_tail_chars;
    private final int min_markdown_group_size_chars;
    private final int smoother_tick_interval_ms;

    public /* synthetic */ StreamSmoothingConfig(int i, int i2, int i3, int i4, int i5, int i6, vnf vnfVar) {
        this.smoother_tick_interval_ms = (i & 1) == 0 ? 33 : i2;
        if ((i & 2) == 0) {
            this.min_markdown_group_size_chars = 800;
        } else {
            this.min_markdown_group_size_chars = i3;
        }
        if ((i & 4) == 0) {
            this.fade_in_tail_chars = 0;
        } else {
            this.fade_in_tail_chars = i4;
        }
        if ((i & 8) == 0) {
            this.fade_in_duration_ms = 200;
        } else {
            this.fade_in_duration_ms = i5;
        }
        if ((i & 16) == 0) {
            this.fade_in_settle_delay_ms = 50;
        } else {
            this.fade_in_settle_delay_ms = i6;
        }
    }

    public static /* synthetic */ StreamSmoothingConfig copy$default(StreamSmoothingConfig streamSmoothingConfig, int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = streamSmoothingConfig.smoother_tick_interval_ms;
        }
        if ((i6 & 2) != 0) {
            i2 = streamSmoothingConfig.min_markdown_group_size_chars;
        }
        if ((i6 & 4) != 0) {
            i3 = streamSmoothingConfig.fade_in_tail_chars;
        }
        if ((i6 & 8) != 0) {
            i4 = streamSmoothingConfig.fade_in_duration_ms;
        }
        if ((i6 & 16) != 0) {
            i5 = streamSmoothingConfig.fade_in_settle_delay_ms;
        }
        int i7 = i5;
        int i8 = i3;
        return streamSmoothingConfig.copy(i, i2, i8, i4, i7);
    }

    public static final /* synthetic */ void write$Self$configs(StreamSmoothingConfig self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.smoother_tick_interval_ms != 33) {
            output.l(0, self.smoother_tick_interval_ms, serialDesc);
        }
        if (output.E(serialDesc) || self.min_markdown_group_size_chars != 800) {
            output.l(1, self.min_markdown_group_size_chars, serialDesc);
        }
        if (output.E(serialDesc) || self.fade_in_tail_chars != 0) {
            output.l(2, self.fade_in_tail_chars, serialDesc);
        }
        if (output.E(serialDesc) || self.fade_in_duration_ms != 200) {
            output.l(3, self.fade_in_duration_ms, serialDesc);
        }
        if (!output.E(serialDesc) && self.fade_in_settle_delay_ms == 50) {
            return;
        }
        output.l(4, self.fade_in_settle_delay_ms, serialDesc);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSmoother_tick_interval_ms() {
        return this.smoother_tick_interval_ms;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMin_markdown_group_size_chars() {
        return this.min_markdown_group_size_chars;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getFade_in_tail_chars() {
        return this.fade_in_tail_chars;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getFade_in_duration_ms() {
        return this.fade_in_duration_ms;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getFade_in_settle_delay_ms() {
        return this.fade_in_settle_delay_ms;
    }

    public final StreamSmoothingConfig copy(int smoother_tick_interval_ms, int min_markdown_group_size_chars, int fade_in_tail_chars, int fade_in_duration_ms, int fade_in_settle_delay_ms) {
        return new StreamSmoothingConfig(smoother_tick_interval_ms, min_markdown_group_size_chars, fade_in_tail_chars, fade_in_duration_ms, fade_in_settle_delay_ms);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StreamSmoothingConfig)) {
            return false;
        }
        StreamSmoothingConfig streamSmoothingConfig = (StreamSmoothingConfig) other;
        return this.smoother_tick_interval_ms == streamSmoothingConfig.smoother_tick_interval_ms && this.min_markdown_group_size_chars == streamSmoothingConfig.min_markdown_group_size_chars && this.fade_in_tail_chars == streamSmoothingConfig.fade_in_tail_chars && this.fade_in_duration_ms == streamSmoothingConfig.fade_in_duration_ms && this.fade_in_settle_delay_ms == streamSmoothingConfig.fade_in_settle_delay_ms;
    }

    public final int getFade_in_duration_ms() {
        return this.fade_in_duration_ms;
    }

    public final int getFade_in_settle_delay_ms() {
        return this.fade_in_settle_delay_ms;
    }

    public final int getFade_in_tail_chars() {
        return this.fade_in_tail_chars;
    }

    public final int getMin_markdown_group_size_chars() {
        return this.min_markdown_group_size_chars;
    }

    public final int getSmoother_tick_interval_ms() {
        return this.smoother_tick_interval_ms;
    }

    public int hashCode() {
        return Integer.hashCode(this.fade_in_settle_delay_ms) + vb7.c(this.fade_in_duration_ms, vb7.c(this.fade_in_tail_chars, vb7.c(this.min_markdown_group_size_chars, Integer.hashCode(this.smoother_tick_interval_ms) * 31, 31), 31), 31);
    }

    public String toString() {
        int i = this.smoother_tick_interval_ms;
        int i2 = this.min_markdown_group_size_chars;
        int i3 = this.fade_in_tail_chars;
        int i4 = this.fade_in_duration_ms;
        int i5 = this.fade_in_settle_delay_ms;
        StringBuilder sbV = vb7.v("StreamSmoothingConfig(smoother_tick_interval_ms=", ", min_markdown_group_size_chars=", i, i2, ", fade_in_tail_chars=");
        qy1.k(i3, i4, ", fade_in_duration_ms=", ", fade_in_settle_delay_ms=", sbV);
        return vb7.l(i5, ")", sbV);
    }

    public StreamSmoothingConfig(int i, int i2, int i3, int i4, int i5) {
        this.smoother_tick_interval_ms = i;
        this.min_markdown_group_size_chars = i2;
        this.fade_in_tail_chars = i3;
        this.fade_in_duration_ms = i4;
        this.fade_in_settle_delay_ms = i5;
    }

    public StreamSmoothingConfig() {
        this(0, 0, 0, 0, 0, 31, (mq5) null);
    }

    public /* synthetic */ StreamSmoothingConfig(int i, int i2, int i3, int i4, int i5, int i6, mq5 mq5Var) {
        this((i6 & 1) != 0 ? 33 : i, (i6 & 2) != 0 ? 800 : i2, (i6 & 4) != 0 ? 0 : i3, (i6 & 8) != 0 ? 200 : i4, (i6 & 16) != 0 ? 50 : i5);
    }
}
