package com.anthropic.claude.tool.model;

import defpackage.elb;
import defpackage.flb;
import defpackage.g9b;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/0B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBA\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ:\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u0019J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b+\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010\u001e¨\u00061"}, d2 = {"Lcom/anthropic/claude/tool/model/MobileAppToolPreviewInfo;", "", "", "iconRes", "", "toolLabel", "toolDescription", "Lcom/anthropic/claude/tool/model/PreviewData;", "previewData", "<init>", "(ILjava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/tool/model/PreviewData;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/tool/model/PreviewData;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$tool", "(Lcom/anthropic/claude/tool/model/MobileAppToolPreviewInfo;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/anthropic/claude/tool/model/PreviewData;", "copy", "(ILjava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/tool/model/PreviewData;)Lcom/anthropic/claude/tool/model/MobileAppToolPreviewInfo;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getIconRes", "Ljava/lang/String;", "getToolLabel", "getToolDescription", "Lcom/anthropic/claude/tool/model/PreviewData;", "getPreviewData", "Companion", "elb", "flb", "tool"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class MobileAppToolPreviewInfo {
    public static final int $stable = 0;
    private final int iconRes;
    private final PreviewData previewData;
    private final String toolDescription;
    private final String toolLabel;
    public static final flb Companion = new flb();
    private static final kw9[] $childSerializers = {null, null, null, yb5.w(w1a.F, new g9b(24))};

    public /* synthetic */ MobileAppToolPreviewInfo(int i, int i2, String str, String str2, PreviewData previewData, vnf vnfVar) {
        if (15 != (i & 15)) {
            gvj.f(i, 15, elb.a.getDescriptor());
            throw null;
        }
        this.iconRes = i2;
        this.toolLabel = str;
        this.toolDescription = str2;
        this.previewData = previewData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return PreviewData.Companion.serializer();
    }

    public static /* synthetic */ MobileAppToolPreviewInfo copy$default(MobileAppToolPreviewInfo mobileAppToolPreviewInfo, int i, String str, String str2, PreviewData previewData, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = mobileAppToolPreviewInfo.iconRes;
        }
        if ((i2 & 2) != 0) {
            str = mobileAppToolPreviewInfo.toolLabel;
        }
        if ((i2 & 4) != 0) {
            str2 = mobileAppToolPreviewInfo.toolDescription;
        }
        if ((i2 & 8) != 0) {
            previewData = mobileAppToolPreviewInfo.previewData;
        }
        return mobileAppToolPreviewInfo.copy(i, str, str2, previewData);
    }

    public static final /* synthetic */ void write$Self$tool(MobileAppToolPreviewInfo self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.l(0, self.iconRes, serialDesc);
        output.q(serialDesc, 1, self.toolLabel);
        output.q(serialDesc, 2, self.toolDescription);
        output.B(serialDesc, 3, (znf) kw9VarArr[3].getValue(), self.previewData);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getIconRes() {
        return this.iconRes;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getToolLabel() {
        return this.toolLabel;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getToolDescription() {
        return this.toolDescription;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final PreviewData getPreviewData() {
        return this.previewData;
    }

    public final MobileAppToolPreviewInfo copy(int iconRes, String toolLabel, String toolDescription, PreviewData previewData) {
        toolLabel.getClass();
        toolDescription.getClass();
        return new MobileAppToolPreviewInfo(iconRes, toolLabel, toolDescription, previewData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MobileAppToolPreviewInfo)) {
            return false;
        }
        MobileAppToolPreviewInfo mobileAppToolPreviewInfo = (MobileAppToolPreviewInfo) other;
        return this.iconRes == mobileAppToolPreviewInfo.iconRes && x44.r(this.toolLabel, mobileAppToolPreviewInfo.toolLabel) && x44.r(this.toolDescription, mobileAppToolPreviewInfo.toolDescription) && x44.r(this.previewData, mobileAppToolPreviewInfo.previewData);
    }

    public final int getIconRes() {
        return this.iconRes;
    }

    public final PreviewData getPreviewData() {
        return this.previewData;
    }

    public final String getToolDescription() {
        return this.toolDescription;
    }

    public final String getToolLabel() {
        return this.toolLabel;
    }

    public int hashCode() {
        int iL = kgh.l(kgh.l(Integer.hashCode(this.iconRes) * 31, 31, this.toolLabel), 31, this.toolDescription);
        PreviewData previewData = this.previewData;
        return iL + (previewData == null ? 0 : previewData.hashCode());
    }

    public String toString() {
        return "MobileAppToolPreviewInfo(iconRes=" + this.iconRes + ", toolLabel=" + this.toolLabel + ", toolDescription=" + this.toolDescription + ", previewData=" + this.previewData + ")";
    }

    public MobileAppToolPreviewInfo(int i, String str, String str2, PreviewData previewData) {
        str.getClass();
        str2.getClass();
        this.iconRes = i;
        this.toolLabel = str;
        this.toolDescription = str2;
        this.previewData = previewData;
    }
}
