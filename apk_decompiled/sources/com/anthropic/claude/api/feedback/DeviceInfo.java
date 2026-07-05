package com.anthropic.claude.api.feedback;

import android.os.Build;
import defpackage.bsg;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.n26;
import defpackage.o26;
import defpackage.onf;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.y6a;
import java.util.Locale;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000245B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nB\u0019\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\t\u0010\u000eBW\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\t\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001dJ\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001dJL\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001dJ\u0010\u0010&\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b/\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b0\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b1\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b2\u0010\u001d¨\u00066"}, d2 = {"Lcom/anthropic/claude/api/feedback/DeviceInfo;", "", "", "platform", "os_version", "app_version", "build_number", "device_model", "locale", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "versionName", "", "versionCode", "(Ljava/lang/String;I)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/feedback/DeviceInfo;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/api/feedback/DeviceInfo;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPlatform", "getOs_version", "getApp_version", "getBuild_number", "getDevice_model", "getLocale", "Companion", "n26", "o26", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class DeviceInfo {
    public static final int $stable = 0;
    public static final o26 Companion = new o26();
    private final String app_version;
    private final String build_number;
    private final String device_model;
    private final String locale;
    private final String os_version;
    private final String platform;

    /* JADX WARN: Illegal instructions before constructor call */
    public DeviceInfo(String str, int i) {
        str.getClass();
        String str2 = Build.VERSION.RELEASE;
        String strValueOf = str2 == null ? String.valueOf(Build.VERSION.SDK_INT) : str2;
        String strValueOf2 = String.valueOf(i);
        String string = bsg.k1(Build.MANUFACTURER + " " + Build.MODEL).toString();
        String languageTag = Locale.getDefault().toLanguageTag();
        languageTag.getClass();
        this("Android", strValueOf, str, strValueOf2, string, languageTag);
    }

    public static /* synthetic */ DeviceInfo copy$default(DeviceInfo deviceInfo, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceInfo.platform;
        }
        if ((i & 2) != 0) {
            str2 = deviceInfo.os_version;
        }
        if ((i & 4) != 0) {
            str3 = deviceInfo.app_version;
        }
        if ((i & 8) != 0) {
            str4 = deviceInfo.build_number;
        }
        if ((i & 16) != 0) {
            str5 = deviceInfo.device_model;
        }
        if ((i & 32) != 0) {
            str6 = deviceInfo.locale;
        }
        String str7 = str5;
        String str8 = str6;
        return deviceInfo.copy(str, str2, str3, str4, str7, str8);
    }

    public static final /* synthetic */ void write$Self$api(DeviceInfo self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.platform);
        output.q(serialDesc, 1, self.os_version);
        output.q(serialDesc, 2, self.app_version);
        output.q(serialDesc, 3, self.build_number);
        output.q(serialDesc, 4, self.device_model);
        output.q(serialDesc, 5, self.locale);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOs_version() {
        return this.os_version;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getApp_version() {
        return this.app_version;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBuild_number() {
        return this.build_number;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDevice_model() {
        return this.device_model;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getLocale() {
        return this.locale;
    }

    public final DeviceInfo copy(String platform, String os_version, String app_version, String build_number, String device_model, String locale) {
        y6a.s(platform, os_version, app_version, build_number, device_model);
        locale.getClass();
        return new DeviceInfo(platform, os_version, app_version, build_number, device_model, locale);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceInfo)) {
            return false;
        }
        DeviceInfo deviceInfo = (DeviceInfo) other;
        return x44.r(this.platform, deviceInfo.platform) && x44.r(this.os_version, deviceInfo.os_version) && x44.r(this.app_version, deviceInfo.app_version) && x44.r(this.build_number, deviceInfo.build_number) && x44.r(this.device_model, deviceInfo.device_model) && x44.r(this.locale, deviceInfo.locale);
    }

    public final String getApp_version() {
        return this.app_version;
    }

    public final String getBuild_number() {
        return this.build_number;
    }

    public final String getDevice_model() {
        return this.device_model;
    }

    public final String getLocale() {
        return this.locale;
    }

    public final String getOs_version() {
        return this.os_version;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public int hashCode() {
        return this.locale.hashCode() + kgh.l(kgh.l(kgh.l(kgh.l(this.platform.hashCode() * 31, 31, this.os_version), 31, this.app_version), 31, this.build_number), 31, this.device_model);
    }

    public String toString() {
        String str = this.platform;
        String str2 = this.os_version;
        String str3 = this.app_version;
        String str4 = this.build_number;
        String str5 = this.device_model;
        String str6 = this.locale;
        StringBuilder sbR = kgh.r("DeviceInfo(platform=", str, ", os_version=", str2, ", app_version=");
        kgh.u(sbR, str3, ", build_number=", str4, ", device_model=");
        return vb7.t(sbR, str5, ", locale=", str6, ")");
    }

    public /* synthetic */ DeviceInfo(int i, String str, String str2, String str3, String str4, String str5, String str6, vnf vnfVar) {
        if (63 != (i & 63)) {
            gvj.f(i, 63, n26.a.getDescriptor());
            throw null;
        }
        this.platform = str;
        this.os_version = str2;
        this.app_version = str3;
        this.build_number = str4;
        this.device_model = str5;
        this.locale = str6;
    }

    public DeviceInfo(String str, String str2, String str3, String str4, String str5, String str6) {
        y6a.s(str, str2, str3, str4, str5);
        str6.getClass();
        this.platform = str;
        this.os_version = str2;
        this.app_version = str3;
        this.build_number = str4;
        this.device_model = str5;
        this.locale = str6;
    }
}
