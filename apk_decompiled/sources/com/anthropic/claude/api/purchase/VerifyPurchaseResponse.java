package com.anthropic.claude.api.purchase;

import com.anthropic.claude.api.kyc.KycStatusResponse;
import defpackage.lti;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.ms9;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0019¨\u0006+"}, d2 = {"Lcom/anthropic/claude/api/purchase/VerifyPurchaseResponse;", "", "", "success", "Lcom/anthropic/claude/api/kyc/KycStatusResponse;", "idv_requirement", "<init>", "(ZLcom/anthropic/claude/api/kyc/KycStatusResponse;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(IZLcom/anthropic/claude/api/kyc/KycStatusResponse;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/purchase/VerifyPurchaseResponse;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Z", "component2", "()Lcom/anthropic/claude/api/kyc/KycStatusResponse;", "copy", "(ZLcom/anthropic/claude/api/kyc/KycStatusResponse;)Lcom/anthropic/claude/api/purchase/VerifyPurchaseResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getSuccess", "Lcom/anthropic/claude/api/kyc/KycStatusResponse;", "getIdv_requirement", "Companion", "kti", "lti", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class VerifyPurchaseResponse {
    public static final int $stable = 0;
    public static final lti Companion = new lti();
    private final KycStatusResponse idv_requirement;
    private final boolean success;

    public /* synthetic */ VerifyPurchaseResponse(int i, boolean z, KycStatusResponse kycStatusResponse, vnf vnfVar) {
        this.success = (i & 1) == 0 ? true : z;
        if ((i & 2) == 0) {
            this.idv_requirement = null;
        } else {
            this.idv_requirement = kycStatusResponse;
        }
    }

    public static /* synthetic */ VerifyPurchaseResponse copy$default(VerifyPurchaseResponse verifyPurchaseResponse, boolean z, KycStatusResponse kycStatusResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            z = verifyPurchaseResponse.success;
        }
        if ((i & 2) != 0) {
            kycStatusResponse = verifyPurchaseResponse.idv_requirement;
        }
        return verifyPurchaseResponse.copy(z, kycStatusResponse);
    }

    public static final /* synthetic */ void write$Self$api(VerifyPurchaseResponse self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || !self.success) {
            output.p(serialDesc, 0, self.success);
        }
        if (!output.E(serialDesc) && self.idv_requirement == null) {
            return;
        }
        output.B(serialDesc, 1, ms9.a, self.idv_requirement);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final KycStatusResponse getIdv_requirement() {
        return this.idv_requirement;
    }

    public final VerifyPurchaseResponse copy(boolean success, KycStatusResponse idv_requirement) {
        return new VerifyPurchaseResponse(success, idv_requirement);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerifyPurchaseResponse)) {
            return false;
        }
        VerifyPurchaseResponse verifyPurchaseResponse = (VerifyPurchaseResponse) other;
        return this.success == verifyPurchaseResponse.success && x44.r(this.idv_requirement, verifyPurchaseResponse.idv_requirement);
    }

    public final KycStatusResponse getIdv_requirement() {
        return this.idv_requirement;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.success) * 31;
        KycStatusResponse kycStatusResponse = this.idv_requirement;
        return iHashCode + (kycStatusResponse == null ? 0 : kycStatusResponse.hashCode());
    }

    public String toString() {
        return "VerifyPurchaseResponse(success=" + this.success + ", idv_requirement=" + this.idv_requirement + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VerifyPurchaseResponse() {
        this(false, (KycStatusResponse) null, 3, (mq5) (0 == true ? 1 : 0));
    }

    public VerifyPurchaseResponse(boolean z, KycStatusResponse kycStatusResponse) {
        this.success = z;
        this.idv_requirement = kycStatusResponse;
    }

    public /* synthetic */ VerifyPurchaseResponse(boolean z, KycStatusResponse kycStatusResponse, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? null : kycStatusResponse);
    }
}
