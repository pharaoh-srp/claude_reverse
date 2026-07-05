package com.anthropic.claude.models.organization.configtypes;

import defpackage.e79;
import defpackage.hb8;
import defpackage.ib8;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.zt1;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000212B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ@\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\u00022\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u001e¨\u00063"}, d2 = {"Lcom/anthropic/claude/models/organization/configtypes/GroveConfig;", "", "", "notice_is_grace_period", "", "notice_reminder_frequency", "domain_excluded", "Lcom/anthropic/claude/models/organization/configtypes/GroveConfigStrings;", "mobile_strings", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Lcom/anthropic/claude/models/organization/configtypes/GroveConfigStrings;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Lcom/anthropic/claude/models/organization/configtypes/GroveConfigStrings;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$models", "(Lcom/anthropic/claude/models/organization/configtypes/GroveConfig;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Boolean;", "component2", "()Ljava/lang/Integer;", "component3", "component4", "()Lcom/anthropic/claude/models/organization/configtypes/GroveConfigStrings;", "copy", "(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Lcom/anthropic/claude/models/organization/configtypes/GroveConfigStrings;)Lcom/anthropic/claude/models/organization/configtypes/GroveConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "getNotice_is_grace_period", "Ljava/lang/Integer;", "getNotice_reminder_frequency", "getDomain_excluded", "Lcom/anthropic/claude/models/organization/configtypes/GroveConfigStrings;", "getMobile_strings", "Companion", "gb8", "hb8", "models"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class GroveConfig {
    public static final int $stable = 0;
    public static final hb8 Companion = new hb8();
    private final Boolean domain_excluded;
    private final GroveConfigStrings mobile_strings;
    private final Boolean notice_is_grace_period;
    private final Integer notice_reminder_frequency;

    public /* synthetic */ GroveConfig(int i, Boolean bool, Integer num, Boolean bool2, GroveConfigStrings groveConfigStrings, vnf vnfVar) {
        this.notice_is_grace_period = (i & 1) == 0 ? Boolean.FALSE : bool;
        if ((i & 2) == 0) {
            this.notice_reminder_frequency = null;
        } else {
            this.notice_reminder_frequency = num;
        }
        if ((i & 4) == 0) {
            this.domain_excluded = Boolean.FALSE;
        } else {
            this.domain_excluded = bool2;
        }
        if ((i & 8) == 0) {
            this.mobile_strings = null;
        } else {
            this.mobile_strings = groveConfigStrings;
        }
    }

    public static /* synthetic */ GroveConfig copy$default(GroveConfig groveConfig, Boolean bool, Integer num, Boolean bool2, GroveConfigStrings groveConfigStrings, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = groveConfig.notice_is_grace_period;
        }
        if ((i & 2) != 0) {
            num = groveConfig.notice_reminder_frequency;
        }
        if ((i & 4) != 0) {
            bool2 = groveConfig.domain_excluded;
        }
        if ((i & 8) != 0) {
            groveConfigStrings = groveConfig.mobile_strings;
        }
        return groveConfig.copy(bool, num, bool2, groveConfigStrings);
    }

    public static final /* synthetic */ void write$Self$models(GroveConfig self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || !x44.r(self.notice_is_grace_period, Boolean.FALSE)) {
            output.B(serialDesc, 0, zt1.a, self.notice_is_grace_period);
        }
        if (output.E(serialDesc) || self.notice_reminder_frequency != null) {
            output.B(serialDesc, 1, e79.a, self.notice_reminder_frequency);
        }
        if (output.E(serialDesc) || !x44.r(self.domain_excluded, Boolean.FALSE)) {
            output.B(serialDesc, 2, zt1.a, self.domain_excluded);
        }
        if (!output.E(serialDesc) && self.mobile_strings == null) {
            return;
        }
        output.B(serialDesc, 3, ib8.a, self.mobile_strings);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getNotice_is_grace_period() {
        return this.notice_is_grace_period;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getNotice_reminder_frequency() {
        return this.notice_reminder_frequency;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getDomain_excluded() {
        return this.domain_excluded;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final GroveConfigStrings getMobile_strings() {
        return this.mobile_strings;
    }

    public final GroveConfig copy(Boolean notice_is_grace_period, Integer notice_reminder_frequency, Boolean domain_excluded, GroveConfigStrings mobile_strings) {
        return new GroveConfig(notice_is_grace_period, notice_reminder_frequency, domain_excluded, mobile_strings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GroveConfig)) {
            return false;
        }
        GroveConfig groveConfig = (GroveConfig) other;
        return x44.r(this.notice_is_grace_period, groveConfig.notice_is_grace_period) && x44.r(this.notice_reminder_frequency, groveConfig.notice_reminder_frequency) && x44.r(this.domain_excluded, groveConfig.domain_excluded) && x44.r(this.mobile_strings, groveConfig.mobile_strings);
    }

    public final Boolean getDomain_excluded() {
        return this.domain_excluded;
    }

    public final GroveConfigStrings getMobile_strings() {
        return this.mobile_strings;
    }

    public final Boolean getNotice_is_grace_period() {
        return this.notice_is_grace_period;
    }

    public final Integer getNotice_reminder_frequency() {
        return this.notice_reminder_frequency;
    }

    public int hashCode() {
        Boolean bool = this.notice_is_grace_period;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.notice_reminder_frequency;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool2 = this.domain_excluded;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        GroveConfigStrings groveConfigStrings = this.mobile_strings;
        return iHashCode3 + (groveConfigStrings != null ? groveConfigStrings.hashCode() : 0);
    }

    public String toString() {
        return "GroveConfig(notice_is_grace_period=" + this.notice_is_grace_period + ", notice_reminder_frequency=" + this.notice_reminder_frequency + ", domain_excluded=" + this.domain_excluded + ", mobile_strings=" + this.mobile_strings + ")";
    }

    public GroveConfig() {
        this((Boolean) null, (Integer) null, (Boolean) null, (GroveConfigStrings) null, 15, (mq5) null);
    }

    public GroveConfig(Boolean bool, Integer num, Boolean bool2, GroveConfigStrings groveConfigStrings) {
        this.notice_is_grace_period = bool;
        this.notice_reminder_frequency = num;
        this.domain_excluded = bool2;
        this.mobile_strings = groveConfigStrings;
    }

    public /* synthetic */ GroveConfig(Boolean bool, Integer num, Boolean bool2, GroveConfigStrings groveConfigStrings, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? Boolean.FALSE : bool, (i & 2) != 0 ? null : num, (i & 4) != 0 ? Boolean.FALSE : bool2, (i & 8) != 0 ? null : groveConfigStrings);
    }
}
