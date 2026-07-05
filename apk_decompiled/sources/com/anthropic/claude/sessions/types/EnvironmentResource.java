package com.anthropic.claude.sessions.types;

import com.anthropic.claude.api.login.VerifyResponse;
import defpackage.ar6;
import defpackage.c69;
import defpackage.ex1;
import defpackage.fc6;
import defpackage.g69;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.uq6;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import defpackage.zq6;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 B2\u00020\u0001:\u0002CDBG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010Ba\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0010\u0010$\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b*\u0010+JZ\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b.\u0010\"J\u0010\u0010/\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b3\u00104R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b8\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00107\u001a\u0004\b9\u0010\"R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010:\u001a\u0004\b;\u0010%R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010<\u001a\u0004\b=\u0010'R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010>\u001a\u0004\b?\u0010)R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010@\u001a\u0004\bA\u0010+¨\u0006E"}, d2 = {"Lcom/anthropic/claude/sessions/types/EnvironmentResource;", "", "Lcom/anthropic/claude/sessions/types/EnvironmentKind;", VerifyResponse.AuthenticationState.DISCRIMINATOR, "", "environment_id", "name", "Lc69;", "created_at", "Lcom/anthropic/claude/sessions/types/EnvironmentState;", "state", "Lcom/anthropic/claude/sessions/types/EnvironmentConfiguration;", "config", "Lcom/anthropic/claude/sessions/types/BridgeEnvironmentInfo;", "bridge_info", "<init>", "(Lcom/anthropic/claude/sessions/types/EnvironmentKind;Ljava/lang/String;Ljava/lang/String;Lc69;Lcom/anthropic/claude/sessions/types/EnvironmentState;Lcom/anthropic/claude/sessions/types/EnvironmentConfiguration;Lcom/anthropic/claude/sessions/types/BridgeEnvironmentInfo;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/sessions/types/EnvironmentKind;Ljava/lang/String;Ljava/lang/String;Lc69;Lcom/anthropic/claude/sessions/types/EnvironmentState;Lcom/anthropic/claude/sessions/types/EnvironmentConfiguration;Lcom/anthropic/claude/sessions/types/BridgeEnvironmentInfo;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/EnvironmentResource;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/sessions/types/EnvironmentKind;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lc69;", "component5", "()Lcom/anthropic/claude/sessions/types/EnvironmentState;", "component6", "()Lcom/anthropic/claude/sessions/types/EnvironmentConfiguration;", "component7", "()Lcom/anthropic/claude/sessions/types/BridgeEnvironmentInfo;", "copy", "(Lcom/anthropic/claude/sessions/types/EnvironmentKind;Ljava/lang/String;Ljava/lang/String;Lc69;Lcom/anthropic/claude/sessions/types/EnvironmentState;Lcom/anthropic/claude/sessions/types/EnvironmentConfiguration;Lcom/anthropic/claude/sessions/types/BridgeEnvironmentInfo;)Lcom/anthropic/claude/sessions/types/EnvironmentResource;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/sessions/types/EnvironmentKind;", "getKind", "Ljava/lang/String;", "getEnvironment_id", "getName", "Lc69;", "getCreated_at", "Lcom/anthropic/claude/sessions/types/EnvironmentState;", "getState", "Lcom/anthropic/claude/sessions/types/EnvironmentConfiguration;", "getConfig", "Lcom/anthropic/claude/sessions/types/BridgeEnvironmentInfo;", "getBridge_info", "Companion", "zq6", "ar6", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class EnvironmentResource {
    private static final kw9[] $childSerializers;
    public static final ar6 Companion = new ar6();
    private final BridgeEnvironmentInfo bridge_info;
    private final EnvironmentConfiguration config;
    private final c69 created_at;
    private final String environment_id;
    private final EnvironmentKind kind;
    private final String name;
    private final EnvironmentState state;

    static {
        fc6 fc6Var = new fc6(24);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{null, null, null, null, yb5.w(w1aVar, fc6Var), yb5.w(w1aVar, new fc6(25)), null};
    }

    public /* synthetic */ EnvironmentResource(int i, EnvironmentKind environmentKind, String str, String str2, c69 c69Var, EnvironmentState environmentState, EnvironmentConfiguration environmentConfiguration, BridgeEnvironmentInfo bridgeEnvironmentInfo, vnf vnfVar) {
        if (31 != (i & 31)) {
            gvj.f(i, 31, zq6.a.getDescriptor());
            throw null;
        }
        this.kind = environmentKind;
        this.environment_id = str;
        this.name = str2;
        this.created_at = c69Var;
        this.state = environmentState;
        if ((i & 32) == 0) {
            this.config = null;
        } else {
            this.config = environmentConfiguration;
        }
        if ((i & 64) == 0) {
            this.bridge_info = null;
        } else {
            this.bridge_info = bridgeEnvironmentInfo;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return EnvironmentState.Companion.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return EnvironmentConfiguration.Companion.serializer();
    }

    public static /* synthetic */ EnvironmentResource copy$default(EnvironmentResource environmentResource, EnvironmentKind environmentKind, String str, String str2, c69 c69Var, EnvironmentState environmentState, EnvironmentConfiguration environmentConfiguration, BridgeEnvironmentInfo bridgeEnvironmentInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            environmentKind = environmentResource.kind;
        }
        if ((i & 2) != 0) {
            str = environmentResource.environment_id;
        }
        if ((i & 4) != 0) {
            str2 = environmentResource.name;
        }
        if ((i & 8) != 0) {
            c69Var = environmentResource.created_at;
        }
        if ((i & 16) != 0) {
            environmentState = environmentResource.state;
        }
        if ((i & 32) != 0) {
            environmentConfiguration = environmentResource.config;
        }
        if ((i & 64) != 0) {
            bridgeEnvironmentInfo = environmentResource.bridge_info;
        }
        EnvironmentConfiguration environmentConfiguration2 = environmentConfiguration;
        BridgeEnvironmentInfo bridgeEnvironmentInfo2 = bridgeEnvironmentInfo;
        EnvironmentState environmentState2 = environmentState;
        String str3 = str2;
        return environmentResource.copy(environmentKind, str, str3, c69Var, environmentState2, environmentConfiguration2, bridgeEnvironmentInfo2);
    }

    public static final /* synthetic */ void write$Self$sessions(EnvironmentResource self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.r(serialDesc, 0, uq6.a, self.kind);
        output.q(serialDesc, 1, self.environment_id);
        output.q(serialDesc, 2, self.name);
        output.r(serialDesc, 3, g69.a, self.created_at);
        output.r(serialDesc, 4, (znf) kw9VarArr[4].getValue(), self.state);
        if (output.E(serialDesc) || self.config != null) {
            output.B(serialDesc, 5, (znf) kw9VarArr[5].getValue(), self.config);
        }
        if (!output.E(serialDesc) && self.bridge_info == null) {
            return;
        }
        output.B(serialDesc, 6, ex1.a, self.bridge_info);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final EnvironmentKind getKind() {
        return this.kind;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEnvironment_id() {
        return this.environment_id;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final c69 getCreated_at() {
        return this.created_at;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final EnvironmentState getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final EnvironmentConfiguration getConfig() {
        return this.config;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BridgeEnvironmentInfo getBridge_info() {
        return this.bridge_info;
    }

    public final EnvironmentResource copy(EnvironmentKind kind, String environment_id, String name, c69 created_at, EnvironmentState state, EnvironmentConfiguration config, BridgeEnvironmentInfo bridge_info) {
        kind.getClass();
        environment_id.getClass();
        name.getClass();
        created_at.getClass();
        state.getClass();
        return new EnvironmentResource(kind, environment_id, name, created_at, state, config, bridge_info);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EnvironmentResource)) {
            return false;
        }
        EnvironmentResource environmentResource = (EnvironmentResource) other;
        return this.kind == environmentResource.kind && x44.r(this.environment_id, environmentResource.environment_id) && x44.r(this.name, environmentResource.name) && x44.r(this.created_at, environmentResource.created_at) && this.state == environmentResource.state && x44.r(this.config, environmentResource.config) && x44.r(this.bridge_info, environmentResource.bridge_info);
    }

    public final BridgeEnvironmentInfo getBridge_info() {
        return this.bridge_info;
    }

    public final EnvironmentConfiguration getConfig() {
        return this.config;
    }

    public final c69 getCreated_at() {
        return this.created_at;
    }

    public final String getEnvironment_id() {
        return this.environment_id;
    }

    public final EnvironmentKind getKind() {
        return this.kind;
    }

    public final String getName() {
        return this.name;
    }

    public final EnvironmentState getState() {
        return this.state;
    }

    public int hashCode() {
        int iHashCode = (this.state.hashCode() + ((this.created_at.hashCode() + kgh.l(kgh.l(this.kind.hashCode() * 31, 31, this.environment_id), 31, this.name)) * 31)) * 31;
        EnvironmentConfiguration environmentConfiguration = this.config;
        int iHashCode2 = (iHashCode + (environmentConfiguration == null ? 0 : environmentConfiguration.hashCode())) * 31;
        BridgeEnvironmentInfo bridgeEnvironmentInfo = this.bridge_info;
        return iHashCode2 + (bridgeEnvironmentInfo != null ? bridgeEnvironmentInfo.hashCode() : 0);
    }

    public String toString() {
        return "EnvironmentResource(kind=" + this.kind + ", environment_id=" + this.environment_id + ", name=" + this.name + ", created_at=" + this.created_at + ", state=" + this.state + ", config=" + this.config + ", bridge_info=" + this.bridge_info + ")";
    }

    public EnvironmentResource(EnvironmentKind environmentKind, String str, String str2, c69 c69Var, EnvironmentState environmentState, EnvironmentConfiguration environmentConfiguration, BridgeEnvironmentInfo bridgeEnvironmentInfo) {
        environmentKind.getClass();
        str.getClass();
        str2.getClass();
        c69Var.getClass();
        environmentState.getClass();
        this.kind = environmentKind;
        this.environment_id = str;
        this.name = str2;
        this.created_at = c69Var;
        this.state = environmentState;
        this.config = environmentConfiguration;
        this.bridge_info = bridgeEnvironmentInfo;
    }

    public /* synthetic */ EnvironmentResource(EnvironmentKind environmentKind, String str, String str2, c69 c69Var, EnvironmentState environmentState, EnvironmentConfiguration environmentConfiguration, BridgeEnvironmentInfo bridgeEnvironmentInfo, int i, mq5 mq5Var) {
        this(environmentKind, str, str2, c69Var, environmentState, (i & 32) != 0 ? null : environmentConfiguration, (i & 64) != 0 ? null : bridgeEnvironmentInfo);
    }
}
