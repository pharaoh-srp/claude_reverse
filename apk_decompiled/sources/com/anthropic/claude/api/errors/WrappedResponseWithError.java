package com.anthropic.claude.api.errors;

import defpackage.iij;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.zqe;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$%B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0015¨\u0006&"}, d2 = {"Lcom/anthropic/claude/api/errors/WrappedResponseWithError;", "", "Lcom/anthropic/claude/api/errors/ResponseWithError;", "error", "<init>", "(Lcom/anthropic/claude/api/errors/ResponseWithError;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/api/errors/ResponseWithError;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/errors/WrappedResponseWithError;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/api/errors/ResponseWithError;", "copy", "(Lcom/anthropic/claude/api/errors/ResponseWithError;)Lcom/anthropic/claude/api/errors/WrappedResponseWithError;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/api/errors/ResponseWithError;", "getError", "Companion", "hij", "iij", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class WrappedResponseWithError {
    public static final int $stable = 0;
    public static final iij Companion = new iij();
    private final ResponseWithError error;

    public /* synthetic */ WrappedResponseWithError(int i, ResponseWithError responseWithError, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.error = null;
        } else {
            this.error = responseWithError;
        }
    }

    public static /* synthetic */ WrappedResponseWithError copy$default(WrappedResponseWithError wrappedResponseWithError, ResponseWithError responseWithError, int i, Object obj) {
        if ((i & 1) != 0) {
            responseWithError = wrappedResponseWithError.error;
        }
        return wrappedResponseWithError.copy(responseWithError);
    }

    public static final /* synthetic */ void write$Self$api(WrappedResponseWithError self, vd4 output, SerialDescriptor serialDesc) {
        if (!output.E(serialDesc) && self.error == null) {
            return;
        }
        output.B(serialDesc, 0, zqe.a, self.error);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ResponseWithError getError() {
        return this.error;
    }

    public final WrappedResponseWithError copy(ResponseWithError error) {
        return new WrappedResponseWithError(error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof WrappedResponseWithError) && x44.r(this.error, ((WrappedResponseWithError) other).error);
    }

    public final ResponseWithError getError() {
        return this.error;
    }

    public int hashCode() {
        ResponseWithError responseWithError = this.error;
        if (responseWithError == null) {
            return 0;
        }
        return responseWithError.hashCode();
    }

    public String toString() {
        return "WrappedResponseWithError(error=" + this.error + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WrappedResponseWithError() {
        this((ResponseWithError) null, 1, (mq5) (0 == true ? 1 : 0));
    }

    public WrappedResponseWithError(ResponseWithError responseWithError) {
        this.error = responseWithError;
    }

    public /* synthetic */ WrappedResponseWithError(ResponseWithError responseWithError, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : responseWithError);
    }
}
