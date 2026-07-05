package com.anthropic.claude.models.organization.configtypes;

import com.anthropic.claude.types.strings._ServerLocalizedString;
import defpackage.e2c;
import defpackage.gvj;
import defpackage.jce;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.rbc;
import defpackage.rp4;
import defpackage.sbc;
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

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002./B7\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\n\u0010\u0005\u001a\u00060\u0002j\u0002`\u0003\u0012\n\u0010\u0006\u001a\u00060\u0002j\u0002`\u0003\u0012\n\u0010\u0007\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0014\u0010\u0018\u001a\u00060\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0014\u0010\u001a\u001a\u00060\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0014\u0010\u001b\u001a\u00060\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0014\u0010\u001c\u001a\u00060\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019JH\u0010\u001d\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\f\b\u0002\u0010\u0005\u001a\u00060\u0002j\u0002`\u00032\f\b\u0002\u0010\u0006\u001a\u00060\u0002j\u0002`\u00032\f\b\u0002\u0010\u0007\u001a\u00060\u0002j\u0002`\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b)\u0010\u0019R\u001b\u0010\u0005\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b*\u0010\u0019R\u001b\u0010\u0006\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b+\u0010\u0019R\u001b\u0010\u0007\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b,\u0010\u0019¨\u00060"}, d2 = {"Lcom/anthropic/claude/models/organization/configtypes/OctopusConfig;", "", "Lcom/anthropic/claude/types/strings/_ServerLocalizedString;", "Lcom/anthropic/claude/types/strings/ServerLocalizedString;", "setting_title", "description", "disclaimer_text", "empty_state", "<init>", "(Lcom/anthropic/claude/types/strings/_ServerLocalizedString;Lcom/anthropic/claude/types/strings/_ServerLocalizedString;Lcom/anthropic/claude/types/strings/_ServerLocalizedString;Lcom/anthropic/claude/types/strings/_ServerLocalizedString;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/types/strings/_ServerLocalizedString;Lcom/anthropic/claude/types/strings/_ServerLocalizedString;Lcom/anthropic/claude/types/strings/_ServerLocalizedString;Lcom/anthropic/claude/types/strings/_ServerLocalizedString;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$models", "(Lcom/anthropic/claude/models/organization/configtypes/OctopusConfig;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/types/strings/_ServerLocalizedString;", "component2", "component3", "component4", "copy", "(Lcom/anthropic/claude/types/strings/_ServerLocalizedString;Lcom/anthropic/claude/types/strings/_ServerLocalizedString;Lcom/anthropic/claude/types/strings/_ServerLocalizedString;Lcom/anthropic/claude/types/strings/_ServerLocalizedString;)Lcom/anthropic/claude/models/organization/configtypes/OctopusConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/types/strings/_ServerLocalizedString;", "getSetting_title", "getDescription", "getDisclaimer_text", "getEmpty_state", "Companion", "rbc", "sbc", "models"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class OctopusConfig {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final sbc Companion = new sbc();
    private final _ServerLocalizedString description;
    private final _ServerLocalizedString disclaimer_text;
    private final _ServerLocalizedString empty_state;
    private final _ServerLocalizedString setting_title;

    static {
        e2c e2cVar = new e2c(8);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{yb5.w(w1aVar, e2cVar), yb5.w(w1aVar, new e2c(9)), yb5.w(w1aVar, new e2c(10)), yb5.w(w1aVar, new e2c(11))};
    }

    public /* synthetic */ OctopusConfig(int i, _ServerLocalizedString _serverlocalizedstring, _ServerLocalizedString _serverlocalizedstring2, _ServerLocalizedString _serverlocalizedstring3, _ServerLocalizedString _serverlocalizedstring4, vnf vnfVar) {
        if (15 != (i & 15)) {
            gvj.f(i, 15, rbc.a.getDescriptor());
            throw null;
        }
        this.setting_title = _serverlocalizedstring;
        this.description = _serverlocalizedstring2;
        this.disclaimer_text = _serverlocalizedstring3;
        this.empty_state = _serverlocalizedstring4;
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
        return new rp4(jce.a.b(_ServerLocalizedString.class), wkj.a, new KSerializer[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer _childSerializers$_anonymous_$2() {
        return new rp4(jce.a.b(_ServerLocalizedString.class), wkj.a, new KSerializer[0]);
    }

    public static /* synthetic */ OctopusConfig copy$default(OctopusConfig octopusConfig, _ServerLocalizedString _serverlocalizedstring, _ServerLocalizedString _serverlocalizedstring2, _ServerLocalizedString _serverlocalizedstring3, _ServerLocalizedString _serverlocalizedstring4, int i, Object obj) {
        if ((i & 1) != 0) {
            _serverlocalizedstring = octopusConfig.setting_title;
        }
        if ((i & 2) != 0) {
            _serverlocalizedstring2 = octopusConfig.description;
        }
        if ((i & 4) != 0) {
            _serverlocalizedstring3 = octopusConfig.disclaimer_text;
        }
        if ((i & 8) != 0) {
            _serverlocalizedstring4 = octopusConfig.empty_state;
        }
        return octopusConfig.copy(_serverlocalizedstring, _serverlocalizedstring2, _serverlocalizedstring3, _serverlocalizedstring4);
    }

    public static final /* synthetic */ void write$Self$models(OctopusConfig self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.r(serialDesc, 0, (znf) kw9VarArr[0].getValue(), self.setting_title);
        output.r(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.description);
        output.r(serialDesc, 2, (znf) kw9VarArr[2].getValue(), self.disclaimer_text);
        output.r(serialDesc, 3, (znf) kw9VarArr[3].getValue(), self.empty_state);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final _ServerLocalizedString getSetting_title() {
        return this.setting_title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final _ServerLocalizedString getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final _ServerLocalizedString getDisclaimer_text() {
        return this.disclaimer_text;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final _ServerLocalizedString getEmpty_state() {
        return this.empty_state;
    }

    public final OctopusConfig copy(_ServerLocalizedString setting_title, _ServerLocalizedString description, _ServerLocalizedString disclaimer_text, _ServerLocalizedString empty_state) {
        setting_title.getClass();
        description.getClass();
        disclaimer_text.getClass();
        empty_state.getClass();
        return new OctopusConfig(setting_title, description, disclaimer_text, empty_state);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OctopusConfig)) {
            return false;
        }
        OctopusConfig octopusConfig = (OctopusConfig) other;
        return x44.r(this.setting_title, octopusConfig.setting_title) && x44.r(this.description, octopusConfig.description) && x44.r(this.disclaimer_text, octopusConfig.disclaimer_text) && x44.r(this.empty_state, octopusConfig.empty_state);
    }

    public final _ServerLocalizedString getDescription() {
        return this.description;
    }

    public final _ServerLocalizedString getDisclaimer_text() {
        return this.disclaimer_text;
    }

    public final _ServerLocalizedString getEmpty_state() {
        return this.empty_state;
    }

    public final _ServerLocalizedString getSetting_title() {
        return this.setting_title;
    }

    public int hashCode() {
        return this.empty_state.hashCode() + ((this.disclaimer_text.hashCode() + ((this.description.hashCode() + (this.setting_title.hashCode() * 31)) * 31)) * 31);
    }

    public String toString() {
        return "OctopusConfig(setting_title=" + this.setting_title + ", description=" + this.description + ", disclaimer_text=" + this.disclaimer_text + ", empty_state=" + this.empty_state + ")";
    }

    public OctopusConfig(_ServerLocalizedString _serverlocalizedstring, _ServerLocalizedString _serverlocalizedstring2, _ServerLocalizedString _serverlocalizedstring3, _ServerLocalizedString _serverlocalizedstring4) {
        _serverlocalizedstring.getClass();
        _serverlocalizedstring2.getClass();
        _serverlocalizedstring3.getClass();
        _serverlocalizedstring4.getClass();
        this.setting_title = _serverlocalizedstring;
        this.description = _serverlocalizedstring2;
        this.disclaimer_text = _serverlocalizedstring3;
        this.empty_state = _serverlocalizedstring4;
    }
}
