package com.anthropic.claude.models.organization.configtypes;

import defpackage.gvj;
import defpackage.mdj;
import defpackage.onf;
import defpackage.pi8;
import defpackage.qi8;
import defpackage.ri8;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0019¨\u0006*"}, d2 = {"Lcom/anthropic/claude/models/organization/configtypes/HealthConnectQueryInputDescriptions;", "", "", "tool_description", "Lcom/anthropic/claude/models/organization/configtypes/HealthConnectQueryQueriesArrayDescription;", "queries", "<init>", "(Ljava/lang/String;Lcom/anthropic/claude/models/organization/configtypes/HealthConnectQueryQueriesArrayDescription;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/anthropic/claude/models/organization/configtypes/HealthConnectQueryQueriesArrayDescription;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$models", "(Lcom/anthropic/claude/models/organization/configtypes/HealthConnectQueryInputDescriptions;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/anthropic/claude/models/organization/configtypes/HealthConnectQueryQueriesArrayDescription;", "copy", "(Ljava/lang/String;Lcom/anthropic/claude/models/organization/configtypes/HealthConnectQueryQueriesArrayDescription;)Lcom/anthropic/claude/models/organization/configtypes/HealthConnectQueryInputDescriptions;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTool_description", "Lcom/anthropic/claude/models/organization/configtypes/HealthConnectQueryQueriesArrayDescription;", "getQueries", "Companion", "pi8", "qi8", "models"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class HealthConnectQueryInputDescriptions {
    public static final int $stable = 0;
    public static final qi8 Companion = new qi8();
    private final HealthConnectQueryQueriesArrayDescription queries;
    private final String tool_description;

    public /* synthetic */ HealthConnectQueryInputDescriptions(int i, String str, HealthConnectQueryQueriesArrayDescription healthConnectQueryQueriesArrayDescription, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, pi8.a.getDescriptor());
            throw null;
        }
        this.tool_description = str;
        this.queries = healthConnectQueryQueriesArrayDescription;
    }

    public static /* synthetic */ HealthConnectQueryInputDescriptions copy$default(HealthConnectQueryInputDescriptions healthConnectQueryInputDescriptions, String str, HealthConnectQueryQueriesArrayDescription healthConnectQueryQueriesArrayDescription, int i, Object obj) {
        if ((i & 1) != 0) {
            str = healthConnectQueryInputDescriptions.tool_description;
        }
        if ((i & 2) != 0) {
            healthConnectQueryQueriesArrayDescription = healthConnectQueryInputDescriptions.queries;
        }
        return healthConnectQueryInputDescriptions.copy(str, healthConnectQueryQueriesArrayDescription);
    }

    public static final /* synthetic */ void write$Self$models(HealthConnectQueryInputDescriptions self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.tool_description);
        output.r(serialDesc, 1, ri8.a, self.queries);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTool_description() {
        return this.tool_description;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final HealthConnectQueryQueriesArrayDescription getQueries() {
        return this.queries;
    }

    public final HealthConnectQueryInputDescriptions copy(String tool_description, HealthConnectQueryQueriesArrayDescription queries) {
        tool_description.getClass();
        queries.getClass();
        return new HealthConnectQueryInputDescriptions(tool_description, queries);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthConnectQueryInputDescriptions)) {
            return false;
        }
        HealthConnectQueryInputDescriptions healthConnectQueryInputDescriptions = (HealthConnectQueryInputDescriptions) other;
        return x44.r(this.tool_description, healthConnectQueryInputDescriptions.tool_description) && x44.r(this.queries, healthConnectQueryInputDescriptions.queries);
    }

    public final HealthConnectQueryQueriesArrayDescription getQueries() {
        return this.queries;
    }

    public final String getTool_description() {
        return this.tool_description;
    }

    public int hashCode() {
        return this.queries.hashCode() + (this.tool_description.hashCode() * 31);
    }

    public String toString() {
        return "HealthConnectQueryInputDescriptions(tool_description=" + this.tool_description + ", queries=" + this.queries + ")";
    }

    public HealthConnectQueryInputDescriptions(String str, HealthConnectQueryQueriesArrayDescription healthConnectQueryQueriesArrayDescription) {
        str.getClass();
        healthConnectQueryQueriesArrayDescription.getClass();
        this.tool_description = str;
        this.queries = healthConnectQueryQueriesArrayDescription;
    }
}
