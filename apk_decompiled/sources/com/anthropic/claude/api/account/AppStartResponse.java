package com.anthropic.claude.api.account;

import com.anthropic.claude.api.model.ModelSelectorConfig;
import com.anthropic.claude.api.model.ModelSelectorState;
import defpackage.f7a;
import defpackage.gid;
import defpackage.gvj;
import defpackage.j7;
import defpackage.k7;
import defpackage.kd5;
import defpackage.kw9;
import defpackage.lpb;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.pob;
import defpackage.sd8;
import defpackage.srg;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.xbb;
import defpackage.yb5;
import defpackage.yl0;
import defpackage.zl0;
import defpackage.znf;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 F2\u00020\u0001:\u0002GHBo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\r¢\u0006\u0004\b\u0012\u0010\u0013By\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\r\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0012\u0010\u0018J'\u0010!\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b&\u0010'J\u001e\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0018\u0010,\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0018\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b.\u0010-Jz\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b3\u00104J\u001a\u00107\u001a\u0002062\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b7\u00108R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00109\u001a\u0004\b:\u0010#R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010;\u001a\u0004\b<\u0010%R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010=\u001a\u0004\b>\u0010'R%\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010?\u001a\u0004\b@\u0010)R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010A\u001a\u0004\bB\u0010+R\u001f\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010C\u001a\u0004\bD\u0010-R\u001f\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0011\u0010C\u001a\u0004\bE\u0010-¨\u0006I"}, d2 = {"Lcom/anthropic/claude/api/account/AppStartResponse;", "", "Lcom/anthropic/claude/api/account/Account;", "account", "Lcom/anthropic/claude/api/account/MemoryMode;", "memory_mode", "Lcom/anthropic/claude/api/account/GrowthBookSchema;", "org_growthbook", "", "", "server_localizations", "Lcom/anthropic/claude/api/account/CurrentUserAccess;", "current_user_access", "", "Lcom/anthropic/claude/api/model/ModelSelectorState;", "model_selector_state", "Lcom/anthropic/claude/api/model/ModelSelectorConfig;", "model_selector_config", "<init>", "(Lcom/anthropic/claude/api/account/Account;Lcom/anthropic/claude/api/account/MemoryMode;Lcom/anthropic/claude/api/account/GrowthBookSchema;Ljava/util/Map;Lcom/anthropic/claude/api/account/CurrentUserAccess;Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/api/account/Account;Lcom/anthropic/claude/api/account/MemoryMode;Lcom/anthropic/claude/api/account/GrowthBookSchema;Ljava/util/Map;Lcom/anthropic/claude/api/account/CurrentUserAccess;Ljava/util/List;Ljava/util/List;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/account/AppStartResponse;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/api/account/Account;", "component2", "()Lcom/anthropic/claude/api/account/MemoryMode;", "component3", "()Lcom/anthropic/claude/api/account/GrowthBookSchema;", "component4", "()Ljava/util/Map;", "component5", "()Lcom/anthropic/claude/api/account/CurrentUserAccess;", "component6", "()Ljava/util/List;", "component7", "copy", "(Lcom/anthropic/claude/api/account/Account;Lcom/anthropic/claude/api/account/MemoryMode;Lcom/anthropic/claude/api/account/GrowthBookSchema;Ljava/util/Map;Lcom/anthropic/claude/api/account/CurrentUserAccess;Ljava/util/List;Ljava/util/List;)Lcom/anthropic/claude/api/account/AppStartResponse;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/api/account/Account;", "getAccount", "Lcom/anthropic/claude/api/account/MemoryMode;", "getMemory_mode", "Lcom/anthropic/claude/api/account/GrowthBookSchema;", "getOrg_growthbook", "Ljava/util/Map;", "getServer_localizations", "Lcom/anthropic/claude/api/account/CurrentUserAccess;", "getCurrent_user_access", "Ljava/util/List;", "getModel_selector_state", "getModel_selector_config", "Companion", "yl0", "zl0", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class AppStartResponse {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final zl0 Companion = new zl0();
    private final Account account;
    private final CurrentUserAccess current_user_access;
    private final MemoryMode memory_mode;
    private final List<ModelSelectorConfig> model_selector_config;
    private final List<ModelSelectorState> model_selector_state;
    private final GrowthBookSchema org_growthbook;
    private final Map<String, String> server_localizations;

    static {
        j7 j7Var = new j7(22);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{null, null, null, yb5.w(w1aVar, j7Var), null, yb5.w(w1aVar, new j7(23)), yb5.w(w1aVar, new j7(24))};
    }

    public /* synthetic */ AppStartResponse(int i, Account account, MemoryMode memoryMode, GrowthBookSchema growthBookSchema, Map map, CurrentUserAccess currentUserAccess, List list, List list2, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, yl0.a.getDescriptor());
            throw null;
        }
        this.account = account;
        if ((i & 2) == 0) {
            this.memory_mode = null;
        } else {
            this.memory_mode = memoryMode;
        }
        if ((i & 4) == 0) {
            this.org_growthbook = null;
        } else {
            this.org_growthbook = growthBookSchema;
        }
        if ((i & 8) == 0) {
            this.server_localizations = null;
        } else {
            this.server_localizations = map;
        }
        if ((i & 16) == 0) {
            this.current_user_access = null;
        } else {
            this.current_user_access = currentUserAccess;
        }
        if ((i & 32) == 0) {
            this.model_selector_state = null;
        } else {
            this.model_selector_state = list;
        }
        if ((i & 64) == 0) {
            this.model_selector_config = null;
        } else {
            this.model_selector_config = list2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        srg srgVar = srg.a;
        return new f7a(srgVar, srgVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new uo0(lpb.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new uo0(pob.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AppStartResponse copy$default(AppStartResponse appStartResponse, Account account, MemoryMode memoryMode, GrowthBookSchema growthBookSchema, Map map, CurrentUserAccess currentUserAccess, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            account = appStartResponse.account;
        }
        if ((i & 2) != 0) {
            memoryMode = appStartResponse.memory_mode;
        }
        if ((i & 4) != 0) {
            growthBookSchema = appStartResponse.org_growthbook;
        }
        if ((i & 8) != 0) {
            map = appStartResponse.server_localizations;
        }
        if ((i & 16) != 0) {
            currentUserAccess = appStartResponse.current_user_access;
        }
        if ((i & 32) != 0) {
            list = appStartResponse.model_selector_state;
        }
        if ((i & 64) != 0) {
            list2 = appStartResponse.model_selector_config;
        }
        List list3 = list;
        List list4 = list2;
        CurrentUserAccess currentUserAccess2 = currentUserAccess;
        GrowthBookSchema growthBookSchema2 = growthBookSchema;
        return appStartResponse.copy(account, memoryMode, growthBookSchema2, map, currentUserAccess2, list3, list4);
    }

    public static final /* synthetic */ void write$Self$api(AppStartResponse self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.r(serialDesc, 0, k7.a, self.account);
        if (output.E(serialDesc) || self.memory_mode != null) {
            output.B(serialDesc, 1, xbb.d, self.memory_mode);
        }
        if (output.E(serialDesc) || self.org_growthbook != null) {
            output.B(serialDesc, 2, sd8.a, self.org_growthbook);
        }
        if (output.E(serialDesc) || self.server_localizations != null) {
            output.B(serialDesc, 3, (znf) kw9VarArr[3].getValue(), self.server_localizations);
        }
        if (output.E(serialDesc) || self.current_user_access != null) {
            output.B(serialDesc, 4, kd5.a, self.current_user_access);
        }
        if (output.E(serialDesc) || self.model_selector_state != null) {
            output.B(serialDesc, 5, (znf) kw9VarArr[5].getValue(), self.model_selector_state);
        }
        if (!output.E(serialDesc) && self.model_selector_config == null) {
            return;
        }
        output.B(serialDesc, 6, (znf) kw9VarArr[6].getValue(), self.model_selector_config);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Account getAccount() {
        return this.account;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final MemoryMode getMemory_mode() {
        return this.memory_mode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final GrowthBookSchema getOrg_growthbook() {
        return this.org_growthbook;
    }

    public final Map<String, String> component4() {
        return this.server_localizations;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final CurrentUserAccess getCurrent_user_access() {
        return this.current_user_access;
    }

    public final List<ModelSelectorState> component6() {
        return this.model_selector_state;
    }

    public final List<ModelSelectorConfig> component7() {
        return this.model_selector_config;
    }

    public final AppStartResponse copy(Account account, MemoryMode memory_mode, GrowthBookSchema org_growthbook, Map<String, String> server_localizations, CurrentUserAccess current_user_access, List<ModelSelectorState> model_selector_state, List<ModelSelectorConfig> model_selector_config) {
        account.getClass();
        return new AppStartResponse(account, memory_mode, org_growthbook, server_localizations, current_user_access, model_selector_state, model_selector_config);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppStartResponse)) {
            return false;
        }
        AppStartResponse appStartResponse = (AppStartResponse) other;
        return x44.r(this.account, appStartResponse.account) && this.memory_mode == appStartResponse.memory_mode && x44.r(this.org_growthbook, appStartResponse.org_growthbook) && x44.r(this.server_localizations, appStartResponse.server_localizations) && x44.r(this.current_user_access, appStartResponse.current_user_access) && x44.r(this.model_selector_state, appStartResponse.model_selector_state) && x44.r(this.model_selector_config, appStartResponse.model_selector_config);
    }

    public final Account getAccount() {
        return this.account;
    }

    public final CurrentUserAccess getCurrent_user_access() {
        return this.current_user_access;
    }

    public final MemoryMode getMemory_mode() {
        return this.memory_mode;
    }

    public final List<ModelSelectorConfig> getModel_selector_config() {
        return this.model_selector_config;
    }

    public final List<ModelSelectorState> getModel_selector_state() {
        return this.model_selector_state;
    }

    public final GrowthBookSchema getOrg_growthbook() {
        return this.org_growthbook;
    }

    public final Map<String, String> getServer_localizations() {
        return this.server_localizations;
    }

    public int hashCode() {
        int iHashCode = this.account.hashCode() * 31;
        MemoryMode memoryMode = this.memory_mode;
        int iHashCode2 = (iHashCode + (memoryMode == null ? 0 : memoryMode.hashCode())) * 31;
        GrowthBookSchema growthBookSchema = this.org_growthbook;
        int iHashCode3 = (iHashCode2 + (growthBookSchema == null ? 0 : growthBookSchema.hashCode())) * 31;
        Map<String, String> map = this.server_localizations;
        int iHashCode4 = (iHashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        CurrentUserAccess currentUserAccess = this.current_user_access;
        int iHashCode5 = (iHashCode4 + (currentUserAccess == null ? 0 : currentUserAccess.hashCode())) * 31;
        List<ModelSelectorState> list = this.model_selector_state;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        List<ModelSelectorConfig> list2 = this.model_selector_config;
        return iHashCode6 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        Account account = this.account;
        MemoryMode memoryMode = this.memory_mode;
        GrowthBookSchema growthBookSchema = this.org_growthbook;
        Map<String, String> map = this.server_localizations;
        CurrentUserAccess currentUserAccess = this.current_user_access;
        List<ModelSelectorState> list = this.model_selector_state;
        List<ModelSelectorConfig> list2 = this.model_selector_config;
        StringBuilder sb = new StringBuilder("AppStartResponse(account=");
        sb.append(account);
        sb.append(", memory_mode=");
        sb.append(memoryMode);
        sb.append(", org_growthbook=");
        sb.append(growthBookSchema);
        sb.append(", server_localizations=");
        sb.append(map);
        sb.append(", current_user_access=");
        sb.append(currentUserAccess);
        sb.append(", model_selector_state=");
        sb.append(list);
        sb.append(", model_selector_config=");
        return gid.q(sb, list2, ")");
    }

    public AppStartResponse(Account account, MemoryMode memoryMode, GrowthBookSchema growthBookSchema, Map<String, String> map, CurrentUserAccess currentUserAccess, List<ModelSelectorState> list, List<ModelSelectorConfig> list2) {
        account.getClass();
        this.account = account;
        this.memory_mode = memoryMode;
        this.org_growthbook = growthBookSchema;
        this.server_localizations = map;
        this.current_user_access = currentUserAccess;
        this.model_selector_state = list;
        this.model_selector_config = list2;
    }

    public /* synthetic */ AppStartResponse(Account account, MemoryMode memoryMode, GrowthBookSchema growthBookSchema, Map map, CurrentUserAccess currentUserAccess, List list, List list2, int i, mq5 mq5Var) {
        this(account, (i & 2) != 0 ? null : memoryMode, (i & 4) != 0 ? null : growthBookSchema, (i & 8) != 0 ? null : map, (i & 16) != 0 ? null : currentUserAccess, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : list2);
    }
}
