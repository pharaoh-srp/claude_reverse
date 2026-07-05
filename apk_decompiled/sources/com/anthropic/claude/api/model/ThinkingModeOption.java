package com.anthropic.claude.api.model;

import com.anthropic.claude.types.strings.ThinkingMode;
import com.anthropic.claude.types.strings._ServerLocalizedString;
import defpackage.cmh;
import defpackage.d4c;
import defpackage.dmh;
import defpackage.emh;
import defpackage.gvj;
import defpackage.jce;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.nlh;
import defpackage.onf;
import defpackage.rp4;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.wkj;
import defpackage.yb5;
import defpackage.znf;
import defpackage.zt1;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\b\u0087\b\u0018\u0000 82\u00020\u0001:\u00029:BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\n\u0010\u0007\u001a\u00060\u0004j\u0002`\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eBW\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0014\u0010\u001f\u001a\u00060\u0004j\u0002`\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0014\u0010!\u001a\u00060\u0004j\u0002`\u0005HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\"\u0010\u001eJ\u0018\u0010$\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005HÆ\u0003¢\u0006\u0004\b$\u0010 J\u0012\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b%\u0010&J`\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\f\b\u0002\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\f\b\u0002\u0010\u0007\u001a\u00060\u0004j\u0002`\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u001eJ\u0010\u0010+\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010.\u001a\u00020\u000b2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u001eR\u001b\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b3\u0010 R\u001b\u0010\u0007\u001a\u00060\u0004j\u0002`\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b4\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b5\u0010\u001eR\u001f\u0010\n\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058\u0006¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b6\u0010 R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00107\u001a\u0004\b\f\u0010&¨\u0006;"}, d2 = {"Lcom/anthropic/claude/api/model/ThinkingModeOption;", "", "", "id", "Lcom/anthropic/claude/types/strings/_ServerLocalizedString;", "Lcom/anthropic/claude/types/strings/ServerLocalizedString;", "title", "description", "Lcom/anthropic/claude/types/strings/ThinkingMode;", "mode", "selection_title", "", "is_default", "<init>", "(Ljava/lang/String;Lcom/anthropic/claude/types/strings/_ServerLocalizedString;Lcom/anthropic/claude/types/strings/_ServerLocalizedString;Ljava/lang/String;Lcom/anthropic/claude/types/strings/_ServerLocalizedString;Ljava/lang/Boolean;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/anthropic/claude/types/strings/_ServerLocalizedString;Lcom/anthropic/claude/types/strings/_ServerLocalizedString;Ljava/lang/String;Lcom/anthropic/claude/types/strings/_ServerLocalizedString;Ljava/lang/Boolean;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/model/ThinkingModeOption;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/anthropic/claude/types/strings/_ServerLocalizedString;", "component3", "component4-KLP3kNA", "component4", "component5", "component6", "()Ljava/lang/Boolean;", "copy-3WgSuLE", "(Ljava/lang/String;Lcom/anthropic/claude/types/strings/_ServerLocalizedString;Lcom/anthropic/claude/types/strings/_ServerLocalizedString;Ljava/lang/String;Lcom/anthropic/claude/types/strings/_ServerLocalizedString;Ljava/lang/Boolean;)Lcom/anthropic/claude/api/model/ThinkingModeOption;", "copy", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lcom/anthropic/claude/types/strings/_ServerLocalizedString;", "getTitle", "getDescription", "getMode-KLP3kNA", "getSelection_title", "Ljava/lang/Boolean;", "Companion", "cmh", "dmh", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ThinkingModeOption {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final dmh Companion = new dmh();
    private final _ServerLocalizedString description;
    private final String id;
    private final Boolean is_default;
    private final String mode;
    private final _ServerLocalizedString selection_title;
    private final _ServerLocalizedString title;

    static {
        nlh nlhVar = new nlh(3);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{null, yb5.w(w1aVar, nlhVar), yb5.w(w1aVar, new nlh(4)), null, yb5.w(w1aVar, new nlh(5)), null};
    }

    private /* synthetic */ ThinkingModeOption(int i, String str, _ServerLocalizedString _serverlocalizedstring, _ServerLocalizedString _serverlocalizedstring2, String str2, _ServerLocalizedString _serverlocalizedstring3, Boolean bool, vnf vnfVar) {
        if (7 != (i & 7)) {
            gvj.f(i, 7, cmh.a.getDescriptor());
            throw null;
        }
        this.id = str;
        this.title = _serverlocalizedstring;
        this.description = _serverlocalizedstring2;
        if ((i & 8) == 0) {
            this.mode = null;
        } else {
            this.mode = str2;
        }
        if ((i & 16) == 0) {
            this.selection_title = null;
        } else {
            this.selection_title = _serverlocalizedstring3;
        }
        if ((i & 32) == 0) {
            this.is_default = null;
        } else {
            this.is_default = bool;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer _childSerializers$_anonymous_() {
        return new rp4(jce.a.b(_ServerLocalizedString.class), wkj.a, new KSerializer[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer _childSerializers$_anonymous_$0() {
        return new rp4(jce.a.b(_ServerLocalizedString.class), wkj.a, new KSerializer[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer _childSerializers$_anonymous_$1() {
        return new rp4(jce.a.b(_ServerLocalizedString.class), d4c.S(wkj.a), new KSerializer[0]);
    }

    /* JADX INFO: renamed from: copy-3WgSuLE$default, reason: not valid java name */
    public static /* synthetic */ ThinkingModeOption m383copy3WgSuLE$default(ThinkingModeOption thinkingModeOption, String str, _ServerLocalizedString _serverlocalizedstring, _ServerLocalizedString _serverlocalizedstring2, String str2, _ServerLocalizedString _serverlocalizedstring3, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = thinkingModeOption.id;
        }
        if ((i & 2) != 0) {
            _serverlocalizedstring = thinkingModeOption.title;
        }
        if ((i & 4) != 0) {
            _serverlocalizedstring2 = thinkingModeOption.description;
        }
        if ((i & 8) != 0) {
            str2 = thinkingModeOption.mode;
        }
        if ((i & 16) != 0) {
            _serverlocalizedstring3 = thinkingModeOption.selection_title;
        }
        if ((i & 32) != 0) {
            bool = thinkingModeOption.is_default;
        }
        _ServerLocalizedString _serverlocalizedstring4 = _serverlocalizedstring3;
        Boolean bool2 = bool;
        return thinkingModeOption.m385copy3WgSuLE(str, _serverlocalizedstring, _serverlocalizedstring2, str2, _serverlocalizedstring4, bool2);
    }

    public static final /* synthetic */ void write$Self$api(ThinkingModeOption self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.id);
        output.r(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.title);
        output.r(serialDesc, 2, (znf) kw9VarArr[2].getValue(), self.description);
        if (output.E(serialDesc) || self.mode != null) {
            emh emhVar = emh.a;
            String str = self.mode;
            output.B(serialDesc, 3, emhVar, str != null ? ThinkingMode.m1142boximpl(str) : null);
        }
        if (output.E(serialDesc) || self.selection_title != null) {
            output.B(serialDesc, 4, (znf) kw9VarArr[4].getValue(), self.selection_title);
        }
        if (!output.E(serialDesc) && self.is_default == null) {
            return;
        }
        output.B(serialDesc, 5, zt1.a, self.is_default);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final _ServerLocalizedString getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final _ServerLocalizedString getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component4-KLP3kNA, reason: not valid java name and from getter */
    public final String getMode() {
        return this.mode;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final _ServerLocalizedString getSelection_title() {
        return this.selection_title;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getIs_default() {
        return this.is_default;
    }

    /* JADX INFO: renamed from: copy-3WgSuLE, reason: not valid java name */
    public final ThinkingModeOption m385copy3WgSuLE(String id, _ServerLocalizedString title, _ServerLocalizedString description, String mode, _ServerLocalizedString selection_title, Boolean is_default) {
        id.getClass();
        title.getClass();
        description.getClass();
        return new ThinkingModeOption(id, title, description, mode, selection_title, is_default, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
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
            boolean r1 = r5 instanceof com.anthropic.claude.api.model.ThinkingModeOption
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.anthropic.claude.api.model.ThinkingModeOption r5 = (com.anthropic.claude.api.model.ThinkingModeOption) r5
            java.lang.String r1 = r4.id
            java.lang.String r3 = r5.id
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            com.anthropic.claude.types.strings._ServerLocalizedString r1 = r4.title
            com.anthropic.claude.types.strings._ServerLocalizedString r3 = r5.title
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            com.anthropic.claude.types.strings._ServerLocalizedString r1 = r4.description
            com.anthropic.claude.types.strings._ServerLocalizedString r3 = r5.description
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r4.mode
            java.lang.String r3 = r5.mode
            if (r1 != 0) goto L39
            if (r3 != 0) goto L37
            r1 = r0
            goto L40
        L37:
            r1 = r2
            goto L40
        L39:
            if (r3 != 0) goto L3c
            goto L37
        L3c:
            boolean r1 = com.anthropic.claude.types.strings.ThinkingMode.m1145equalsimpl0(r1, r3)
        L40:
            if (r1 != 0) goto L43
            return r2
        L43:
            com.anthropic.claude.types.strings._ServerLocalizedString r1 = r4.selection_title
            com.anthropic.claude.types.strings._ServerLocalizedString r3 = r5.selection_title
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L4e
            return r2
        L4e:
            java.lang.Boolean r4 = r4.is_default
            java.lang.Boolean r5 = r5.is_default
            boolean r4 = defpackage.x44.r(r4, r5)
            if (r4 != 0) goto L59
            return r2
        L59:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.api.model.ThinkingModeOption.equals(java.lang.Object):boolean");
    }

    public final _ServerLocalizedString getDescription() {
        return this.description;
    }

    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: getMode-KLP3kNA, reason: not valid java name */
    public final String m386getModeKLP3kNA() {
        return this.mode;
    }

    public final _ServerLocalizedString getSelection_title() {
        return this.selection_title;
    }

    public final _ServerLocalizedString getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = (this.description.hashCode() + ((this.title.hashCode() + (this.id.hashCode() * 31)) * 31)) * 31;
        String str = this.mode;
        int iM1146hashCodeimpl = (iHashCode + (str == null ? 0 : ThinkingMode.m1146hashCodeimpl(str))) * 31;
        _ServerLocalizedString _serverlocalizedstring = this.selection_title;
        int iHashCode2 = (iM1146hashCodeimpl + (_serverlocalizedstring == null ? 0 : _serverlocalizedstring.hashCode())) * 31;
        Boolean bool = this.is_default;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final Boolean is_default() {
        return this.is_default;
    }

    public String toString() {
        String str = this.id;
        _ServerLocalizedString _serverlocalizedstring = this.title;
        _ServerLocalizedString _serverlocalizedstring2 = this.description;
        String str2 = this.mode;
        return "ThinkingModeOption(id=" + str + ", title=" + _serverlocalizedstring + ", description=" + _serverlocalizedstring2 + ", mode=" + (str2 == null ? "null" : ThinkingMode.m1148toStringimpl(str2)) + ", selection_title=" + this.selection_title + ", is_default=" + this.is_default + ")";
    }

    public /* synthetic */ ThinkingModeOption(String str, _ServerLocalizedString _serverlocalizedstring, _ServerLocalizedString _serverlocalizedstring2, String str2, _ServerLocalizedString _serverlocalizedstring3, Boolean bool, mq5 mq5Var) {
        this(str, _serverlocalizedstring, _serverlocalizedstring2, str2, _serverlocalizedstring3, bool);
    }

    public /* synthetic */ ThinkingModeOption(int i, String str, _ServerLocalizedString _serverlocalizedstring, _ServerLocalizedString _serverlocalizedstring2, String str2, _ServerLocalizedString _serverlocalizedstring3, Boolean bool, vnf vnfVar, mq5 mq5Var) {
        this(i, str, _serverlocalizedstring, _serverlocalizedstring2, str2, _serverlocalizedstring3, bool, vnfVar);
    }

    private ThinkingModeOption(String str, _ServerLocalizedString _serverlocalizedstring, _ServerLocalizedString _serverlocalizedstring2, String str2, _ServerLocalizedString _serverlocalizedstring3, Boolean bool) {
        str.getClass();
        _serverlocalizedstring.getClass();
        _serverlocalizedstring2.getClass();
        this.id = str;
        this.title = _serverlocalizedstring;
        this.description = _serverlocalizedstring2;
        this.mode = str2;
        this.selection_title = _serverlocalizedstring3;
        this.is_default = bool;
    }

    public /* synthetic */ ThinkingModeOption(String str, _ServerLocalizedString _serverlocalizedstring, _ServerLocalizedString _serverlocalizedstring2, String str2, _ServerLocalizedString _serverlocalizedstring3, Boolean bool, int i, mq5 mq5Var) {
        this(str, _serverlocalizedstring, _serverlocalizedstring2, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : _serverlocalizedstring3, (i & 32) != 0 ? null : bool, null);
    }
}
