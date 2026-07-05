package com.anthropic.claude.api.model;

import com.anthropic.claude.types.strings._ServerLocalizedString;
import defpackage.d4c;
import defpackage.j7;
import defpackage.jce;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.pc1;
import defpackage.rp4;
import defpackage.tc1;
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

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B#\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB/\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0017\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ,\u0010\u001b\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\tHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001f\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u001a¨\u0006-"}, d2 = {"Lcom/anthropic/claude/api/model/Badge;", "", "Lcom/anthropic/claude/types/strings/_ServerLocalizedString;", "Lcom/anthropic/claude/types/strings/ServerLocalizedString;", "message", "Lcom/anthropic/claude/api/model/BadgeVariant;", "variant", "<init>", "(Lcom/anthropic/claude/types/strings/_ServerLocalizedString;Lcom/anthropic/claude/api/model/BadgeVariant;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/types/strings/_ServerLocalizedString;Lcom/anthropic/claude/api/model/BadgeVariant;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/model/Badge;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/types/strings/_ServerLocalizedString;", "component2", "()Lcom/anthropic/claude/api/model/BadgeVariant;", "copy", "(Lcom/anthropic/claude/types/strings/_ServerLocalizedString;Lcom/anthropic/claude/api/model/BadgeVariant;)Lcom/anthropic/claude/api/model/Badge;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/types/strings/_ServerLocalizedString;", "getMessage", "Lcom/anthropic/claude/api/model/BadgeVariant;", "getVariant", "Companion", "oc1", "pc1", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class Badge {
    public static final int $stable = 0;
    private final _ServerLocalizedString message;
    private final BadgeVariant variant;
    public static final pc1 Companion = new pc1();
    private static final kw9[] $childSerializers = {yb5.w(w1a.F, new j7(29)), null};

    public /* synthetic */ Badge(int i, _ServerLocalizedString _serverlocalizedstring, BadgeVariant badgeVariant, vnf vnfVar) {
        this.message = (i & 1) == 0 ? null : _serverlocalizedstring;
        if ((i & 2) == 0) {
            this.variant = BadgeVariant.NEUTRAL;
        } else {
            this.variant = badgeVariant;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer _childSerializers$_anonymous_() {
        return new rp4(jce.a.b(_ServerLocalizedString.class), d4c.S(wkj.a), new KSerializer[0]);
    }

    public static /* synthetic */ Badge copy$default(Badge badge, _ServerLocalizedString _serverlocalizedstring, BadgeVariant badgeVariant, int i, Object obj) {
        if ((i & 1) != 0) {
            _serverlocalizedstring = badge.message;
        }
        if ((i & 2) != 0) {
            badgeVariant = badge.variant;
        }
        return badge.copy(_serverlocalizedstring, badgeVariant);
    }

    public static final /* synthetic */ void write$Self$api(Badge self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        if (output.E(serialDesc) || self.message != null) {
            output.B(serialDesc, 0, (znf) kw9VarArr[0].getValue(), self.message);
        }
        if (!output.E(serialDesc) && self.variant == BadgeVariant.NEUTRAL) {
            return;
        }
        output.r(serialDesc, 1, tc1.d, self.variant);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final _ServerLocalizedString getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BadgeVariant getVariant() {
        return this.variant;
    }

    public final Badge copy(_ServerLocalizedString message, BadgeVariant variant) {
        variant.getClass();
        return new Badge(message, variant);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Badge)) {
            return false;
        }
        Badge badge = (Badge) other;
        return x44.r(this.message, badge.message) && this.variant == badge.variant;
    }

    public final _ServerLocalizedString getMessage() {
        return this.message;
    }

    public final BadgeVariant getVariant() {
        return this.variant;
    }

    public int hashCode() {
        _ServerLocalizedString _serverlocalizedstring = this.message;
        return this.variant.hashCode() + ((_serverlocalizedstring == null ? 0 : _serverlocalizedstring.hashCode()) * 31);
    }

    public String toString() {
        return "Badge(message=" + this.message + ", variant=" + this.variant + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Badge() {
        this((_ServerLocalizedString) null, (BadgeVariant) (0 == true ? 1 : 0), 3, (mq5) (0 == true ? 1 : 0));
    }

    public Badge(_ServerLocalizedString _serverlocalizedstring, BadgeVariant badgeVariant) {
        badgeVariant.getClass();
        this.message = _serverlocalizedstring;
        this.variant = badgeVariant;
    }

    public /* synthetic */ Badge(_ServerLocalizedString _serverlocalizedstring, BadgeVariant badgeVariant, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : _serverlocalizedstring, (i & 2) != 0 ? BadgeVariant.NEUTRAL : badgeVariant);
    }
}
