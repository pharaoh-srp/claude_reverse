package com.anthropic.claude.api.account;

import defpackage.ad1;
import defpackage.bc9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import java.util.Date;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B4\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u001f\b\u0002\u0010\t\u001a\u0019\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\u0004\b\n\u0010\u000bB/\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001c\u001a\u0019\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ=\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u001f\b\u0002\u0010\t\u001a\u0019\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u001bJ\u0010\u0010!\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u001bR.\u0010\t\u001a\u0019\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b*\u0010\u001d¨\u0006."}, d2 = {"Lcom/anthropic/claude/api/account/BannerDismissal;", "", "", "banner_id", "Ljava/util/Date;", "Lcom/anthropic/claude/api/Iso8601Date;", "Lonf;", "with", "Lbc9;", "dismissed_at", "<init>", "(Ljava/lang/String;Ljava/util/Date;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/Date;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/account/BannerDismissal;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/Date;", "copy", "(Ljava/lang/String;Ljava/util/Date;)Lcom/anthropic/claude/api/account/BannerDismissal;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBanner_id", "Ljava/util/Date;", "getDismissed_at", "Companion", "zc1", "ad1", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class BannerDismissal {
    public static final int $stable = 0;
    public static final ad1 Companion = new ad1();
    private final String banner_id;
    private final Date dismissed_at;

    public /* synthetic */ BannerDismissal(int i, String str, Date date, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.banner_id = null;
        } else {
            this.banner_id = str;
        }
        if ((i & 2) == 0) {
            this.dismissed_at = null;
        } else {
            this.dismissed_at = date;
        }
    }

    public static /* synthetic */ BannerDismissal copy$default(BannerDismissal bannerDismissal, String str, Date date, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bannerDismissal.banner_id;
        }
        if ((i & 2) != 0) {
            date = bannerDismissal.dismissed_at;
        }
        return bannerDismissal.copy(str, date);
    }

    public static final /* synthetic */ void write$Self$api(BannerDismissal self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.banner_id != null) {
            output.B(serialDesc, 0, srg.a, self.banner_id);
        }
        if (!output.E(serialDesc) && self.dismissed_at == null) {
            return;
        }
        output.B(serialDesc, 1, bc9.a, self.dismissed_at);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBanner_id() {
        return this.banner_id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Date getDismissed_at() {
        return this.dismissed_at;
    }

    public final BannerDismissal copy(String banner_id, Date dismissed_at) {
        return new BannerDismissal(banner_id, dismissed_at);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BannerDismissal)) {
            return false;
        }
        BannerDismissal bannerDismissal = (BannerDismissal) other;
        return x44.r(this.banner_id, bannerDismissal.banner_id) && x44.r(this.dismissed_at, bannerDismissal.dismissed_at);
    }

    public final String getBanner_id() {
        return this.banner_id;
    }

    public final Date getDismissed_at() {
        return this.dismissed_at;
    }

    public int hashCode() {
        String str = this.banner_id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Date date = this.dismissed_at;
        return iHashCode + (date != null ? date.hashCode() : 0);
    }

    public String toString() {
        return "BannerDismissal(banner_id=" + this.banner_id + ", dismissed_at=" + this.dismissed_at + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BannerDismissal() {
        this((String) null, (Date) (0 == true ? 1 : 0), 3, (mq5) (0 == true ? 1 : 0));
    }

    public BannerDismissal(String str, Date date) {
        this.banner_id = str;
        this.dismissed_at = date;
    }

    public /* synthetic */ BannerDismissal(String str, Date date, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : date);
    }
}
