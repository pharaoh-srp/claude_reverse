package com.anthropic.claude.api.model;

import com.anthropic.claude.api.experience.ExperienceToggle;
import com.anthropic.claude.types.strings._ServerLocalizedString;
import defpackage.d4c;
import defpackage.ij0;
import defpackage.jce;
import defpackage.kw9;
import defpackage.lq6;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.qg9;
import defpackage.rk3;
import defpackage.rp4;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.wkj;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0004\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/anthropic/claude/api/model/DisabledReason;", "", "Companion", "SeatRestricted", "UpgradeRequired", "ModelDisabled", "Unknown", "com/anthropic/claude/api/model/a", "Lcom/anthropic/claude/api/model/DisabledReason$ModelDisabled;", "Lcom/anthropic/claude/api/model/DisabledReason$SeatRestricted;", "Lcom/anthropic/claude/api/model/DisabledReason$Unknown;", "Lcom/anthropic/claude/api/model/DisabledReason$UpgradeRequired;", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
@qg9(discriminator = "type")
public interface DisabledReason {
    public static final a Companion = a.a;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004Ê\u0001\u0002\b\u000fÊ\u0001\u0002\b\u0010Ê\u0001\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/api/model/DisabledReason$SeatRestricted;", "Lcom/anthropic/claude/api/model/DisabledReason;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "api", "Landroidx/compose/runtime/Immutable;", "Lkotlinx/serialization/Serializable;", "Lkotlinx/serialization/SerialName;", ExperienceToggle.DEFAULT_PARAM_KEY, "seat_restricted"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class SeatRestricted implements DisabledReason {
        public static final int $stable = 0;
        public static final SeatRestricted INSTANCE = new SeatRestricted();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new rk3(19));

        private SeatRestricted() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final KSerializer _init_$_anonymous_() {
            return new lq6("seat_restricted", INSTANCE, new Annotation[]{new j()});
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof SeatRestricted);
        }

        public int hashCode() {
            return 1645171316;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "SeatRestricted";
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004Ê\u0001\u0002\b\u000fÊ\u0001\u0002\b\u0010Ê\u0001\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/api/model/DisabledReason$Unknown;", "Lcom/anthropic/claude/api/model/DisabledReason;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "api", "Landroidx/compose/runtime/Immutable;", "Lkotlinx/serialization/Serializable;", "Lkotlinx/serialization/SerialName;", ExperienceToggle.DEFAULT_PARAM_KEY, "unknown"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Unknown implements DisabledReason {
        public static final int $stable = 0;
        public static final Unknown INSTANCE = new Unknown();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new rk3(20));

        private Unknown() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final KSerializer _init_$_anonymous_() {
            return new lq6("unknown", INSTANCE, new Annotation[]{new j()});
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Unknown);
        }

        public int hashCode() {
            return 1739349142;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "Unknown";
        }
    }

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u0019\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\u0004\b\u0005\u0010\u0006B%\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\"\u0010\u0017\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001f\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010\u0016¨\u0006("}, d2 = {"Lcom/anthropic/claude/api/model/DisabledReason$ModelDisabled;", "Lcom/anthropic/claude/api/model/DisabledReason;", "Lcom/anthropic/claude/types/strings/_ServerLocalizedString;", "Lcom/anthropic/claude/types/strings/ServerLocalizedString;", "message", "<init>", "(Lcom/anthropic/claude/types/strings/_ServerLocalizedString;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/types/strings/_ServerLocalizedString;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/model/DisabledReason$ModelDisabled;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/types/strings/_ServerLocalizedString;", "copy", "(Lcom/anthropic/claude/types/strings/_ServerLocalizedString;)Lcom/anthropic/claude/api/model/DisabledReason$ModelDisabled;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/types/strings/_ServerLocalizedString;", "getMessage", "Companion", "com/anthropic/claude/api/model/b", "com/anthropic/claude/api/model/c", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class ModelDisabled implements DisabledReason {
        public static final int $stable = 0;
        private final _ServerLocalizedString message;
        public static final c Companion = new c();
        private static final kw9[] $childSerializers = {yb5.w(w1a.F, new rk3(18))};

        public /* synthetic */ ModelDisabled(int i, _ServerLocalizedString _serverlocalizedstring, vnf vnfVar) {
            if ((i & 1) == 0) {
                this.message = null;
            } else {
                this.message = _serverlocalizedstring;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final KSerializer _childSerializers$_anonymous_() {
            return new rp4(jce.a.b(_ServerLocalizedString.class), d4c.S(wkj.a), new KSerializer[0]);
        }

        public static /* synthetic */ ModelDisabled copy$default(ModelDisabled modelDisabled, _ServerLocalizedString _serverlocalizedstring, int i, Object obj) {
            if ((i & 1) != 0) {
                _serverlocalizedstring = modelDisabled.message;
            }
            return modelDisabled.copy(_serverlocalizedstring);
        }

        public static final /* synthetic */ void write$Self$api(ModelDisabled self, vd4 output, SerialDescriptor serialDesc) {
            kw9[] kw9VarArr = $childSerializers;
            if (!output.E(serialDesc) && self.message == null) {
                return;
            }
            output.B(serialDesc, 0, (znf) kw9VarArr[0].getValue(), self.message);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final _ServerLocalizedString getMessage() {
            return this.message;
        }

        public final ModelDisabled copy(_ServerLocalizedString message) {
            return new ModelDisabled(message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ModelDisabled) && x44.r(this.message, ((ModelDisabled) other).message);
        }

        public final _ServerLocalizedString getMessage() {
            return this.message;
        }

        public int hashCode() {
            _ServerLocalizedString _serverlocalizedstring = this.message;
            if (_serverlocalizedstring == null) {
                return 0;
            }
            return _serverlocalizedstring.hashCode();
        }

        public String toString() {
            return "ModelDisabled(message=" + this.message + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ModelDisabled() {
            this((_ServerLocalizedString) null, 1, (mq5) (0 == true ? 1 : 0));
        }

        public ModelDisabled(_ServerLocalizedString _serverlocalizedstring) {
            this.message = _serverlocalizedstring;
        }

        public /* synthetic */ ModelDisabled(_ServerLocalizedString _serverlocalizedstring, int i, mq5 mq5Var) {
            this((i & 1) != 0 ? null : _serverlocalizedstring);
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#$B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0015¨\u0006%"}, d2 = {"Lcom/anthropic/claude/api/model/DisabledReason$UpgradeRequired;", "Lcom/anthropic/claude/api/model/DisabledReason;", "", "required_plan", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/model/DisabledReason$UpgradeRequired;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/anthropic/claude/api/model/DisabledReason$UpgradeRequired;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRequired_plan", "Companion", "com/anthropic/claude/api/model/d", "com/anthropic/claude/api/model/e", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class UpgradeRequired implements DisabledReason {
        public static final int $stable = 0;
        public static final e Companion = new e();
        private final String required_plan;

        public /* synthetic */ UpgradeRequired(int i, String str, vnf vnfVar) {
            if ((i & 1) == 0) {
                this.required_plan = null;
            } else {
                this.required_plan = str;
            }
        }

        public static /* synthetic */ UpgradeRequired copy$default(UpgradeRequired upgradeRequired, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = upgradeRequired.required_plan;
            }
            return upgradeRequired.copy(str);
        }

        public static final /* synthetic */ void write$Self$api(UpgradeRequired self, vd4 output, SerialDescriptor serialDesc) {
            if (!output.E(serialDesc) && self.required_plan == null) {
                return;
            }
            output.B(serialDesc, 0, srg.a, self.required_plan);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getRequired_plan() {
            return this.required_plan;
        }

        public final UpgradeRequired copy(String required_plan) {
            return new UpgradeRequired(required_plan);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UpgradeRequired) && x44.r(this.required_plan, ((UpgradeRequired) other).required_plan);
        }

        public final String getRequired_plan() {
            return this.required_plan;
        }

        public int hashCode() {
            String str = this.required_plan;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return ij0.j("UpgradeRequired(required_plan=", this.required_plan, ")");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public UpgradeRequired() {
            this((String) null, 1, (mq5) (0 == true ? 1 : 0));
        }

        public UpgradeRequired(String str) {
            this.required_plan = str;
        }

        public /* synthetic */ UpgradeRequired(String str, int i, mq5 mq5Var) {
            this((i & 1) != 0 ? null : str);
        }
    }
}
