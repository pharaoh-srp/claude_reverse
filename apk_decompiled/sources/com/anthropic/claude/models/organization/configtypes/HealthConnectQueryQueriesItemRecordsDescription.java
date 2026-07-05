package com.anthropic.claude.models.organization.configtypes;

import defpackage.grc;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.xi8;
import defpackage.yi8;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J.\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b&\u0010\u0017¨\u0006*"}, d2 = {"Lcom/anthropic/claude/models/organization/configtypes/HealthConnectQueryQueriesItemRecordsDescription;", "", "", "description", "limit", "page_token", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$models", "(Lcom/anthropic/claude/models/organization/configtypes/HealthConnectQueryQueriesItemRecordsDescription;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/models/organization/configtypes/HealthConnectQueryQueriesItemRecordsDescription;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDescription", "getLimit", "getPage_token", "Companion", "xi8", "yi8", "models"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class HealthConnectQueryQueriesItemRecordsDescription {
    public static final int $stable = 0;
    public static final yi8 Companion = new yi8();
    private final String description;
    private final String limit;
    private final String page_token;

    public /* synthetic */ HealthConnectQueryQueriesItemRecordsDescription(int i, String str, String str2, String str3, vnf vnfVar) {
        if (7 != (i & 7)) {
            gvj.f(i, 7, xi8.a.getDescriptor());
            throw null;
        }
        this.description = str;
        this.limit = str2;
        this.page_token = str3;
    }

    public static /* synthetic */ HealthConnectQueryQueriesItemRecordsDescription copy$default(HealthConnectQueryQueriesItemRecordsDescription healthConnectQueryQueriesItemRecordsDescription, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = healthConnectQueryQueriesItemRecordsDescription.description;
        }
        if ((i & 2) != 0) {
            str2 = healthConnectQueryQueriesItemRecordsDescription.limit;
        }
        if ((i & 4) != 0) {
            str3 = healthConnectQueryQueriesItemRecordsDescription.page_token;
        }
        return healthConnectQueryQueriesItemRecordsDescription.copy(str, str2, str3);
    }

    public static final /* synthetic */ void write$Self$models(HealthConnectQueryQueriesItemRecordsDescription self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.description);
        output.q(serialDesc, 1, self.limit);
        output.q(serialDesc, 2, self.page_token);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLimit() {
        return this.limit;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPage_token() {
        return this.page_token;
    }

    public final HealthConnectQueryQueriesItemRecordsDescription copy(String description, String limit, String page_token) {
        description.getClass();
        limit.getClass();
        page_token.getClass();
        return new HealthConnectQueryQueriesItemRecordsDescription(description, limit, page_token);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthConnectQueryQueriesItemRecordsDescription)) {
            return false;
        }
        HealthConnectQueryQueriesItemRecordsDescription healthConnectQueryQueriesItemRecordsDescription = (HealthConnectQueryQueriesItemRecordsDescription) other;
        return x44.r(this.description, healthConnectQueryQueriesItemRecordsDescription.description) && x44.r(this.limit, healthConnectQueryQueriesItemRecordsDescription.limit) && x44.r(this.page_token, healthConnectQueryQueriesItemRecordsDescription.page_token);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getLimit() {
        return this.limit;
    }

    public final String getPage_token() {
        return this.page_token;
    }

    public int hashCode() {
        return this.page_token.hashCode() + kgh.l(this.description.hashCode() * 31, 31, this.limit);
    }

    public String toString() {
        String str = this.description;
        String str2 = this.limit;
        return ij0.m(kgh.r("HealthConnectQueryQueriesItemRecordsDescription(description=", str, ", limit=", str2, ", page_token="), this.page_token, ")");
    }

    public HealthConnectQueryQueriesItemRecordsDescription(String str, String str2, String str3) {
        grc.B(str, str2, str3);
        this.description = str;
        this.limit = str2;
        this.page_token = str3;
    }
}
