package com.anthropic.claude.sessions.types;

import defpackage.e79;
import defpackage.grc;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.zt1;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bq\u0018\u0000 \u00062\u00020\u0001:\u0007\u0007\b\t\n\u000b\f\rR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0006\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lcom/anthropic/claude/sessions/types/ControlRequestBody;", "", "", "getSubtype", "()Ljava/lang/String;", "subtype", "Companion", "Interrupt", "Initialize", "SetMode", "SetModel", "ToolDecision", "ReadFile", "com/anthropic/claude/sessions/types/m", "Lcom/anthropic/claude/sessions/types/ControlRequestBody$Initialize;", "Lcom/anthropic/claude/sessions/types/ControlRequestBody$Interrupt;", "Lcom/anthropic/claude/sessions/types/ControlRequestBody$ReadFile;", "Lcom/anthropic/claude/sessions/types/ControlRequestBody$SetMode;", "Lcom/anthropic/claude/sessions/types/ControlRequestBody$SetModel;", "Lcom/anthropic/claude/sessions/types/ControlRequestBody$ToolDecision;", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = z.class)
public interface ControlRequestBody {
    public static final m Companion = m.a;

    String getSubtype();

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#$B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0015¨\u0006%"}, d2 = {"Lcom/anthropic/claude/sessions/types/ControlRequestBody$Interrupt;", "Lcom/anthropic/claude/sessions/types/ControlRequestBody;", "", "subtype", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/ControlRequestBody$Interrupt;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/anthropic/claude/sessions/types/ControlRequestBody$Interrupt;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSubtype", "Companion", "com/anthropic/claude/sessions/types/p", "com/anthropic/claude/sessions/types/q", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Interrupt implements ControlRequestBody {
        public static final q Companion = new q();
        private final String subtype;

        public /* synthetic */ Interrupt(int i, String str, vnf vnfVar) {
            if ((i & 1) == 0) {
                this.subtype = "interrupt";
            } else {
                this.subtype = str;
            }
        }

        public static /* synthetic */ Interrupt copy$default(Interrupt interrupt, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = interrupt.subtype;
            }
            return interrupt.copy(str);
        }

        public static final /* synthetic */ void write$Self$sessions(Interrupt self, vd4 output, SerialDescriptor serialDesc) {
            if (!output.E(serialDesc) && x44.r(self.getSubtype(), "interrupt")) {
                return;
            }
            output.q(serialDesc, 0, self.getSubtype());
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getSubtype() {
            return this.subtype;
        }

        public final Interrupt copy(String subtype) {
            subtype.getClass();
            return new Interrupt(subtype);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Interrupt) && x44.r(this.subtype, ((Interrupt) other).subtype);
        }

        @Override // com.anthropic.claude.sessions.types.ControlRequestBody
        public String getSubtype() {
            return this.subtype;
        }

        public int hashCode() {
            return this.subtype.hashCode();
        }

        public String toString() {
            return ij0.j("Interrupt(subtype=", this.subtype, ")");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Interrupt() {
            this((String) null, 1, (mq5) (0 == true ? 1 : 0));
        }

        public Interrupt(String str) {
            str.getClass();
            this.subtype = str;
        }

        public /* synthetic */ Interrupt(String str, int i, mq5 mq5Var) {
            this((i & 1) != 0 ? "interrupt" : str);
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0019¨\u0006*"}, d2 = {"Lcom/anthropic/claude/sessions/types/ControlRequestBody$Initialize;", "Lcom/anthropic/claude/sessions/types/ControlRequestBody;", "", "subtype", "", "promptSuggestions", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Boolean;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/ControlRequestBody$Initialize;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;)Lcom/anthropic/claude/sessions/types/ControlRequestBody$Initialize;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSubtype", "Ljava/lang/Boolean;", "getPromptSuggestions", "Companion", "com/anthropic/claude/sessions/types/n", "com/anthropic/claude/sessions/types/o", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class Initialize implements ControlRequestBody {
        public static final o Companion = new o();
        private final Boolean promptSuggestions;
        private final String subtype;

        public /* synthetic */ Initialize(int i, String str, Boolean bool, vnf vnfVar) {
            this.subtype = (i & 1) == 0 ? "initialize" : str;
            if ((i & 2) == 0) {
                this.promptSuggestions = null;
            } else {
                this.promptSuggestions = bool;
            }
        }

        public static /* synthetic */ Initialize copy$default(Initialize initialize, String str, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                str = initialize.subtype;
            }
            if ((i & 2) != 0) {
                bool = initialize.promptSuggestions;
            }
            return initialize.copy(str, bool);
        }

        public static final /* synthetic */ void write$Self$sessions(Initialize self, vd4 output, SerialDescriptor serialDesc) {
            if (output.E(serialDesc) || !x44.r(self.getSubtype(), "initialize")) {
                output.q(serialDesc, 0, self.getSubtype());
            }
            if (!output.E(serialDesc) && self.promptSuggestions == null) {
                return;
            }
            output.B(serialDesc, 1, zt1.a, self.promptSuggestions);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getSubtype() {
            return this.subtype;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Boolean getPromptSuggestions() {
            return this.promptSuggestions;
        }

        public final Initialize copy(String subtype, Boolean promptSuggestions) {
            subtype.getClass();
            return new Initialize(subtype, promptSuggestions);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Initialize)) {
                return false;
            }
            Initialize initialize = (Initialize) other;
            return x44.r(this.subtype, initialize.subtype) && x44.r(this.promptSuggestions, initialize.promptSuggestions);
        }

        public final Boolean getPromptSuggestions() {
            return this.promptSuggestions;
        }

        @Override // com.anthropic.claude.sessions.types.ControlRequestBody
        public String getSubtype() {
            return this.subtype;
        }

        public int hashCode() {
            int iHashCode = this.subtype.hashCode() * 31;
            Boolean bool = this.promptSuggestions;
            return iHashCode + (bool == null ? 0 : bool.hashCode());
        }

        public String toString() {
            return "Initialize(subtype=" + this.subtype + ", promptSuggestions=" + this.promptSuggestions + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Initialize() {
            this((String) null, (Boolean) (0 == true ? 1 : 0), 3, (mq5) (0 == true ? 1 : 0));
        }

        public Initialize(String str, Boolean bool) {
            str.getClass();
            this.subtype = str;
            this.promptSuggestions = bool;
        }

        public /* synthetic */ Initialize(String str, Boolean bool, int i, mq5 mq5Var) {
            this((i & 1) != 0 ? "initialize" : str, (i & 2) != 0 ? null : bool);
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u0016¨\u0006("}, d2 = {"Lcom/anthropic/claude/sessions/types/ControlRequestBody$SetMode;", "Lcom/anthropic/claude/sessions/types/ControlRequestBody;", "", "subtype", "mode", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/ControlRequestBody$SetMode;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/sessions/types/ControlRequestBody$SetMode;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSubtype", "getMode", "Companion", "com/anthropic/claude/sessions/types/t", "com/anthropic/claude/sessions/types/u", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class SetMode implements ControlRequestBody {
        public static final u Companion = new u();
        private final String mode;
        private final String subtype;

        public /* synthetic */ SetMode(int i, String str, String str2, vnf vnfVar) {
            if (2 != (i & 2)) {
                gvj.f(i, 2, t.a.getDescriptor());
                throw null;
            }
            if ((i & 1) == 0) {
                this.subtype = "set_permission_mode";
            } else {
                this.subtype = str;
            }
            this.mode = str2;
        }

        public static /* synthetic */ SetMode copy$default(SetMode setMode, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = setMode.subtype;
            }
            if ((i & 2) != 0) {
                str2 = setMode.mode;
            }
            return setMode.copy(str, str2);
        }

        public static final /* synthetic */ void write$Self$sessions(SetMode self, vd4 output, SerialDescriptor serialDesc) {
            if (output.E(serialDesc) || !x44.r(self.getSubtype(), "set_permission_mode")) {
                output.q(serialDesc, 0, self.getSubtype());
            }
            output.q(serialDesc, 1, self.mode);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getSubtype() {
            return this.subtype;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getMode() {
            return this.mode;
        }

        public final SetMode copy(String subtype, String mode) {
            subtype.getClass();
            mode.getClass();
            return new SetMode(subtype, mode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SetMode)) {
                return false;
            }
            SetMode setMode = (SetMode) other;
            return x44.r(this.subtype, setMode.subtype) && x44.r(this.mode, setMode.mode);
        }

        public final String getMode() {
            return this.mode;
        }

        @Override // com.anthropic.claude.sessions.types.ControlRequestBody
        public String getSubtype() {
            return this.subtype;
        }

        public int hashCode() {
            return this.mode.hashCode() + (this.subtype.hashCode() * 31);
        }

        public String toString() {
            return ij0.l("SetMode(subtype=", this.subtype, ", mode=", this.mode, ")");
        }

        public SetMode(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.subtype = str;
            this.mode = str2;
        }

        public /* synthetic */ SetMode(String str, String str2, int i, mq5 mq5Var) {
            this((i & 1) != 0 ? "set_permission_mode" : str, str2);
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u0016¨\u0006("}, d2 = {"Lcom/anthropic/claude/sessions/types/ControlRequestBody$SetModel;", "Lcom/anthropic/claude/sessions/types/ControlRequestBody;", "", "subtype", "model", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/ControlRequestBody$SetModel;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/sessions/types/ControlRequestBody$SetModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSubtype", "getModel", "Companion", "com/anthropic/claude/sessions/types/v", "com/anthropic/claude/sessions/types/w", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class SetModel implements ControlRequestBody {
        public static final w Companion = new w();
        private final String model;
        private final String subtype;

        public /* synthetic */ SetModel(int i, String str, String str2, vnf vnfVar) {
            if (2 != (i & 2)) {
                gvj.f(i, 2, v.a.getDescriptor());
                throw null;
            }
            if ((i & 1) == 0) {
                this.subtype = "set_model";
            } else {
                this.subtype = str;
            }
            this.model = str2;
        }

        public static /* synthetic */ SetModel copy$default(SetModel setModel, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = setModel.subtype;
            }
            if ((i & 2) != 0) {
                str2 = setModel.model;
            }
            return setModel.copy(str, str2);
        }

        public static final /* synthetic */ void write$Self$sessions(SetModel self, vd4 output, SerialDescriptor serialDesc) {
            if (output.E(serialDesc) || !x44.r(self.getSubtype(), "set_model")) {
                output.q(serialDesc, 0, self.getSubtype());
            }
            output.q(serialDesc, 1, self.model);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getSubtype() {
            return this.subtype;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getModel() {
            return this.model;
        }

        public final SetModel copy(String subtype, String model) {
            subtype.getClass();
            model.getClass();
            return new SetModel(subtype, model);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SetModel)) {
                return false;
            }
            SetModel setModel = (SetModel) other;
            return x44.r(this.subtype, setModel.subtype) && x44.r(this.model, setModel.model);
        }

        public final String getModel() {
            return this.model;
        }

        @Override // com.anthropic.claude.sessions.types.ControlRequestBody
        public String getSubtype() {
            return this.subtype;
        }

        public int hashCode() {
            return this.model.hashCode() + (this.subtype.hashCode() * 31);
        }

        public String toString() {
            return ij0.l("SetModel(subtype=", this.subtype, ", model=", this.model, ")");
        }

        public SetModel(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.subtype = str;
            this.model = str2;
        }

        public /* synthetic */ SetModel(String str, String str2, int i, mq5 mq5Var) {
            this((i & 1) != 0 ? "set_model" : str, str2);
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J.\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b'\u0010\u0017¨\u0006+"}, d2 = {"Lcom/anthropic/claude/sessions/types/ControlRequestBody$ToolDecision;", "Lcom/anthropic/claude/sessions/types/ControlRequestBody;", "", "subtype", "tool_use_id", "decision", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/ControlRequestBody$ToolDecision;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/sessions/types/ControlRequestBody$ToolDecision;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSubtype", "getTool_use_id", "getDecision", "Companion", "com/anthropic/claude/sessions/types/x", "com/anthropic/claude/sessions/types/y", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class ToolDecision implements ControlRequestBody {
        public static final y Companion = new y();
        private final String decision;
        private final String subtype;
        private final String tool_use_id;

        public /* synthetic */ ToolDecision(int i, String str, String str2, String str3, vnf vnfVar) {
            if (6 != (i & 6)) {
                gvj.f(i, 6, x.a.getDescriptor());
                throw null;
            }
            if ((i & 1) == 0) {
                this.subtype = "tool_decision";
            } else {
                this.subtype = str;
            }
            this.tool_use_id = str2;
            this.decision = str3;
        }

        public static /* synthetic */ ToolDecision copy$default(ToolDecision toolDecision, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = toolDecision.subtype;
            }
            if ((i & 2) != 0) {
                str2 = toolDecision.tool_use_id;
            }
            if ((i & 4) != 0) {
                str3 = toolDecision.decision;
            }
            return toolDecision.copy(str, str2, str3);
        }

        public static final /* synthetic */ void write$Self$sessions(ToolDecision self, vd4 output, SerialDescriptor serialDesc) {
            if (output.E(serialDesc) || !x44.r(self.getSubtype(), "tool_decision")) {
                output.q(serialDesc, 0, self.getSubtype());
            }
            output.q(serialDesc, 1, self.tool_use_id);
            output.q(serialDesc, 2, self.decision);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getSubtype() {
            return this.subtype;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getTool_use_id() {
            return this.tool_use_id;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getDecision() {
            return this.decision;
        }

        public final ToolDecision copy(String subtype, String tool_use_id, String decision) {
            subtype.getClass();
            tool_use_id.getClass();
            decision.getClass();
            return new ToolDecision(subtype, tool_use_id, decision);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ToolDecision)) {
                return false;
            }
            ToolDecision toolDecision = (ToolDecision) other;
            return x44.r(this.subtype, toolDecision.subtype) && x44.r(this.tool_use_id, toolDecision.tool_use_id) && x44.r(this.decision, toolDecision.decision);
        }

        public final String getDecision() {
            return this.decision;
        }

        @Override // com.anthropic.claude.sessions.types.ControlRequestBody
        public String getSubtype() {
            return this.subtype;
        }

        public final String getTool_use_id() {
            return this.tool_use_id;
        }

        public int hashCode() {
            return this.decision.hashCode() + kgh.l(this.subtype.hashCode() * 31, 31, this.tool_use_id);
        }

        public String toString() {
            String str = this.subtype;
            String str2 = this.tool_use_id;
            return ij0.m(kgh.r("ToolDecision(subtype=", str, ", tool_use_id=", str2, ", decision="), this.decision, ")");
        }

        public ToolDecision(String str, String str2, String str3) {
            grc.B(str, str2, str3);
            this.subtype = str;
            this.tool_use_id = str2;
            this.decision = str3;
        }

        public /* synthetic */ ToolDecision(String str, String str2, String str3, int i, mq5 mq5Var) {
            this((i & 1) != 0 ? "tool_decision" : str, str2, str3);
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002./B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018J<\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0018J\u0010\u0010 \u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b,\u0010\u0018¨\u00060"}, d2 = {"Lcom/anthropic/claude/sessions/types/ControlRequestBody$ReadFile;", "Lcom/anthropic/claude/sessions/types/ControlRequestBody;", "", "subtype", "path", "", "max_bytes", "encoding", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/ControlRequestBody$ReadFile;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Integer;", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/anthropic/claude/sessions/types/ControlRequestBody$ReadFile;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSubtype", "getPath", "Ljava/lang/Integer;", "getMax_bytes", "getEncoding", "Companion", "com/anthropic/claude/sessions/types/r", "com/anthropic/claude/sessions/types/s", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class ReadFile implements ControlRequestBody {
        public static final s Companion = new s();
        private final String encoding;
        private final Integer max_bytes;
        private final String path;
        private final String subtype;

        public /* synthetic */ ReadFile(int i, String str, String str2, Integer num, String str3, vnf vnfVar) {
            if (2 != (i & 2)) {
                gvj.f(i, 2, r.a.getDescriptor());
                throw null;
            }
            this.subtype = (i & 1) == 0 ? "read_file" : str;
            this.path = str2;
            if ((i & 4) == 0) {
                this.max_bytes = null;
            } else {
                this.max_bytes = num;
            }
            if ((i & 8) == 0) {
                this.encoding = null;
            } else {
                this.encoding = str3;
            }
        }

        public static /* synthetic */ ReadFile copy$default(ReadFile readFile, String str, String str2, Integer num, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = readFile.subtype;
            }
            if ((i & 2) != 0) {
                str2 = readFile.path;
            }
            if ((i & 4) != 0) {
                num = readFile.max_bytes;
            }
            if ((i & 8) != 0) {
                str3 = readFile.encoding;
            }
            return readFile.copy(str, str2, num, str3);
        }

        public static final /* synthetic */ void write$Self$sessions(ReadFile self, vd4 output, SerialDescriptor serialDesc) {
            if (output.E(serialDesc) || !x44.r(self.getSubtype(), "read_file")) {
                output.q(serialDesc, 0, self.getSubtype());
            }
            output.q(serialDesc, 1, self.path);
            if (output.E(serialDesc) || self.max_bytes != null) {
                output.B(serialDesc, 2, e79.a, self.max_bytes);
            }
            if (!output.E(serialDesc) && self.encoding == null) {
                return;
            }
            output.B(serialDesc, 3, srg.a, self.encoding);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getSubtype() {
            return this.subtype;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getPath() {
            return this.path;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Integer getMax_bytes() {
            return this.max_bytes;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getEncoding() {
            return this.encoding;
        }

        public final ReadFile copy(String subtype, String path, Integer max_bytes, String encoding) {
            subtype.getClass();
            path.getClass();
            return new ReadFile(subtype, path, max_bytes, encoding);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReadFile)) {
                return false;
            }
            ReadFile readFile = (ReadFile) other;
            return x44.r(this.subtype, readFile.subtype) && x44.r(this.path, readFile.path) && x44.r(this.max_bytes, readFile.max_bytes) && x44.r(this.encoding, readFile.encoding);
        }

        public final String getEncoding() {
            return this.encoding;
        }

        public final Integer getMax_bytes() {
            return this.max_bytes;
        }

        public final String getPath() {
            return this.path;
        }

        @Override // com.anthropic.claude.sessions.types.ControlRequestBody
        public String getSubtype() {
            return this.subtype;
        }

        public int hashCode() {
            int iL = kgh.l(this.subtype.hashCode() * 31, 31, this.path);
            Integer num = this.max_bytes;
            int iHashCode = (iL + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.encoding;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            String str = this.subtype;
            String str2 = this.path;
            Integer num = this.max_bytes;
            String str3 = this.encoding;
            StringBuilder sbR = kgh.r("ReadFile(subtype=", str, ", path=", str2, ", max_bytes=");
            sbR.append(num);
            sbR.append(", encoding=");
            sbR.append(str3);
            sbR.append(")");
            return sbR.toString();
        }

        public ReadFile(String str, String str2, Integer num, String str3) {
            str.getClass();
            str2.getClass();
            this.subtype = str;
            this.path = str2;
            this.max_bytes = num;
            this.encoding = str3;
        }

        public /* synthetic */ ReadFile(String str, String str2, Integer num, String str3, int i, mq5 mq5Var) {
            this((i & 1) != 0 ? "read_file" : str, str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str3);
        }
    }
}
