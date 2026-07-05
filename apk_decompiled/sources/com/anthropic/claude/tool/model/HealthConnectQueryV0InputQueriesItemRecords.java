package com.anthropic.claude.tool.model;

import defpackage.e79;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.qj8;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'(B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J(\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0018¨\u0006)"}, d2 = {"Lcom/anthropic/claude/tool/model/HealthConnectQueryV0InputQueriesItemRecords;", "", "", "limit", "", "page_token", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_tool_model", "(Lcom/anthropic/claude/tool/model/HealthConnectQueryV0InputQueriesItemRecords;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Integer;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Integer;Ljava/lang/String;)Lcom/anthropic/claude/tool/model/HealthConnectQueryV0InputQueriesItemRecords;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getLimit", "Ljava/lang/String;", "getPage_token", "Companion", "pj8", "qj8", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class HealthConnectQueryV0InputQueriesItemRecords {
    public static final qj8 Companion = new qj8();
    private final Integer limit;
    private final String page_token;

    public /* synthetic */ HealthConnectQueryV0InputQueriesItemRecords(int i, Integer num, String str, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.limit = null;
        } else {
            this.limit = num;
        }
        if ((i & 2) == 0) {
            this.page_token = null;
        } else {
            this.page_token = str;
        }
    }

    public static /* synthetic */ HealthConnectQueryV0InputQueriesItemRecords copy$default(HealthConnectQueryV0InputQueriesItemRecords healthConnectQueryV0InputQueriesItemRecords, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = healthConnectQueryV0InputQueriesItemRecords.limit;
        }
        if ((i & 2) != 0) {
            str = healthConnectQueryV0InputQueriesItemRecords.page_token;
        }
        return healthConnectQueryV0InputQueriesItemRecords.copy(num, str);
    }

    public static final /* synthetic */ void write$Self$Claude_tool_model(HealthConnectQueryV0InputQueriesItemRecords self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.limit != null) {
            output.B(serialDesc, 0, e79.a, self.limit);
        }
        if (!output.E(serialDesc) && self.page_token == null) {
            return;
        }
        output.B(serialDesc, 1, srg.a, self.page_token);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getLimit() {
        return this.limit;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPage_token() {
        return this.page_token;
    }

    public final HealthConnectQueryV0InputQueriesItemRecords copy(Integer limit, String page_token) {
        return new HealthConnectQueryV0InputQueriesItemRecords(limit, page_token);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthConnectQueryV0InputQueriesItemRecords)) {
            return false;
        }
        HealthConnectQueryV0InputQueriesItemRecords healthConnectQueryV0InputQueriesItemRecords = (HealthConnectQueryV0InputQueriesItemRecords) other;
        return x44.r(this.limit, healthConnectQueryV0InputQueriesItemRecords.limit) && x44.r(this.page_token, healthConnectQueryV0InputQueriesItemRecords.page_token);
    }

    public final Integer getLimit() {
        return this.limit;
    }

    public final String getPage_token() {
        return this.page_token;
    }

    public int hashCode() {
        Integer num = this.limit;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.page_token;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "HealthConnectQueryV0InputQueriesItemRecords(limit=" + this.limit + ", page_token=" + this.page_token + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HealthConnectQueryV0InputQueriesItemRecords() {
        this((Integer) null, (String) (0 == true ? 1 : 0), 3, (mq5) (0 == true ? 1 : 0));
    }

    public HealthConnectQueryV0InputQueriesItemRecords(Integer num, String str) {
        this.limit = num;
        this.page_token = str;
    }

    public /* synthetic */ HealthConnectQueryV0InputQueriesItemRecords(Integer num, String str, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str);
    }
}
