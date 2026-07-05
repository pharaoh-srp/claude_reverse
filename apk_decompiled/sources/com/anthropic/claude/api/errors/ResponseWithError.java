package com.anthropic.claude.api.errors;

import defpackage.are;
import defpackage.bs6;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000234BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJL\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u001aR\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010.\u0012\u0004\b0\u00101\u001a\u0004\b/\u0010\u001f¨\u00065"}, d2 = {"Lcom/anthropic/claude/api/errors/ResponseWithError;", "", "", "type", "error_code", "message", "resource", "Lcom/anthropic/claude/api/errors/ErrorDetails;", "details", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/errors/ErrorDetails;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/errors/ErrorDetails;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/errors/ResponseWithError;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/anthropic/claude/api/errors/ErrorDetails;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/errors/ErrorDetails;)Lcom/anthropic/claude/api/errors/ResponseWithError;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "getError_code", "getMessage", "getResource", "Lcom/anthropic/claude/api/errors/ErrorDetails;", "getDetails", "getDetails$annotations", "()V", "Companion", "zqe", "are", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ResponseWithError {
    public static final int $stable = 0;
    public static final are Companion = new are();
    private final ErrorDetails details;
    private final String error_code;
    private final String message;
    private final String resource;
    private final String type;

    public /* synthetic */ ResponseWithError(int i, String str, String str2, String str3, String str4, ErrorDetails errorDetails, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.type = null;
        } else {
            this.type = str;
        }
        if ((i & 2) == 0) {
            this.error_code = null;
        } else {
            this.error_code = str2;
        }
        if ((i & 4) == 0) {
            this.message = null;
        } else {
            this.message = str3;
        }
        if ((i & 8) == 0) {
            this.resource = null;
        } else {
            this.resource = str4;
        }
        if ((i & 16) == 0) {
            this.details = null;
        } else {
            this.details = errorDetails;
        }
    }

    public static /* synthetic */ ResponseWithError copy$default(ResponseWithError responseWithError, String str, String str2, String str3, String str4, ErrorDetails errorDetails, int i, Object obj) {
        if ((i & 1) != 0) {
            str = responseWithError.type;
        }
        if ((i & 2) != 0) {
            str2 = responseWithError.error_code;
        }
        if ((i & 4) != 0) {
            str3 = responseWithError.message;
        }
        if ((i & 8) != 0) {
            str4 = responseWithError.resource;
        }
        if ((i & 16) != 0) {
            errorDetails = responseWithError.details;
        }
        ErrorDetails errorDetails2 = errorDetails;
        String str5 = str3;
        return responseWithError.copy(str, str2, str5, str4, errorDetails2);
    }

    @onf(with = bs6.class)
    public static /* synthetic */ void getDetails$annotations() {
    }

    public static final /* synthetic */ void write$Self$api(ResponseWithError self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.type != null) {
            output.B(serialDesc, 0, srg.a, self.type);
        }
        if (output.E(serialDesc) || self.error_code != null) {
            output.B(serialDesc, 1, srg.a, self.error_code);
        }
        if (output.E(serialDesc) || self.message != null) {
            output.B(serialDesc, 2, srg.a, self.message);
        }
        if (output.E(serialDesc) || self.resource != null) {
            output.B(serialDesc, 3, srg.a, self.resource);
        }
        if (!output.E(serialDesc) && self.details == null) {
            return;
        }
        output.B(serialDesc, 4, bs6.b, self.details);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getError_code() {
        return this.error_code;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getResource() {
        return this.resource;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ErrorDetails getDetails() {
        return this.details;
    }

    public final ResponseWithError copy(String type, String error_code, String message, String resource, ErrorDetails details) {
        return new ResponseWithError(type, error_code, message, resource, details);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResponseWithError)) {
            return false;
        }
        ResponseWithError responseWithError = (ResponseWithError) other;
        return x44.r(this.type, responseWithError.type) && x44.r(this.error_code, responseWithError.error_code) && x44.r(this.message, responseWithError.message) && x44.r(this.resource, responseWithError.resource) && x44.r(this.details, responseWithError.details);
    }

    public final ErrorDetails getDetails() {
        return this.details;
    }

    public final String getError_code() {
        return this.error_code;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getResource() {
        return this.resource;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.error_code;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.message;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.resource;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ErrorDetails errorDetails = this.details;
        return iHashCode4 + (errorDetails != null ? errorDetails.hashCode() : 0);
    }

    public String toString() {
        String str = this.type;
        String str2 = this.error_code;
        String str3 = this.message;
        String str4 = this.resource;
        ErrorDetails errorDetails = this.details;
        StringBuilder sbR = kgh.r("ResponseWithError(type=", str, ", error_code=", str2, ", message=");
        kgh.u(sbR, str3, ", resource=", str4, ", details=");
        sbR.append(errorDetails);
        sbR.append(")");
        return sbR.toString();
    }

    public ResponseWithError() {
        this((String) null, (String) null, (String) null, (String) null, (ErrorDetails) null, 31, (mq5) null);
    }

    public ResponseWithError(String str, String str2, String str3, String str4, ErrorDetails errorDetails) {
        this.type = str;
        this.error_code = str2;
        this.message = str3;
        this.resource = str4;
        this.details = errorDetails;
    }

    public /* synthetic */ ResponseWithError(String str, String str2, String str3, String str4, ErrorDetails errorDetails, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : errorDetails);
    }
}
