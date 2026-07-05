package com.anthropic.claude.api.model;

import com.anthropic.claude.types.strings._ServerLocalizedString;
import defpackage.d4c;
import defpackage.fsh;
import defpackage.gmh;
import defpackage.gvj;
import defpackage.jce;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.nlh;
import defpackage.oc1;
import defpackage.onf;
import defpackage.rp4;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.wkj;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0087\b\u0018\u0000 :*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002;<BC\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBK\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012JG\u0010\u001d\u001a\u00020\u001a\"\n\b\u0001\u0010\u0001*\u0004\u0018\u00010\u00022\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0014\u0010 \u001a\u00060\u0004j\u0002`\u0005HÆ\u0003¢\u0006\u0004\b \u0010!J\u0018\u0010\"\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0010\u0010#\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b%\u0010&JV\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\f\b\u0002\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u0010/\u001a\u00020\b2\b\u0010.\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u001fR\u001b\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b4\u0010!R\u001f\u0010\u0007\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b5\u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b7\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00108\u001a\u0004\b9\u0010&¨\u0006="}, d2 = {"Lcom/anthropic/claude/api/model/ThinkingOption;", "ID", "", "id", "Lcom/anthropic/claude/types/strings/_ServerLocalizedString;", "Lcom/anthropic/claude/types/strings/ServerLocalizedString;", "name", "description", "", "recommended", "Lcom/anthropic/claude/api/model/Badge;", "badge", "<init>", "(Ljava/lang/Object;Lcom/anthropic/claude/types/strings/_ServerLocalizedString;Lcom/anthropic/claude/types/strings/_ServerLocalizedString;ZLcom/anthropic/claude/api/model/Badge;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/Object;Lcom/anthropic/claude/types/strings/_ServerLocalizedString;Lcom/anthropic/claude/types/strings/_ServerLocalizedString;ZLcom/anthropic/claude/api/model/Badge;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlinx/serialization/KSerializer;", "typeSerial0", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/model/ThinkingOption;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/KSerializer;)V", "write$Self", "component1", "()Ljava/lang/Object;", "component2", "()Lcom/anthropic/claude/types/strings/_ServerLocalizedString;", "component3", "component4", "()Z", "component5", "()Lcom/anthropic/claude/api/model/Badge;", "copy", "(Ljava/lang/Object;Lcom/anthropic/claude/types/strings/_ServerLocalizedString;Lcom/anthropic/claude/types/strings/_ServerLocalizedString;ZLcom/anthropic/claude/api/model/Badge;)Lcom/anthropic/claude/api/model/ThinkingOption;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "getId", "Lcom/anthropic/claude/types/strings/_ServerLocalizedString;", "getName", "getDescription", "Z", "getRecommended", "Lcom/anthropic/claude/api/model/Badge;", "getBadge", "Companion", "fmh", "gmh", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ThinkingOption<ID> {
    private static final SerialDescriptor $cachedDescriptor;
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final gmh Companion = new gmh();
    private final Badge badge;
    private final _ServerLocalizedString description;
    private final ID id;
    private final _ServerLocalizedString name;
    private final boolean recommended;

    static {
        nlh nlhVar = new nlh(6);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{null, yb5.w(w1aVar, nlhVar), yb5.w(w1aVar, new nlh(7)), null, null};
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.model.ThinkingOption", null, 5);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("name", false);
        pluginGeneratedSerialDescriptor.j("description", true);
        pluginGeneratedSerialDescriptor.j("recommended", true);
        pluginGeneratedSerialDescriptor.j("badge", true);
        $cachedDescriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ThinkingOption(int i, Object obj, _ServerLocalizedString _serverlocalizedstring, _ServerLocalizedString _serverlocalizedstring2, boolean z, Badge badge, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, $cachedDescriptor);
            throw null;
        }
        this.id = obj;
        this.name = _serverlocalizedstring;
        if ((i & 4) == 0) {
            this.description = null;
        } else {
            this.description = _serverlocalizedstring2;
        }
        if ((i & 8) == 0) {
            this.recommended = false;
        } else {
            this.recommended = z;
        }
        if ((i & 16) == 0) {
            this.badge = null;
        } else {
            this.badge = badge;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer _childSerializers$_anonymous_() {
        return new rp4(jce.a.b(_ServerLocalizedString.class), wkj.a, new KSerializer[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer _childSerializers$_anonymous_$0() {
        return new rp4(jce.a.b(_ServerLocalizedString.class), d4c.S(wkj.a), new KSerializer[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ThinkingOption copy$default(ThinkingOption thinkingOption, Object obj, _ServerLocalizedString _serverlocalizedstring, _ServerLocalizedString _serverlocalizedstring2, boolean z, Badge badge, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = thinkingOption.id;
        }
        if ((i & 2) != 0) {
            _serverlocalizedstring = thinkingOption.name;
        }
        if ((i & 4) != 0) {
            _serverlocalizedstring2 = thinkingOption.description;
        }
        if ((i & 8) != 0) {
            z = thinkingOption.recommended;
        }
        if ((i & 16) != 0) {
            badge = thinkingOption.badge;
        }
        Badge badge2 = badge;
        _ServerLocalizedString _serverlocalizedstring3 = _serverlocalizedstring2;
        return thinkingOption.copy(obj, _serverlocalizedstring, _serverlocalizedstring3, z, badge2);
    }

    public static final /* synthetic */ void write$Self$api(ThinkingOption self, vd4 output, SerialDescriptor serialDesc, KSerializer typeSerial0) {
        kw9[] kw9VarArr = $childSerializers;
        output.r(serialDesc, 0, typeSerial0, self.id);
        output.r(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.name);
        if (output.E(serialDesc) || self.description != null) {
            output.B(serialDesc, 2, (znf) kw9VarArr[2].getValue(), self.description);
        }
        if (output.E(serialDesc) || self.recommended) {
            output.p(serialDesc, 3, self.recommended);
        }
        if (!output.E(serialDesc) && self.badge == null) {
            return;
        }
        output.B(serialDesc, 4, oc1.a, self.badge);
    }

    public final ID component1() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final _ServerLocalizedString getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final _ServerLocalizedString getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getRecommended() {
        return this.recommended;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Badge getBadge() {
        return this.badge;
    }

    public final ThinkingOption<ID> copy(ID id, _ServerLocalizedString name, _ServerLocalizedString description, boolean recommended, Badge badge) {
        name.getClass();
        return new ThinkingOption<>(id, name, description, recommended, badge);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThinkingOption)) {
            return false;
        }
        ThinkingOption thinkingOption = (ThinkingOption) other;
        return x44.r(this.id, thinkingOption.id) && x44.r(this.name, thinkingOption.name) && x44.r(this.description, thinkingOption.description) && this.recommended == thinkingOption.recommended && x44.r(this.badge, thinkingOption.badge);
    }

    public final Badge getBadge() {
        return this.badge;
    }

    public final _ServerLocalizedString getDescription() {
        return this.description;
    }

    public final ID getId() {
        return this.id;
    }

    public final _ServerLocalizedString getName() {
        return this.name;
    }

    public final boolean getRecommended() {
        return this.recommended;
    }

    public int hashCode() {
        ID id = this.id;
        int iHashCode = (this.name.hashCode() + ((id == null ? 0 : id.hashCode()) * 31)) * 31;
        _ServerLocalizedString _serverlocalizedstring = this.description;
        int iP = fsh.p((iHashCode + (_serverlocalizedstring == null ? 0 : _serverlocalizedstring.hashCode())) * 31, 31, this.recommended);
        Badge badge = this.badge;
        return iP + (badge != null ? badge.hashCode() : 0);
    }

    public String toString() {
        return "ThinkingOption(id=" + this.id + ", name=" + this.name + ", description=" + this.description + ", recommended=" + this.recommended + ", badge=" + this.badge + ")";
    }

    public ThinkingOption(ID id, _ServerLocalizedString _serverlocalizedstring, _ServerLocalizedString _serverlocalizedstring2, boolean z, Badge badge) {
        _serverlocalizedstring.getClass();
        this.id = id;
        this.name = _serverlocalizedstring;
        this.description = _serverlocalizedstring2;
        this.recommended = z;
        this.badge = badge;
    }

    public /* synthetic */ ThinkingOption(Object obj, _ServerLocalizedString _serverlocalizedstring, _ServerLocalizedString _serverlocalizedstring2, boolean z, Badge badge, int i, mq5 mq5Var) {
        this(obj, _serverlocalizedstring, (i & 4) != 0 ? null : _serverlocalizedstring2, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : badge);
    }
}
