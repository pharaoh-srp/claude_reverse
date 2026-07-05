package com.anthropic.claude.api.model;

import com.anthropic.claude.types.strings.ModelId;
import com.anthropic.claude.types.strings._ServerLocalizedString;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.bsg;
import defpackage.cmh;
import defpackage.cob;
import defpackage.d4c;
import defpackage.dob;
import defpackage.e79;
import defpackage.ebh;
import defpackage.gvj;
import defpackage.jce;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.nnb;
import defpackage.onf;
import defpackage.rp4;
import defpackage.rpa;
import defpackage.srg;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnb;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.wkj;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import defpackage.zt1;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \b\u0087\b\u0018\u0000 [2\u00020\u0001:\u0002\\]B¡\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018B\u0099\u0001\b\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0015\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0017\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0018\u0010!\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b#\u0010\u001eJ\u0012\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b&\u0010%J\u0018\u0010'\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0018\u0010+\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007HÆ\u0003¢\u0006\u0004\b+\u0010\"J\u0012\u0010,\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b,\u0010\u001eJ\u0012\u0010-\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b-\u0010\u001eJ\u0012\u0010.\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b.\u0010/J®\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0010\b\u0002\u0010\u0012\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÆ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00103\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b3\u0010\u001eJ\u0010\u00104\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b4\u00105J\u001a\u00107\u001a\u00020\n2\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b7\u00108J'\u0010A\u001a\u00020>2\u0006\u00109\u001a\u00020\u00002\u0006\u0010;\u001a\u00020:2\u0006\u0010=\u001a\u00020<H\u0001¢\u0006\u0004\b?\u0010@R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010B\u001a\u0004\bC\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010B\u001a\u0004\bD\u0010\u001eR\u001f\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010E\u001a\u0004\bF\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010B\u001a\u0004\bG\u0010\u001eR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010H\u001a\u0004\bI\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010H\u001a\u0004\bJ\u0010%R\u001f\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010K\u001a\u0004\bL\u0010(R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010M\u001a\u0004\bN\u0010*R\u001f\u0010\u0012\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0006¢\u0006\f\n\u0004\b\u0012\u0010E\u001a\u0004\bO\u0010\"R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010B\u001a\u0004\bP\u0010\u001eR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010B\u001a\u0004\bQ\u0010\u001eR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010R\u001a\u0004\bS\u0010/R\u0011\u0010U\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bT\u0010\u001eR\u0011\u0010V\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bV\u0010WR\u0011\u0010X\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bX\u0010WR\u0011\u0010Y\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bY\u0010WR\u0011\u0010Z\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bZ\u0010W¨\u0006^"}, d2 = {"Lcom/anthropic/claude/api/model/ModelOption;", "", "Lcom/anthropic/claude/types/strings/ModelId;", "model", "", "name", "Lcom/anthropic/claude/types/strings/_ServerLocalizedString;", "Lcom/anthropic/claude/types/strings/ServerLocalizedString;", "description", "description_i18n_key", "", "overflow", "inactive", "", "Lcom/anthropic/claude/api/model/ThinkingModeOption;", "thinking_modes", "Lcom/anthropic/claude/api/model/ModelCapabilities;", "capabilities", "notice_text", "notice_text_i18n_key", "knowledgeCutoff", "", "slow_kb_warning_threshold", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/types/strings/_ServerLocalizedString;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Lcom/anthropic/claude/api/model/ModelCapabilities;Lcom/anthropic/claude/types/strings/_ServerLocalizedString;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lmq5;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/types/strings/_ServerLocalizedString;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Lcom/anthropic/claude/api/model/ModelCapabilities;Lcom/anthropic/claude/types/strings/_ServerLocalizedString;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lvnf;Lmq5;)V", "component1-i-4oh0I", "()Ljava/lang/String;", "component1", "component2", "component3", "()Lcom/anthropic/claude/types/strings/_ServerLocalizedString;", "component4", "component5", "()Ljava/lang/Boolean;", "component6", "component7", "()Ljava/util/List;", "component8", "()Lcom/anthropic/claude/api/model/ModelCapabilities;", "component9", "component10", "component11", "component12", "()Ljava/lang/Integer;", "copy-ZEIUhPU", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/types/strings/_ServerLocalizedString;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Lcom/anthropic/claude/api/model/ModelCapabilities;Lcom/anthropic/claude/types/strings/_ServerLocalizedString;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/anthropic/claude/api/model/ModelOption;", "copy", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/model/ModelOption;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getModel-i-4oh0I", "getName", "Lcom/anthropic/claude/types/strings/_ServerLocalizedString;", "getDescription", "getDescription_i18n_key", "Ljava/lang/Boolean;", "getOverflow", "getInactive", "Ljava/util/List;", "getThinking_modes", "Lcom/anthropic/claude/api/model/ModelCapabilities;", "getCapabilities", "getNotice_text", "getNotice_text_i18n_key", "getKnowledgeCutoff", "Ljava/lang/Integer;", "getSlow_kb_warning_threshold", "getSafeDisplayName", "safeDisplayName", "isMmPdfSupported", "()Z", "isMmImagesSupported", "isWebSearchSupported", "isResearchSupported", "Companion", "dob", "cob", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ModelOption {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final dob Companion = new dob();
    private static final ModelOption MISSING;
    private final ModelCapabilities capabilities;
    private final _ServerLocalizedString description;
    private final String description_i18n_key;
    private final Boolean inactive;
    private final String knowledgeCutoff;
    private final String model;
    private final String name;
    private final _ServerLocalizedString notice_text;
    private final String notice_text_i18n_key;
    private final Boolean overflow;
    private final Integer slow_kb_warning_threshold;
    private final List<ThinkingModeOption> thinking_modes;

    static {
        rpa rpaVar = new rpa(21);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{null, null, yb5.w(w1aVar, rpaVar), null, null, null, yb5.w(w1aVar, new rpa(22)), null, yb5.w(w1aVar, new rpa(23)), null, null, null};
        MISSING = new ModelOption(ModelId.m1059constructorimpl("missing-model"), "", (_ServerLocalizedString) null, (String) null, (Boolean) null, Boolean.TRUE, (List) null, (ModelCapabilities) null, (_ServerLocalizedString) null, (String) null, (String) null, (Integer) null, 4056, (mq5) null);
    }

    private /* synthetic */ ModelOption(int i, String str, String str2, _ServerLocalizedString _serverlocalizedstring, String str3, Boolean bool, Boolean bool2, List list, ModelCapabilities modelCapabilities, _ServerLocalizedString _serverlocalizedstring2, String str4, String str5, Integer num, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, cob.a.getDescriptor());
            throw null;
        }
        this.model = str;
        this.name = str2;
        if ((i & 4) == 0) {
            this.description = null;
        } else {
            this.description = _serverlocalizedstring;
        }
        if ((i & 8) == 0) {
            this.description_i18n_key = null;
        } else {
            this.description_i18n_key = str3;
        }
        if ((i & 16) == 0) {
            this.overflow = null;
        } else {
            this.overflow = bool;
        }
        if ((i & 32) == 0) {
            this.inactive = null;
        } else {
            this.inactive = bool2;
        }
        if ((i & 64) == 0) {
            this.thinking_modes = null;
        } else {
            this.thinking_modes = list;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0) {
            this.capabilities = null;
        } else {
            this.capabilities = modelCapabilities;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 0) {
            this.notice_text = null;
        } else {
            this.notice_text = _serverlocalizedstring2;
        }
        if ((i & 512) == 0) {
            this.notice_text_i18n_key = null;
        } else {
            this.notice_text_i18n_key = str4;
        }
        if ((i & FreeTypeConstants.FT_LOAD_NO_RECURSE) == 0) {
            this.knowledgeCutoff = null;
        } else {
            this.knowledgeCutoff = str5;
        }
        if ((i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) == 0) {
            this.slow_kb_warning_threshold = null;
        } else {
            this.slow_kb_warning_threshold = num;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer _childSerializers$_anonymous_() {
        return new rp4(jce.a.b(_ServerLocalizedString.class), d4c.S(wkj.a), new KSerializer[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new uo0(cmh.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer _childSerializers$_anonymous_$1() {
        return new rp4(jce.a.b(_ServerLocalizedString.class), d4c.S(wkj.a), new KSerializer[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-ZEIUhPU$default, reason: not valid java name */
    public static /* synthetic */ ModelOption m353copyZEIUhPU$default(ModelOption modelOption, String str, String str2, _ServerLocalizedString _serverlocalizedstring, String str3, Boolean bool, Boolean bool2, List list, ModelCapabilities modelCapabilities, _ServerLocalizedString _serverlocalizedstring2, String str4, String str5, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = modelOption.model;
        }
        if ((i & 2) != 0) {
            str2 = modelOption.name;
        }
        if ((i & 4) != 0) {
            _serverlocalizedstring = modelOption.description;
        }
        if ((i & 8) != 0) {
            str3 = modelOption.description_i18n_key;
        }
        if ((i & 16) != 0) {
            bool = modelOption.overflow;
        }
        if ((i & 32) != 0) {
            bool2 = modelOption.inactive;
        }
        if ((i & 64) != 0) {
            list = modelOption.thinking_modes;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            modelCapabilities = modelOption.capabilities;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0) {
            _serverlocalizedstring2 = modelOption.notice_text;
        }
        if ((i & 512) != 0) {
            str4 = modelOption.notice_text_i18n_key;
        }
        if ((i & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0) {
            str5 = modelOption.knowledgeCutoff;
        }
        if ((i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0) {
            num = modelOption.slow_kb_warning_threshold;
        }
        String str6 = str5;
        Integer num2 = num;
        _ServerLocalizedString _serverlocalizedstring3 = _serverlocalizedstring2;
        String str7 = str4;
        List list2 = list;
        ModelCapabilities modelCapabilities2 = modelCapabilities;
        Boolean bool3 = bool;
        Boolean bool4 = bool2;
        return modelOption.m355copyZEIUhPU(str, str2, _serverlocalizedstring, str3, bool3, bool4, list2, modelCapabilities2, _serverlocalizedstring3, str7, str6, num2);
    }

    public static final /* synthetic */ void write$Self$api(ModelOption self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.r(serialDesc, 0, vnb.a, ModelId.m1058boximpl(self.model));
        output.q(serialDesc, 1, self.name);
        if (output.E(serialDesc) || self.description != null) {
            output.B(serialDesc, 2, (znf) kw9VarArr[2].getValue(), self.description);
        }
        if (output.E(serialDesc) || self.description_i18n_key != null) {
            output.B(serialDesc, 3, srg.a, self.description_i18n_key);
        }
        if (output.E(serialDesc) || self.overflow != null) {
            output.B(serialDesc, 4, zt1.a, self.overflow);
        }
        if (output.E(serialDesc) || self.inactive != null) {
            output.B(serialDesc, 5, zt1.a, self.inactive);
        }
        if (output.E(serialDesc) || self.thinking_modes != null) {
            output.B(serialDesc, 6, (znf) kw9VarArr[6].getValue(), self.thinking_modes);
        }
        if (output.E(serialDesc) || self.capabilities != null) {
            output.B(serialDesc, 7, nnb.a, self.capabilities);
        }
        if (output.E(serialDesc) || self.notice_text != null) {
            output.B(serialDesc, 8, (znf) kw9VarArr[8].getValue(), self.notice_text);
        }
        if (output.E(serialDesc) || self.notice_text_i18n_key != null) {
            output.B(serialDesc, 9, srg.a, self.notice_text_i18n_key);
        }
        if (output.E(serialDesc) || self.knowledgeCutoff != null) {
            output.B(serialDesc, 10, srg.a, self.knowledgeCutoff);
        }
        if (!output.E(serialDesc) && self.slow_kb_warning_threshold == null) {
            return;
        }
        output.B(serialDesc, 11, e79.a, self.slow_kb_warning_threshold);
    }

    /* JADX INFO: renamed from: component1-i-4oh0I, reason: not valid java name and from getter */
    public final String getModel() {
        return this.model;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getNotice_text_i18n_key() {
        return this.notice_text_i18n_key;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getKnowledgeCutoff() {
        return this.knowledgeCutoff;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Integer getSlow_kb_warning_threshold() {
        return this.slow_kb_warning_threshold;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final _ServerLocalizedString getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDescription_i18n_key() {
        return this.description_i18n_key;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getOverflow() {
        return this.overflow;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getInactive() {
        return this.inactive;
    }

    public final List<ThinkingModeOption> component7() {
        return this.thinking_modes;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final ModelCapabilities getCapabilities() {
        return this.capabilities;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final _ServerLocalizedString getNotice_text() {
        return this.notice_text;
    }

    /* JADX INFO: renamed from: copy-ZEIUhPU, reason: not valid java name */
    public final ModelOption m355copyZEIUhPU(String model, String name, _ServerLocalizedString description, String description_i18n_key, Boolean overflow, Boolean inactive, List<ThinkingModeOption> thinking_modes, ModelCapabilities capabilities, _ServerLocalizedString notice_text, String notice_text_i18n_key, String knowledgeCutoff, Integer slow_kb_warning_threshold) {
        model.getClass();
        name.getClass();
        return new ModelOption(model, name, description, description_i18n_key, overflow, inactive, thinking_modes, capabilities, notice_text, notice_text_i18n_key, knowledgeCutoff, slow_kb_warning_threshold, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModelOption)) {
            return false;
        }
        ModelOption modelOption = (ModelOption) other;
        return ModelId.m1061equalsimpl0(this.model, modelOption.model) && x44.r(this.name, modelOption.name) && x44.r(this.description, modelOption.description) && x44.r(this.description_i18n_key, modelOption.description_i18n_key) && x44.r(this.overflow, modelOption.overflow) && x44.r(this.inactive, modelOption.inactive) && x44.r(this.thinking_modes, modelOption.thinking_modes) && x44.r(this.capabilities, modelOption.capabilities) && x44.r(this.notice_text, modelOption.notice_text) && x44.r(this.notice_text_i18n_key, modelOption.notice_text_i18n_key) && x44.r(this.knowledgeCutoff, modelOption.knowledgeCutoff) && x44.r(this.slow_kb_warning_threshold, modelOption.slow_kb_warning_threshold);
    }

    public final ModelCapabilities getCapabilities() {
        return this.capabilities;
    }

    public final _ServerLocalizedString getDescription() {
        return this.description;
    }

    public final String getDescription_i18n_key() {
        return this.description_i18n_key;
    }

    public final Boolean getInactive() {
        return this.inactive;
    }

    public final String getKnowledgeCutoff() {
        return this.knowledgeCutoff;
    }

    /* JADX INFO: renamed from: getModel-i-4oh0I, reason: not valid java name */
    public final String m356getModeli4oh0I() {
        return this.model;
    }

    public final String getName() {
        return this.name;
    }

    public final _ServerLocalizedString getNotice_text() {
        return this.notice_text;
    }

    public final String getNotice_text_i18n_key() {
        return this.notice_text_i18n_key;
    }

    public final Boolean getOverflow() {
        return this.overflow;
    }

    public final String getSafeDisplayName() {
        return bsg.u0(this.name, "🤫", false) ? "🤫" : bsg.R0(this.name, "Claude ");
    }

    public final Integer getSlow_kb_warning_threshold() {
        return this.slow_kb_warning_threshold;
    }

    public final List<ThinkingModeOption> getThinking_modes() {
        return this.thinking_modes;
    }

    public int hashCode() {
        int iL = kgh.l(ModelId.m1062hashCodeimpl(this.model) * 31, 31, this.name);
        _ServerLocalizedString _serverlocalizedstring = this.description;
        int iHashCode = (iL + (_serverlocalizedstring == null ? 0 : _serverlocalizedstring.hashCode())) * 31;
        String str = this.description_i18n_key;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.overflow;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.inactive;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<ThinkingModeOption> list = this.thinking_modes;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        ModelCapabilities modelCapabilities = this.capabilities;
        int iHashCode6 = (iHashCode5 + (modelCapabilities == null ? 0 : modelCapabilities.hashCode())) * 31;
        _ServerLocalizedString _serverlocalizedstring2 = this.notice_text;
        int iHashCode7 = (iHashCode6 + (_serverlocalizedstring2 == null ? 0 : _serverlocalizedstring2.hashCode())) * 31;
        String str2 = this.notice_text_i18n_key;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.knowledgeCutoff;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.slow_kb_warning_threshold;
        return iHashCode9 + (num != null ? num.hashCode() : 0);
    }

    public final boolean isMmImagesSupported() {
        return !(this.capabilities != null ? x44.r(r1.getMm_images(), Boolean.FALSE) : false);
    }

    public final boolean isMmPdfSupported() {
        return !(this.capabilities != null ? x44.r(r1.getMm_pdf(), Boolean.FALSE) : false);
    }

    public final boolean isResearchSupported() {
        return !(this.capabilities != null ? x44.r(r1.getCompass(), Boolean.FALSE) : false);
    }

    public final boolean isWebSearchSupported() {
        return !(this.capabilities != null ? x44.r(r1.getWeb_search(), Boolean.FALSE) : false);
    }

    public String toString() {
        String strM1063toStringimpl = ModelId.m1063toStringimpl(this.model);
        String str = this.name;
        _ServerLocalizedString _serverlocalizedstring = this.description;
        String str2 = this.description_i18n_key;
        Boolean bool = this.overflow;
        Boolean bool2 = this.inactive;
        List<ThinkingModeOption> list = this.thinking_modes;
        ModelCapabilities modelCapabilities = this.capabilities;
        _ServerLocalizedString _serverlocalizedstring2 = this.notice_text;
        String str3 = this.notice_text_i18n_key;
        String str4 = this.knowledgeCutoff;
        Integer num = this.slow_kb_warning_threshold;
        StringBuilder sbR = kgh.r("ModelOption(model=", strM1063toStringimpl, ", name=", str, ", description=");
        sbR.append(_serverlocalizedstring);
        sbR.append(", description_i18n_key=");
        sbR.append(str2);
        sbR.append(", overflow=");
        ebh.C(sbR, bool, ", inactive=", bool2, ", thinking_modes=");
        sbR.append(list);
        sbR.append(", capabilities=");
        sbR.append(modelCapabilities);
        sbR.append(", notice_text=");
        sbR.append(_serverlocalizedstring2);
        sbR.append(", notice_text_i18n_key=");
        sbR.append(str3);
        sbR.append(", knowledgeCutoff=");
        sbR.append(str4);
        sbR.append(", slow_kb_warning_threshold=");
        sbR.append(num);
        sbR.append(")");
        return sbR.toString();
    }

    public /* synthetic */ ModelOption(String str, String str2, _ServerLocalizedString _serverlocalizedstring, String str3, Boolean bool, Boolean bool2, List list, ModelCapabilities modelCapabilities, _ServerLocalizedString _serverlocalizedstring2, String str4, String str5, Integer num, mq5 mq5Var) {
        this(str, str2, _serverlocalizedstring, str3, bool, bool2, list, modelCapabilities, _serverlocalizedstring2, str4, str5, num);
    }

    public /* synthetic */ ModelOption(int i, String str, String str2, _ServerLocalizedString _serverlocalizedstring, String str3, Boolean bool, Boolean bool2, List list, ModelCapabilities modelCapabilities, _ServerLocalizedString _serverlocalizedstring2, String str4, String str5, Integer num, vnf vnfVar, mq5 mq5Var) {
        this(i, str, str2, _serverlocalizedstring, str3, bool, bool2, list, modelCapabilities, _serverlocalizedstring2, str4, str5, num, vnfVar);
    }

    private ModelOption(String str, String str2, _ServerLocalizedString _serverlocalizedstring, String str3, Boolean bool, Boolean bool2, List<ThinkingModeOption> list, ModelCapabilities modelCapabilities, _ServerLocalizedString _serverlocalizedstring2, String str4, String str5, Integer num) {
        str.getClass();
        str2.getClass();
        this.model = str;
        this.name = str2;
        this.description = _serverlocalizedstring;
        this.description_i18n_key = str3;
        this.overflow = bool;
        this.inactive = bool2;
        this.thinking_modes = list;
        this.capabilities = modelCapabilities;
        this.notice_text = _serverlocalizedstring2;
        this.notice_text_i18n_key = str4;
        this.knowledgeCutoff = str5;
        this.slow_kb_warning_threshold = num;
    }

    public /* synthetic */ ModelOption(String str, String str2, _ServerLocalizedString _serverlocalizedstring, String str3, Boolean bool, Boolean bool2, List list, ModelCapabilities modelCapabilities, _ServerLocalizedString _serverlocalizedstring2, String str4, String str5, Integer num, int i, mq5 mq5Var) {
        this(str, str2, (i & 4) != 0 ? null : _serverlocalizedstring, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : bool2, (i & 64) != 0 ? null : list, (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? null : modelCapabilities, (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? null : _serverlocalizedstring2, (i & 512) != 0 ? null : str4, (i & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? null : str5, (i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0 ? null : num, null);
    }
}
