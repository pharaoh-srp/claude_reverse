package com.anthropic.claude.configs.flags;

import defpackage.fsh;
import defpackage.grc;
import defpackage.ij0;
import defpackage.lji;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000278BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fBK\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u001dJ\u0010\u0010\"\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010\u001dJL\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001bJ\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b3\u0010\u001dR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b4\u0010\u001dR\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b5\u0010\u001d¨\u00069"}, d2 = {"Lcom/anthropic/claude/configs/flags/UploadConfig;", "", "", "max_retries", "", "initial_delay_ms", "", "delay_multiplier", "max_delay_ms", "max_file_size_bytes", "direct_filestore_max_bytes", "<init>", "(IJDJJJ)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(IIJDJJJLvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$configs", "(Lcom/anthropic/claude/configs/flags/UploadConfig;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()J", "component3", "()D", "component4", "component5", "component6", "copy", "(IJDJJJ)Lcom/anthropic/claude/configs/flags/UploadConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getMax_retries", "J", "getInitial_delay_ms", "D", "getDelay_multiplier", "getMax_delay_ms", "getMax_file_size_bytes", "getDirect_filestore_max_bytes", "Companion", "lji", "kji", "configs"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class UploadConfig {
    public static final int $stable = 0;
    public static final lji Companion = new lji();
    public static final String DETERMINATE_PROGRESS_GATE = "claudeai_android_attachment_upload_determinate_progress";
    public static final String DIRECT_FILESTORE_GATE = "claudeai_direct_filestore_uploads";
    public static final String FEATURE_KEY = "mobile_upload_config";
    public static final String WORKMANAGER_GATE = "mobile_android_upload_workmanager";
    private final double delay_multiplier;
    private final long direct_filestore_max_bytes;
    private final long initial_delay_ms;
    private final long max_delay_ms;
    private final long max_file_size_bytes;
    private final int max_retries;

    public /* synthetic */ UploadConfig(int i, int i2, long j, double d, long j2, long j3, long j4, vnf vnfVar) {
        this.max_retries = (i & 1) == 0 ? 2 : i2;
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
            this.max_file_size_bytes = 36700160L;
        } else {
            this.max_file_size_bytes = j3;
        }
        if ((i & 32) == 0) {
            this.direct_filestore_max_bytes = 524288000L;
        } else {
            this.direct_filestore_max_bytes = j4;
        }
    }

    public static /* synthetic */ UploadConfig copy$default(UploadConfig uploadConfig, int i, long j, double d, long j2, long j3, long j4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = uploadConfig.max_retries;
        }
        if ((i2 & 2) != 0) {
            j = uploadConfig.initial_delay_ms;
        }
        if ((i2 & 4) != 0) {
            d = uploadConfig.delay_multiplier;
        }
        if ((i2 & 8) != 0) {
            j2 = uploadConfig.max_delay_ms;
        }
        if ((i2 & 16) != 0) {
            j3 = uploadConfig.max_file_size_bytes;
        }
        if ((i2 & 32) != 0) {
            j4 = uploadConfig.direct_filestore_max_bytes;
        }
        long j5 = j4;
        long j6 = j3;
        long j7 = j2;
        return uploadConfig.copy(i, j, d, j7, j6, j5);
    }

    public static final /* synthetic */ void write$Self$configs(UploadConfig self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.max_retries != 2) {
            output.l(0, self.max_retries, serialDesc);
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
        if (output.E(serialDesc) || self.max_file_size_bytes != 36700160) {
            output.D(serialDesc, 4, self.max_file_size_bytes);
        }
        if (!output.E(serialDesc) && self.direct_filestore_max_bytes == 524288000) {
            return;
        }
        output.D(serialDesc, 5, self.direct_filestore_max_bytes);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getMax_retries() {
        return this.max_retries;
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
    public final long getMax_file_size_bytes() {
        return this.max_file_size_bytes;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getDirect_filestore_max_bytes() {
        return this.direct_filestore_max_bytes;
    }

    public final UploadConfig copy(int max_retries, long initial_delay_ms, double delay_multiplier, long max_delay_ms, long max_file_size_bytes, long direct_filestore_max_bytes) {
        return new UploadConfig(max_retries, initial_delay_ms, delay_multiplier, max_delay_ms, max_file_size_bytes, direct_filestore_max_bytes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UploadConfig)) {
            return false;
        }
        UploadConfig uploadConfig = (UploadConfig) other;
        return this.max_retries == uploadConfig.max_retries && this.initial_delay_ms == uploadConfig.initial_delay_ms && Double.compare(this.delay_multiplier, uploadConfig.delay_multiplier) == 0 && this.max_delay_ms == uploadConfig.max_delay_ms && this.max_file_size_bytes == uploadConfig.max_file_size_bytes && this.direct_filestore_max_bytes == uploadConfig.direct_filestore_max_bytes;
    }

    public final double getDelay_multiplier() {
        return this.delay_multiplier;
    }

    public final long getDirect_filestore_max_bytes() {
        return this.direct_filestore_max_bytes;
    }

    public final long getInitial_delay_ms() {
        return this.initial_delay_ms;
    }

    public final long getMax_delay_ms() {
        return this.max_delay_ms;
    }

    public final long getMax_file_size_bytes() {
        return this.max_file_size_bytes;
    }

    public final int getMax_retries() {
        return this.max_retries;
    }

    public int hashCode() {
        return Long.hashCode(this.direct_filestore_max_bytes) + vb7.e(vb7.e(fsh.o(this.delay_multiplier, vb7.e(Integer.hashCode(this.max_retries) * 31, 31, this.initial_delay_ms), 31), 31, this.max_delay_ms), 31, this.max_file_size_bytes);
    }

    public String toString() {
        int i = this.max_retries;
        long j = this.initial_delay_ms;
        double d = this.delay_multiplier;
        long j2 = this.max_delay_ms;
        long j3 = this.max_file_size_bytes;
        long j4 = this.direct_filestore_max_bytes;
        StringBuilder sb = new StringBuilder("UploadConfig(max_retries=");
        sb.append(i);
        sb.append(", initial_delay_ms=");
        sb.append(j);
        sb.append(", delay_multiplier=");
        sb.append(d);
        sb.append(", max_delay_ms=");
        sb.append(j2);
        ij0.u(j3, ", max_file_size_bytes=", ", direct_filestore_max_bytes=", sb);
        return grc.r(j4, ")", sb);
    }

    public UploadConfig() {
        this(0, 0L, 0.0d, 0L, 0L, 0L, 63, (mq5) null);
    }

    public UploadConfig(int i, long j, double d, long j2, long j3, long j4) {
        this.max_retries = i;
        this.initial_delay_ms = j;
        this.delay_multiplier = d;
        this.max_delay_ms = j2;
        this.max_file_size_bytes = j3;
        this.direct_filestore_max_bytes = j4;
    }

    public /* synthetic */ UploadConfig(int i, long j, double d, long j2, long j3, long j4, int i2, mq5 mq5Var) {
        this((i2 & 1) != 0 ? 2 : i, (i2 & 2) != 0 ? 500L : j, (i2 & 4) != 0 ? 2.0d : d, (i2 & 8) != 0 ? 10000L : j2, (i2 & 16) != 0 ? 36700160L : j3, (i2 & 32) != 0 ? 524288000L : j4);
    }
}
