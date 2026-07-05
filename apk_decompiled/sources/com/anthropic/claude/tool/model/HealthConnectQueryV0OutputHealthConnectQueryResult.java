package com.anthropic.claude.tool.model;

import defpackage.ak8;
import defpackage.gvj;
import defpackage.ij8;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.y6a;
import defpackage.yb5;
import defpackage.yj8;
import defpackage.zj8;
import defpackage.znf;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*+B!\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ,\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u001a¨\u0006,"}, d2 = {"Lcom/anthropic/claude/tool/model/HealthConnectQueryV0OutputHealthConnectQueryResult;", "Lcom/anthropic/claude/tool/model/HealthConnectQueryV0Output;", "", "message", "", "Lcom/anthropic/claude/tool/model/HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItem;", "query_results", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_tool_model", "(Lcom/anthropic/claude/tool/model/HealthConnectQueryV0OutputHealthConnectQueryResult;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/anthropic/claude/tool/model/HealthConnectQueryV0OutputHealthConnectQueryResult;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage", "Ljava/util/List;", "getQuery_results", "Companion", "yj8", "zj8", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class HealthConnectQueryV0OutputHealthConnectQueryResult implements HealthConnectQueryV0Output {
    private final String message;
    private final List<HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItem> query_results;
    public static final zj8 Companion = new zj8();
    private static final kw9[] $childSerializers = {null, yb5.w(w1a.F, new ij8(4))};

    public /* synthetic */ HealthConnectQueryV0OutputHealthConnectQueryResult(int i, String str, List list, vnf vnfVar) {
        if (2 != (i & 2)) {
            gvj.f(i, 2, yj8.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.message = null;
        } else {
            this.message = str;
        }
        this.query_results = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(ak8.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HealthConnectQueryV0OutputHealthConnectQueryResult copy$default(HealthConnectQueryV0OutputHealthConnectQueryResult healthConnectQueryV0OutputHealthConnectQueryResult, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = healthConnectQueryV0OutputHealthConnectQueryResult.message;
        }
        if ((i & 2) != 0) {
            list = healthConnectQueryV0OutputHealthConnectQueryResult.query_results;
        }
        return healthConnectQueryV0OutputHealthConnectQueryResult.copy(str, list);
    }

    public static final /* synthetic */ void write$Self$Claude_tool_model(HealthConnectQueryV0OutputHealthConnectQueryResult self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        if (output.E(serialDesc) || self.message != null) {
            output.B(serialDesc, 0, srg.a, self.message);
        }
        output.r(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.query_results);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final List<HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItem> component2() {
        return this.query_results;
    }

    public final HealthConnectQueryV0OutputHealthConnectQueryResult copy(String message, List<HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItem> query_results) {
        query_results.getClass();
        return new HealthConnectQueryV0OutputHealthConnectQueryResult(message, query_results);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthConnectQueryV0OutputHealthConnectQueryResult)) {
            return false;
        }
        HealthConnectQueryV0OutputHealthConnectQueryResult healthConnectQueryV0OutputHealthConnectQueryResult = (HealthConnectQueryV0OutputHealthConnectQueryResult) other;
        return x44.r(this.message, healthConnectQueryV0OutputHealthConnectQueryResult.message) && x44.r(this.query_results, healthConnectQueryV0OutputHealthConnectQueryResult.query_results);
    }

    public final String getMessage() {
        return this.message;
    }

    public final List<HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItem> getQuery_results() {
        return this.query_results;
    }

    public int hashCode() {
        String str = this.message;
        return this.query_results.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public String toString() {
        return y6a.o("HealthConnectQueryV0OutputHealthConnectQueryResult(message=", this.message, ", query_results=", this.query_results, ")");
    }

    public HealthConnectQueryV0OutputHealthConnectQueryResult(String str, List<HealthConnectQueryV0OutputHealthConnectQueryResultQueryResultsItem> list) {
        list.getClass();
        this.message = str;
        this.query_results = list;
    }

    public /* synthetic */ HealthConnectQueryV0OutputHealthConnectQueryResult(String str, List list, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : str, list);
    }
}
