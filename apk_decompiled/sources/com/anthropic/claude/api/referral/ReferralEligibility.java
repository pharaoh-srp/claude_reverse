package com.anthropic.claude.api.referral;

import defpackage.e79;
import defpackage.gvj;
import defpackage.hae;
import defpackage.iae;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vae;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:;BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBU\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\f\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b#\u0010$JV\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b'\u0010!J\u0010\u0010(\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010+\u001a\u00020\u00022\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b1\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b3\u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b4\u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b6\u0010$R\u0011\u00108\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b7\u0010\u001c¨\u0006<"}, d2 = {"Lcom/anthropic/claude/api/referral/ReferralEligibility;", "", "", "eligible", "", "remaining_passes", "limit", "", "share_link", "terms_url", "Lcom/anthropic/claude/api/referral/ReferrerReward;", "referrer_reward", "<init>", "(ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/referral/ReferrerReward;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(IZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/referral/ReferrerReward;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/referral/ReferralEligibility;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Z", "component2", "()Ljava/lang/Integer;", "component3", "component4", "()Ljava/lang/String;", "component5", "component6", "()Lcom/anthropic/claude/api/referral/ReferrerReward;", "copy", "(ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/referral/ReferrerReward;)Lcom/anthropic/claude/api/referral/ReferralEligibility;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getEligible", "Ljava/lang/Integer;", "getRemaining_passes", "getLimit", "Ljava/lang/String;", "getShare_link", "getTerms_url", "Lcom/anthropic/claude/api/referral/ReferrerReward;", "getReferrer_reward", "getHasSharablePass", "hasSharablePass", "Companion", "hae", "iae", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ReferralEligibility {
    public static final int $stable = 0;
    public static final iae Companion = new iae();
    private final boolean eligible;
    private final Integer limit;
    private final ReferrerReward referrer_reward;
    private final Integer remaining_passes;
    private final String share_link;
    private final String terms_url;

    public /* synthetic */ ReferralEligibility(int i, boolean z, Integer num, Integer num2, String str, String str2, ReferrerReward referrerReward, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, hae.a.getDescriptor());
            throw null;
        }
        this.eligible = z;
        if ((i & 2) == 0) {
            this.remaining_passes = null;
        } else {
            this.remaining_passes = num;
        }
        if ((i & 4) == 0) {
            this.limit = null;
        } else {
            this.limit = num2;
        }
        if ((i & 8) == 0) {
            this.share_link = null;
        } else {
            this.share_link = str;
        }
        if ((i & 16) == 0) {
            this.terms_url = null;
        } else {
            this.terms_url = str2;
        }
        if ((i & 32) == 0) {
            this.referrer_reward = null;
        } else {
            this.referrer_reward = referrerReward;
        }
    }

    public static /* synthetic */ ReferralEligibility copy$default(ReferralEligibility referralEligibility, boolean z, Integer num, Integer num2, String str, String str2, ReferrerReward referrerReward, int i, Object obj) {
        if ((i & 1) != 0) {
            z = referralEligibility.eligible;
        }
        if ((i & 2) != 0) {
            num = referralEligibility.remaining_passes;
        }
        if ((i & 4) != 0) {
            num2 = referralEligibility.limit;
        }
        if ((i & 8) != 0) {
            str = referralEligibility.share_link;
        }
        if ((i & 16) != 0) {
            str2 = referralEligibility.terms_url;
        }
        if ((i & 32) != 0) {
            referrerReward = referralEligibility.referrer_reward;
        }
        String str3 = str2;
        ReferrerReward referrerReward2 = referrerReward;
        return referralEligibility.copy(z, num, num2, str, str3, referrerReward2);
    }

    public static final /* synthetic */ void write$Self$api(ReferralEligibility self, vd4 output, SerialDescriptor serialDesc) {
        output.p(serialDesc, 0, self.eligible);
        if (output.E(serialDesc) || self.remaining_passes != null) {
            output.B(serialDesc, 1, e79.a, self.remaining_passes);
        }
        if (output.E(serialDesc) || self.limit != null) {
            output.B(serialDesc, 2, e79.a, self.limit);
        }
        if (output.E(serialDesc) || self.share_link != null) {
            output.B(serialDesc, 3, srg.a, self.share_link);
        }
        if (output.E(serialDesc) || self.terms_url != null) {
            output.B(serialDesc, 4, srg.a, self.terms_url);
        }
        if (!output.E(serialDesc) && self.referrer_reward == null) {
            return;
        }
        output.B(serialDesc, 5, vae.a, self.referrer_reward);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEligible() {
        return this.eligible;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getRemaining_passes() {
        return this.remaining_passes;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getLimit() {
        return this.limit;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getShare_link() {
        return this.share_link;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTerms_url() {
        return this.terms_url;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final ReferrerReward getReferrer_reward() {
        return this.referrer_reward;
    }

    public final ReferralEligibility copy(boolean eligible, Integer remaining_passes, Integer limit, String share_link, String terms_url, ReferrerReward referrer_reward) {
        return new ReferralEligibility(eligible, remaining_passes, limit, share_link, terms_url, referrer_reward);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReferralEligibility)) {
            return false;
        }
        ReferralEligibility referralEligibility = (ReferralEligibility) other;
        return this.eligible == referralEligibility.eligible && x44.r(this.remaining_passes, referralEligibility.remaining_passes) && x44.r(this.limit, referralEligibility.limit) && x44.r(this.share_link, referralEligibility.share_link) && x44.r(this.terms_url, referralEligibility.terms_url) && x44.r(this.referrer_reward, referralEligibility.referrer_reward);
    }

    public final boolean getEligible() {
        return this.eligible;
    }

    public final boolean getHasSharablePass() {
        if (this.eligible) {
            Integer num = this.remaining_passes;
            if ((num != null ? num.intValue() : 0) > 0) {
                return true;
            }
        }
        return false;
    }

    public final Integer getLimit() {
        return this.limit;
    }

    public final ReferrerReward getReferrer_reward() {
        return this.referrer_reward;
    }

    public final Integer getRemaining_passes() {
        return this.remaining_passes;
    }

    public final String getShare_link() {
        return this.share_link;
    }

    public final String getTerms_url() {
        return this.terms_url;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.eligible) * 31;
        Integer num = this.remaining_passes;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.limit;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.share_link;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.terms_url;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ReferrerReward referrerReward = this.referrer_reward;
        return iHashCode5 + (referrerReward != null ? referrerReward.hashCode() : 0);
    }

    public String toString() {
        return "ReferralEligibility(eligible=" + this.eligible + ", remaining_passes=" + this.remaining_passes + ", limit=" + this.limit + ", share_link=" + this.share_link + ", terms_url=" + this.terms_url + ", referrer_reward=" + this.referrer_reward + ")";
    }

    public ReferralEligibility(boolean z, Integer num, Integer num2, String str, String str2, ReferrerReward referrerReward) {
        this.eligible = z;
        this.remaining_passes = num;
        this.limit = num2;
        this.share_link = str;
        this.terms_url = str2;
        this.referrer_reward = referrerReward;
    }

    public /* synthetic */ ReferralEligibility(boolean z, Integer num, Integer num2, String str, String str2, ReferrerReward referrerReward, int i, mq5 mq5Var) {
        this(z, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : referrerReward);
    }
}
