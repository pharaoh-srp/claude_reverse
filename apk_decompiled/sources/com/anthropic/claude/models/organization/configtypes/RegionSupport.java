package com.anthropic.claude.models.organization.configtypes;

import defpackage.mdj;
import defpackage.mq5;
import defpackage.ode;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u0016¨\u0006("}, d2 = {"Lcom/anthropic/claude/models/organization/configtypes/RegionSupport;", "", "", "claudeai_supported", "phone_verification_supported", "<init>", "(ZZ)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(IZZLvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$models", "(Lcom/anthropic/claude/models/organization/configtypes/RegionSupport;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Z", "component2", "copy", "(ZZ)Lcom/anthropic/claude/models/organization/configtypes/RegionSupport;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getClaudeai_supported", "getPhone_verification_supported", "Companion", "nde", "ode", "models"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class RegionSupport {
    public static final int $stable = 0;
    public static final ode Companion = new ode();
    private final boolean claudeai_supported;
    private final boolean phone_verification_supported;

    public /* synthetic */ RegionSupport(int i, boolean z, boolean z2, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.claudeai_supported = false;
        } else {
            this.claudeai_supported = z;
        }
        if ((i & 2) == 0) {
            this.phone_verification_supported = false;
        } else {
            this.phone_verification_supported = z2;
        }
    }

    public static /* synthetic */ RegionSupport copy$default(RegionSupport regionSupport, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = regionSupport.claudeai_supported;
        }
        if ((i & 2) != 0) {
            z2 = regionSupport.phone_verification_supported;
        }
        return regionSupport.copy(z, z2);
    }

    public static final /* synthetic */ void write$Self$models(RegionSupport self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.claudeai_supported) {
            output.p(serialDesc, 0, self.claudeai_supported);
        }
        if (output.E(serialDesc) || self.phone_verification_supported) {
            output.p(serialDesc, 1, self.phone_verification_supported);
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getClaudeai_supported() {
        return this.claudeai_supported;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getPhone_verification_supported() {
        return this.phone_verification_supported;
    }

    public final RegionSupport copy(boolean claudeai_supported, boolean phone_verification_supported) {
        return new RegionSupport(claudeai_supported, phone_verification_supported);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RegionSupport)) {
            return false;
        }
        RegionSupport regionSupport = (RegionSupport) other;
        return this.claudeai_supported == regionSupport.claudeai_supported && this.phone_verification_supported == regionSupport.phone_verification_supported;
    }

    public final boolean getClaudeai_supported() {
        return this.claudeai_supported;
    }

    public final boolean getPhone_verification_supported() {
        return this.phone_verification_supported;
    }

    public int hashCode() {
        return Boolean.hashCode(this.phone_verification_supported) + (Boolean.hashCode(this.claudeai_supported) * 31);
    }

    public String toString() {
        return "RegionSupport(claudeai_supported=" + this.claudeai_supported + ", phone_verification_supported=" + this.phone_verification_supported + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RegionSupport() {
        boolean z = false;
        this(z, z, 3, (mq5) null);
    }

    public RegionSupport(boolean z, boolean z2) {
        this.claudeai_supported = z;
        this.phone_verification_supported = z2;
    }

    public /* synthetic */ RegionSupport(boolean z, boolean z2, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }
}
