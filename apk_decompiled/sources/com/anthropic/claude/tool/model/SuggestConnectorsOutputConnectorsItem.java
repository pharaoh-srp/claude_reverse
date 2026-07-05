package com.anthropic.claude.tool.model;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.grc;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.nxg;
import defpackage.onf;
import defpackage.oxg;
import defpackage.srg;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.zt1;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000289B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rBk\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001dJ\u0012\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001dJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001dJj\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001dJ\u0010\u0010)\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010,\u001a\u00020\b2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b0\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b1\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b2\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b3\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b\t\u0010#R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b5\u0010\u001dR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010.\u001a\u0004\b6\u0010\u001d¨\u0006:"}, d2 = {"Lcom/anthropic/claude/tool/model/SuggestConnectorsOutputConnectorsItem;", "", "", "description", "directoryUuid", "iconUrl", "installState", "installedServerId", "", "isAuthless", "name", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_tool_model", "(Lcom/anthropic/claude/tool/model/SuggestConnectorsOutputConnectorsItem;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Ljava/lang/Boolean;", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/tool/model/SuggestConnectorsOutputConnectorsItem;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDescription", "getDirectoryUuid", "getIconUrl", "getInstallState", "getInstalledServerId", "Ljava/lang/Boolean;", "getName", "getUrl", "Companion", "nxg", "oxg", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class SuggestConnectorsOutputConnectorsItem {
    public static final oxg Companion = new oxg();
    private final String description;
    private final String directoryUuid;
    private final String iconUrl;
    private final String installState;
    private final String installedServerId;
    private final Boolean isAuthless;
    private final String name;
    private final String url;

    public /* synthetic */ SuggestConnectorsOutputConnectorsItem(int i, String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, String str7, vnf vnfVar) {
        if (67 != (i & 67)) {
            gvj.f(i, 67, nxg.a.getDescriptor());
            throw null;
        }
        this.description = str;
        this.directoryUuid = str2;
        if ((i & 4) == 0) {
            this.iconUrl = null;
        } else {
            this.iconUrl = str3;
        }
        if ((i & 8) == 0) {
            this.installState = null;
        } else {
            this.installState = str4;
        }
        if ((i & 16) == 0) {
            this.installedServerId = null;
        } else {
            this.installedServerId = str5;
        }
        if ((i & 32) == 0) {
            this.isAuthless = null;
        } else {
            this.isAuthless = bool;
        }
        this.name = str6;
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0) {
            this.url = null;
        } else {
            this.url = str7;
        }
    }

    public static /* synthetic */ SuggestConnectorsOutputConnectorsItem copy$default(SuggestConnectorsOutputConnectorsItem suggestConnectorsOutputConnectorsItem, String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = suggestConnectorsOutputConnectorsItem.description;
        }
        if ((i & 2) != 0) {
            str2 = suggestConnectorsOutputConnectorsItem.directoryUuid;
        }
        if ((i & 4) != 0) {
            str3 = suggestConnectorsOutputConnectorsItem.iconUrl;
        }
        if ((i & 8) != 0) {
            str4 = suggestConnectorsOutputConnectorsItem.installState;
        }
        if ((i & 16) != 0) {
            str5 = suggestConnectorsOutputConnectorsItem.installedServerId;
        }
        if ((i & 32) != 0) {
            bool = suggestConnectorsOutputConnectorsItem.isAuthless;
        }
        if ((i & 64) != 0) {
            str6 = suggestConnectorsOutputConnectorsItem.name;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            str7 = suggestConnectorsOutputConnectorsItem.url;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        Boolean bool2 = bool;
        return suggestConnectorsOutputConnectorsItem.copy(str, str2, str3, str4, str10, bool2, str8, str9);
    }

    public static final /* synthetic */ void write$Self$Claude_tool_model(SuggestConnectorsOutputConnectorsItem self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.description);
        output.q(serialDesc, 1, self.directoryUuid);
        if (output.E(serialDesc) || self.iconUrl != null) {
            output.B(serialDesc, 2, srg.a, self.iconUrl);
        }
        if (output.E(serialDesc) || self.installState != null) {
            output.B(serialDesc, 3, srg.a, self.installState);
        }
        if (output.E(serialDesc) || self.installedServerId != null) {
            output.B(serialDesc, 4, srg.a, self.installedServerId);
        }
        if (output.E(serialDesc) || self.isAuthless != null) {
            output.B(serialDesc, 5, zt1.a, self.isAuthless);
        }
        output.q(serialDesc, 6, self.name);
        if (!output.E(serialDesc) && self.url == null) {
            return;
        }
        output.B(serialDesc, 7, srg.a, self.url);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDirectoryUuid() {
        return this.directoryUuid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getInstallState() {
        return this.installState;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getInstalledServerId() {
        return this.installedServerId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getIsAuthless() {
        return this.isAuthless;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final SuggestConnectorsOutputConnectorsItem copy(String description, String directoryUuid, String iconUrl, String installState, String installedServerId, Boolean isAuthless, String name, String url) {
        description.getClass();
        directoryUuid.getClass();
        name.getClass();
        return new SuggestConnectorsOutputConnectorsItem(description, directoryUuid, iconUrl, installState, installedServerId, isAuthless, name, url);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SuggestConnectorsOutputConnectorsItem)) {
            return false;
        }
        SuggestConnectorsOutputConnectorsItem suggestConnectorsOutputConnectorsItem = (SuggestConnectorsOutputConnectorsItem) other;
        return x44.r(this.description, suggestConnectorsOutputConnectorsItem.description) && x44.r(this.directoryUuid, suggestConnectorsOutputConnectorsItem.directoryUuid) && x44.r(this.iconUrl, suggestConnectorsOutputConnectorsItem.iconUrl) && x44.r(this.installState, suggestConnectorsOutputConnectorsItem.installState) && x44.r(this.installedServerId, suggestConnectorsOutputConnectorsItem.installedServerId) && x44.r(this.isAuthless, suggestConnectorsOutputConnectorsItem.isAuthless) && x44.r(this.name, suggestConnectorsOutputConnectorsItem.name) && x44.r(this.url, suggestConnectorsOutputConnectorsItem.url);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDirectoryUuid() {
        return this.directoryUuid;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getInstallState() {
        return this.installState;
    }

    public final String getInstalledServerId() {
        return this.installedServerId;
    }

    public final String getName() {
        return this.name;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iL = kgh.l(this.description.hashCode() * 31, 31, this.directoryUuid);
        String str = this.iconUrl;
        int iHashCode = (iL + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.installState;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.installedServerId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isAuthless;
        int iL2 = kgh.l((iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.name);
        String str4 = this.url;
        return iL2 + (str4 != null ? str4.hashCode() : 0);
    }

    public final Boolean isAuthless() {
        return this.isAuthless;
    }

    public String toString() {
        String str = this.description;
        String str2 = this.directoryUuid;
        String str3 = this.iconUrl;
        String str4 = this.installState;
        String str5 = this.installedServerId;
        Boolean bool = this.isAuthless;
        String str6 = this.name;
        String str7 = this.url;
        StringBuilder sbR = kgh.r("SuggestConnectorsOutputConnectorsItem(description=", str, ", directoryUuid=", str2, ", iconUrl=");
        kgh.u(sbR, str3, ", installState=", str4, ", installedServerId=");
        sbR.append(str5);
        sbR.append(", isAuthless=");
        sbR.append(bool);
        sbR.append(", name=");
        return vb7.t(sbR, str6, ", url=", str7, ")");
    }

    public SuggestConnectorsOutputConnectorsItem(String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, String str7) {
        grc.B(str, str2, str6);
        this.description = str;
        this.directoryUuid = str2;
        this.iconUrl = str3;
        this.installState = str4;
        this.installedServerId = str5;
        this.isAuthless = bool;
        this.name = str6;
        this.url = str7;
    }

    public /* synthetic */ SuggestConnectorsOutputConnectorsItem(String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, String str7, int i, mq5 mq5Var) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : bool, str6, (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? null : str7);
    }
}
