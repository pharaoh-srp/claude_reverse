package com.anthropic.claude.conway.protocol;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.cv4;
import defpackage.dv4;
import defpackage.fr4;
import defpackage.fsh;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.lm6;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.nr4;
import defpackage.onf;
import defpackage.sq6;
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
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u0000 E2\u00020\u0001:\u0002FGBw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010B\u0083\u0001\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\n0\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b!\u0010 J\u0082\u0001\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u0017J\u0010\u0010%\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\f2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)J'\u00102\u001a\u00020/2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-H\u0001¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u0017R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u00103\u0012\u0004\b6\u00107\u001a\u0004\b5\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00103\u001a\u0004\b8\u0010\u0017R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00103\u0012\u0004\b:\u00107\u001a\u0004\b9\u0010\u0017R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010;\u001a\u0004\b<\u0010\u001cR&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010;\u0012\u0004\b>\u00107\u001a\u0004\b=\u0010\u001cR&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010;\u0012\u0004\b@\u00107\u001a\u0004\b?\u0010\u001cR \u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010A\u0012\u0004\bC\u00107\u001a\u0004\bB\u0010 R \u0010\u000e\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010A\u0012\u0004\bD\u00107\u001a\u0004\b\u000e\u0010 ¨\u0006H"}, d2 = {"Lcom/anthropic/claude/conway/protocol/ConwayExtensionMeta;", "", "", "name", "displayName", "description", "extensionVersion", "", "tools", "httpRoutes", "Lcom/anthropic/claude/conway/protocol/ConwayAppScreenSpec;", "appScreens", "", "hasHook", "isBuiltin", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZZ)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZZLvnf;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/util/List;", "component6", "component7", "component8", "()Z", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZZ)Lcom/anthropic/claude/conway/protocol/ConwayExtensionMeta;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$conway", "(Lcom/anthropic/claude/conway/protocol/ConwayExtensionMeta;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getName", "getDisplayName", "getDisplayName$annotations", "()V", "getDescription", "getExtensionVersion", "getExtensionVersion$annotations", "Ljava/util/List;", "getTools", "getHttpRoutes", "getHttpRoutes$annotations", "getAppScreens", "getAppScreens$annotations", "Z", "getHasHook", "getHasHook$annotations", "isBuiltin$annotations", "Companion", "cv4", "dv4", "conway"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ConwayExtensionMeta {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final dv4 Companion = new dv4();
    private final List<ConwayAppScreenSpec> appScreens;
    private final String description;
    private final String displayName;
    private final String extensionVersion;
    private final boolean hasHook;
    private final List<String> httpRoutes;
    private final boolean isBuiltin;
    private final String name;
    private final List<String> tools;

    static {
        fr4 fr4Var = new fr4(6);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{null, null, null, null, yb5.w(w1aVar, fr4Var), yb5.w(w1aVar, new fr4(7)), null, null, null};
    }

    public /* synthetic */ ConwayExtensionMeta(int i, String str, String str2, String str3, String str4, List list, List list2, List list3, boolean z, boolean z2, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, cv4.a.getDescriptor());
            throw null;
        }
        this.name = str;
        if ((i & 2) == 0) {
            this.displayName = null;
        } else {
            this.displayName = str2;
        }
        if ((i & 4) == 0) {
            this.description = null;
        } else {
            this.description = str3;
        }
        if ((i & 8) == 0) {
            this.extensionVersion = null;
        } else {
            this.extensionVersion = str4;
        }
        int i2 = i & 16;
        lm6 lm6Var = lm6.E;
        if (i2 == 0) {
            this.tools = lm6Var;
        } else {
            this.tools = list;
        }
        if ((i & 32) == 0) {
            this.httpRoutes = lm6Var;
        } else {
            this.httpRoutes = list2;
        }
        if ((i & 64) == 0) {
            this.appScreens = lm6Var;
        } else {
            this.appScreens = list3;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0) {
            this.hasHook = false;
        } else {
            this.hasHook = z;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 0) {
            this.isBuiltin = false;
        } else {
            this.isBuiltin = z2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(srg.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new uo0(srg.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConwayExtensionMeta copy$default(ConwayExtensionMeta conwayExtensionMeta, String str, String str2, String str3, String str4, List list, List list2, List list3, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = conwayExtensionMeta.name;
        }
        if ((i & 2) != 0) {
            str2 = conwayExtensionMeta.displayName;
        }
        if ((i & 4) != 0) {
            str3 = conwayExtensionMeta.description;
        }
        if ((i & 8) != 0) {
            str4 = conwayExtensionMeta.extensionVersion;
        }
        if ((i & 16) != 0) {
            list = conwayExtensionMeta.tools;
        }
        if ((i & 32) != 0) {
            list2 = conwayExtensionMeta.httpRoutes;
        }
        if ((i & 64) != 0) {
            list3 = conwayExtensionMeta.appScreens;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            z = conwayExtensionMeta.hasHook;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0) {
            z2 = conwayExtensionMeta.isBuiltin;
        }
        boolean z3 = z;
        boolean z4 = z2;
        List list4 = list2;
        List list5 = list3;
        List list6 = list;
        String str5 = str3;
        return conwayExtensionMeta.copy(str, str2, str5, str4, list6, list4, list5, z3, z4);
    }

    @onf(with = nr4.class)
    public static /* synthetic */ void getAppScreens$annotations() {
    }

    public static /* synthetic */ void getDisplayName$annotations() {
    }

    public static /* synthetic */ void getExtensionVersion$annotations() {
    }

    public static /* synthetic */ void getHasHook$annotations() {
    }

    public static /* synthetic */ void getHttpRoutes$annotations() {
    }

    public static /* synthetic */ void isBuiltin$annotations() {
    }

    public static final /* synthetic */ void write$Self$conway(ConwayExtensionMeta self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.name);
        if (output.E(serialDesc) || self.displayName != null) {
            output.B(serialDesc, 1, srg.a, self.displayName);
        }
        if (output.E(serialDesc) || self.description != null) {
            output.B(serialDesc, 2, srg.a, self.description);
        }
        if (output.E(serialDesc) || self.extensionVersion != null) {
            output.B(serialDesc, 3, srg.a, self.extensionVersion);
        }
        boolean zE = output.E(serialDesc);
        lm6 lm6Var = lm6.E;
        if (zE || !x44.r(self.tools, lm6Var)) {
            output.r(serialDesc, 4, (znf) kw9VarArr[4].getValue(), self.tools);
        }
        if (output.E(serialDesc) || !x44.r(self.httpRoutes, lm6Var)) {
            output.r(serialDesc, 5, (znf) kw9VarArr[5].getValue(), self.httpRoutes);
        }
        if (output.E(serialDesc) || !x44.r(self.appScreens, lm6Var)) {
            output.r(serialDesc, 6, nr4.a, self.appScreens);
        }
        if (output.E(serialDesc) || self.hasHook) {
            output.p(serialDesc, 7, self.hasHook);
        }
        if (output.E(serialDesc) || self.isBuiltin) {
            output.p(serialDesc, 8, self.isBuiltin);
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getExtensionVersion() {
        return this.extensionVersion;
    }

    public final List<String> component5() {
        return this.tools;
    }

    public final List<String> component6() {
        return this.httpRoutes;
    }

    public final List<ConwayAppScreenSpec> component7() {
        return this.appScreens;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getHasHook() {
        return this.hasHook;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getIsBuiltin() {
        return this.isBuiltin;
    }

    public final ConwayExtensionMeta copy(String name, String displayName, String description, String extensionVersion, List<String> tools, List<String> httpRoutes, List<ConwayAppScreenSpec> appScreens, boolean hasHook, boolean isBuiltin) {
        name.getClass();
        tools.getClass();
        httpRoutes.getClass();
        appScreens.getClass();
        return new ConwayExtensionMeta(name, displayName, description, extensionVersion, tools, httpRoutes, appScreens, hasHook, isBuiltin);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConwayExtensionMeta)) {
            return false;
        }
        ConwayExtensionMeta conwayExtensionMeta = (ConwayExtensionMeta) other;
        return x44.r(this.name, conwayExtensionMeta.name) && x44.r(this.displayName, conwayExtensionMeta.displayName) && x44.r(this.description, conwayExtensionMeta.description) && x44.r(this.extensionVersion, conwayExtensionMeta.extensionVersion) && x44.r(this.tools, conwayExtensionMeta.tools) && x44.r(this.httpRoutes, conwayExtensionMeta.httpRoutes) && x44.r(this.appScreens, conwayExtensionMeta.appScreens) && this.hasHook == conwayExtensionMeta.hasHook && this.isBuiltin == conwayExtensionMeta.isBuiltin;
    }

    public final List<ConwayAppScreenSpec> getAppScreens() {
        return this.appScreens;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getExtensionVersion() {
        return this.extensionVersion;
    }

    public final boolean getHasHook() {
        return this.hasHook;
    }

    public final List<String> getHttpRoutes() {
        return this.httpRoutes;
    }

    public final String getName() {
        return this.name;
    }

    public final List<String> getTools() {
        return this.tools;
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        String str = this.displayName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.extensionVersion;
        return Boolean.hashCode(this.isBuiltin) + fsh.p(kgh.m(kgh.m(kgh.m((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.tools), 31, this.httpRoutes), 31, this.appScreens), 31, this.hasHook);
    }

    public final boolean isBuiltin() {
        return this.isBuiltin;
    }

    public String toString() {
        String str = this.name;
        String str2 = this.displayName;
        String str3 = this.description;
        String str4 = this.extensionVersion;
        List<String> list = this.tools;
        List<String> list2 = this.httpRoutes;
        List<ConwayAppScreenSpec> list3 = this.appScreens;
        boolean z = this.hasHook;
        boolean z2 = this.isBuiltin;
        StringBuilder sbR = kgh.r("ConwayExtensionMeta(name=", str, ", displayName=", str2, ", description=");
        kgh.u(sbR, str3, ", extensionVersion=", str4, ", tools=");
        sbR.append(list);
        sbR.append(", httpRoutes=");
        sbR.append(list2);
        sbR.append(", appScreens=");
        sbR.append(list3);
        sbR.append(", hasHook=");
        sbR.append(z);
        sbR.append(", isBuiltin=");
        return sq6.v(")", sbR, z2);
    }

    public ConwayExtensionMeta(String str, String str2, String str3, String str4, List<String> list, List<String> list2, List<ConwayAppScreenSpec> list3, boolean z, boolean z2) {
        str.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.name = str;
        this.displayName = str2;
        this.description = str3;
        this.extensionVersion = str4;
        this.tools = list;
        this.httpRoutes = list2;
        this.appScreens = list3;
        this.hasHook = z;
        this.isBuiltin = z2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ConwayExtensionMeta(String str, String str2, String str3, String str4, List list, List list2, List list3, boolean z, boolean z2, int i, mq5 mq5Var) {
        str2 = (i & 2) != 0 ? null : str2;
        str3 = (i & 4) != 0 ? null : str3;
        str4 = (i & 8) != 0 ? null : str4;
        int i2 = i & 16;
        lm6 lm6Var = lm6.E;
        this(str, str2, str3, str4, i2 != 0 ? lm6Var : list, (i & 32) != 0 ? lm6Var : list2, (i & 64) != 0 ? lm6Var : list3, (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? false : z, (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? false : z2);
    }
}
