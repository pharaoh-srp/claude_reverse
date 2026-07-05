package com.anthropic.claude.models.organization.configtypes;

import defpackage.e79;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.qng;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0018¨\u0006*"}, d2 = {"Lcom/anthropic/claude/models/organization/configtypes/StickyConfig;", "", "", "enabled", "", "ttl_seconds", "<init>", "(ZLjava/lang/Integer;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(IZLjava/lang/Integer;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$models", "(Lcom/anthropic/claude/models/organization/configtypes/StickyConfig;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Z", "component2", "()Ljava/lang/Integer;", "copy", "(ZLjava/lang/Integer;)Lcom/anthropic/claude/models/organization/configtypes/StickyConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getEnabled", "Ljava/lang/Integer;", "getTtl_seconds", "Companion", "png", "qng", "models"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class StickyConfig {
    public static final int $stable = 0;
    public static final qng Companion = new qng();
    private final boolean enabled;
    private final Integer ttl_seconds;

    public /* synthetic */ StickyConfig(int i, boolean z, Integer num, vnf vnfVar) {
        this.enabled = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.ttl_seconds = null;
        } else {
            this.ttl_seconds = num;
        }
    }

    public static /* synthetic */ StickyConfig copy$default(StickyConfig stickyConfig, boolean z, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            z = stickyConfig.enabled;
        }
        if ((i & 2) != 0) {
            num = stickyConfig.ttl_seconds;
        }
        return stickyConfig.copy(z, num);
    }

    public static final /* synthetic */ void write$Self$models(StickyConfig self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.enabled) {
            output.p(serialDesc, 0, self.enabled);
        }
        if (!output.E(serialDesc) && self.ttl_seconds == null) {
            return;
        }
        output.B(serialDesc, 1, e79.a, self.ttl_seconds);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getTtl_seconds() {
        return this.ttl_seconds;
    }

    public final StickyConfig copy(boolean enabled, Integer ttl_seconds) {
        return new StickyConfig(enabled, ttl_seconds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StickyConfig)) {
            return false;
        }
        StickyConfig stickyConfig = (StickyConfig) other;
        return this.enabled == stickyConfig.enabled && x44.r(this.ttl_seconds, stickyConfig.ttl_seconds);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final Integer getTtl_seconds() {
        return this.ttl_seconds;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.enabled) * 31;
        Integer num = this.ttl_seconds;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "StickyConfig(enabled=" + this.enabled + ", ttl_seconds=" + this.ttl_seconds + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StickyConfig() {
        this(false, (Integer) null, 3, (mq5) (0 == true ? 1 : 0));
    }

    public StickyConfig(boolean z, Integer num) {
        this.enabled = z;
        this.ttl_seconds = num;
    }

    public /* synthetic */ StickyConfig(boolean z, Integer num, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : num);
    }
}
