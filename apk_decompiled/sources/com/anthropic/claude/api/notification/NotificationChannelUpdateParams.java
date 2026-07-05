package com.anthropic.claude.api.notification;

import defpackage.e2c;
import defpackage.gvj;
import defpackage.i7c;
import defpackage.j7c;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.qy1;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import defpackage.zt1;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000267B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBM\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u0012\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\"\u0010#JD\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b&\u0010\u001eJ\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010*\u001a\u00020\t2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b1\u0010 R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b2\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b4\u0010#¨\u00068"}, d2 = {"Lcom/anthropic/claude/api/notification/NotificationChannelUpdateParams;", "", "Lcom/anthropic/claude/api/notification/NotificationChannelType;", "channel_type", "", "client_app_name", "Lcom/anthropic/claude/api/notification/ClientPlatform;", "client_platform", "registration_token", "", "os_push_permission_granted", "<init>", "(Lcom/anthropic/claude/api/notification/NotificationChannelType;Ljava/lang/String;Lcom/anthropic/claude/api/notification/ClientPlatform;Ljava/lang/String;Ljava/lang/Boolean;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/api/notification/NotificationChannelType;Ljava/lang/String;Lcom/anthropic/claude/api/notification/ClientPlatform;Ljava/lang/String;Ljava/lang/Boolean;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/notification/NotificationChannelUpdateParams;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/api/notification/NotificationChannelType;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/anthropic/claude/api/notification/ClientPlatform;", "component4", "component5", "()Ljava/lang/Boolean;", "copy", "(Lcom/anthropic/claude/api/notification/NotificationChannelType;Ljava/lang/String;Lcom/anthropic/claude/api/notification/ClientPlatform;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/anthropic/claude/api/notification/NotificationChannelUpdateParams;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/api/notification/NotificationChannelType;", "getChannel_type", "Ljava/lang/String;", "getClient_app_name", "Lcom/anthropic/claude/api/notification/ClientPlatform;", "getClient_platform", "getRegistration_token", "Ljava/lang/Boolean;", "getOs_push_permission_granted", "Companion", "i7c", "j7c", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class NotificationChannelUpdateParams {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final j7c Companion = new j7c();
    private final NotificationChannelType channel_type;
    private final String client_app_name;
    private final ClientPlatform client_platform;
    private final Boolean os_push_permission_granted;
    private final String registration_token;

    static {
        e2c e2cVar = new e2c(6);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{yb5.w(w1aVar, e2cVar), null, yb5.w(w1aVar, new e2c(7)), null, null};
    }

    public /* synthetic */ NotificationChannelUpdateParams(int i, NotificationChannelType notificationChannelType, String str, ClientPlatform clientPlatform, String str2, Boolean bool, vnf vnfVar) {
        if (31 != (i & 31)) {
            gvj.f(i, 31, i7c.a.getDescriptor());
            throw null;
        }
        this.channel_type = notificationChannelType;
        this.client_app_name = str;
        this.client_platform = clientPlatform;
        this.registration_token = str2;
        this.os_push_permission_granted = bool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return NotificationChannelType.Companion.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return ClientPlatform.Companion.serializer();
    }

    public static /* synthetic */ NotificationChannelUpdateParams copy$default(NotificationChannelUpdateParams notificationChannelUpdateParams, NotificationChannelType notificationChannelType, String str, ClientPlatform clientPlatform, String str2, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            notificationChannelType = notificationChannelUpdateParams.channel_type;
        }
        if ((i & 2) != 0) {
            str = notificationChannelUpdateParams.client_app_name;
        }
        if ((i & 4) != 0) {
            clientPlatform = notificationChannelUpdateParams.client_platform;
        }
        if ((i & 8) != 0) {
            str2 = notificationChannelUpdateParams.registration_token;
        }
        if ((i & 16) != 0) {
            bool = notificationChannelUpdateParams.os_push_permission_granted;
        }
        Boolean bool2 = bool;
        ClientPlatform clientPlatform2 = clientPlatform;
        return notificationChannelUpdateParams.copy(notificationChannelType, str, clientPlatform2, str2, bool2);
    }

    public static final /* synthetic */ void write$Self$api(NotificationChannelUpdateParams self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.r(serialDesc, 0, (znf) kw9VarArr[0].getValue(), self.channel_type);
        output.q(serialDesc, 1, self.client_app_name);
        output.r(serialDesc, 2, (znf) kw9VarArr[2].getValue(), self.client_platform);
        output.q(serialDesc, 3, self.registration_token);
        output.B(serialDesc, 4, zt1.a, self.os_push_permission_granted);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final NotificationChannelType getChannel_type() {
        return this.channel_type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getClient_app_name() {
        return this.client_app_name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ClientPlatform getClient_platform() {
        return this.client_platform;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRegistration_token() {
        return this.registration_token;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getOs_push_permission_granted() {
        return this.os_push_permission_granted;
    }

    public final NotificationChannelUpdateParams copy(NotificationChannelType channel_type, String client_app_name, ClientPlatform client_platform, String registration_token, Boolean os_push_permission_granted) {
        channel_type.getClass();
        client_app_name.getClass();
        client_platform.getClass();
        registration_token.getClass();
        return new NotificationChannelUpdateParams(channel_type, client_app_name, client_platform, registration_token, os_push_permission_granted);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationChannelUpdateParams)) {
            return false;
        }
        NotificationChannelUpdateParams notificationChannelUpdateParams = (NotificationChannelUpdateParams) other;
        return this.channel_type == notificationChannelUpdateParams.channel_type && x44.r(this.client_app_name, notificationChannelUpdateParams.client_app_name) && this.client_platform == notificationChannelUpdateParams.client_platform && x44.r(this.registration_token, notificationChannelUpdateParams.registration_token) && x44.r(this.os_push_permission_granted, notificationChannelUpdateParams.os_push_permission_granted);
    }

    public final NotificationChannelType getChannel_type() {
        return this.channel_type;
    }

    public final String getClient_app_name() {
        return this.client_app_name;
    }

    public final ClientPlatform getClient_platform() {
        return this.client_platform;
    }

    public final Boolean getOs_push_permission_granted() {
        return this.os_push_permission_granted;
    }

    public final String getRegistration_token() {
        return this.registration_token;
    }

    public int hashCode() {
        int iL = kgh.l((this.client_platform.hashCode() + kgh.l(this.channel_type.hashCode() * 31, 31, this.client_app_name)) * 31, 31, this.registration_token);
        Boolean bool = this.os_push_permission_granted;
        return iL + (bool == null ? 0 : bool.hashCode());
    }

    public String toString() {
        NotificationChannelType notificationChannelType = this.channel_type;
        String str = this.client_app_name;
        ClientPlatform clientPlatform = this.client_platform;
        String str2 = this.registration_token;
        Boolean bool = this.os_push_permission_granted;
        StringBuilder sb = new StringBuilder("NotificationChannelUpdateParams(channel_type=");
        sb.append(notificationChannelType);
        sb.append(", client_app_name=");
        sb.append(str);
        sb.append(", client_platform=");
        sb.append(clientPlatform);
        sb.append(", registration_token=");
        sb.append(str2);
        sb.append(", os_push_permission_granted=");
        return qy1.h(sb, bool, ")");
    }

    public NotificationChannelUpdateParams(NotificationChannelType notificationChannelType, String str, ClientPlatform clientPlatform, String str2, Boolean bool) {
        notificationChannelType.getClass();
        str.getClass();
        clientPlatform.getClass();
        str2.getClass();
        this.channel_type = notificationChannelType;
        this.client_app_name = str;
        this.client_platform = clientPlatform;
        this.registration_token = str2;
        this.os_push_permission_granted = bool;
    }
}
