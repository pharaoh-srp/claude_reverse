package com.anthropic.claude.api.wiggle;

import defpackage.gvj;
import defpackage.mdj;
import defpackage.oaj;
import defpackage.onf;
import defpackage.paj;
import defpackage.raj;
import defpackage.vd4;
import defpackage.vnf;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0019¨\u0006+"}, d2 = {"Lcom/anthropic/claude/api/wiggle/WiggleDeleteFileResponse;", "", "", "success", "Lcom/anthropic/claude/api/wiggle/WiggleDeleteFileResult;", "result", "<init>", "(ZLcom/anthropic/claude/api/wiggle/WiggleDeleteFileResult;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(IZLcom/anthropic/claude/api/wiggle/WiggleDeleteFileResult;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/wiggle/WiggleDeleteFileResponse;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Z", "component2", "()Lcom/anthropic/claude/api/wiggle/WiggleDeleteFileResult;", "copy", "(ZLcom/anthropic/claude/api/wiggle/WiggleDeleteFileResult;)Lcom/anthropic/claude/api/wiggle/WiggleDeleteFileResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getSuccess", "Lcom/anthropic/claude/api/wiggle/WiggleDeleteFileResult;", "getResult", "Companion", "oaj", "paj", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class WiggleDeleteFileResponse {
    public static final int $stable = 0;
    public static final paj Companion = new paj();
    private final WiggleDeleteFileResult result;
    private final boolean success;

    public /* synthetic */ WiggleDeleteFileResponse(int i, boolean z, WiggleDeleteFileResult wiggleDeleteFileResult, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, oaj.a.getDescriptor());
            throw null;
        }
        this.success = z;
        this.result = wiggleDeleteFileResult;
    }

    public static /* synthetic */ WiggleDeleteFileResponse copy$default(WiggleDeleteFileResponse wiggleDeleteFileResponse, boolean z, WiggleDeleteFileResult wiggleDeleteFileResult, int i, Object obj) {
        if ((i & 1) != 0) {
            z = wiggleDeleteFileResponse.success;
        }
        if ((i & 2) != 0) {
            wiggleDeleteFileResult = wiggleDeleteFileResponse.result;
        }
        return wiggleDeleteFileResponse.copy(z, wiggleDeleteFileResult);
    }

    public static final /* synthetic */ void write$Self$api(WiggleDeleteFileResponse self, vd4 output, SerialDescriptor serialDesc) {
        output.p(serialDesc, 0, self.success);
        output.r(serialDesc, 1, raj.d, self.result);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final WiggleDeleteFileResult getResult() {
        return this.result;
    }

    public final WiggleDeleteFileResponse copy(boolean success, WiggleDeleteFileResult result) {
        result.getClass();
        return new WiggleDeleteFileResponse(success, result);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WiggleDeleteFileResponse)) {
            return false;
        }
        WiggleDeleteFileResponse wiggleDeleteFileResponse = (WiggleDeleteFileResponse) other;
        return this.success == wiggleDeleteFileResponse.success && this.result == wiggleDeleteFileResponse.result;
    }

    public final WiggleDeleteFileResult getResult() {
        return this.result;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        return this.result.hashCode() + (Boolean.hashCode(this.success) * 31);
    }

    public String toString() {
        return "WiggleDeleteFileResponse(success=" + this.success + ", result=" + this.result + ")";
    }

    public WiggleDeleteFileResponse(boolean z, WiggleDeleteFileResult wiggleDeleteFileResult) {
        wiggleDeleteFileResult.getClass();
        this.success = z;
        this.result = wiggleDeleteFileResult;
    }
}
