package com.anthropic.claude.api.chat.messages;

import defpackage.ef0;
import defpackage.ff0;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000212BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nBW\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJT\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b.\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b/\u0010\u001a¨\u00063"}, d2 = {"Lcom/anthropic/claude/api/chat/messages/ApiHelpline;", "", "", "id", "name", "phone_number", "sms_number", "web_chat_url", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/chat/messages/ApiHelpline;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/api/chat/messages/ApiHelpline;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getName", "getPhone_number", "getSms_number", "getWeb_chat_url", "getUrl", "Companion", "ef0", "ff0", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ApiHelpline {
    public static final int $stable = 0;
    public static final ff0 Companion = new ff0();
    private final String id;
    private final String name;
    private final String phone_number;
    private final String sms_number;
    private final String url;
    private final String web_chat_url;

    public /* synthetic */ ApiHelpline(int i, String str, String str2, String str3, String str4, String str5, String str6, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, ef0.a.getDescriptor());
            throw null;
        }
        this.id = str;
        this.name = str2;
        if ((i & 4) == 0) {
            this.phone_number = null;
        } else {
            this.phone_number = str3;
        }
        if ((i & 8) == 0) {
            this.sms_number = null;
        } else {
            this.sms_number = str4;
        }
        if ((i & 16) == 0) {
            this.web_chat_url = null;
        } else {
            this.web_chat_url = str5;
        }
        if ((i & 32) == 0) {
            this.url = null;
        } else {
            this.url = str6;
        }
    }

    public static /* synthetic */ ApiHelpline copy$default(ApiHelpline apiHelpline, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = apiHelpline.id;
        }
        if ((i & 2) != 0) {
            str2 = apiHelpline.name;
        }
        if ((i & 4) != 0) {
            str3 = apiHelpline.phone_number;
        }
        if ((i & 8) != 0) {
            str4 = apiHelpline.sms_number;
        }
        if ((i & 16) != 0) {
            str5 = apiHelpline.web_chat_url;
        }
        if ((i & 32) != 0) {
            str6 = apiHelpline.url;
        }
        String str7 = str5;
        String str8 = str6;
        return apiHelpline.copy(str, str2, str3, str4, str7, str8);
    }

    public static final /* synthetic */ void write$Self$api(ApiHelpline self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.id);
        output.q(serialDesc, 1, self.name);
        if (output.E(serialDesc) || self.phone_number != null) {
            output.B(serialDesc, 2, srg.a, self.phone_number);
        }
        if (output.E(serialDesc) || self.sms_number != null) {
            output.B(serialDesc, 3, srg.a, self.sms_number);
        }
        if (output.E(serialDesc) || self.web_chat_url != null) {
            output.B(serialDesc, 4, srg.a, self.web_chat_url);
        }
        if (!output.E(serialDesc) && self.url == null) {
            return;
        }
        output.B(serialDesc, 5, srg.a, self.url);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPhone_number() {
        return this.phone_number;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSms_number() {
        return this.sms_number;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getWeb_chat_url() {
        return this.web_chat_url;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final ApiHelpline copy(String id, String name, String phone_number, String sms_number, String web_chat_url, String url) {
        id.getClass();
        name.getClass();
        return new ApiHelpline(id, name, phone_number, sms_number, web_chat_url, url);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiHelpline)) {
            return false;
        }
        ApiHelpline apiHelpline = (ApiHelpline) other;
        return x44.r(this.id, apiHelpline.id) && x44.r(this.name, apiHelpline.name) && x44.r(this.phone_number, apiHelpline.phone_number) && x44.r(this.sms_number, apiHelpline.sms_number) && x44.r(this.web_chat_url, apiHelpline.web_chat_url) && x44.r(this.url, apiHelpline.url);
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPhone_number() {
        return this.phone_number;
    }

    public final String getSms_number() {
        return this.sms_number;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getWeb_chat_url() {
        return this.web_chat_url;
    }

    public int hashCode() {
        int iL = kgh.l(this.id.hashCode() * 31, 31, this.name);
        String str = this.phone_number;
        int iHashCode = (iL + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.sms_number;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.web_chat_url;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.url;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.name;
        String str3 = this.phone_number;
        String str4 = this.sms_number;
        String str5 = this.web_chat_url;
        String str6 = this.url;
        StringBuilder sbR = kgh.r("ApiHelpline(id=", str, ", name=", str2, ", phone_number=");
        kgh.u(sbR, str3, ", sms_number=", str4, ", web_chat_url=");
        return vb7.t(sbR, str5, ", url=", str6, ")");
    }

    public ApiHelpline(String str, String str2, String str3, String str4, String str5, String str6) {
        str.getClass();
        str2.getClass();
        this.id = str;
        this.name = str2;
        this.phone_number = str3;
        this.sms_number = str4;
        this.web_chat_url = str5;
        this.url = str6;
    }

    public /* synthetic */ ApiHelpline(String str, String str2, String str3, String str4, String str5, String str6, int i, mq5 mq5Var) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
    }
}
