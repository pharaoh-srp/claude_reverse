package com.anthropic.claude.configs.flags;

import com.anthropic.claude.api.experience.ExperienceToggle;
import com.anthropic.claude.types.strings.ToolSearchMode;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.ozh;
import defpackage.pzh;
import defpackage.qzh;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000212B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJH\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001aJ\u0010\u0010$\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b-\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b.\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b/\u0010\u001a¨\u00063"}, d2 = {"Lcom/anthropic/claude/configs/flags/ToolSearchModeConfig;", "", "", "title", "description", "title_key", "description_key", "Lcom/anthropic/claude/types/strings/ToolSearchMode;", ExperienceToggle.DEFAULT_PARAM_KEY, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$configs", "(Lcom/anthropic/claude/configs/flags/ToolSearchModeConfig;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5-OP4DWQA", "component5", "copy-6PMWhIo", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/configs/flags/ToolSearchModeConfig;", "copy", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getDescription", "getTitle_key", "getDescription_key", "getValue-OP4DWQA", "Companion", "ozh", "pzh", "configs"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ToolSearchModeConfig {
    public static final int $stable = 0;
    public static final pzh Companion = new pzh();
    private final String description;
    private final String description_key;
    private final String title;
    private final String title_key;
    private final String value;

    private /* synthetic */ ToolSearchModeConfig(int i, String str, String str2, String str3, String str4, String str5, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, ozh.a.getDescriptor());
            throw null;
        }
        this.title = str;
        this.description = str2;
        if ((i & 4) == 0) {
            this.title_key = null;
        } else {
            this.title_key = str3;
        }
        if ((i & 8) == 0) {
            this.description_key = null;
        } else {
            this.description_key = str4;
        }
        if ((i & 16) == 0) {
            this.value = null;
        } else {
            this.value = str5;
        }
    }

    /* JADX INFO: renamed from: copy-6PMWhIo$default, reason: not valid java name */
    public static /* synthetic */ ToolSearchModeConfig m729copy6PMWhIo$default(ToolSearchModeConfig toolSearchModeConfig, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = toolSearchModeConfig.title;
        }
        if ((i & 2) != 0) {
            str2 = toolSearchModeConfig.description;
        }
        if ((i & 4) != 0) {
            str3 = toolSearchModeConfig.title_key;
        }
        if ((i & 8) != 0) {
            str4 = toolSearchModeConfig.description_key;
        }
        if ((i & 16) != 0) {
            str5 = toolSearchModeConfig.value;
        }
        String str6 = str5;
        String str7 = str3;
        return toolSearchModeConfig.m731copy6PMWhIo(str, str2, str7, str4, str6);
    }

    public static final /* synthetic */ void write$Self$configs(ToolSearchModeConfig self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.title);
        output.q(serialDesc, 1, self.description);
        if (output.E(serialDesc) || self.title_key != null) {
            output.B(serialDesc, 2, srg.a, self.title_key);
        }
        if (output.E(serialDesc) || self.description_key != null) {
            output.B(serialDesc, 3, srg.a, self.description_key);
        }
        if (!output.E(serialDesc) && self.value == null) {
            return;
        }
        qzh qzhVar = qzh.a;
        String str = self.value;
        output.B(serialDesc, 4, qzhVar, str != null ? ToolSearchMode.m1150boximpl(str) : null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle_key() {
        return this.title_key;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDescription_key() {
        return this.description_key;
    }

    /* JADX INFO: renamed from: component5-OP4DWQA, reason: not valid java name and from getter */
    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: copy-6PMWhIo, reason: not valid java name */
    public final ToolSearchModeConfig m731copy6PMWhIo(String title, String description, String title_key, String description_key, String value) {
        title.getClass();
        description.getClass();
        return new ToolSearchModeConfig(title, description, title_key, description_key, value, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.anthropic.claude.configs.flags.ToolSearchModeConfig
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.anthropic.claude.configs.flags.ToolSearchModeConfig r5 = (com.anthropic.claude.configs.flags.ToolSearchModeConfig) r5
            java.lang.String r1 = r4.title
            java.lang.String r3 = r5.title
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.description
            java.lang.String r3 = r5.description
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.title_key
            java.lang.String r3 = r5.title_key
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r4.description_key
            java.lang.String r3 = r5.description_key
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            java.lang.String r4 = r4.value
            java.lang.String r5 = r5.value
            if (r4 != 0) goto L44
            if (r5 != 0) goto L42
            r4 = r0
            goto L4b
        L42:
            r4 = r2
            goto L4b
        L44:
            if (r5 != 0) goto L47
            goto L42
        L47:
            boolean r4 = com.anthropic.claude.types.strings.ToolSearchMode.m1153equalsimpl0(r4, r5)
        L4b:
            if (r4 != 0) goto L4e
            return r2
        L4e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.configs.flags.ToolSearchModeConfig.equals(java.lang.Object):boolean");
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDescription_key() {
        return this.description_key;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTitle_key() {
        return this.title_key;
    }

    /* JADX INFO: renamed from: getValue-OP4DWQA, reason: not valid java name */
    public final String m732getValueOP4DWQA() {
        return this.value;
    }

    public int hashCode() {
        int iL = kgh.l(this.title.hashCode() * 31, 31, this.description);
        String str = this.title_key;
        int iHashCode = (iL + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description_key;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.value;
        return iHashCode2 + (str3 != null ? ToolSearchMode.m1154hashCodeimpl(str3) : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.description;
        String str3 = this.title_key;
        String str4 = this.description_key;
        String str5 = this.value;
        String strM1155toStringimpl = str5 == null ? "null" : ToolSearchMode.m1155toStringimpl(str5);
        StringBuilder sbR = kgh.r("ToolSearchModeConfig(title=", str, ", description=", str2, ", title_key=");
        kgh.u(sbR, str3, ", description_key=", str4, ", value=");
        return ij0.m(sbR, strM1155toStringimpl, ")");
    }

    public /* synthetic */ ToolSearchModeConfig(String str, String str2, String str3, String str4, String str5, mq5 mq5Var) {
        this(str, str2, str3, str4, str5);
    }

    public /* synthetic */ ToolSearchModeConfig(int i, String str, String str2, String str3, String str4, String str5, vnf vnfVar, mq5 mq5Var) {
        this(i, str, str2, str3, str4, str5, vnfVar);
    }

    private ToolSearchModeConfig(String str, String str2, String str3, String str4, String str5) {
        str.getClass();
        str2.getClass();
        this.title = str;
        this.description = str2;
        this.title_key = str3;
        this.description_key = str4;
        this.value = str5;
    }

    public /* synthetic */ ToolSearchModeConfig(String str, String str2, String str3, String str4, String str5, int i, mq5 mq5Var) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, null);
    }
}
