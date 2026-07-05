package com.anthropic.claude.api.errors;

import com.anthropic.claude.api.notice.Notice;
import defpackage.as6;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.z6c;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ4\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u001b¨\u0006-"}, d2 = {"Lcom/anthropic/claude/api/errors/ErrorDetails;", "", "", "error_code", "model", "Lcom/anthropic/claude/api/notice/Notice;", "notice", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/notice/Notice;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/notice/Notice;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/errors/ErrorDetails;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/anthropic/claude/api/notice/Notice;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/notice/Notice;)Lcom/anthropic/claude/api/errors/ErrorDetails;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getError_code", "getModel", "Lcom/anthropic/claude/api/notice/Notice;", "getNotice", "Companion", "zr6", "as6", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ErrorDetails {
    public static final int $stable = 0;
    public static final as6 Companion = new as6();
    private final String error_code;
    private final String model;
    private final Notice notice;

    public /* synthetic */ ErrorDetails(int i, String str, String str2, Notice notice, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.error_code = null;
        } else {
            this.error_code = str;
        }
        if ((i & 2) == 0) {
            this.model = null;
        } else {
            this.model = str2;
        }
        if ((i & 4) == 0) {
            this.notice = null;
        } else {
            this.notice = notice;
        }
    }

    public static /* synthetic */ ErrorDetails copy$default(ErrorDetails errorDetails, String str, String str2, Notice notice, int i, Object obj) {
        if ((i & 1) != 0) {
            str = errorDetails.error_code;
        }
        if ((i & 2) != 0) {
            str2 = errorDetails.model;
        }
        if ((i & 4) != 0) {
            notice = errorDetails.notice;
        }
        return errorDetails.copy(str, str2, notice);
    }

    public static final /* synthetic */ void write$Self$api(ErrorDetails self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.error_code != null) {
            output.B(serialDesc, 0, srg.a, self.error_code);
        }
        if (output.E(serialDesc) || self.model != null) {
            output.B(serialDesc, 1, srg.a, self.model);
        }
        if (!output.E(serialDesc) && self.notice == null) {
            return;
        }
        output.B(serialDesc, 2, z6c.a, self.notice);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getError_code() {
        return this.error_code;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Notice getNotice() {
        return this.notice;
    }

    public final ErrorDetails copy(String error_code, String model, Notice notice) {
        return new ErrorDetails(error_code, model, notice);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ErrorDetails)) {
            return false;
        }
        ErrorDetails errorDetails = (ErrorDetails) other;
        return x44.r(this.error_code, errorDetails.error_code) && x44.r(this.model, errorDetails.model) && x44.r(this.notice, errorDetails.notice);
    }

    public final String getError_code() {
        return this.error_code;
    }

    public final String getModel() {
        return this.model;
    }

    public final Notice getNotice() {
        return this.notice;
    }

    public int hashCode() {
        String str = this.error_code;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.model;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Notice notice = this.notice;
        return iHashCode2 + (notice != null ? notice.hashCode() : 0);
    }

    public String toString() {
        String str = this.error_code;
        String str2 = this.model;
        Notice notice = this.notice;
        StringBuilder sbR = kgh.r("ErrorDetails(error_code=", str, ", model=", str2, ", notice=");
        sbR.append(notice);
        sbR.append(")");
        return sbR.toString();
    }

    public ErrorDetails() {
        this((String) null, (String) null, (Notice) null, 7, (mq5) null);
    }

    public ErrorDetails(String str, String str2, Notice notice) {
        this.error_code = str;
        this.model = str2;
        this.notice = notice;
    }

    public /* synthetic */ ErrorDetails(String str, String str2, Notice notice, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : notice);
    }
}
