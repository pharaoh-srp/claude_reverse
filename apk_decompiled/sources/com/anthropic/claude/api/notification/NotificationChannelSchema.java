package com.anthropic.claude.api.notification;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.bc9;
import defpackage.e2c;
import defpackage.e7c;
import defpackage.ebh;
import defpackage.f7c;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import java.util.Date;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u0000 I2\u00020\u0001:\u0002JKB{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u001f\b\u0002\u0010\u000e\u001a\u0019\u0018\u00010\tj\u0004\u0018\u0001`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r\u0012\u0019\u0010\u000f\u001a\u00150\tj\u0002`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015Bu\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0014\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ'\u0010\"\u001a\u0019\u0018\u00010\tj\u0004\u0018\u0001`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\rHÆ\u0003¢\u0006\u0004\b\"\u0010#J#\u0010$\u001a\u00150\tj\u0002`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\rHÆ\u0003¢\u0006\u0004\b$\u0010#J\u0010\u0010%\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b%\u0010\u001eJ\u0010\u0010&\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b(\u0010\u001eJ\u0094\u0001\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\u001f\b\u0002\u0010\u000e\u001a\u0019\u0018\u00010\tj\u0004\u0018\u0001`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r2\u001b\b\u0002\u0010\u000f\u001a\u00150\tj\u0002`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r2\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b+\u0010\u001eJ\u0010\u0010,\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b0\u00101J'\u0010:\u001a\u0002072\u0006\u00102\u001a\u00020\u00002\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u000205H\u0001¢\u0006\u0004\b8\u00109R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010;\u001a\u0004\b<\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010=\u001a\u0004\b>\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010?\u001a\u0004\b@\u0010 R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010=\u001a\u0004\bA\u0010\u001eR.\u0010\u000e\u001a\u0019\u0018\u00010\tj\u0004\u0018\u0001`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010B\u001a\u0004\bC\u0010#R*\u0010\u000f\u001a\u00150\tj\u0002`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010B\u001a\u0004\bD\u0010#R\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010=\u001a\u0004\bE\u0010\u001eR\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010F\u001a\u0004\bG\u0010'R\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010=\u001a\u0004\bH\u0010\u001e¨\u0006L"}, d2 = {"Lcom/anthropic/claude/api/notification/NotificationChannelSchema;", "", "Lcom/anthropic/claude/api/notification/NotificationChannelType;", "channel_type", "", "client_app_name", "Lcom/anthropic/claude/api/notification/ClientPlatform;", "client_platform", "device_id", "Ljava/util/Date;", "Lcom/anthropic/claude/api/Iso8601Date;", "Lonf;", "with", "Lbc9;", "last_successful_delivery_time", "last_token_refresh_time", "registration_token", "Lcom/anthropic/claude/api/notification/NotificationChannelStatus;", "status", "uuid", "<init>", "(Lcom/anthropic/claude/api/notification/NotificationChannelType;Ljava/lang/String;Lcom/anthropic/claude/api/notification/ClientPlatform;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Lcom/anthropic/claude/api/notification/NotificationChannelStatus;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/api/notification/NotificationChannelType;Ljava/lang/String;Lcom/anthropic/claude/api/notification/ClientPlatform;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Lcom/anthropic/claude/api/notification/NotificationChannelStatus;Ljava/lang/String;Lvnf;)V", "component1", "()Lcom/anthropic/claude/api/notification/NotificationChannelType;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/anthropic/claude/api/notification/ClientPlatform;", "component4", "component5", "()Ljava/util/Date;", "component6", "component7", "component8", "()Lcom/anthropic/claude/api/notification/NotificationChannelStatus;", "component9", "copy", "(Lcom/anthropic/claude/api/notification/NotificationChannelType;Ljava/lang/String;Lcom/anthropic/claude/api/notification/ClientPlatform;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Lcom/anthropic/claude/api/notification/NotificationChannelStatus;Ljava/lang/String;)Lcom/anthropic/claude/api/notification/NotificationChannelSchema;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/notification/NotificationChannelSchema;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/anthropic/claude/api/notification/NotificationChannelType;", "getChannel_type", "Ljava/lang/String;", "getClient_app_name", "Lcom/anthropic/claude/api/notification/ClientPlatform;", "getClient_platform", "getDevice_id", "Ljava/util/Date;", "getLast_successful_delivery_time", "getLast_token_refresh_time", "getRegistration_token", "Lcom/anthropic/claude/api/notification/NotificationChannelStatus;", "getStatus", "getUuid", "Companion", "e7c", "f7c", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class NotificationChannelSchema {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final f7c Companion = new f7c();
    private final NotificationChannelType channel_type;
    private final String client_app_name;
    private final ClientPlatform client_platform;
    private final String device_id;
    private final Date last_successful_delivery_time;
    private final Date last_token_refresh_time;
    private final String registration_token;
    private final NotificationChannelStatus status;
    private final String uuid;

    static {
        e2c e2cVar = new e2c(1);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{yb5.w(w1aVar, e2cVar), null, yb5.w(w1aVar, new e2c(2)), null, null, null, null, yb5.w(w1aVar, new e2c(3)), null};
    }

    public /* synthetic */ NotificationChannelSchema(int i, NotificationChannelType notificationChannelType, String str, ClientPlatform clientPlatform, String str2, Date date, Date date2, String str3, NotificationChannelStatus notificationChannelStatus, String str4, vnf vnfVar) {
        if (495 != (i & 495)) {
            gvj.f(i, 495, e7c.a.getDescriptor());
            throw null;
        }
        this.channel_type = notificationChannelType;
        this.client_app_name = str;
        this.client_platform = clientPlatform;
        this.device_id = str2;
        if ((i & 16) == 0) {
            this.last_successful_delivery_time = null;
        } else {
            this.last_successful_delivery_time = date;
        }
        this.last_token_refresh_time = date2;
        this.registration_token = str3;
        this.status = notificationChannelStatus;
        this.uuid = str4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return NotificationChannelType.Companion.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return ClientPlatform.Companion.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return NotificationChannelStatus.Companion.serializer();
    }

    public static /* synthetic */ NotificationChannelSchema copy$default(NotificationChannelSchema notificationChannelSchema, NotificationChannelType notificationChannelType, String str, ClientPlatform clientPlatform, String str2, Date date, Date date2, String str3, NotificationChannelStatus notificationChannelStatus, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            notificationChannelType = notificationChannelSchema.channel_type;
        }
        if ((i & 2) != 0) {
            str = notificationChannelSchema.client_app_name;
        }
        if ((i & 4) != 0) {
            clientPlatform = notificationChannelSchema.client_platform;
        }
        if ((i & 8) != 0) {
            str2 = notificationChannelSchema.device_id;
        }
        if ((i & 16) != 0) {
            date = notificationChannelSchema.last_successful_delivery_time;
        }
        if ((i & 32) != 0) {
            date2 = notificationChannelSchema.last_token_refresh_time;
        }
        if ((i & 64) != 0) {
            str3 = notificationChannelSchema.registration_token;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            notificationChannelStatus = notificationChannelSchema.status;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0) {
            str4 = notificationChannelSchema.uuid;
        }
        NotificationChannelStatus notificationChannelStatus2 = notificationChannelStatus;
        String str5 = str4;
        Date date3 = date2;
        String str6 = str3;
        Date date4 = date;
        ClientPlatform clientPlatform2 = clientPlatform;
        return notificationChannelSchema.copy(notificationChannelType, str, clientPlatform2, str2, date4, date3, str6, notificationChannelStatus2, str5);
    }

    public static final /* synthetic */ void write$Self$api(NotificationChannelSchema self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.r(serialDesc, 0, (znf) kw9VarArr[0].getValue(), self.channel_type);
        output.q(serialDesc, 1, self.client_app_name);
        output.r(serialDesc, 2, (znf) kw9VarArr[2].getValue(), self.client_platform);
        output.q(serialDesc, 3, self.device_id);
        if (output.E(serialDesc) || self.last_successful_delivery_time != null) {
            output.B(serialDesc, 4, bc9.a, self.last_successful_delivery_time);
        }
        output.r(serialDesc, 5, bc9.a, self.last_token_refresh_time);
        output.q(serialDesc, 6, self.registration_token);
        output.r(serialDesc, 7, (znf) kw9VarArr[7].getValue(), self.status);
        output.q(serialDesc, 8, self.uuid);
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
    public final String getDevice_id() {
        return this.device_id;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Date getLast_successful_delivery_time() {
        return this.last_successful_delivery_time;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Date getLast_token_refresh_time() {
        return this.last_token_refresh_time;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getRegistration_token() {
        return this.registration_token;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final NotificationChannelStatus getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    public final NotificationChannelSchema copy(NotificationChannelType channel_type, String client_app_name, ClientPlatform client_platform, String device_id, Date last_successful_delivery_time, Date last_token_refresh_time, String registration_token, NotificationChannelStatus status, String uuid) {
        channel_type.getClass();
        client_app_name.getClass();
        client_platform.getClass();
        device_id.getClass();
        last_token_refresh_time.getClass();
        registration_token.getClass();
        status.getClass();
        uuid.getClass();
        return new NotificationChannelSchema(channel_type, client_app_name, client_platform, device_id, last_successful_delivery_time, last_token_refresh_time, registration_token, status, uuid);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationChannelSchema)) {
            return false;
        }
        NotificationChannelSchema notificationChannelSchema = (NotificationChannelSchema) other;
        return this.channel_type == notificationChannelSchema.channel_type && x44.r(this.client_app_name, notificationChannelSchema.client_app_name) && this.client_platform == notificationChannelSchema.client_platform && x44.r(this.device_id, notificationChannelSchema.device_id) && x44.r(this.last_successful_delivery_time, notificationChannelSchema.last_successful_delivery_time) && x44.r(this.last_token_refresh_time, notificationChannelSchema.last_token_refresh_time) && x44.r(this.registration_token, notificationChannelSchema.registration_token) && this.status == notificationChannelSchema.status && x44.r(this.uuid, notificationChannelSchema.uuid);
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

    public final String getDevice_id() {
        return this.device_id;
    }

    public final Date getLast_successful_delivery_time() {
        return this.last_successful_delivery_time;
    }

    public final Date getLast_token_refresh_time() {
        return this.last_token_refresh_time;
    }

    public final String getRegistration_token() {
        return this.registration_token;
    }

    public final NotificationChannelStatus getStatus() {
        return this.status;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        int iL = kgh.l((this.client_platform.hashCode() + kgh.l(this.channel_type.hashCode() * 31, 31, this.client_app_name)) * 31, 31, this.device_id);
        Date date = this.last_successful_delivery_time;
        return this.uuid.hashCode() + ((this.status.hashCode() + kgh.l(ebh.j(this.last_token_refresh_time, (iL + (date == null ? 0 : date.hashCode())) * 31, 31), 31, this.registration_token)) * 31);
    }

    public String toString() {
        NotificationChannelType notificationChannelType = this.channel_type;
        String str = this.client_app_name;
        ClientPlatform clientPlatform = this.client_platform;
        String str2 = this.device_id;
        Date date = this.last_successful_delivery_time;
        Date date2 = this.last_token_refresh_time;
        String str3 = this.registration_token;
        NotificationChannelStatus notificationChannelStatus = this.status;
        String str4 = this.uuid;
        StringBuilder sb = new StringBuilder("NotificationChannelSchema(channel_type=");
        sb.append(notificationChannelType);
        sb.append(", client_app_name=");
        sb.append(str);
        sb.append(", client_platform=");
        sb.append(clientPlatform);
        sb.append(", device_id=");
        sb.append(str2);
        sb.append(", last_successful_delivery_time=");
        sb.append(date);
        sb.append(", last_token_refresh_time=");
        sb.append(date2);
        sb.append(", registration_token=");
        sb.append(str3);
        sb.append(", status=");
        sb.append(notificationChannelStatus);
        sb.append(", uuid=");
        return ij0.m(sb, str4, ")");
    }

    public NotificationChannelSchema(NotificationChannelType notificationChannelType, String str, ClientPlatform clientPlatform, String str2, Date date, Date date2, String str3, NotificationChannelStatus notificationChannelStatus, String str4) {
        notificationChannelType.getClass();
        str.getClass();
        clientPlatform.getClass();
        str2.getClass();
        date2.getClass();
        str3.getClass();
        notificationChannelStatus.getClass();
        str4.getClass();
        this.channel_type = notificationChannelType;
        this.client_app_name = str;
        this.client_platform = clientPlatform;
        this.device_id = str2;
        this.last_successful_delivery_time = date;
        this.last_token_refresh_time = date2;
        this.registration_token = str3;
        this.status = notificationChannelStatus;
        this.uuid = str4;
    }

    public /* synthetic */ NotificationChannelSchema(NotificationChannelType notificationChannelType, String str, ClientPlatform clientPlatform, String str2, Date date, Date date2, String str3, NotificationChannelStatus notificationChannelStatus, String str4, int i, mq5 mq5Var) {
        this(notificationChannelType, str, clientPlatform, str2, (i & 16) != 0 ? null : date, date2, str3, notificationChannelStatus, str4);
    }
}
