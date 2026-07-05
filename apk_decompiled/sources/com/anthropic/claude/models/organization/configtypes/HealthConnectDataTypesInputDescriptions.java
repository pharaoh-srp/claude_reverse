package com.anthropic.claude.models.organization.configtypes;

import defpackage.gvj;
import defpackage.ij0;
import defpackage.mdj;
import defpackage.onf;
import defpackage.uh8;
import defpackage.vd4;
import defpackage.vh8;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u0016¨\u0006'"}, d2 = {"Lcom/anthropic/claude/models/organization/configtypes/HealthConnectDataTypesInputDescriptions;", "", "", "tool_description", "search_text", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$models", "(Lcom/anthropic/claude/models/organization/configtypes/HealthConnectDataTypesInputDescriptions;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/models/organization/configtypes/HealthConnectDataTypesInputDescriptions;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTool_description", "getSearch_text", "Companion", "uh8", "vh8", "models"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class HealthConnectDataTypesInputDescriptions {
    public static final int $stable = 0;
    public static final vh8 Companion = new vh8();
    private final String search_text;
    private final String tool_description;

    public /* synthetic */ HealthConnectDataTypesInputDescriptions(int i, String str, String str2, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, uh8.a.getDescriptor());
            throw null;
        }
        this.tool_description = str;
        this.search_text = str2;
    }

    public static /* synthetic */ HealthConnectDataTypesInputDescriptions copy$default(HealthConnectDataTypesInputDescriptions healthConnectDataTypesInputDescriptions, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = healthConnectDataTypesInputDescriptions.tool_description;
        }
        if ((i & 2) != 0) {
            str2 = healthConnectDataTypesInputDescriptions.search_text;
        }
        return healthConnectDataTypesInputDescriptions.copy(str, str2);
    }

    public static final /* synthetic */ void write$Self$models(HealthConnectDataTypesInputDescriptions self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.tool_description);
        output.q(serialDesc, 1, self.search_text);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTool_description() {
        return this.tool_description;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSearch_text() {
        return this.search_text;
    }

    public final HealthConnectDataTypesInputDescriptions copy(String tool_description, String search_text) {
        tool_description.getClass();
        search_text.getClass();
        return new HealthConnectDataTypesInputDescriptions(tool_description, search_text);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthConnectDataTypesInputDescriptions)) {
            return false;
        }
        HealthConnectDataTypesInputDescriptions healthConnectDataTypesInputDescriptions = (HealthConnectDataTypesInputDescriptions) other;
        return x44.r(this.tool_description, healthConnectDataTypesInputDescriptions.tool_description) && x44.r(this.search_text, healthConnectDataTypesInputDescriptions.search_text);
    }

    public final String getSearch_text() {
        return this.search_text;
    }

    public final String getTool_description() {
        return this.tool_description;
    }

    public int hashCode() {
        return this.search_text.hashCode() + (this.tool_description.hashCode() * 31);
    }

    public String toString() {
        return ij0.l("HealthConnectDataTypesInputDescriptions(tool_description=", this.tool_description, ", search_text=", this.search_text, ")");
    }

    public HealthConnectDataTypesInputDescriptions(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.tool_description = str;
        this.search_text = str2;
    }
}
