package com.anthropic.claude.api.referral;

import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.wae;
import defpackage.x44;
import defpackage.xka;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J(\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0019¨\u0006*"}, d2 = {"Lcom/anthropic/claude/api/referral/ReferrerReward;", "", "", "amount_minor_units", "", "currency", "<init>", "(Ljava/lang/Long;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/Long;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/referral/ReferrerReward;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Long;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Long;Ljava/lang/String;)Lcom/anthropic/claude/api/referral/ReferrerReward;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Long;", "getAmount_minor_units", "Ljava/lang/String;", "getCurrency", "Companion", "vae", "wae", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ReferrerReward {
    public static final int $stable = 0;
    public static final wae Companion = new wae();
    private final Long amount_minor_units;
    private final String currency;

    public /* synthetic */ ReferrerReward(int i, Long l, String str, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.amount_minor_units = null;
        } else {
            this.amount_minor_units = l;
        }
        if ((i & 2) == 0) {
            this.currency = null;
        } else {
            this.currency = str;
        }
    }

    public static /* synthetic */ ReferrerReward copy$default(ReferrerReward referrerReward, Long l, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            l = referrerReward.amount_minor_units;
        }
        if ((i & 2) != 0) {
            str = referrerReward.currency;
        }
        return referrerReward.copy(l, str);
    }

    public static final /* synthetic */ void write$Self$api(ReferrerReward self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.amount_minor_units != null) {
            output.B(serialDesc, 0, xka.a, self.amount_minor_units);
        }
        if (!output.E(serialDesc) && self.currency == null) {
            return;
        }
        output.B(serialDesc, 1, srg.a, self.currency);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getAmount_minor_units() {
        return this.amount_minor_units;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    public final ReferrerReward copy(Long amount_minor_units, String currency) {
        return new ReferrerReward(amount_minor_units, currency);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReferrerReward)) {
            return false;
        }
        ReferrerReward referrerReward = (ReferrerReward) other;
        return x44.r(this.amount_minor_units, referrerReward.amount_minor_units) && x44.r(this.currency, referrerReward.currency);
    }

    public final Long getAmount_minor_units() {
        return this.amount_minor_units;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public int hashCode() {
        Long l = this.amount_minor_units;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.currency;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "ReferrerReward(amount_minor_units=" + this.amount_minor_units + ", currency=" + this.currency + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReferrerReward() {
        this((Long) null, (String) (0 == true ? 1 : 0), 3, (mq5) (0 == true ? 1 : 0));
    }

    public ReferrerReward(Long l, String str) {
        this.amount_minor_units = l;
        this.currency = str;
    }

    public /* synthetic */ ReferrerReward(Long l, String str, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : str);
    }
}
