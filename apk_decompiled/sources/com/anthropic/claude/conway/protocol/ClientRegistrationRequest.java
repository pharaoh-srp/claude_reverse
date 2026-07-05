package com.anthropic.claude.conway.protocol;

import defpackage.gi3;
import defpackage.gvj;
import defpackage.hp3;
import defpackage.ip3;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.lm6;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.uh9;
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
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;<BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fB]\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJX\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001cJ\u0010\u0010&\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010,\u0012\u0004\b.\u0010/\u001a\u0004\b-\u0010\u001cR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010,\u0012\u0004\b1\u0010/\u001a\u0004\b0\u0010\u001cR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010,\u0012\u0004\b3\u0010/\u001a\u0004\b2\u0010\u001cR \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010,\u0012\u0004\b5\u0010/\u001a\u0004\b4\u0010\u001cR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b7\u0010!R\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010,\u0012\u0004\b9\u0010/\u001a\u0004\b8\u0010\u001c¨\u0006="}, d2 = {"Lcom/anthropic/claude/conway/protocol/ClientRegistrationRequest;", "", "", "clientName", "clientId", "hostId", "clientDescription", "", "Lkotlinx/serialization/json/JsonObject;", "tools", "welcomeMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$conway", "(Lcom/anthropic/claude/conway/protocol/ClientRegistrationRequest;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/util/List;", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/anthropic/claude/conway/protocol/ClientRegistrationRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getClientName", "getClientName$annotations", "()V", "getClientId", "getClientId$annotations", "getHostId", "getHostId$annotations", "getClientDescription", "getClientDescription$annotations", "Ljava/util/List;", "getTools", "getWelcomeMessage", "getWelcomeMessage$annotations", "Companion", "hp3", "ip3", "conway"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ClientRegistrationRequest {
    public static final int $stable = 8;
    private final String clientDescription;
    private final String clientId;
    private final String clientName;
    private final String hostId;
    private final List<JsonObject> tools;
    private final String welcomeMessage;
    public static final ip3 Companion = new ip3();
    private static final kw9[] $childSerializers = {null, null, null, null, yb5.w(w1a.F, new gi3(9)), null};

    public /* synthetic */ ClientRegistrationRequest(int i, String str, String str2, String str3, String str4, List list, String str5, vnf vnfVar) {
        if (9 != (i & 9)) {
            gvj.f(i, 9, hp3.a.getDescriptor());
            throw null;
        }
        this.clientName = str;
        if ((i & 2) == 0) {
            this.clientId = null;
        } else {
            this.clientId = str2;
        }
        if ((i & 4) == 0) {
            this.hostId = null;
        } else {
            this.hostId = str3;
        }
        this.clientDescription = str4;
        if ((i & 16) == 0) {
            this.tools = lm6.E;
        } else {
            this.tools = list;
        }
        if ((i & 32) == 0) {
            this.welcomeMessage = null;
        } else {
            this.welcomeMessage = str5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(uh9.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ClientRegistrationRequest copy$default(ClientRegistrationRequest clientRegistrationRequest, String str, String str2, String str3, String str4, List list, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = clientRegistrationRequest.clientName;
        }
        if ((i & 2) != 0) {
            str2 = clientRegistrationRequest.clientId;
        }
        if ((i & 4) != 0) {
            str3 = clientRegistrationRequest.hostId;
        }
        if ((i & 8) != 0) {
            str4 = clientRegistrationRequest.clientDescription;
        }
        if ((i & 16) != 0) {
            list = clientRegistrationRequest.tools;
        }
        if ((i & 32) != 0) {
            str5 = clientRegistrationRequest.welcomeMessage;
        }
        List list2 = list;
        String str6 = str5;
        return clientRegistrationRequest.copy(str, str2, str3, str4, list2, str6);
    }

    public static /* synthetic */ void getClientDescription$annotations() {
    }

    public static /* synthetic */ void getClientId$annotations() {
    }

    public static /* synthetic */ void getClientName$annotations() {
    }

    public static /* synthetic */ void getHostId$annotations() {
    }

    public static /* synthetic */ void getWelcomeMessage$annotations() {
    }

    public static final /* synthetic */ void write$Self$conway(ClientRegistrationRequest self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.clientName);
        if (output.E(serialDesc) || self.clientId != null) {
            output.B(serialDesc, 1, srg.a, self.clientId);
        }
        if (output.E(serialDesc) || self.hostId != null) {
            output.B(serialDesc, 2, srg.a, self.hostId);
        }
        output.q(serialDesc, 3, self.clientDescription);
        if (output.E(serialDesc) || !x44.r(self.tools, lm6.E)) {
            output.r(serialDesc, 4, (znf) kw9VarArr[4].getValue(), self.tools);
        }
        if (!output.E(serialDesc) && self.welcomeMessage == null) {
            return;
        }
        output.B(serialDesc, 5, srg.a, self.welcomeMessage);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getClientName() {
        return this.clientName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getClientId() {
        return this.clientId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getHostId() {
        return this.hostId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getClientDescription() {
        return this.clientDescription;
    }

    public final List<JsonObject> component5() {
        return this.tools;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getWelcomeMessage() {
        return this.welcomeMessage;
    }

    public final ClientRegistrationRequest copy(String clientName, String clientId, String hostId, String clientDescription, List<JsonObject> tools, String welcomeMessage) {
        clientName.getClass();
        clientDescription.getClass();
        tools.getClass();
        return new ClientRegistrationRequest(clientName, clientId, hostId, clientDescription, tools, welcomeMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClientRegistrationRequest)) {
            return false;
        }
        ClientRegistrationRequest clientRegistrationRequest = (ClientRegistrationRequest) other;
        return x44.r(this.clientName, clientRegistrationRequest.clientName) && x44.r(this.clientId, clientRegistrationRequest.clientId) && x44.r(this.hostId, clientRegistrationRequest.hostId) && x44.r(this.clientDescription, clientRegistrationRequest.clientDescription) && x44.r(this.tools, clientRegistrationRequest.tools) && x44.r(this.welcomeMessage, clientRegistrationRequest.welcomeMessage);
    }

    public final String getClientDescription() {
        return this.clientDescription;
    }

    public final String getClientId() {
        return this.clientId;
    }

    public final String getClientName() {
        return this.clientName;
    }

    public final String getHostId() {
        return this.hostId;
    }

    public final List<JsonObject> getTools() {
        return this.tools;
    }

    public final String getWelcomeMessage() {
        return this.welcomeMessage;
    }

    public int hashCode() {
        int iHashCode = this.clientName.hashCode() * 31;
        String str = this.clientId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.hostId;
        int iM = kgh.m(kgh.l((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.clientDescription), 31, this.tools);
        String str3 = this.welcomeMessage;
        return iM + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.clientName;
        String str2 = this.clientId;
        String str3 = this.hostId;
        String str4 = this.clientDescription;
        List<JsonObject> list = this.tools;
        String str5 = this.welcomeMessage;
        StringBuilder sbR = kgh.r("ClientRegistrationRequest(clientName=", str, ", clientId=", str2, ", hostId=");
        kgh.u(sbR, str3, ", clientDescription=", str4, ", tools=");
        sbR.append(list);
        sbR.append(", welcomeMessage=");
        sbR.append(str5);
        sbR.append(")");
        return sbR.toString();
    }

    public ClientRegistrationRequest(String str, String str2, String str3, String str4, List<JsonObject> list, String str5) {
        str.getClass();
        str4.getClass();
        list.getClass();
        this.clientName = str;
        this.clientId = str2;
        this.hostId = str3;
        this.clientDescription = str4;
        this.tools = list;
        this.welcomeMessage = str5;
    }

    public /* synthetic */ ClientRegistrationRequest(String str, String str2, String str3, String str4, List list, String str5, int i, mq5 mq5Var) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, str4, (i & 16) != 0 ? lm6.E : list, (i & 32) != 0 ? null : str5);
    }
}
