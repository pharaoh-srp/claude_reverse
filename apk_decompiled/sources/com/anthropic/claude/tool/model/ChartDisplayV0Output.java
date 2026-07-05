package com.anthropic.claude.tool.model;

import defpackage.gvj;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.sk2;
import defpackage.srg;
import defpackage.tk2;
import defpackage.vd4;
import defpackage.vk2;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u001b\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0019¨\u0006*"}, d2 = {"Lcom/anthropic/claude/tool/model/ChartDisplayV0Output;", "", "", "message", "Lcom/anthropic/claude/tool/model/ChartDisplayV0OutputStatus;", "status", "<init>", "(Ljava/lang/String;Lcom/anthropic/claude/tool/model/ChartDisplayV0OutputStatus;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/anthropic/claude/tool/model/ChartDisplayV0OutputStatus;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_tool_model", "(Lcom/anthropic/claude/tool/model/ChartDisplayV0Output;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/anthropic/claude/tool/model/ChartDisplayV0OutputStatus;", "copy", "(Ljava/lang/String;Lcom/anthropic/claude/tool/model/ChartDisplayV0OutputStatus;)Lcom/anthropic/claude/tool/model/ChartDisplayV0Output;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage", "Lcom/anthropic/claude/tool/model/ChartDisplayV0OutputStatus;", "getStatus", "Companion", "sk2", "tk2", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ChartDisplayV0Output {
    public static final tk2 Companion = new tk2();
    private final String message;
    private final ChartDisplayV0OutputStatus status;

    public /* synthetic */ ChartDisplayV0Output(int i, String str, ChartDisplayV0OutputStatus chartDisplayV0OutputStatus, vnf vnfVar) {
        if (2 != (i & 2)) {
            gvj.f(i, 2, sk2.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.message = null;
        } else {
            this.message = str;
        }
        this.status = chartDisplayV0OutputStatus;
    }

    public static /* synthetic */ ChartDisplayV0Output copy$default(ChartDisplayV0Output chartDisplayV0Output, String str, ChartDisplayV0OutputStatus chartDisplayV0OutputStatus, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chartDisplayV0Output.message;
        }
        if ((i & 2) != 0) {
            chartDisplayV0OutputStatus = chartDisplayV0Output.status;
        }
        return chartDisplayV0Output.copy(str, chartDisplayV0OutputStatus);
    }

    public static final /* synthetic */ void write$Self$Claude_tool_model(ChartDisplayV0Output self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.message != null) {
            output.B(serialDesc, 0, srg.a, self.message);
        }
        output.r(serialDesc, 1, vk2.d, self.status);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ChartDisplayV0OutputStatus getStatus() {
        return this.status;
    }

    public final ChartDisplayV0Output copy(String message, ChartDisplayV0OutputStatus status) {
        status.getClass();
        return new ChartDisplayV0Output(message, status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChartDisplayV0Output)) {
            return false;
        }
        ChartDisplayV0Output chartDisplayV0Output = (ChartDisplayV0Output) other;
        return x44.r(this.message, chartDisplayV0Output.message) && this.status == chartDisplayV0Output.status;
    }

    public final String getMessage() {
        return this.message;
    }

    public final ChartDisplayV0OutputStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        String str = this.message;
        return this.status.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public String toString() {
        return "ChartDisplayV0Output(message=" + this.message + ", status=" + this.status + ")";
    }

    public ChartDisplayV0Output(String str, ChartDisplayV0OutputStatus chartDisplayV0OutputStatus) {
        chartDisplayV0OutputStatus.getClass();
        this.message = str;
        this.status = chartDisplayV0OutputStatus;
    }

    public /* synthetic */ ChartDisplayV0Output(String str, ChartDisplayV0OutputStatus chartDisplayV0OutputStatus, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : str, chartDisplayV0OutputStatus);
    }
}
