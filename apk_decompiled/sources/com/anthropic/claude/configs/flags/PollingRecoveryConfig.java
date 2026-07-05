package com.anthropic.claude.configs.flags;

import defpackage.fsh;
import defpackage.ij0;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.o8d;
import defpackage.onf;
import defpackage.qy1;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0087\b\u0018\u0000 82\u00020\u0001:\u00029:BM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rBS\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\f\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0010\u0010\"\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b$\u0010#JV\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u001cJ\u001a\u0010,\u001a\u00020\t2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b2\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b3\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b4\u0010\u001cR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b6\u0010#R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b7\u0010#¨\u0006;"}, d2 = {"Lcom/anthropic/claude/configs/flags/PollingRecoveryConfig;", "", "", "response_budget_sec", "", "poll_interval_ms", "max_poll_interval_ms", "resume_refresh_debounce_sec", "max_consecutive_fetch_failed", "", "skip_conversation_load_polling", "skip_known_terminal_error_polling", "<init>", "(IJJIIZZ)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(IIJJIIZZLvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$configs", "(Lcom/anthropic/claude/configs/flags/PollingRecoveryConfig;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()J", "component3", "component4", "component5", "component6", "()Z", "component7", "copy", "(IJJIIZZ)Lcom/anthropic/claude/configs/flags/PollingRecoveryConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getResponse_budget_sec", "J", "getPoll_interval_ms", "getMax_poll_interval_ms", "getResume_refresh_debounce_sec", "getMax_consecutive_fetch_failed", "Z", "getSkip_conversation_load_polling", "getSkip_known_terminal_error_polling", "Companion", "o8d", "n8d", "configs"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class PollingRecoveryConfig {
    public static final int $stable = 0;
    public static final o8d Companion = new o8d();
    public static final String FEATURE_KEY = "android_polling_recovery_config";
    private final int max_consecutive_fetch_failed;
    private final long max_poll_interval_ms;
    private final long poll_interval_ms;
    private final int response_budget_sec;
    private final int resume_refresh_debounce_sec;
    private final boolean skip_conversation_load_polling;
    private final boolean skip_known_terminal_error_polling;

    public /* synthetic */ PollingRecoveryConfig(int i, int i2, long j, long j2, int i3, int i4, boolean z, boolean z2, vnf vnfVar) {
        this.response_budget_sec = (i & 1) == 0 ? 300 : i2;
        if ((i & 2) == 0) {
            this.poll_interval_ms = 3000L;
        } else {
            this.poll_interval_ms = j;
        }
        if ((i & 4) == 0) {
            this.max_poll_interval_ms = 10000L;
        } else {
            this.max_poll_interval_ms = j2;
        }
        if ((i & 8) == 0) {
            this.resume_refresh_debounce_sec = 10;
        } else {
            this.resume_refresh_debounce_sec = i3;
        }
        if ((i & 16) == 0) {
            this.max_consecutive_fetch_failed = 10;
        } else {
            this.max_consecutive_fetch_failed = i4;
        }
        if ((i & 32) == 0) {
            this.skip_conversation_load_polling = false;
        } else {
            this.skip_conversation_load_polling = z;
        }
        if ((i & 64) == 0) {
            this.skip_known_terminal_error_polling = false;
        } else {
            this.skip_known_terminal_error_polling = z2;
        }
    }

    public static /* synthetic */ PollingRecoveryConfig copy$default(PollingRecoveryConfig pollingRecoveryConfig, int i, long j, long j2, int i2, int i3, boolean z, boolean z2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = pollingRecoveryConfig.response_budget_sec;
        }
        if ((i4 & 2) != 0) {
            j = pollingRecoveryConfig.poll_interval_ms;
        }
        if ((i4 & 4) != 0) {
            j2 = pollingRecoveryConfig.max_poll_interval_ms;
        }
        if ((i4 & 8) != 0) {
            i2 = pollingRecoveryConfig.resume_refresh_debounce_sec;
        }
        if ((i4 & 16) != 0) {
            i3 = pollingRecoveryConfig.max_consecutive_fetch_failed;
        }
        if ((i4 & 32) != 0) {
            z = pollingRecoveryConfig.skip_conversation_load_polling;
        }
        if ((i4 & 64) != 0) {
            z2 = pollingRecoveryConfig.skip_known_terminal_error_polling;
        }
        long j3 = j2;
        return pollingRecoveryConfig.copy(i, j, j3, i2, i3, z, z2);
    }

    public static final /* synthetic */ void write$Self$configs(PollingRecoveryConfig self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.response_budget_sec != 300) {
            output.l(0, self.response_budget_sec, serialDesc);
        }
        if (output.E(serialDesc) || self.poll_interval_ms != 3000) {
            output.D(serialDesc, 1, self.poll_interval_ms);
        }
        if (output.E(serialDesc) || self.max_poll_interval_ms != 10000) {
            output.D(serialDesc, 2, self.max_poll_interval_ms);
        }
        if (output.E(serialDesc) || self.resume_refresh_debounce_sec != 10) {
            output.l(3, self.resume_refresh_debounce_sec, serialDesc);
        }
        if (output.E(serialDesc) || self.max_consecutive_fetch_failed != 10) {
            output.l(4, self.max_consecutive_fetch_failed, serialDesc);
        }
        if (output.E(serialDesc) || self.skip_conversation_load_polling) {
            output.p(serialDesc, 5, self.skip_conversation_load_polling);
        }
        if (output.E(serialDesc) || self.skip_known_terminal_error_polling) {
            output.p(serialDesc, 6, self.skip_known_terminal_error_polling);
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getResponse_budget_sec() {
        return this.response_budget_sec;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getPoll_interval_ms() {
        return this.poll_interval_ms;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getMax_poll_interval_ms() {
        return this.max_poll_interval_ms;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getResume_refresh_debounce_sec() {
        return this.resume_refresh_debounce_sec;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getMax_consecutive_fetch_failed() {
        return this.max_consecutive_fetch_failed;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getSkip_conversation_load_polling() {
        return this.skip_conversation_load_polling;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getSkip_known_terminal_error_polling() {
        return this.skip_known_terminal_error_polling;
    }

    public final PollingRecoveryConfig copy(int response_budget_sec, long poll_interval_ms, long max_poll_interval_ms, int resume_refresh_debounce_sec, int max_consecutive_fetch_failed, boolean skip_conversation_load_polling, boolean skip_known_terminal_error_polling) {
        return new PollingRecoveryConfig(response_budget_sec, poll_interval_ms, max_poll_interval_ms, resume_refresh_debounce_sec, max_consecutive_fetch_failed, skip_conversation_load_polling, skip_known_terminal_error_polling);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PollingRecoveryConfig)) {
            return false;
        }
        PollingRecoveryConfig pollingRecoveryConfig = (PollingRecoveryConfig) other;
        return this.response_budget_sec == pollingRecoveryConfig.response_budget_sec && this.poll_interval_ms == pollingRecoveryConfig.poll_interval_ms && this.max_poll_interval_ms == pollingRecoveryConfig.max_poll_interval_ms && this.resume_refresh_debounce_sec == pollingRecoveryConfig.resume_refresh_debounce_sec && this.max_consecutive_fetch_failed == pollingRecoveryConfig.max_consecutive_fetch_failed && this.skip_conversation_load_polling == pollingRecoveryConfig.skip_conversation_load_polling && this.skip_known_terminal_error_polling == pollingRecoveryConfig.skip_known_terminal_error_polling;
    }

    public final int getMax_consecutive_fetch_failed() {
        return this.max_consecutive_fetch_failed;
    }

    public final long getMax_poll_interval_ms() {
        return this.max_poll_interval_ms;
    }

    public final long getPoll_interval_ms() {
        return this.poll_interval_ms;
    }

    public final int getResponse_budget_sec() {
        return this.response_budget_sec;
    }

    public final int getResume_refresh_debounce_sec() {
        return this.resume_refresh_debounce_sec;
    }

    public final boolean getSkip_conversation_load_polling() {
        return this.skip_conversation_load_polling;
    }

    public final boolean getSkip_known_terminal_error_polling() {
        return this.skip_known_terminal_error_polling;
    }

    public int hashCode() {
        return Boolean.hashCode(this.skip_known_terminal_error_polling) + fsh.p(vb7.c(this.max_consecutive_fetch_failed, vb7.c(this.resume_refresh_debounce_sec, vb7.e(vb7.e(Integer.hashCode(this.response_budget_sec) * 31, 31, this.poll_interval_ms), 31, this.max_poll_interval_ms), 31), 31), 31, this.skip_conversation_load_polling);
    }

    public String toString() {
        int i = this.response_budget_sec;
        long j = this.poll_interval_ms;
        long j2 = this.max_poll_interval_ms;
        int i2 = this.resume_refresh_debounce_sec;
        int i3 = this.max_consecutive_fetch_failed;
        boolean z = this.skip_conversation_load_polling;
        boolean z2 = this.skip_known_terminal_error_polling;
        StringBuilder sb = new StringBuilder("PollingRecoveryConfig(response_budget_sec=");
        sb.append(i);
        sb.append(", poll_interval_ms=");
        sb.append(j);
        ij0.u(j2, ", max_poll_interval_ms=", ", resume_refresh_debounce_sec=", sb);
        qy1.k(i2, i3, ", max_consecutive_fetch_failed=", ", skip_conversation_load_polling=", sb);
        sb.append(z);
        sb.append(", skip_known_terminal_error_polling=");
        sb.append(z2);
        sb.append(")");
        return sb.toString();
    }

    public PollingRecoveryConfig() {
        this(0, 0L, 0L, 0, 0, false, false, 127, (mq5) null);
    }

    public PollingRecoveryConfig(int i, long j, long j2, int i2, int i3, boolean z, boolean z2) {
        this.response_budget_sec = i;
        this.poll_interval_ms = j;
        this.max_poll_interval_ms = j2;
        this.resume_refresh_debounce_sec = i2;
        this.max_consecutive_fetch_failed = i3;
        this.skip_conversation_load_polling = z;
        this.skip_known_terminal_error_polling = z2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PollingRecoveryConfig(int i, long j, long j2, int i2, int i3, boolean z, boolean z2, int i4, mq5 mq5Var) {
        boolean z3;
        boolean z4;
        int i5;
        int i6;
        i = (i4 & 1) != 0 ? 300 : i;
        j = (i4 & 2) != 0 ? 3000L : j;
        j2 = (i4 & 4) != 0 ? 10000L : j2;
        i2 = (i4 & 8) != 0 ? 10 : i2;
        i3 = (i4 & 16) != 0 ? 10 : i3;
        z = (i4 & 32) != 0 ? false : z;
        if ((i4 & 64) != 0) {
            z3 = false;
            i6 = i3;
            z4 = z;
            i5 = i2;
        } else {
            z3 = z2;
            z4 = z;
            i5 = i2;
            i6 = i3;
        }
        this(i, j, j2, i5, i6, z4, z3);
    }
}
