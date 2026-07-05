package com.anthropic.claude.tool.model;

import defpackage.gvj;
import defpackage.ik8;
import defpackage.jk8;
import defpackage.lk8;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0019¨\u0006*"}, d2 = {"Lcom/anthropic/claude/tool/model/HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemError;", "", "Lcom/anthropic/claude/tool/model/HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemErrorErrorType;", "error_type", "", "message", "<init>", "(Lcom/anthropic/claude/tool/model/HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemErrorErrorType;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/tool/model/HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemErrorErrorType;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_tool_model", "(Lcom/anthropic/claude/tool/model/HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemError;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/tool/model/HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemErrorErrorType;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/anthropic/claude/tool/model/HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemErrorErrorType;Ljava/lang/String;)Lcom/anthropic/claude/tool/model/HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemError;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/tool/model/HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemErrorErrorType;", "getError_type", "Ljava/lang/String;", "getMessage", "Companion", "ik8", "jk8", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemError {
    public static final jk8 Companion = new jk8();
    private final HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemErrorErrorType error_type;
    private final String message;

    public /* synthetic */ HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemError(int i, HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemErrorErrorType healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemErrorErrorType, String str, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, ik8.a.getDescriptor());
            throw null;
        }
        this.error_type = healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemErrorErrorType;
        if ((i & 2) == 0) {
            this.message = null;
        } else {
            this.message = str;
        }
    }

    public static /* synthetic */ HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemError copy$default(HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemError healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemError, HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemErrorErrorType healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemErrorErrorType, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemErrorErrorType = healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemError.error_type;
        }
        if ((i & 2) != 0) {
            str = healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemError.message;
        }
        return healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemError.copy(healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemErrorErrorType, str);
    }

    public static final /* synthetic */ void write$Self$Claude_tool_model(HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemError self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, lk8.d, self.error_type);
        if (!output.E(serialDesc) && self.message == null) {
            return;
        }
        output.B(serialDesc, 1, srg.a, self.message);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemErrorErrorType getError_type() {
        return this.error_type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemError copy(HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemErrorErrorType error_type, String message) {
        error_type.getClass();
        return new HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemError(error_type, message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemError)) {
            return false;
        }
        HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemError healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemError = (HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemError) other;
        return this.error_type == healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemError.error_type && x44.r(this.message, healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemError.message);
    }

    public final HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemErrorErrorType getError_type() {
        return this.error_type;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        int iHashCode = this.error_type.hashCode() * 31;
        String str = this.message;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemError(error_type=" + this.error_type + ", message=" + this.message + ")";
    }

    public HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemError(HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemErrorErrorType healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemErrorErrorType, String str) {
        healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemErrorErrorType.getClass();
        this.error_type = healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemErrorErrorType;
        this.message = str;
    }

    public /* synthetic */ HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemError(HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemErrorErrorType healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemErrorErrorType, String str, int i, mq5 mq5Var) {
        this(healthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItemErrorErrorType, (i & 2) != 0 ? null : str);
    }
}
