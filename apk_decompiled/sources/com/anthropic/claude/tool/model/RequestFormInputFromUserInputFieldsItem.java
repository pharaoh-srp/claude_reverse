package com.anthropic.claude.tool.model;

import defpackage.gvj;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.nje;
import defpackage.oje;
import defpackage.onf;
import defpackage.qje;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.zt1;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000267BG\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fBW\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0010\u0010\"\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\"\u0010#JT\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010*\u001a\u00020\u00052\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b0\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b1\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b2\u0010\u001cR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b4\u0010#¨\u00068"}, d2 = {"Lcom/anthropic/claude/tool/model/RequestFormInputFromUserInputFieldsItem;", "", "", "locator_ref", "name", "", "optional", "placeholder", "prefill", "Lcom/anthropic/claude/tool/model/RequestFormInputFromUserInputFieldsItemType;", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/tool/model/RequestFormInputFromUserInputFieldsItemType;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/tool/model/RequestFormInputFromUserInputFieldsItemType;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_tool_model", "(Lcom/anthropic/claude/tool/model/RequestFormInputFromUserInputFieldsItem;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Boolean;", "component4", "component5", "component6", "()Lcom/anthropic/claude/tool/model/RequestFormInputFromUserInputFieldsItemType;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/tool/model/RequestFormInputFromUserInputFieldsItemType;)Lcom/anthropic/claude/tool/model/RequestFormInputFromUserInputFieldsItem;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLocator_ref", "getName", "Ljava/lang/Boolean;", "getOptional", "getPlaceholder", "getPrefill", "Lcom/anthropic/claude/tool/model/RequestFormInputFromUserInputFieldsItemType;", "getType", "Companion", "nje", "oje", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class RequestFormInputFromUserInputFieldsItem {
    public static final oje Companion = new oje();
    private final String locator_ref;
    private final String name;
    private final Boolean optional;
    private final String placeholder;
    private final String prefill;
    private final RequestFormInputFromUserInputFieldsItemType type;

    public /* synthetic */ RequestFormInputFromUserInputFieldsItem(int i, String str, String str2, Boolean bool, String str3, String str4, RequestFormInputFromUserInputFieldsItemType requestFormInputFromUserInputFieldsItemType, vnf vnfVar) {
        if (34 != (i & 34)) {
            gvj.f(i, 34, nje.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.locator_ref = null;
        } else {
            this.locator_ref = str;
        }
        this.name = str2;
        if ((i & 4) == 0) {
            this.optional = null;
        } else {
            this.optional = bool;
        }
        if ((i & 8) == 0) {
            this.placeholder = null;
        } else {
            this.placeholder = str3;
        }
        if ((i & 16) == 0) {
            this.prefill = null;
        } else {
            this.prefill = str4;
        }
        this.type = requestFormInputFromUserInputFieldsItemType;
    }

    public static /* synthetic */ RequestFormInputFromUserInputFieldsItem copy$default(RequestFormInputFromUserInputFieldsItem requestFormInputFromUserInputFieldsItem, String str, String str2, Boolean bool, String str3, String str4, RequestFormInputFromUserInputFieldsItemType requestFormInputFromUserInputFieldsItemType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = requestFormInputFromUserInputFieldsItem.locator_ref;
        }
        if ((i & 2) != 0) {
            str2 = requestFormInputFromUserInputFieldsItem.name;
        }
        if ((i & 4) != 0) {
            bool = requestFormInputFromUserInputFieldsItem.optional;
        }
        if ((i & 8) != 0) {
            str3 = requestFormInputFromUserInputFieldsItem.placeholder;
        }
        if ((i & 16) != 0) {
            str4 = requestFormInputFromUserInputFieldsItem.prefill;
        }
        if ((i & 32) != 0) {
            requestFormInputFromUserInputFieldsItemType = requestFormInputFromUserInputFieldsItem.type;
        }
        String str5 = str4;
        RequestFormInputFromUserInputFieldsItemType requestFormInputFromUserInputFieldsItemType2 = requestFormInputFromUserInputFieldsItemType;
        return requestFormInputFromUserInputFieldsItem.copy(str, str2, bool, str3, str5, requestFormInputFromUserInputFieldsItemType2);
    }

    public static final /* synthetic */ void write$Self$Claude_tool_model(RequestFormInputFromUserInputFieldsItem self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.locator_ref != null) {
            output.B(serialDesc, 0, srg.a, self.locator_ref);
        }
        output.q(serialDesc, 1, self.name);
        if (output.E(serialDesc) || self.optional != null) {
            output.B(serialDesc, 2, zt1.a, self.optional);
        }
        if (output.E(serialDesc) || self.placeholder != null) {
            output.B(serialDesc, 3, srg.a, self.placeholder);
        }
        if (output.E(serialDesc) || self.prefill != null) {
            output.B(serialDesc, 4, srg.a, self.prefill);
        }
        output.r(serialDesc, 5, qje.d, self.type);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLocator_ref() {
        return this.locator_ref;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getOptional() {
        return this.optional;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPrefill() {
        return this.prefill;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final RequestFormInputFromUserInputFieldsItemType getType() {
        return this.type;
    }

    public final RequestFormInputFromUserInputFieldsItem copy(String locator_ref, String name, Boolean optional, String placeholder, String prefill, RequestFormInputFromUserInputFieldsItemType type) {
        name.getClass();
        type.getClass();
        return new RequestFormInputFromUserInputFieldsItem(locator_ref, name, optional, placeholder, prefill, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RequestFormInputFromUserInputFieldsItem)) {
            return false;
        }
        RequestFormInputFromUserInputFieldsItem requestFormInputFromUserInputFieldsItem = (RequestFormInputFromUserInputFieldsItem) other;
        return x44.r(this.locator_ref, requestFormInputFromUserInputFieldsItem.locator_ref) && x44.r(this.name, requestFormInputFromUserInputFieldsItem.name) && x44.r(this.optional, requestFormInputFromUserInputFieldsItem.optional) && x44.r(this.placeholder, requestFormInputFromUserInputFieldsItem.placeholder) && x44.r(this.prefill, requestFormInputFromUserInputFieldsItem.prefill) && this.type == requestFormInputFromUserInputFieldsItem.type;
    }

    public final String getLocator_ref() {
        return this.locator_ref;
    }

    public final String getName() {
        return this.name;
    }

    public final Boolean getOptional() {
        return this.optional;
    }

    public final String getPlaceholder() {
        return this.placeholder;
    }

    public final String getPrefill() {
        return this.prefill;
    }

    public final RequestFormInputFromUserInputFieldsItemType getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.locator_ref;
        int iL = kgh.l((str == null ? 0 : str.hashCode()) * 31, 31, this.name);
        Boolean bool = this.optional;
        int iHashCode = (iL + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.placeholder;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.prefill;
        return this.type.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.locator_ref;
        String str2 = this.name;
        Boolean bool = this.optional;
        String str3 = this.placeholder;
        String str4 = this.prefill;
        RequestFormInputFromUserInputFieldsItemType requestFormInputFromUserInputFieldsItemType = this.type;
        StringBuilder sbR = kgh.r("RequestFormInputFromUserInputFieldsItem(locator_ref=", str, ", name=", str2, ", optional=");
        sbR.append(bool);
        sbR.append(", placeholder=");
        sbR.append(str3);
        sbR.append(", prefill=");
        sbR.append(str4);
        sbR.append(", type=");
        sbR.append(requestFormInputFromUserInputFieldsItemType);
        sbR.append(")");
        return sbR.toString();
    }

    public RequestFormInputFromUserInputFieldsItem(String str, String str2, Boolean bool, String str3, String str4, RequestFormInputFromUserInputFieldsItemType requestFormInputFromUserInputFieldsItemType) {
        str2.getClass();
        requestFormInputFromUserInputFieldsItemType.getClass();
        this.locator_ref = str;
        this.name = str2;
        this.optional = bool;
        this.placeholder = str3;
        this.prefill = str4;
        this.type = requestFormInputFromUserInputFieldsItemType;
    }

    public /* synthetic */ RequestFormInputFromUserInputFieldsItem(String str, String str2, Boolean bool, String str3, String str4, RequestFormInputFromUserInputFieldsItemType requestFormInputFromUserInputFieldsItemType, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : str, str2, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, requestFormInputFromUserInputFieldsItemType);
    }
}
