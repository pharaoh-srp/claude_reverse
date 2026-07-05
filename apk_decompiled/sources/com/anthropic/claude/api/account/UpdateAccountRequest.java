package com.anthropic.claude.api.account;

import defpackage.kdi;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.l8;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.phi;
import defpackage.qy1;
import defpackage.srg;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import defpackage.zt1;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000267BI\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBS\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0018\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\"\u0010#JR\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010*\u001a\u00020\t2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001cR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u001cR\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b0\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b2\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b4\u0010#¨\u00068"}, d2 = {"Lcom/anthropic/claude/api/account/UpdateAccountRequest;", "", "", "full_name", "display_name", "", "accept_document_ids", "Lcom/anthropic/claude/api/account/AccountSettings;", "settings", "", "age_is_verified", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/anthropic/claude/api/account/AccountSettings;Ljava/lang/Boolean;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/anthropic/claude/api/account/AccountSettings;Ljava/lang/Boolean;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/account/UpdateAccountRequest;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "()Lcom/anthropic/claude/api/account/AccountSettings;", "component5", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/anthropic/claude/api/account/AccountSettings;Ljava/lang/Boolean;)Lcom/anthropic/claude/api/account/UpdateAccountRequest;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFull_name", "getDisplay_name", "Ljava/util/List;", "getAccept_document_ids", "Lcom/anthropic/claude/api/account/AccountSettings;", "getSettings", "Ljava/lang/Boolean;", "getAge_is_verified", "Companion", "ohi", "phi", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class UpdateAccountRequest {
    public static final int $stable = 0;
    private final List<String> accept_document_ids;
    private final Boolean age_is_verified;
    private final String display_name;
    private final String full_name;
    private final AccountSettings settings;
    public static final phi Companion = new phi();
    private static final kw9[] $childSerializers = {null, null, yb5.w(w1a.F, new kdi(6)), null, null};

    public /* synthetic */ UpdateAccountRequest(int i, String str, String str2, List list, AccountSettings accountSettings, Boolean bool, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.full_name = null;
        } else {
            this.full_name = str;
        }
        if ((i & 2) == 0) {
            this.display_name = null;
        } else {
            this.display_name = str2;
        }
        if ((i & 4) == 0) {
            this.accept_document_ids = null;
        } else {
            this.accept_document_ids = list;
        }
        if ((i & 8) == 0) {
            this.settings = null;
        } else {
            this.settings = accountSettings;
        }
        if ((i & 16) == 0) {
            this.age_is_verified = null;
        } else {
            this.age_is_verified = bool;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(srg.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UpdateAccountRequest copy$default(UpdateAccountRequest updateAccountRequest, String str, String str2, List list, AccountSettings accountSettings, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = updateAccountRequest.full_name;
        }
        if ((i & 2) != 0) {
            str2 = updateAccountRequest.display_name;
        }
        if ((i & 4) != 0) {
            list = updateAccountRequest.accept_document_ids;
        }
        if ((i & 8) != 0) {
            accountSettings = updateAccountRequest.settings;
        }
        if ((i & 16) != 0) {
            bool = updateAccountRequest.age_is_verified;
        }
        Boolean bool2 = bool;
        List list2 = list;
        return updateAccountRequest.copy(str, str2, list2, accountSettings, bool2);
    }

    public static final /* synthetic */ void write$Self$api(UpdateAccountRequest self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        if (output.E(serialDesc) || self.full_name != null) {
            output.B(serialDesc, 0, srg.a, self.full_name);
        }
        if (output.E(serialDesc) || self.display_name != null) {
            output.B(serialDesc, 1, srg.a, self.display_name);
        }
        if (output.E(serialDesc) || self.accept_document_ids != null) {
            output.B(serialDesc, 2, (znf) kw9VarArr[2].getValue(), self.accept_document_ids);
        }
        if (output.E(serialDesc) || self.settings != null) {
            output.B(serialDesc, 3, l8.a, self.settings);
        }
        if (!output.E(serialDesc) && self.age_is_verified == null) {
            return;
        }
        output.B(serialDesc, 4, zt1.a, self.age_is_verified);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFull_name() {
        return this.full_name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDisplay_name() {
        return this.display_name;
    }

    public final List<String> component3() {
        return this.accept_document_ids;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final AccountSettings getSettings() {
        return this.settings;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getAge_is_verified() {
        return this.age_is_verified;
    }

    public final UpdateAccountRequest copy(String full_name, String display_name, List<String> accept_document_ids, AccountSettings settings, Boolean age_is_verified) {
        return new UpdateAccountRequest(full_name, display_name, accept_document_ids, settings, age_is_verified);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateAccountRequest)) {
            return false;
        }
        UpdateAccountRequest updateAccountRequest = (UpdateAccountRequest) other;
        return x44.r(this.full_name, updateAccountRequest.full_name) && x44.r(this.display_name, updateAccountRequest.display_name) && x44.r(this.accept_document_ids, updateAccountRequest.accept_document_ids) && x44.r(this.settings, updateAccountRequest.settings) && x44.r(this.age_is_verified, updateAccountRequest.age_is_verified);
    }

    public final List<String> getAccept_document_ids() {
        return this.accept_document_ids;
    }

    public final Boolean getAge_is_verified() {
        return this.age_is_verified;
    }

    public final String getDisplay_name() {
        return this.display_name;
    }

    public final String getFull_name() {
        return this.full_name;
    }

    public final AccountSettings getSettings() {
        return this.settings;
    }

    public int hashCode() {
        String str = this.full_name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.display_name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.accept_document_ids;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        AccountSettings accountSettings = this.settings;
        int iHashCode4 = (iHashCode3 + (accountSettings == null ? 0 : accountSettings.hashCode())) * 31;
        Boolean bool = this.age_is_verified;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        String str = this.full_name;
        String str2 = this.display_name;
        List<String> list = this.accept_document_ids;
        AccountSettings accountSettings = this.settings;
        Boolean bool = this.age_is_verified;
        StringBuilder sbR = kgh.r("UpdateAccountRequest(full_name=", str, ", display_name=", str2, ", accept_document_ids=");
        sbR.append(list);
        sbR.append(", settings=");
        sbR.append(accountSettings);
        sbR.append(", age_is_verified=");
        return qy1.h(sbR, bool, ")");
    }

    public UpdateAccountRequest() {
        this((String) null, (String) null, (List) null, (AccountSettings) null, (Boolean) null, 31, (mq5) null);
    }

    public UpdateAccountRequest(String str, String str2, List<String> list, AccountSettings accountSettings, Boolean bool) {
        this.full_name = str;
        this.display_name = str2;
        this.accept_document_ids = list;
        this.settings = accountSettings;
        this.age_is_verified = bool;
    }

    public /* synthetic */ UpdateAccountRequest(String str, String str2, List list, AccountSettings accountSettings, Boolean bool, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : accountSettings, (i & 16) != 0 ? null : bool);
    }
}
