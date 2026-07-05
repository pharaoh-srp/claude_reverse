package com.anthropic.claude.configs.flags;

import defpackage.e79;
import defpackage.fsh;
import defpackage.kw9;
import defpackage.lm6;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.rlf;
import defpackage.uo0;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.zcd;
import defpackage.znf;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0002<=BI\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eBS\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\r\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ\u0010\u0010#\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bHÆ\u0003¢\u0006\u0004\b%\u0010&JR\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010\u001dJ\u001a\u0010.\u001a\u00020\t2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b3\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b5\u0010!R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b6\u0010\u001fR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b8\u0010$R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00109\u001a\u0004\b:\u0010&¨\u0006>"}, d2 = {"Lcom/anthropic/claude/configs/flags/SendRetryConfig;", "", "", "max_attempts", "", "initial_delay_ms", "", "delay_multiplier", "max_delay_ms", "", "retry_on_io_exception", "", "retry_on_http_codes", "<init>", "(IJDJZLjava/util/List;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(IIJDJZLjava/util/List;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$configs", "(Lcom/anthropic/claude/configs/flags/SendRetryConfig;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()J", "component3", "()D", "component4", "component5", "()Z", "component6", "()Ljava/util/List;", "copy", "(IJDJZLjava/util/List;)Lcom/anthropic/claude/configs/flags/SendRetryConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getMax_attempts", "J", "getInitial_delay_ms", "D", "getDelay_multiplier", "getMax_delay_ms", "Z", "getRetry_on_io_exception", "Ljava/util/List;", "getRetry_on_http_codes", "Companion", "rlf", "qlf", "configs"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class SendRetryConfig {
    public static final int $stable = 0;
    public static final String FEATURE_KEY = "mobile_send_retry";
    private final double delay_multiplier;
    private final long initial_delay_ms;
    private final int max_attempts;
    private final long max_delay_ms;
    private final List<Integer> retry_on_http_codes;
    private final boolean retry_on_io_exception;
    public static final rlf Companion = new rlf();
    private static final kw9[] $childSerializers = {null, null, null, null, null, yb5.w(w1a.F, new zcd(29))};

    public /* synthetic */ SendRetryConfig(int i, int i2, long j, double d, long j2, boolean z, List list, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.max_attempts = 0;
        } else {
            this.max_attempts = i2;
        }
        if ((i & 2) == 0) {
            this.initial_delay_ms = 500L;
        } else {
            this.initial_delay_ms = j;
        }
        if ((i & 4) == 0) {
            this.delay_multiplier = 2.0d;
        } else {
            this.delay_multiplier = d;
        }
        if ((i & 8) == 0) {
            this.max_delay_ms = 10000L;
        } else {
            this.max_delay_ms = j2;
        }
        if ((i & 16) == 0) {
            this.retry_on_io_exception = false;
        } else {
            this.retry_on_io_exception = z;
        }
        if ((i & 32) == 0) {
            this.retry_on_http_codes = lm6.E;
        } else {
            this.retry_on_http_codes = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(e79.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SendRetryConfig copy$default(SendRetryConfig sendRetryConfig, int i, long j, double d, long j2, boolean z, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = sendRetryConfig.max_attempts;
        }
        if ((i2 & 2) != 0) {
            j = sendRetryConfig.initial_delay_ms;
        }
        if ((i2 & 4) != 0) {
            d = sendRetryConfig.delay_multiplier;
        }
        if ((i2 & 8) != 0) {
            j2 = sendRetryConfig.max_delay_ms;
        }
        if ((i2 & 16) != 0) {
            z = sendRetryConfig.retry_on_io_exception;
        }
        if ((i2 & 32) != 0) {
            list = sendRetryConfig.retry_on_http_codes;
        }
        long j3 = j2;
        double d2 = d;
        return sendRetryConfig.copy(i, j, d2, j3, z, list);
    }

    public static final /* synthetic */ void write$Self$configs(SendRetryConfig self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        if (output.E(serialDesc) || self.max_attempts != 0) {
            output.l(0, self.max_attempts, serialDesc);
        }
        if (output.E(serialDesc) || self.initial_delay_ms != 500) {
            output.D(serialDesc, 1, self.initial_delay_ms);
        }
        if (output.E(serialDesc) || Double.compare(self.delay_multiplier, 2.0d) != 0) {
            output.z(serialDesc, 2, self.delay_multiplier);
        }
        if (output.E(serialDesc) || self.max_delay_ms != 10000) {
            output.D(serialDesc, 3, self.max_delay_ms);
        }
        if (output.E(serialDesc) || self.retry_on_io_exception) {
            output.p(serialDesc, 4, self.retry_on_io_exception);
        }
        if (!output.E(serialDesc) && x44.r(self.retry_on_http_codes, lm6.E)) {
            return;
        }
        output.r(serialDesc, 5, (znf) kw9VarArr[5].getValue(), self.retry_on_http_codes);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getMax_attempts() {
        return this.max_attempts;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getInitial_delay_ms() {
        return this.initial_delay_ms;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getDelay_multiplier() {
        return this.delay_multiplier;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getMax_delay_ms() {
        return this.max_delay_ms;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getRetry_on_io_exception() {
        return this.retry_on_io_exception;
    }

    public final List<Integer> component6() {
        return this.retry_on_http_codes;
    }

    public final SendRetryConfig copy(int max_attempts, long initial_delay_ms, double delay_multiplier, long max_delay_ms, boolean retry_on_io_exception, List<Integer> retry_on_http_codes) {
        retry_on_http_codes.getClass();
        return new SendRetryConfig(max_attempts, initial_delay_ms, delay_multiplier, max_delay_ms, retry_on_io_exception, retry_on_http_codes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SendRetryConfig)) {
            return false;
        }
        SendRetryConfig sendRetryConfig = (SendRetryConfig) other;
        return this.max_attempts == sendRetryConfig.max_attempts && this.initial_delay_ms == sendRetryConfig.initial_delay_ms && Double.compare(this.delay_multiplier, sendRetryConfig.delay_multiplier) == 0 && this.max_delay_ms == sendRetryConfig.max_delay_ms && this.retry_on_io_exception == sendRetryConfig.retry_on_io_exception && x44.r(this.retry_on_http_codes, sendRetryConfig.retry_on_http_codes);
    }

    public final double getDelay_multiplier() {
        return this.delay_multiplier;
    }

    public final long getInitial_delay_ms() {
        return this.initial_delay_ms;
    }

    public final int getMax_attempts() {
        return this.max_attempts;
    }

    public final long getMax_delay_ms() {
        return this.max_delay_ms;
    }

    public final List<Integer> getRetry_on_http_codes() {
        return this.retry_on_http_codes;
    }

    public final boolean getRetry_on_io_exception() {
        return this.retry_on_io_exception;
    }

    public int hashCode() {
        return this.retry_on_http_codes.hashCode() + fsh.p(vb7.e(fsh.o(this.delay_multiplier, vb7.e(Integer.hashCode(this.max_attempts) * 31, 31, this.initial_delay_ms), 31), 31, this.max_delay_ms), 31, this.retry_on_io_exception);
    }

    public String toString() {
        return "SendRetryConfig(max_attempts=" + this.max_attempts + ", initial_delay_ms=" + this.initial_delay_ms + ", delay_multiplier=" + this.delay_multiplier + ", max_delay_ms=" + this.max_delay_ms + ", retry_on_io_exception=" + this.retry_on_io_exception + ", retry_on_http_codes=" + this.retry_on_http_codes + ")";
    }

    public SendRetryConfig() {
        this(0, 0L, 0.0d, 0L, false, (List) null, 63, (mq5) null);
    }

    public SendRetryConfig(int i, long j, double d, long j2, boolean z, List<Integer> list) {
        list.getClass();
        this.max_attempts = i;
        this.initial_delay_ms = j;
        this.delay_multiplier = d;
        this.max_delay_ms = j2;
        this.retry_on_io_exception = z;
        this.retry_on_http_codes = list;
    }

    public /* synthetic */ SendRetryConfig(int i, long j, double d, long j2, boolean z, List list, int i2, mq5 mq5Var) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? 500L : j, (i2 & 4) != 0 ? 2.0d : d, (i2 & 8) != 0 ? 10000L : j2, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? lm6.E : list);
    }
}
