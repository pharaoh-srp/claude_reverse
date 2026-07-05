package com.anthropic.claude.mcpapps.transport;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.bp8;
import defpackage.ij8;
import defpackage.ixh;
import defpackage.k26;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.om4;
import defpackage.onf;
import defpackage.srg;
import defpackage.uh9;
import defpackage.uo0;
import defpackage.v2f;
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

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u0000 T2\u00020\u0001:\u0002UVB\u009d\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016B\u0099\u0001\b\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0015\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001dJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001dJ\u0018\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b-\u0010.J¦\u0001\u0010/\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b1\u0010\u001dJ\u0010\u00102\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b2\u00103J\u001a\u00106\u001a\u0002052\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b6\u00107J'\u0010@\u001a\u00020=2\u0006\u00108\u001a\u00020\u00002\u0006\u0010:\u001a\u0002092\u0006\u0010<\u001a\u00020;H\u0001¢\u0006\u0004\b>\u0010?R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010A\u001a\u0004\bB\u0010\u001dR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010A\u001a\u0004\bC\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010A\u001a\u0004\bD\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010A\u001a\u0004\bE\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010A\u001a\u0004\bF\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010A\u001a\u0004\bG\u0010\u001dR\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010H\u001a\u0004\bI\u0010$R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010J\u001a\u0004\bK\u0010&R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010L\u001a\u0004\bM\u0010(R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010N\u001a\u0004\bO\u0010*R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010P\u001a\u0004\bQ\u0010,R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010R\u001a\u0004\bS\u0010.¨\u0006W"}, d2 = {"Lcom/anthropic/claude/mcpapps/transport/HostContext;", "", "", "theme", "platform", "locale", "timeZone", "userAgent", "displayMode", "", "availableDisplayModes", "Lcom/anthropic/claude/mcpapps/transport/ContainerDimensions;", "containerDimensions", "Lcom/anthropic/claude/mcpapps/transport/DeviceCapabilities;", "deviceCapabilities", "Lcom/anthropic/claude/mcpapps/transport/SafeAreaInsets;", "safeAreaInsets", "Lkotlinx/serialization/json/JsonObject;", "styles", "Lcom/anthropic/claude/mcpapps/transport/ToolInfo;", "toolInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/anthropic/claude/mcpapps/transport/ContainerDimensions;Lcom/anthropic/claude/mcpapps/transport/DeviceCapabilities;Lcom/anthropic/claude/mcpapps/transport/SafeAreaInsets;Lkotlinx/serialization/json/JsonObject;Lcom/anthropic/claude/mcpapps/transport/ToolInfo;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/anthropic/claude/mcpapps/transport/ContainerDimensions;Lcom/anthropic/claude/mcpapps/transport/DeviceCapabilities;Lcom/anthropic/claude/mcpapps/transport/SafeAreaInsets;Lkotlinx/serialization/json/JsonObject;Lcom/anthropic/claude/mcpapps/transport/ToolInfo;Lvnf;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "()Ljava/util/List;", "component8", "()Lcom/anthropic/claude/mcpapps/transport/ContainerDimensions;", "component9", "()Lcom/anthropic/claude/mcpapps/transport/DeviceCapabilities;", "component10", "()Lcom/anthropic/claude/mcpapps/transport/SafeAreaInsets;", "component11", "()Lkotlinx/serialization/json/JsonObject;", "component12", "()Lcom/anthropic/claude/mcpapps/transport/ToolInfo;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/anthropic/claude/mcpapps/transport/ContainerDimensions;Lcom/anthropic/claude/mcpapps/transport/DeviceCapabilities;Lcom/anthropic/claude/mcpapps/transport/SafeAreaInsets;Lkotlinx/serialization/json/JsonObject;Lcom/anthropic/claude/mcpapps/transport/ToolInfo;)Lcom/anthropic/claude/mcpapps/transport/HostContext;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_mcpapp", "(Lcom/anthropic/claude/mcpapps/transport/HostContext;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getTheme", "getPlatform", "getLocale", "getTimeZone", "getUserAgent", "getDisplayMode", "Ljava/util/List;", "getAvailableDisplayModes", "Lcom/anthropic/claude/mcpapps/transport/ContainerDimensions;", "getContainerDimensions", "Lcom/anthropic/claude/mcpapps/transport/DeviceCapabilities;", "getDeviceCapabilities", "Lcom/anthropic/claude/mcpapps/transport/SafeAreaInsets;", "getSafeAreaInsets", "Lkotlinx/serialization/json/JsonObject;", "getStyles", "Lcom/anthropic/claude/mcpapps/transport/ToolInfo;", "getToolInfo", "Companion", "ap8", "bp8", "Claude:mcpapp"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class HostContext {
    public static final int $stable = 8;
    private final List<String> availableDisplayModes;
    private final ContainerDimensions containerDimensions;
    private final DeviceCapabilities deviceCapabilities;
    private final String displayMode;
    private final String locale;
    private final String platform;
    private final SafeAreaInsets safeAreaInsets;
    private final JsonObject styles;
    private final String theme;
    private final String timeZone;
    private final ToolInfo toolInfo;
    private final String userAgent;
    public static final bp8 Companion = new bp8();
    private static final kw9[] $childSerializers = {null, null, null, null, null, null, yb5.w(w1a.F, new ij8(17)), null, null, null, null, null};

    public /* synthetic */ HostContext(int i, String str, String str2, String str3, String str4, String str5, String str6, List list, ContainerDimensions containerDimensions, DeviceCapabilities deviceCapabilities, SafeAreaInsets safeAreaInsets, JsonObject jsonObject, ToolInfo toolInfo, vnf vnfVar) {
        this.theme = (i & 1) == 0 ? "light" : str;
        if ((i & 2) == 0) {
            this.platform = "mobile";
        } else {
            this.platform = str2;
        }
        if ((i & 4) == 0) {
            this.locale = null;
        } else {
            this.locale = str3;
        }
        if ((i & 8) == 0) {
            this.timeZone = null;
        } else {
            this.timeZone = str4;
        }
        if ((i & 16) == 0) {
            this.userAgent = null;
        } else {
            this.userAgent = str5;
        }
        if ((i & 32) == 0) {
            this.displayMode = null;
        } else {
            this.displayMode = str6;
        }
        if ((i & 64) == 0) {
            this.availableDisplayModes = null;
        } else {
            this.availableDisplayModes = list;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0) {
            this.containerDimensions = null;
        } else {
            this.containerDimensions = containerDimensions;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 0) {
            this.deviceCapabilities = null;
        } else {
            this.deviceCapabilities = deviceCapabilities;
        }
        if ((i & 512) == 0) {
            this.safeAreaInsets = null;
        } else {
            this.safeAreaInsets = safeAreaInsets;
        }
        if ((i & FreeTypeConstants.FT_LOAD_NO_RECURSE) == 0) {
            this.styles = null;
        } else {
            this.styles = jsonObject;
        }
        if ((i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) == 0) {
            this.toolInfo = null;
        } else {
            this.toolInfo = toolInfo;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(srg.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HostContext copy$default(HostContext hostContext, String str, String str2, String str3, String str4, String str5, String str6, List list, ContainerDimensions containerDimensions, DeviceCapabilities deviceCapabilities, SafeAreaInsets safeAreaInsets, JsonObject jsonObject, ToolInfo toolInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hostContext.theme;
        }
        if ((i & 2) != 0) {
            str2 = hostContext.platform;
        }
        if ((i & 4) != 0) {
            str3 = hostContext.locale;
        }
        if ((i & 8) != 0) {
            str4 = hostContext.timeZone;
        }
        if ((i & 16) != 0) {
            str5 = hostContext.userAgent;
        }
        if ((i & 32) != 0) {
            str6 = hostContext.displayMode;
        }
        if ((i & 64) != 0) {
            list = hostContext.availableDisplayModes;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            containerDimensions = hostContext.containerDimensions;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0) {
            deviceCapabilities = hostContext.deviceCapabilities;
        }
        if ((i & 512) != 0) {
            safeAreaInsets = hostContext.safeAreaInsets;
        }
        if ((i & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0) {
            jsonObject = hostContext.styles;
        }
        if ((i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0) {
            toolInfo = hostContext.toolInfo;
        }
        JsonObject jsonObject2 = jsonObject;
        ToolInfo toolInfo2 = toolInfo;
        DeviceCapabilities deviceCapabilities2 = deviceCapabilities;
        SafeAreaInsets safeAreaInsets2 = safeAreaInsets;
        List list2 = list;
        ContainerDimensions containerDimensions2 = containerDimensions;
        String str7 = str5;
        String str8 = str6;
        return hostContext.copy(str, str2, str3, str4, str7, str8, list2, containerDimensions2, deviceCapabilities2, safeAreaInsets2, jsonObject2, toolInfo2);
    }

    public static final /* synthetic */ void write$Self$Claude_mcpapp(HostContext self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        if (output.E(serialDesc) || !x44.r(self.theme, "light")) {
            output.B(serialDesc, 0, srg.a, self.theme);
        }
        if (output.E(serialDesc) || !x44.r(self.platform, "mobile")) {
            output.B(serialDesc, 1, srg.a, self.platform);
        }
        if (output.E(serialDesc) || self.locale != null) {
            output.B(serialDesc, 2, srg.a, self.locale);
        }
        if (output.E(serialDesc) || self.timeZone != null) {
            output.B(serialDesc, 3, srg.a, self.timeZone);
        }
        if (output.E(serialDesc) || self.userAgent != null) {
            output.B(serialDesc, 4, srg.a, self.userAgent);
        }
        if (output.E(serialDesc) || self.displayMode != null) {
            output.B(serialDesc, 5, srg.a, self.displayMode);
        }
        if (output.E(serialDesc) || self.availableDisplayModes != null) {
            output.B(serialDesc, 6, (znf) kw9VarArr[6].getValue(), self.availableDisplayModes);
        }
        if (output.E(serialDesc) || self.containerDimensions != null) {
            output.B(serialDesc, 7, om4.a, self.containerDimensions);
        }
        if (output.E(serialDesc) || self.deviceCapabilities != null) {
            output.B(serialDesc, 8, k26.a, self.deviceCapabilities);
        }
        if (output.E(serialDesc) || self.safeAreaInsets != null) {
            output.B(serialDesc, 9, v2f.a, self.safeAreaInsets);
        }
        if (output.E(serialDesc) || self.styles != null) {
            output.B(serialDesc, 10, uh9.a, self.styles);
        }
        if (!output.E(serialDesc) && self.toolInfo == null) {
            return;
        }
        output.B(serialDesc, 11, ixh.a, self.toolInfo);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTheme() {
        return this.theme;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final SafeAreaInsets getSafeAreaInsets() {
        return this.safeAreaInsets;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final JsonObject getStyles() {
        return this.styles;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final ToolInfo getToolInfo() {
        return this.toolInfo;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLocale() {
        return this.locale;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTimeZone() {
        return this.timeZone;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getUserAgent() {
        return this.userAgent;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDisplayMode() {
        return this.displayMode;
    }

    public final List<String> component7() {
        return this.availableDisplayModes;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final ContainerDimensions getContainerDimensions() {
        return this.containerDimensions;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final DeviceCapabilities getDeviceCapabilities() {
        return this.deviceCapabilities;
    }

    public final HostContext copy(String theme, String platform, String locale, String timeZone, String userAgent, String displayMode, List<String> availableDisplayModes, ContainerDimensions containerDimensions, DeviceCapabilities deviceCapabilities, SafeAreaInsets safeAreaInsets, JsonObject styles, ToolInfo toolInfo) {
        return new HostContext(theme, platform, locale, timeZone, userAgent, displayMode, availableDisplayModes, containerDimensions, deviceCapabilities, safeAreaInsets, styles, toolInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HostContext)) {
            return false;
        }
        HostContext hostContext = (HostContext) other;
        return x44.r(this.theme, hostContext.theme) && x44.r(this.platform, hostContext.platform) && x44.r(this.locale, hostContext.locale) && x44.r(this.timeZone, hostContext.timeZone) && x44.r(this.userAgent, hostContext.userAgent) && x44.r(this.displayMode, hostContext.displayMode) && x44.r(this.availableDisplayModes, hostContext.availableDisplayModes) && x44.r(this.containerDimensions, hostContext.containerDimensions) && x44.r(this.deviceCapabilities, hostContext.deviceCapabilities) && x44.r(this.safeAreaInsets, hostContext.safeAreaInsets) && x44.r(this.styles, hostContext.styles) && x44.r(this.toolInfo, hostContext.toolInfo);
    }

    public final List<String> getAvailableDisplayModes() {
        return this.availableDisplayModes;
    }

    public final ContainerDimensions getContainerDimensions() {
        return this.containerDimensions;
    }

    public final DeviceCapabilities getDeviceCapabilities() {
        return this.deviceCapabilities;
    }

    public final String getDisplayMode() {
        return this.displayMode;
    }

    public final String getLocale() {
        return this.locale;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final SafeAreaInsets getSafeAreaInsets() {
        return this.safeAreaInsets;
    }

    public final JsonObject getStyles() {
        return this.styles;
    }

    public final String getTheme() {
        return this.theme;
    }

    public final String getTimeZone() {
        return this.timeZone;
    }

    public final ToolInfo getToolInfo() {
        return this.toolInfo;
    }

    public final String getUserAgent() {
        return this.userAgent;
    }

    public int hashCode() {
        String str = this.theme;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.platform;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.locale;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.timeZone;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.userAgent;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.displayMode;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<String> list = this.availableDisplayModes;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        ContainerDimensions containerDimensions = this.containerDimensions;
        int iHashCode8 = (iHashCode7 + (containerDimensions == null ? 0 : containerDimensions.hashCode())) * 31;
        DeviceCapabilities deviceCapabilities = this.deviceCapabilities;
        int iHashCode9 = (iHashCode8 + (deviceCapabilities == null ? 0 : deviceCapabilities.hashCode())) * 31;
        SafeAreaInsets safeAreaInsets = this.safeAreaInsets;
        int iHashCode10 = (iHashCode9 + (safeAreaInsets == null ? 0 : safeAreaInsets.hashCode())) * 31;
        JsonObject jsonObject = this.styles;
        int iHashCode11 = (iHashCode10 + (jsonObject == null ? 0 : jsonObject.hashCode())) * 31;
        ToolInfo toolInfo = this.toolInfo;
        return iHashCode11 + (toolInfo != null ? toolInfo.hashCode() : 0);
    }

    public String toString() {
        String str = this.theme;
        String str2 = this.platform;
        String str3 = this.locale;
        String str4 = this.timeZone;
        String str5 = this.userAgent;
        String str6 = this.displayMode;
        List<String> list = this.availableDisplayModes;
        ContainerDimensions containerDimensions = this.containerDimensions;
        DeviceCapabilities deviceCapabilities = this.deviceCapabilities;
        SafeAreaInsets safeAreaInsets = this.safeAreaInsets;
        JsonObject jsonObject = this.styles;
        ToolInfo toolInfo = this.toolInfo;
        StringBuilder sbR = kgh.r("HostContext(theme=", str, ", platform=", str2, ", locale=");
        kgh.u(sbR, str3, ", timeZone=", str4, ", userAgent=");
        kgh.u(sbR, str5, ", displayMode=", str6, ", availableDisplayModes=");
        sbR.append(list);
        sbR.append(", containerDimensions=");
        sbR.append(containerDimensions);
        sbR.append(", deviceCapabilities=");
        sbR.append(deviceCapabilities);
        sbR.append(", safeAreaInsets=");
        sbR.append(safeAreaInsets);
        sbR.append(", styles=");
        sbR.append(jsonObject);
        sbR.append(", toolInfo=");
        sbR.append(toolInfo);
        sbR.append(")");
        return sbR.toString();
    }

    public HostContext() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (ContainerDimensions) null, (DeviceCapabilities) null, (SafeAreaInsets) null, (JsonObject) null, (ToolInfo) null, 4095, (mq5) null);
    }

    public HostContext(String str, String str2, String str3, String str4, String str5, String str6, List<String> list, ContainerDimensions containerDimensions, DeviceCapabilities deviceCapabilities, SafeAreaInsets safeAreaInsets, JsonObject jsonObject, ToolInfo toolInfo) {
        this.theme = str;
        this.platform = str2;
        this.locale = str3;
        this.timeZone = str4;
        this.userAgent = str5;
        this.displayMode = str6;
        this.availableDisplayModes = list;
        this.containerDimensions = containerDimensions;
        this.deviceCapabilities = deviceCapabilities;
        this.safeAreaInsets = safeAreaInsets;
        this.styles = jsonObject;
        this.toolInfo = toolInfo;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ HostContext(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.util.List r8, com.anthropic.claude.mcpapps.transport.ContainerDimensions r9, com.anthropic.claude.mcpapps.transport.DeviceCapabilities r10, com.anthropic.claude.mcpapps.transport.SafeAreaInsets r11, kotlinx.serialization.json.JsonObject r12, com.anthropic.claude.mcpapps.transport.ToolInfo r13, int r14, defpackage.mq5 r15) {
        /*
            r1 = this;
            r15 = r14 & 1
            if (r15 == 0) goto L6
            java.lang.String r2 = "light"
        L6:
            r15 = r14 & 2
            if (r15 == 0) goto Lc
            java.lang.String r3 = "mobile"
        Lc:
            r15 = r14 & 4
            r0 = 0
            if (r15 == 0) goto L12
            r4 = r0
        L12:
            r15 = r14 & 8
            if (r15 == 0) goto L17
            r5 = r0
        L17:
            r15 = r14 & 16
            if (r15 == 0) goto L1c
            r6 = r0
        L1c:
            r15 = r14 & 32
            if (r15 == 0) goto L21
            r7 = r0
        L21:
            r15 = r14 & 64
            if (r15 == 0) goto L26
            r8 = r0
        L26:
            r15 = r14 & 128(0x80, float:1.8E-43)
            if (r15 == 0) goto L2b
            r9 = r0
        L2b:
            r15 = r14 & 256(0x100, float:3.59E-43)
            if (r15 == 0) goto L30
            r10 = r0
        L30:
            r15 = r14 & 512(0x200, float:7.17E-43)
            if (r15 == 0) goto L35
            r11 = r0
        L35:
            r15 = r14 & 1024(0x400, float:1.435E-42)
            if (r15 == 0) goto L3a
            r12 = r0
        L3a:
            r14 = r14 & 2048(0x800, float:2.87E-42)
            if (r14 == 0) goto L4c
            r15 = r0
            r13 = r11
            r14 = r12
            r11 = r9
            r12 = r10
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L59
        L4c:
            r15 = r13
            r14 = r12
            r12 = r10
            r13 = r11
            r10 = r8
            r11 = r9
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L59:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.mcpapps.transport.HostContext.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, com.anthropic.claude.mcpapps.transport.ContainerDimensions, com.anthropic.claude.mcpapps.transport.DeviceCapabilities, com.anthropic.claude.mcpapps.transport.SafeAreaInsets, kotlinx.serialization.json.JsonObject, com.anthropic.claude.mcpapps.transport.ToolInfo, int, mq5):void");
    }
}
