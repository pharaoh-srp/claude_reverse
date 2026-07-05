package com.anthropic.claude.tool.model;

import defpackage.ay6;
import defpackage.gid;
import defpackage.gvj;
import defpackage.kw9;
import defpackage.lje;
import defpackage.mdj;
import defpackage.mje;
import defpackage.mq5;
import defpackage.nje;
import defpackage.onf;
import defpackage.srg;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.zcd;
import defpackage.znf;
import java.time.OffsetDateTime;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000234BB\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u001f\b\u0002\u0010\t\u001a\u0019\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eB?\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010\u001f\u001a\u0019\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003¢\u0006\u0004\b!\u0010\"JM\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u001f\b\u0002\u0010\t\u001a\u0019\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001eJ\u0010\u0010&\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001eR.\u0010\t\u001a\u0019\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b/\u0010 R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u00100\u001a\u0004\b1\u0010\"¨\u00065"}, d2 = {"Lcom/anthropic/claude/tool/model/RequestFormInputFromUserInput;", "", "", "domain", "Ljava/time/OffsetDateTime;", "Lcom/anthropic/claude/tool/model/EventDateTime;", "Lonf;", "with", "Lay6;", "expires_at", "", "Lcom/anthropic/claude/tool/model/RequestFormInputFromUserInputFieldsItem;", "fields", "<init>", "(Ljava/lang/String;Ljava/time/OffsetDateTime;Ljava/util/List;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/time/OffsetDateTime;Ljava/util/List;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_tool_model", "(Lcom/anthropic/claude/tool/model/RequestFormInputFromUserInput;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/time/OffsetDateTime;", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/time/OffsetDateTime;Ljava/util/List;)Lcom/anthropic/claude/tool/model/RequestFormInputFromUserInput;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDomain", "Ljava/time/OffsetDateTime;", "getExpires_at", "Ljava/util/List;", "getFields", "Companion", "lje", "mje", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class RequestFormInputFromUserInput {
    private final String domain;
    private final OffsetDateTime expires_at;
    private final List<RequestFormInputFromUserInputFieldsItem> fields;
    public static final mje Companion = new mje();
    private static final kw9[] $childSerializers = {null, null, yb5.w(w1a.F, new zcd(16))};

    public /* synthetic */ RequestFormInputFromUserInput(int i, String str, OffsetDateTime offsetDateTime, List list, vnf vnfVar) {
        if (4 != (i & 4)) {
            gvj.f(i, 4, lje.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.domain = null;
        } else {
            this.domain = str;
        }
        if ((i & 2) == 0) {
            this.expires_at = null;
        } else {
            this.expires_at = offsetDateTime;
        }
        this.fields = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(nje.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RequestFormInputFromUserInput copy$default(RequestFormInputFromUserInput requestFormInputFromUserInput, String str, OffsetDateTime offsetDateTime, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = requestFormInputFromUserInput.domain;
        }
        if ((i & 2) != 0) {
            offsetDateTime = requestFormInputFromUserInput.expires_at;
        }
        if ((i & 4) != 0) {
            list = requestFormInputFromUserInput.fields;
        }
        return requestFormInputFromUserInput.copy(str, offsetDateTime, list);
    }

    public static final /* synthetic */ void write$Self$Claude_tool_model(RequestFormInputFromUserInput self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        if (output.E(serialDesc) || self.domain != null) {
            output.B(serialDesc, 0, srg.a, self.domain);
        }
        if (output.E(serialDesc) || self.expires_at != null) {
            output.B(serialDesc, 1, ay6.a, self.expires_at);
        }
        output.r(serialDesc, 2, (znf) kw9VarArr[2].getValue(), self.fields);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDomain() {
        return this.domain;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final OffsetDateTime getExpires_at() {
        return this.expires_at;
    }

    public final List<RequestFormInputFromUserInputFieldsItem> component3() {
        return this.fields;
    }

    public final RequestFormInputFromUserInput copy(String domain, OffsetDateTime expires_at, List<RequestFormInputFromUserInputFieldsItem> fields) {
        fields.getClass();
        return new RequestFormInputFromUserInput(domain, expires_at, fields);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RequestFormInputFromUserInput)) {
            return false;
        }
        RequestFormInputFromUserInput requestFormInputFromUserInput = (RequestFormInputFromUserInput) other;
        return x44.r(this.domain, requestFormInputFromUserInput.domain) && x44.r(this.expires_at, requestFormInputFromUserInput.expires_at) && x44.r(this.fields, requestFormInputFromUserInput.fields);
    }

    public final String getDomain() {
        return this.domain;
    }

    public final OffsetDateTime getExpires_at() {
        return this.expires_at;
    }

    public final List<RequestFormInputFromUserInputFieldsItem> getFields() {
        return this.fields;
    }

    public int hashCode() {
        String str = this.domain;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        OffsetDateTime offsetDateTime = this.expires_at;
        return this.fields.hashCode() + ((iHashCode + (offsetDateTime != null ? offsetDateTime.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.domain;
        OffsetDateTime offsetDateTime = this.expires_at;
        List<RequestFormInputFromUserInputFieldsItem> list = this.fields;
        StringBuilder sb = new StringBuilder("RequestFormInputFromUserInput(domain=");
        sb.append(str);
        sb.append(", expires_at=");
        sb.append(offsetDateTime);
        sb.append(", fields=");
        return gid.q(sb, list, ")");
    }

    public RequestFormInputFromUserInput(String str, OffsetDateTime offsetDateTime, List<RequestFormInputFromUserInputFieldsItem> list) {
        list.getClass();
        this.domain = str;
        this.expires_at = offsetDateTime;
        this.fields = list;
    }

    public /* synthetic */ RequestFormInputFromUserInput(String str, OffsetDateTime offsetDateTime, List list, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : offsetDateTime, list);
    }
}
