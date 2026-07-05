package com.anthropic.claude.conway.protocol;

import defpackage.gi3;
import defpackage.gvj;
import defpackage.jp3;
import defpackage.kgh;
import defpackage.kp3;
import defpackage.kw9;
import defpackage.lm6;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000234B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tBI\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019JB\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\u0019R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010'\u0012\u0004\b,\u0010*\u001a\u0004\b+\u0010\u0019R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010-\u0012\u0004\b/\u0010*\u001a\u0004\b.\u0010\u001cR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010'\u0012\u0004\b1\u0010*\u001a\u0004\b0\u0010\u0019¨\u00065"}, d2 = {"Lcom/anthropic/claude/conway/protocol/ClientRegistrationResponse;", "", "", "clientId", "sessionId", "", "registeredTools", "welcomeMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$conway", "(Lcom/anthropic/claude/conway/protocol/ClientRegistrationResponse;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/anthropic/claude/conway/protocol/ClientRegistrationResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getClientId", "getClientId$annotations", "()V", "getSessionId", "getSessionId$annotations", "Ljava/util/List;", "getRegisteredTools", "getRegisteredTools$annotations", "getWelcomeMessage", "getWelcomeMessage$annotations", "Companion", "jp3", "kp3", "conway"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ClientRegistrationResponse {
    public static final int $stable = 8;
    private final String clientId;
    private final List<String> registeredTools;
    private final String sessionId;
    private final String welcomeMessage;
    public static final kp3 Companion = new kp3();
    private static final kw9[] $childSerializers = {null, null, yb5.w(w1a.F, new gi3(10)), null};

    public /* synthetic */ ClientRegistrationResponse(int i, String str, String str2, List list, String str3, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, jp3.a.getDescriptor());
            throw null;
        }
        this.clientId = str;
        if ((i & 2) == 0) {
            this.sessionId = null;
        } else {
            this.sessionId = str2;
        }
        if ((i & 4) == 0) {
            this.registeredTools = lm6.E;
        } else {
            this.registeredTools = list;
        }
        if ((i & 8) == 0) {
            this.welcomeMessage = null;
        } else {
            this.welcomeMessage = str3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(srg.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ClientRegistrationResponse copy$default(ClientRegistrationResponse clientRegistrationResponse, String str, String str2, List list, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = clientRegistrationResponse.clientId;
        }
        if ((i & 2) != 0) {
            str2 = clientRegistrationResponse.sessionId;
        }
        if ((i & 4) != 0) {
            list = clientRegistrationResponse.registeredTools;
        }
        if ((i & 8) != 0) {
            str3 = clientRegistrationResponse.welcomeMessage;
        }
        return clientRegistrationResponse.copy(str, str2, list, str3);
    }

    public static /* synthetic */ void getClientId$annotations() {
    }

    public static /* synthetic */ void getRegisteredTools$annotations() {
    }

    public static /* synthetic */ void getSessionId$annotations() {
    }

    public static /* synthetic */ void getWelcomeMessage$annotations() {
    }

    public static final /* synthetic */ void write$Self$conway(ClientRegistrationResponse self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.clientId);
        if (output.E(serialDesc) || self.sessionId != null) {
            output.B(serialDesc, 1, srg.a, self.sessionId);
        }
        if (output.E(serialDesc) || !x44.r(self.registeredTools, lm6.E)) {
            output.r(serialDesc, 2, (znf) kw9VarArr[2].getValue(), self.registeredTools);
        }
        if (!output.E(serialDesc) && self.welcomeMessage == null) {
            return;
        }
        output.B(serialDesc, 3, srg.a, self.welcomeMessage);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getClientId() {
        return this.clientId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    public final List<String> component3() {
        return this.registeredTools;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getWelcomeMessage() {
        return this.welcomeMessage;
    }

    public final ClientRegistrationResponse copy(String clientId, String sessionId, List<String> registeredTools, String welcomeMessage) {
        clientId.getClass();
        registeredTools.getClass();
        return new ClientRegistrationResponse(clientId, sessionId, registeredTools, welcomeMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClientRegistrationResponse)) {
            return false;
        }
        ClientRegistrationResponse clientRegistrationResponse = (ClientRegistrationResponse) other;
        return x44.r(this.clientId, clientRegistrationResponse.clientId) && x44.r(this.sessionId, clientRegistrationResponse.sessionId) && x44.r(this.registeredTools, clientRegistrationResponse.registeredTools) && x44.r(this.welcomeMessage, clientRegistrationResponse.welcomeMessage);
    }

    public final String getClientId() {
        return this.clientId;
    }

    public final List<String> getRegisteredTools() {
        return this.registeredTools;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final String getWelcomeMessage() {
        return this.welcomeMessage;
    }

    public int hashCode() {
        int iHashCode = this.clientId.hashCode() * 31;
        String str = this.sessionId;
        int iM = kgh.m((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.registeredTools);
        String str2 = this.welcomeMessage;
        return iM + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.clientId;
        String str2 = this.sessionId;
        List<String> list = this.registeredTools;
        String str3 = this.welcomeMessage;
        StringBuilder sbR = kgh.r("ClientRegistrationResponse(clientId=", str, ", sessionId=", str2, ", registeredTools=");
        sbR.append(list);
        sbR.append(", welcomeMessage=");
        sbR.append(str3);
        sbR.append(")");
        return sbR.toString();
    }

    public ClientRegistrationResponse(String str, String str2, List<String> list, String str3) {
        str.getClass();
        list.getClass();
        this.clientId = str;
        this.sessionId = str2;
        this.registeredTools = list;
        this.welcomeMessage = str3;
    }

    public /* synthetic */ ClientRegistrationResponse(String str, String str2, List list, String str3, int i, mq5 mq5Var) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? lm6.E : list, (i & 8) != 0 ? null : str3);
    }
}
