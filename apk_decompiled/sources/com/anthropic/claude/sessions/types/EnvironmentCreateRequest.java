package com.anthropic.claude.sessions.types;

import com.anthropic.claude.api.login.VerifyResponse;
import defpackage.fc6;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.qq6;
import defpackage.rq6;
import defpackage.uq6;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000212B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ:\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u001f¨\u00063"}, d2 = {"Lcom/anthropic/claude/sessions/types/EnvironmentCreateRequest;", "", "", "name", "Lcom/anthropic/claude/sessions/types/EnvironmentKind;", VerifyResponse.AuthenticationState.DISCRIMINATOR, "description", "Lcom/anthropic/claude/sessions/types/EnvironmentConfiguration;", "config", "<init>", "(Ljava/lang/String;Lcom/anthropic/claude/sessions/types/EnvironmentKind;Ljava/lang/String;Lcom/anthropic/claude/sessions/types/EnvironmentConfiguration;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/anthropic/claude/sessions/types/EnvironmentKind;Ljava/lang/String;Lcom/anthropic/claude/sessions/types/EnvironmentConfiguration;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/EnvironmentCreateRequest;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/anthropic/claude/sessions/types/EnvironmentKind;", "component3", "component4", "()Lcom/anthropic/claude/sessions/types/EnvironmentConfiguration;", "copy", "(Ljava/lang/String;Lcom/anthropic/claude/sessions/types/EnvironmentKind;Ljava/lang/String;Lcom/anthropic/claude/sessions/types/EnvironmentConfiguration;)Lcom/anthropic/claude/sessions/types/EnvironmentCreateRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "Lcom/anthropic/claude/sessions/types/EnvironmentKind;", "getKind", "getDescription", "Lcom/anthropic/claude/sessions/types/EnvironmentConfiguration;", "getConfig", "Companion", "qq6", "rq6", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class EnvironmentCreateRequest {
    private final EnvironmentConfiguration config;
    private final String description;
    private final EnvironmentKind kind;
    private final String name;
    public static final rq6 Companion = new rq6();
    private static final kw9[] $childSerializers = {null, null, null, yb5.w(w1a.F, new fc6(21))};

    public /* synthetic */ EnvironmentCreateRequest(int i, String str, EnvironmentKind environmentKind, String str2, EnvironmentConfiguration environmentConfiguration, vnf vnfVar) {
        if (7 != (i & 7)) {
            gvj.f(i, 7, qq6.a.getDescriptor());
            throw null;
        }
        this.name = str;
        this.kind = environmentKind;
        this.description = str2;
        if ((i & 8) == 0) {
            this.config = null;
        } else {
            this.config = environmentConfiguration;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return EnvironmentConfiguration.Companion.serializer();
    }

    public static /* synthetic */ EnvironmentCreateRequest copy$default(EnvironmentCreateRequest environmentCreateRequest, String str, EnvironmentKind environmentKind, String str2, EnvironmentConfiguration environmentConfiguration, int i, Object obj) {
        if ((i & 1) != 0) {
            str = environmentCreateRequest.name;
        }
        if ((i & 2) != 0) {
            environmentKind = environmentCreateRequest.kind;
        }
        if ((i & 4) != 0) {
            str2 = environmentCreateRequest.description;
        }
        if ((i & 8) != 0) {
            environmentConfiguration = environmentCreateRequest.config;
        }
        return environmentCreateRequest.copy(str, environmentKind, str2, environmentConfiguration);
    }

    public static final /* synthetic */ void write$Self$sessions(EnvironmentCreateRequest self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.name);
        output.r(serialDesc, 1, uq6.a, self.kind);
        output.q(serialDesc, 2, self.description);
        if (!output.E(serialDesc) && self.config == null) {
            return;
        }
        output.B(serialDesc, 3, (znf) kw9VarArr[3].getValue(), self.config);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final EnvironmentKind getKind() {
        return this.kind;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final EnvironmentConfiguration getConfig() {
        return this.config;
    }

    public final EnvironmentCreateRequest copy(String name, EnvironmentKind kind, String description, EnvironmentConfiguration config) {
        name.getClass();
        kind.getClass();
        description.getClass();
        return new EnvironmentCreateRequest(name, kind, description, config);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EnvironmentCreateRequest)) {
            return false;
        }
        EnvironmentCreateRequest environmentCreateRequest = (EnvironmentCreateRequest) other;
        return x44.r(this.name, environmentCreateRequest.name) && this.kind == environmentCreateRequest.kind && x44.r(this.description, environmentCreateRequest.description) && x44.r(this.config, environmentCreateRequest.config);
    }

    public final EnvironmentConfiguration getConfig() {
        return this.config;
    }

    public final String getDescription() {
        return this.description;
    }

    public final EnvironmentKind getKind() {
        return this.kind;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int iL = kgh.l((this.kind.hashCode() + (this.name.hashCode() * 31)) * 31, 31, this.description);
        EnvironmentConfiguration environmentConfiguration = this.config;
        return iL + (environmentConfiguration == null ? 0 : environmentConfiguration.hashCode());
    }

    public String toString() {
        return "EnvironmentCreateRequest(name=" + this.name + ", kind=" + this.kind + ", description=" + this.description + ", config=" + this.config + ")";
    }

    public EnvironmentCreateRequest(String str, EnvironmentKind environmentKind, String str2, EnvironmentConfiguration environmentConfiguration) {
        str.getClass();
        environmentKind.getClass();
        str2.getClass();
        this.name = str;
        this.kind = environmentKind;
        this.description = str2;
        this.config = environmentConfiguration;
    }

    public /* synthetic */ EnvironmentCreateRequest(String str, EnvironmentKind environmentKind, String str2, EnvironmentConfiguration environmentConfiguration, int i, mq5 mq5Var) {
        this(str, environmentKind, str2, (i & 8) != 0 ? null : environmentConfiguration);
    }
}
