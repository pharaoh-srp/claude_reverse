package com.anthropic.claude.api.kyc;

import defpackage.bc9;
import defpackage.fsh;
import defpackage.gid;
import defpackage.gvj;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.ms9;
import defpackage.ns9;
import defpackage.onf;
import defpackage.os9;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import java.util.Date;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:;BR\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u001f\b\u0002\u0010\u000e\u001a\u0019\u0018\u00010\tj\u0004\u0018\u0001`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r¢\u0006\u0004\b\u000f\u0010\u0010BK\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0010\u0010$\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b$\u0010%J'\u0010&\u001a\u0019\u0018\u00010\tj\u0004\u0018\u0001`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\rHÆ\u0003¢\u0006\u0004\b&\u0010'J]\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u001f\b\u0002\u0010\u000e\u001a\u0019\u0018\u00010\tj\u0004\u0018\u0001`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\rHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b*\u0010\"J\u0010\u0010+\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010.\u001a\u00020\u00072\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010 R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b3\u0010\"R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b4\u0010\"R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b6\u0010%R.\u0010\u000e\u001a\u0019\u0018\u00010\tj\u0004\u0018\u0001`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00107\u001a\u0004\b8\u0010'¨\u0006<"}, d2 = {"Lcom/anthropic/claude/api/kyc/KycStatusResponse;", "", "Lcom/anthropic/claude/api/kyc/KycStatus;", "status", "", "vendor_inquiry_id", "vendor_inquiry_url", "", "should_poll", "Ljava/util/Date;", "Lcom/anthropic/claude/api/Iso8601Date;", "Lonf;", "with", "Lbc9;", "created_at", "<init>", "(Lcom/anthropic/claude/api/kyc/KycStatus;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Date;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/api/kyc/KycStatus;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Date;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/kyc/KycStatusResponse;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/api/kyc/KycStatus;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Z", "component5", "()Ljava/util/Date;", "copy", "(Lcom/anthropic/claude/api/kyc/KycStatus;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Date;)Lcom/anthropic/claude/api/kyc/KycStatusResponse;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/api/kyc/KycStatus;", "getStatus", "Ljava/lang/String;", "getVendor_inquiry_id", "getVendor_inquiry_url", "Z", "getShould_poll", "Ljava/util/Date;", "getCreated_at", "Companion", "ms9", "ns9", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class KycStatusResponse {
    public static final int $stable = 0;
    public static final ns9 Companion = new ns9();
    private final Date created_at;
    private final boolean should_poll;
    private final KycStatus status;
    private final String vendor_inquiry_id;
    private final String vendor_inquiry_url;

    public /* synthetic */ KycStatusResponse(int i, KycStatus kycStatus, String str, String str2, boolean z, Date date, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, ms9.a.getDescriptor());
            throw null;
        }
        this.status = kycStatus;
        if ((i & 2) == 0) {
            this.vendor_inquiry_id = null;
        } else {
            this.vendor_inquiry_id = str;
        }
        if ((i & 4) == 0) {
            this.vendor_inquiry_url = null;
        } else {
            this.vendor_inquiry_url = str2;
        }
        if ((i & 8) == 0) {
            this.should_poll = false;
        } else {
            this.should_poll = z;
        }
        if ((i & 16) == 0) {
            this.created_at = null;
        } else {
            this.created_at = date;
        }
    }

    public static /* synthetic */ KycStatusResponse copy$default(KycStatusResponse kycStatusResponse, KycStatus kycStatus, String str, String str2, boolean z, Date date, int i, Object obj) {
        if ((i & 1) != 0) {
            kycStatus = kycStatusResponse.status;
        }
        if ((i & 2) != 0) {
            str = kycStatusResponse.vendor_inquiry_id;
        }
        if ((i & 4) != 0) {
            str2 = kycStatusResponse.vendor_inquiry_url;
        }
        if ((i & 8) != 0) {
            z = kycStatusResponse.should_poll;
        }
        if ((i & 16) != 0) {
            date = kycStatusResponse.created_at;
        }
        Date date2 = date;
        String str3 = str2;
        return kycStatusResponse.copy(kycStatus, str, str3, z, date2);
    }

    public static final /* synthetic */ void write$Self$api(KycStatusResponse self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, os9.d, self.status);
        if (output.E(serialDesc) || self.vendor_inquiry_id != null) {
            output.B(serialDesc, 1, srg.a, self.vendor_inquiry_id);
        }
        if (output.E(serialDesc) || self.vendor_inquiry_url != null) {
            output.B(serialDesc, 2, srg.a, self.vendor_inquiry_url);
        }
        if (output.E(serialDesc) || self.should_poll) {
            output.p(serialDesc, 3, self.should_poll);
        }
        if (!output.E(serialDesc) && self.created_at == null) {
            return;
        }
        output.B(serialDesc, 4, bc9.a, self.created_at);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final KycStatus getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getVendor_inquiry_id() {
        return this.vendor_inquiry_id;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getVendor_inquiry_url() {
        return this.vendor_inquiry_url;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getShould_poll() {
        return this.should_poll;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Date getCreated_at() {
        return this.created_at;
    }

    public final KycStatusResponse copy(KycStatus status, String vendor_inquiry_id, String vendor_inquiry_url, boolean should_poll, Date created_at) {
        status.getClass();
        return new KycStatusResponse(status, vendor_inquiry_id, vendor_inquiry_url, should_poll, created_at);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KycStatusResponse)) {
            return false;
        }
        KycStatusResponse kycStatusResponse = (KycStatusResponse) other;
        return this.status == kycStatusResponse.status && x44.r(this.vendor_inquiry_id, kycStatusResponse.vendor_inquiry_id) && x44.r(this.vendor_inquiry_url, kycStatusResponse.vendor_inquiry_url) && this.should_poll == kycStatusResponse.should_poll && x44.r(this.created_at, kycStatusResponse.created_at);
    }

    public final Date getCreated_at() {
        return this.created_at;
    }

    public final boolean getShould_poll() {
        return this.should_poll;
    }

    public final KycStatus getStatus() {
        return this.status;
    }

    public final String getVendor_inquiry_id() {
        return this.vendor_inquiry_id;
    }

    public final String getVendor_inquiry_url() {
        return this.vendor_inquiry_url;
    }

    public int hashCode() {
        int iHashCode = this.status.hashCode() * 31;
        String str = this.vendor_inquiry_id;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.vendor_inquiry_url;
        int iP = fsh.p((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.should_poll);
        Date date = this.created_at;
        return iP + (date != null ? date.hashCode() : 0);
    }

    public String toString() {
        KycStatus kycStatus = this.status;
        String str = this.vendor_inquiry_id;
        String str2 = this.vendor_inquiry_url;
        boolean z = this.should_poll;
        Date date = this.created_at;
        StringBuilder sb = new StringBuilder("KycStatusResponse(status=");
        sb.append(kycStatus);
        sb.append(", vendor_inquiry_id=");
        sb.append(str);
        sb.append(", vendor_inquiry_url=");
        gid.t(sb, str2, ", should_poll=", z, ", created_at=");
        sb.append(date);
        sb.append(")");
        return sb.toString();
    }

    public KycStatusResponse(KycStatus kycStatus, String str, String str2, boolean z, Date date) {
        kycStatus.getClass();
        this.status = kycStatus;
        this.vendor_inquiry_id = str;
        this.vendor_inquiry_url = str2;
        this.should_poll = z;
        this.created_at = date;
    }

    public /* synthetic */ KycStatusResponse(KycStatus kycStatus, String str, String str2, boolean z, Date date, int i, mq5 mq5Var) {
        this(kycStatus, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : date);
    }
}
