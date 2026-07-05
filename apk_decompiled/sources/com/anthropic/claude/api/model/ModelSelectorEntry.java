package com.anthropic.claude.api.model;

import com.anthropic.claude.api.model.DisabledReason;
import com.anthropic.claude.api.notice.Cta;
import com.anthropic.claude.api.notice.CtaIntent;
import com.anthropic.claude.api.notice.Notice;
import com.anthropic.claude.api.notice.RedirectHint;
import com.anthropic.claude.types.strings.ModelId;
import com.anthropic.claude.types.strings.ThinkingEffort;
import com.anthropic.claude.types.strings.ThinkingMode;
import com.anthropic.claude.types.strings._ServerLocalizedString;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.bsg;
import defpackage.bz7;
import defpackage.d4c;
import defpackage.ebh;
import defpackage.f7a;
import defpackage.gvj;
import defpackage.hmh;
import defpackage.jce;
import defpackage.jua;
import defpackage.kgh;
import defpackage.kob;
import defpackage.kw9;
import defpackage.lm6;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.nm6;
import defpackage.oc1;
import defpackage.onf;
import defpackage.oob;
import defpackage.rob;
import defpackage.rp4;
import defpackage.sob;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnb;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.wkj;
import defpackage.x44;
import defpackage.xpb;
import defpackage.yb5;
import defpackage.yc5;
import defpackage.znf;
import defpackage.zt1;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u0000 \u0087\u00012\u00020\u0001:\u0004\u0088\u0001\u0089\u0001B»\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00130\u0012\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cB©\u0001\b\u0010\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\u001b\u0010!J)\u0010$\u001a\u00020\u00002\u001a\u0010#\u001a\u0016\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0012\b\u0012\u00060\u0006j\u0002`\u00070\"¢\u0006\u0004\b$\u0010%J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b)\u0010'J\u0018\u0010*\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b.\u0010/J\u001c\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00130\u0012HÆ\u0003¢\u0006\u0004\b0\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b2\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b4\u00105J\u0012\u00106\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\b6\u00107JÈ\u0001\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00130\u00122\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÆ\u0001¢\u0006\u0004\b8\u00109J\u0010\u0010;\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b;\u0010'J\u0010\u0010<\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b<\u0010=J\u001a\u0010?\u001a\u00020\u00132\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b?\u0010@J\u0017\u0010B\u001a\u00020\u00132\u0006\u0010A\u001a\u00020\u0004H\u0002¢\u0006\u0004\bB\u0010CJ)\u0010F\u001a\u0004\u0018\u00010E2\u0016\u0010D\u001a\u0012\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0012\u0004\u0012\u00020\u00040\"H\u0002¢\u0006\u0004\bF\u0010GJ\u0018\u0010H\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007HÂ\u0003¢\u0006\u0004\bH\u0010+J\u0018\u0010I\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007HÂ\u0003¢\u0006\u0004\bI\u0010+J\u0018\u0010J\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007HÂ\u0003¢\u0006\u0004\bJ\u0010+J\u0012\u0010K\u001a\u0004\u0018\u00010\fHÂ\u0003¢\u0006\u0004\bK\u0010LJ'\u0010U\u001a\u00020R2\u0006\u0010M\u001a\u00020\u00002\u0006\u0010O\u001a\u00020N2\u0006\u0010Q\u001a\u00020PH\u0001¢\u0006\u0004\bS\u0010TR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010V\u001a\u0004\bW\u0010'R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010V\u001a\u0004\bX\u0010'R\u001f\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010Y\u001a\u0004\bZ\u0010+R\u001c\u0010\t\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010YR\u001c\u0010\n\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010YR\u001c\u0010\u000b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010YR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010[R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\\\u001a\u0004\b]\u0010-R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010^\u001a\u0004\b_\u0010/R#\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u0010`\u001a\u0004\ba\u00101R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010b\u001a\u0004\bc\u00103R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010d\u001a\u0004\be\u00105R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010f\u001a\u0004\bg\u00107R\u0011\u0010i\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bh\u0010'R\u0011\u0010j\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\bj\u0010kR\u0011\u0010l\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\bl\u0010kR\u0011\u0010m\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\bm\u0010kR\u0011\u0010n\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\bn\u0010kR\u0013\u0010p\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\bo\u0010'R\u001d\u0010v\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020s0r0q8F¢\u0006\u0006\u001a\u0004\bt\u0010uR\u001d\u0010y\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020w0r0q8F¢\u0006\u0006\u001a\u0004\bx\u0010uR\u0011\u0010{\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\bz\u0010kR\u0011\u0010}\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b|\u0010kR\u0011\u0010\u007f\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b~\u0010kR\u0013\u0010\u0081\u0001\u001a\u00020\u00138F¢\u0006\u0007\u001a\u0005\b\u0080\u0001\u0010kR\u0016\u0010\u0084\u0001\u001a\u0004\u0018\u00010E8F¢\u0006\b\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0015\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0007\u001a\u0005\b\u0085\u0001\u0010'¨\u0006\u008a\u0001"}, d2 = {"Lcom/anthropic/claude/api/model/ModelSelectorEntry;", "", "Lcom/anthropic/claude/types/strings/ModelId;", "id", "", "name", "Lcom/anthropic/claude/types/strings/_ServerLocalizedString;", "Lcom/anthropic/claude/types/strings/ServerLocalizedString;", "description", "notice_title", "notice_text", "cta_copy", "Lcom/anthropic/claude/api/notice/CtaIntent;", "cta_intent", "Lcom/anthropic/claude/api/model/ModelSection;", "section", "Lcom/anthropic/claude/api/model/DisabledReason;", "disabled_reason", "", "", "capabilities", "Lcom/anthropic/claude/api/model/ThinkingOptions;", "thinking", "Lcom/anthropic/claude/api/model/Badge;", "badge", "Lcom/anthropic/claude/api/model/ModelTooltip;", "tooltip", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/types/strings/_ServerLocalizedString;Lcom/anthropic/claude/types/strings/_ServerLocalizedString;Lcom/anthropic/claude/types/strings/_ServerLocalizedString;Lcom/anthropic/claude/types/strings/_ServerLocalizedString;Lcom/anthropic/claude/api/notice/CtaIntent;Lcom/anthropic/claude/api/model/ModelSection;Lcom/anthropic/claude/api/model/DisabledReason;Ljava/util/Map;Lcom/anthropic/claude/api/model/ThinkingOptions;Lcom/anthropic/claude/api/model/Badge;Lcom/anthropic/claude/api/model/ModelTooltip;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/types/strings/_ServerLocalizedString;Lcom/anthropic/claude/types/strings/_ServerLocalizedString;Lcom/anthropic/claude/types/strings/_ServerLocalizedString;Lcom/anthropic/claude/types/strings/_ServerLocalizedString;Lcom/anthropic/claude/api/notice/CtaIntent;Lcom/anthropic/claude/api/model/ModelSection;Lcom/anthropic/claude/api/model/DisabledReason;Ljava/util/Map;Lcom/anthropic/claude/api/model/ThinkingOptions;Lcom/anthropic/claude/api/model/Badge;Lcom/anthropic/claude/api/model/ModelTooltip;Lvnf;Lmq5;)V", "Lkotlin/Function1;", "f", "mapNoticeStrings", "(Lbz7;)Lcom/anthropic/claude/api/model/ModelSelectorEntry;", "component1-i-4oh0I", "()Ljava/lang/String;", "component1", "component2", "component3", "()Lcom/anthropic/claude/types/strings/_ServerLocalizedString;", "component8", "()Lcom/anthropic/claude/api/model/ModelSection;", "component9", "()Lcom/anthropic/claude/api/model/DisabledReason;", "component10", "()Ljava/util/Map;", "component11", "()Lcom/anthropic/claude/api/model/ThinkingOptions;", "component12", "()Lcom/anthropic/claude/api/model/Badge;", "component13", "()Lcom/anthropic/claude/api/model/ModelTooltip;", "copy-rAmvSeg", "(Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/types/strings/_ServerLocalizedString;Lcom/anthropic/claude/types/strings/_ServerLocalizedString;Lcom/anthropic/claude/types/strings/_ServerLocalizedString;Lcom/anthropic/claude/types/strings/_ServerLocalizedString;Lcom/anthropic/claude/api/notice/CtaIntent;Lcom/anthropic/claude/api/model/ModelSection;Lcom/anthropic/claude/api/model/DisabledReason;Ljava/util/Map;Lcom/anthropic/claude/api/model/ThinkingOptions;Lcom/anthropic/claude/api/model/Badge;Lcom/anthropic/claude/api/model/ModelTooltip;)Lcom/anthropic/claude/api/model/ModelSelectorEntry;", "copy", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "key", "supports", "(Ljava/lang/String;)Z", "pick", "Lcom/anthropic/claude/api/notice/Notice;", "buildNotice", "(Lbz7;)Lcom/anthropic/claude/api/notice/Notice;", "component4", "component5", "component6", "component7", "()Lcom/anthropic/claude/api/notice/CtaIntent;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/model/ModelSelectorEntry;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getId-i-4oh0I", "getName", "Lcom/anthropic/claude/types/strings/_ServerLocalizedString;", "getDescription", "Lcom/anthropic/claude/api/notice/CtaIntent;", "Lcom/anthropic/claude/api/model/ModelSection;", "getSection", "Lcom/anthropic/claude/api/model/DisabledReason;", "getDisabled_reason", "Ljava/util/Map;", "getCapabilities", "Lcom/anthropic/claude/api/model/ThinkingOptions;", "getThinking", "Lcom/anthropic/claude/api/model/Badge;", "getBadge", "Lcom/anthropic/claude/api/model/ModelTooltip;", "getTooltip", "getDisplayName", "displayName", "isSelectable", "()Z", "isUpgradeGated", "isUnavailable", "isKillSwitched", "getUnavailableMessage", "unavailableMessage", "", "Lcom/anthropic/claude/api/model/ThinkingOption;", "Lcom/anthropic/claude/types/strings/ThinkingEffort;", "getEffortOptions", "()Ljava/util/List;", "effortOptions", "Lcom/anthropic/claude/types/strings/ThinkingMode;", "getModeOptions", "modeOptions", "getSupportsMmPdf", "supportsMmPdf", "getSupportsImages", "supportsImages", "getSupportsWebSearch", "supportsWebSearch", "getSupportsResearch", "supportsResearch", "getNotice", "()Lcom/anthropic/claude/api/notice/Notice;", "notice", "getNoticeFingerprint", "noticeFingerprint", "Companion", "rob", "sob", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ModelSelectorEntry {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final sob Companion = new sob();
    private final Badge badge;
    private final Map<String, Boolean> capabilities;
    private final _ServerLocalizedString cta_copy;
    private final CtaIntent cta_intent;
    private final _ServerLocalizedString description;
    private final DisabledReason disabled_reason;
    private final String id;
    private final String name;
    private final _ServerLocalizedString notice_text;
    private final _ServerLocalizedString notice_title;
    private final ModelSection section;
    private final ThinkingOptions thinking;
    private final ModelTooltip tooltip;

    static {
        oob oobVar = new oob(1);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{null, null, yb5.w(w1aVar, oobVar), yb5.w(w1aVar, new oob(2)), yb5.w(w1aVar, new oob(3)), yb5.w(w1aVar, new oob(4)), null, null, yb5.w(w1aVar, new oob(5)), yb5.w(w1aVar, new oob(6)), null, null, null};
    }

    private /* synthetic */ ModelSelectorEntry(int i, String str, String str2, _ServerLocalizedString _serverlocalizedstring, _ServerLocalizedString _serverlocalizedstring2, _ServerLocalizedString _serverlocalizedstring3, _ServerLocalizedString _serverlocalizedstring4, CtaIntent ctaIntent, ModelSection modelSection, DisabledReason disabledReason, Map map, ThinkingOptions thinkingOptions, Badge badge, ModelTooltip modelTooltip, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, rob.a.getDescriptor());
            throw null;
        }
        this.id = str;
        this.name = str2;
        if ((i & 4) == 0) {
            this.description = null;
        } else {
            this.description = _serverlocalizedstring;
        }
        if ((i & 8) == 0) {
            this.notice_title = null;
        } else {
            this.notice_title = _serverlocalizedstring2;
        }
        if ((i & 16) == 0) {
            this.notice_text = null;
        } else {
            this.notice_text = _serverlocalizedstring3;
        }
        if ((i & 32) == 0) {
            this.cta_copy = null;
        } else {
            this.cta_copy = _serverlocalizedstring4;
        }
        if ((i & 64) == 0) {
            this.cta_intent = null;
        } else {
            this.cta_intent = ctaIntent;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0) {
            this.section = ModelSection.DEPRECATED;
        } else {
            this.section = modelSection;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 0) {
            this.disabled_reason = null;
        } else {
            this.disabled_reason = disabledReason;
        }
        if ((i & 512) == 0) {
            this.capabilities = nm6.E;
        } else {
            this.capabilities = map;
        }
        if ((i & FreeTypeConstants.FT_LOAD_NO_RECURSE) == 0) {
            this.thinking = null;
        } else {
            this.thinking = thinkingOptions;
        }
        if ((i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) == 0) {
            this.badge = null;
        } else {
            this.badge = badge;
        }
        if ((i & FreeTypeConstants.FT_LOAD_MONOCHROME) == 0) {
            this.tooltip = null;
        } else {
            this.tooltip = modelTooltip;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer _childSerializers$_anonymous_() {
        return new rp4(jce.a.b(_ServerLocalizedString.class), d4c.S(wkj.a), new KSerializer[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer _childSerializers$_anonymous_$0() {
        return new rp4(jce.a.b(_ServerLocalizedString.class), d4c.S(wkj.a), new KSerializer[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer _childSerializers$_anonymous_$1() {
        return new rp4(jce.a.b(_ServerLocalizedString.class), d4c.S(wkj.a), new KSerializer[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer _childSerializers$_anonymous_$2() {
        return new rp4(jce.a.b(_ServerLocalizedString.class), d4c.S(wkj.a), new KSerializer[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$3() {
        return DisabledReason.Companion.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$4() {
        return new f7a(srg.a, zt1.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_noticeFingerprint_$lambda$0(_ServerLocalizedString _serverlocalizedstring) {
        _serverlocalizedstring.getClass();
        return _serverlocalizedstring.getEnglish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_notice_$lambda$0(_ServerLocalizedString _serverlocalizedstring) {
        _serverlocalizedstring.getClass();
        return _serverlocalizedstring.getLocalizedText();
    }

    private final Notice buildNotice(bz7 pick) {
        String str;
        String str2;
        CtaIntent ctaIntent;
        String str3;
        _ServerLocalizedString _serverlocalizedstring = this.notice_title;
        Cta cta = null;
        if (_serverlocalizedstring == null || (str = (String) pick.invoke(_serverlocalizedstring)) == null || bsg.I0(str)) {
            str = null;
        }
        _ServerLocalizedString _serverlocalizedstring2 = this.notice_text;
        if (_serverlocalizedstring2 == null || (str2 = (String) pick.invoke(_serverlocalizedstring2)) == null || bsg.I0(str2)) {
            str2 = null;
        }
        if (str == null && str2 == null) {
            return null;
        }
        _ServerLocalizedString _serverlocalizedstring3 = this.cta_copy;
        String str4 = (_serverlocalizedstring3 == null || (str3 = (String) pick.invoke(_serverlocalizedstring3)) == null || bsg.I0(str3)) ? null : str3;
        if (str4 != null && (ctaIntent = this.cta_intent) != null) {
            cta = new Cta(str4, ctaIntent, (RedirectHint) null, 4, (mq5) null);
        }
        return new Notice(str, str2, cta);
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    private final _ServerLocalizedString getNotice_title() {
        return this.notice_title;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    private final _ServerLocalizedString getNotice_text() {
        return this.notice_text;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    private final _ServerLocalizedString getCta_copy() {
        return this.cta_copy;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    private final CtaIntent getCta_intent() {
        return this.cta_intent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-rAmvSeg$default, reason: not valid java name */
    public static /* synthetic */ ModelSelectorEntry m361copyrAmvSeg$default(ModelSelectorEntry modelSelectorEntry, String str, String str2, _ServerLocalizedString _serverlocalizedstring, _ServerLocalizedString _serverlocalizedstring2, _ServerLocalizedString _serverlocalizedstring3, _ServerLocalizedString _serverlocalizedstring4, CtaIntent ctaIntent, ModelSection modelSection, DisabledReason disabledReason, Map map, ThinkingOptions thinkingOptions, Badge badge, ModelTooltip modelTooltip, int i, Object obj) {
        if ((i & 1) != 0) {
            str = modelSelectorEntry.id;
        }
        return modelSelectorEntry.m363copyrAmvSeg(str, (i & 2) != 0 ? modelSelectorEntry.name : str2, (i & 4) != 0 ? modelSelectorEntry.description : _serverlocalizedstring, (i & 8) != 0 ? modelSelectorEntry.notice_title : _serverlocalizedstring2, (i & 16) != 0 ? modelSelectorEntry.notice_text : _serverlocalizedstring3, (i & 32) != 0 ? modelSelectorEntry.cta_copy : _serverlocalizedstring4, (i & 64) != 0 ? modelSelectorEntry.cta_intent : ctaIntent, (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? modelSelectorEntry.section : modelSection, (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? modelSelectorEntry.disabled_reason : disabledReason, (i & 512) != 0 ? modelSelectorEntry.capabilities : map, (i & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? modelSelectorEntry.thinking : thinkingOptions, (i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0 ? modelSelectorEntry.badge : badge, (i & FreeTypeConstants.FT_LOAD_MONOCHROME) != 0 ? modelSelectorEntry.tooltip : modelTooltip);
    }

    private final boolean supports(String key) {
        return this.capabilities.isEmpty() || x44.r(this.capabilities.get(key), Boolean.TRUE);
    }

    public static final /* synthetic */ void write$Self$api(ModelSelectorEntry self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.r(serialDesc, 0, vnb.a, ModelId.m1058boximpl(self.id));
        output.q(serialDesc, 1, self.name);
        if (output.E(serialDesc) || self.description != null) {
            output.B(serialDesc, 2, (znf) kw9VarArr[2].getValue(), self.description);
        }
        if (output.E(serialDesc) || self.notice_title != null) {
            output.B(serialDesc, 3, (znf) kw9VarArr[3].getValue(), self.notice_title);
        }
        if (output.E(serialDesc) || self.notice_text != null) {
            output.B(serialDesc, 4, (znf) kw9VarArr[4].getValue(), self.notice_text);
        }
        if (output.E(serialDesc) || self.cta_copy != null) {
            output.B(serialDesc, 5, (znf) kw9VarArr[5].getValue(), self.cta_copy);
        }
        if (output.E(serialDesc) || self.cta_intent != null) {
            output.B(serialDesc, 6, yc5.d, self.cta_intent);
        }
        if (output.E(serialDesc) || self.section != ModelSection.DEPRECATED) {
            output.r(serialDesc, 7, kob.d, self.section);
        }
        if (output.E(serialDesc) || self.disabled_reason != null) {
            output.B(serialDesc, 8, (znf) kw9VarArr[8].getValue(), self.disabled_reason);
        }
        if (output.E(serialDesc) || !x44.r(self.capabilities, nm6.E)) {
            output.r(serialDesc, 9, (znf) kw9VarArr[9].getValue(), self.capabilities);
        }
        if (output.E(serialDesc) || self.thinking != null) {
            output.B(serialDesc, 10, hmh.a, self.thinking);
        }
        if (output.E(serialDesc) || self.badge != null) {
            output.B(serialDesc, 11, oc1.a, self.badge);
        }
        if (!output.E(serialDesc) && self.tooltip == null) {
            return;
        }
        output.B(serialDesc, 12, xpb.a, self.tooltip);
    }

    /* JADX INFO: renamed from: component1-i-4oh0I, reason: not valid java name and from getter */
    public final String getId() {
        return this.id;
    }

    public final Map<String, Boolean> component10() {
        return this.capabilities;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final ThinkingOptions getThinking() {
        return this.thinking;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Badge getBadge() {
        return this.badge;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final ModelTooltip getTooltip() {
        return this.tooltip;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final _ServerLocalizedString getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final ModelSection getSection() {
        return this.section;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final DisabledReason getDisabled_reason() {
        return this.disabled_reason;
    }

    /* JADX INFO: renamed from: copy-rAmvSeg, reason: not valid java name */
    public final ModelSelectorEntry m363copyrAmvSeg(String id, String name, _ServerLocalizedString description, _ServerLocalizedString notice_title, _ServerLocalizedString notice_text, _ServerLocalizedString cta_copy, CtaIntent cta_intent, ModelSection section, DisabledReason disabled_reason, Map<String, Boolean> capabilities, ThinkingOptions thinking, Badge badge, ModelTooltip tooltip) {
        id.getClass();
        name.getClass();
        section.getClass();
        capabilities.getClass();
        return new ModelSelectorEntry(id, name, description, notice_title, notice_text, cta_copy, cta_intent, section, disabled_reason, capabilities, thinking, badge, tooltip, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModelSelectorEntry)) {
            return false;
        }
        ModelSelectorEntry modelSelectorEntry = (ModelSelectorEntry) other;
        return ModelId.m1061equalsimpl0(this.id, modelSelectorEntry.id) && x44.r(this.name, modelSelectorEntry.name) && x44.r(this.description, modelSelectorEntry.description) && x44.r(this.notice_title, modelSelectorEntry.notice_title) && x44.r(this.notice_text, modelSelectorEntry.notice_text) && x44.r(this.cta_copy, modelSelectorEntry.cta_copy) && this.cta_intent == modelSelectorEntry.cta_intent && this.section == modelSelectorEntry.section && x44.r(this.disabled_reason, modelSelectorEntry.disabled_reason) && x44.r(this.capabilities, modelSelectorEntry.capabilities) && x44.r(this.thinking, modelSelectorEntry.thinking) && x44.r(this.badge, modelSelectorEntry.badge) && x44.r(this.tooltip, modelSelectorEntry.tooltip);
    }

    public final Badge getBadge() {
        return this.badge;
    }

    public final Map<String, Boolean> getCapabilities() {
        return this.capabilities;
    }

    public final _ServerLocalizedString getDescription() {
        return this.description;
    }

    public final DisabledReason getDisabled_reason() {
        return this.disabled_reason;
    }

    public final String getDisplayName() {
        return this.name;
    }

    public final List<ThinkingOption<ThinkingEffort>> getEffortOptions() {
        ThinkingOptions thinkingOptions = this.thinking;
        List<ThinkingOption<ThinkingEffort>> effort_options = thinkingOptions != null ? thinkingOptions.getEffort_options() : null;
        return effort_options == null ? lm6.E : effort_options;
    }

    /* JADX INFO: renamed from: getId-i-4oh0I, reason: not valid java name */
    public final String m364getIdi4oh0I() {
        return this.id;
    }

    public final List<ThinkingOption<ThinkingMode>> getModeOptions() {
        ThinkingOptions thinkingOptions = this.thinking;
        List<ThinkingOption<ThinkingMode>> mode_options = thinkingOptions != null ? thinkingOptions.getMode_options() : null;
        return mode_options == null ? lm6.E : mode_options;
    }

    public final String getName() {
        return this.name;
    }

    public final Notice getNotice() {
        return buildNotice(new jua(19));
    }

    public final String getNoticeFingerprint() {
        Notice noticeBuildNotice = buildNotice(new jua(20));
        if (noticeBuildNotice != null) {
            return noticeBuildNotice.getFingerprint();
        }
        return null;
    }

    public final ModelSection getSection() {
        return this.section;
    }

    public final boolean getSupportsImages() {
        return supports("mm_images");
    }

    public final boolean getSupportsMmPdf() {
        return supports("mm_pdf");
    }

    public final boolean getSupportsResearch() {
        return supports("compass");
    }

    public final boolean getSupportsWebSearch() {
        return supports("web_search");
    }

    public final ThinkingOptions getThinking() {
        return this.thinking;
    }

    public final ModelTooltip getTooltip() {
        return this.tooltip;
    }

    public final String getUnavailableMessage() {
        _ServerLocalizedString content;
        String localizedText;
        _ServerLocalizedString message;
        String localizedText2;
        DisabledReason disabledReason = this.disabled_reason;
        DisabledReason.ModelDisabled modelDisabled = disabledReason instanceof DisabledReason.ModelDisabled ? (DisabledReason.ModelDisabled) disabledReason : null;
        if (modelDisabled != null && (message = modelDisabled.getMessage()) != null && (localizedText2 = message.getLocalizedText()) != null) {
            if (bsg.I0(localizedText2)) {
                localizedText2 = null;
            }
            if (localizedText2 != null) {
                return localizedText2;
            }
        }
        ModelTooltip modelTooltip = this.tooltip;
        if (modelTooltip == null || (content = modelTooltip.getContent()) == null || (localizedText = content.getLocalizedText()) == null || bsg.I0(localizedText)) {
            return null;
        }
        return localizedText;
    }

    public int hashCode() {
        int iL = kgh.l(ModelId.m1062hashCodeimpl(this.id) * 31, 31, this.name);
        _ServerLocalizedString _serverlocalizedstring = this.description;
        int iHashCode = (iL + (_serverlocalizedstring == null ? 0 : _serverlocalizedstring.hashCode())) * 31;
        _ServerLocalizedString _serverlocalizedstring2 = this.notice_title;
        int iHashCode2 = (iHashCode + (_serverlocalizedstring2 == null ? 0 : _serverlocalizedstring2.hashCode())) * 31;
        _ServerLocalizedString _serverlocalizedstring3 = this.notice_text;
        int iHashCode3 = (iHashCode2 + (_serverlocalizedstring3 == null ? 0 : _serverlocalizedstring3.hashCode())) * 31;
        _ServerLocalizedString _serverlocalizedstring4 = this.cta_copy;
        int iHashCode4 = (iHashCode3 + (_serverlocalizedstring4 == null ? 0 : _serverlocalizedstring4.hashCode())) * 31;
        CtaIntent ctaIntent = this.cta_intent;
        int iHashCode5 = (this.section.hashCode() + ((iHashCode4 + (ctaIntent == null ? 0 : ctaIntent.hashCode())) * 31)) * 31;
        DisabledReason disabledReason = this.disabled_reason;
        int iG = ebh.g((iHashCode5 + (disabledReason == null ? 0 : disabledReason.hashCode())) * 31, 31, this.capabilities);
        ThinkingOptions thinkingOptions = this.thinking;
        int iHashCode6 = (iG + (thinkingOptions == null ? 0 : thinkingOptions.hashCode())) * 31;
        Badge badge = this.badge;
        int iHashCode7 = (iHashCode6 + (badge == null ? 0 : badge.hashCode())) * 31;
        ModelTooltip modelTooltip = this.tooltip;
        return iHashCode7 + (modelTooltip != null ? modelTooltip.hashCode() : 0);
    }

    public final boolean isKillSwitched() {
        return this.disabled_reason instanceof DisabledReason.ModelDisabled;
    }

    public final boolean isSelectable() {
        return this.section != ModelSection.DEPRECATED && this.disabled_reason == null;
    }

    public final boolean isUnavailable() {
        return (isSelectable() || isUpgradeGated()) ? false : true;
    }

    public final boolean isUpgradeGated() {
        return this.disabled_reason instanceof DisabledReason.UpgradeRequired;
    }

    public final ModelSelectorEntry mapNoticeStrings(bz7 f) {
        f.getClass();
        _ServerLocalizedString _serverlocalizedstring = this.notice_title;
        _ServerLocalizedString _serverlocalizedstring2 = _serverlocalizedstring != null ? (_ServerLocalizedString) f.invoke(_serverlocalizedstring) : null;
        _ServerLocalizedString _serverlocalizedstring3 = this.notice_text;
        _ServerLocalizedString _serverlocalizedstring4 = _serverlocalizedstring3 != null ? (_ServerLocalizedString) f.invoke(_serverlocalizedstring3) : null;
        _ServerLocalizedString _serverlocalizedstring5 = this.cta_copy;
        return m361copyrAmvSeg$default(this, null, null, null, _serverlocalizedstring2, _serverlocalizedstring4, _serverlocalizedstring5 != null ? (_ServerLocalizedString) f.invoke(_serverlocalizedstring5) : null, null, null, null, null, null, null, null, 8135, null);
    }

    public String toString() {
        String strM1063toStringimpl = ModelId.m1063toStringimpl(this.id);
        String str = this.name;
        _ServerLocalizedString _serverlocalizedstring = this.description;
        _ServerLocalizedString _serverlocalizedstring2 = this.notice_title;
        _ServerLocalizedString _serverlocalizedstring3 = this.notice_text;
        _ServerLocalizedString _serverlocalizedstring4 = this.cta_copy;
        CtaIntent ctaIntent = this.cta_intent;
        ModelSection modelSection = this.section;
        DisabledReason disabledReason = this.disabled_reason;
        Map<String, Boolean> map = this.capabilities;
        ThinkingOptions thinkingOptions = this.thinking;
        Badge badge = this.badge;
        ModelTooltip modelTooltip = this.tooltip;
        StringBuilder sbR = kgh.r("ModelSelectorEntry(id=", strM1063toStringimpl, ", name=", str, ", description=");
        sbR.append(_serverlocalizedstring);
        sbR.append(", notice_title=");
        sbR.append(_serverlocalizedstring2);
        sbR.append(", notice_text=");
        sbR.append(_serverlocalizedstring3);
        sbR.append(", cta_copy=");
        sbR.append(_serverlocalizedstring4);
        sbR.append(", cta_intent=");
        sbR.append(ctaIntent);
        sbR.append(", section=");
        sbR.append(modelSection);
        sbR.append(", disabled_reason=");
        sbR.append(disabledReason);
        sbR.append(", capabilities=");
        sbR.append(map);
        sbR.append(", thinking=");
        sbR.append(thinkingOptions);
        sbR.append(", badge=");
        sbR.append(badge);
        sbR.append(", tooltip=");
        sbR.append(modelTooltip);
        sbR.append(")");
        return sbR.toString();
    }

    public /* synthetic */ ModelSelectorEntry(String str, String str2, _ServerLocalizedString _serverlocalizedstring, _ServerLocalizedString _serverlocalizedstring2, _ServerLocalizedString _serverlocalizedstring3, _ServerLocalizedString _serverlocalizedstring4, CtaIntent ctaIntent, ModelSection modelSection, DisabledReason disabledReason, Map map, ThinkingOptions thinkingOptions, Badge badge, ModelTooltip modelTooltip, mq5 mq5Var) {
        this(str, str2, _serverlocalizedstring, _serverlocalizedstring2, _serverlocalizedstring3, _serverlocalizedstring4, ctaIntent, modelSection, disabledReason, map, thinkingOptions, badge, modelTooltip);
    }

    public /* synthetic */ ModelSelectorEntry(int i, String str, String str2, _ServerLocalizedString _serverlocalizedstring, _ServerLocalizedString _serverlocalizedstring2, _ServerLocalizedString _serverlocalizedstring3, _ServerLocalizedString _serverlocalizedstring4, CtaIntent ctaIntent, ModelSection modelSection, DisabledReason disabledReason, Map map, ThinkingOptions thinkingOptions, Badge badge, ModelTooltip modelTooltip, vnf vnfVar, mq5 mq5Var) {
        this(i, str, str2, _serverlocalizedstring, _serverlocalizedstring2, _serverlocalizedstring3, _serverlocalizedstring4, ctaIntent, modelSection, disabledReason, map, thinkingOptions, badge, modelTooltip, vnfVar);
    }

    private ModelSelectorEntry(String str, String str2, _ServerLocalizedString _serverlocalizedstring, _ServerLocalizedString _serverlocalizedstring2, _ServerLocalizedString _serverlocalizedstring3, _ServerLocalizedString _serverlocalizedstring4, CtaIntent ctaIntent, ModelSection modelSection, DisabledReason disabledReason, Map<String, Boolean> map, ThinkingOptions thinkingOptions, Badge badge, ModelTooltip modelTooltip) {
        str.getClass();
        str2.getClass();
        modelSection.getClass();
        map.getClass();
        this.id = str;
        this.name = str2;
        this.description = _serverlocalizedstring;
        this.notice_title = _serverlocalizedstring2;
        this.notice_text = _serverlocalizedstring3;
        this.cta_copy = _serverlocalizedstring4;
        this.cta_intent = ctaIntent;
        this.section = modelSection;
        this.disabled_reason = disabledReason;
        this.capabilities = map;
        this.thinking = thinkingOptions;
        this.badge = badge;
        this.tooltip = modelTooltip;
    }

    public /* synthetic */ ModelSelectorEntry(String str, String str2, _ServerLocalizedString _serverlocalizedstring, _ServerLocalizedString _serverlocalizedstring2, _ServerLocalizedString _serverlocalizedstring3, _ServerLocalizedString _serverlocalizedstring4, CtaIntent ctaIntent, ModelSection modelSection, DisabledReason disabledReason, Map map, ThinkingOptions thinkingOptions, Badge badge, ModelTooltip modelTooltip, int i, mq5 mq5Var) {
        this(str, str2, (i & 4) != 0 ? null : _serverlocalizedstring, (i & 8) != 0 ? null : _serverlocalizedstring2, (i & 16) != 0 ? null : _serverlocalizedstring3, (i & 32) != 0 ? null : _serverlocalizedstring4, (i & 64) != 0 ? null : ctaIntent, (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? ModelSection.DEPRECATED : modelSection, (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? null : disabledReason, (i & 512) != 0 ? nm6.E : map, (i & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? null : thinkingOptions, (i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0 ? null : badge, (i & FreeTypeConstants.FT_LOAD_MONOCHROME) != 0 ? null : modelTooltip, null);
    }
}
