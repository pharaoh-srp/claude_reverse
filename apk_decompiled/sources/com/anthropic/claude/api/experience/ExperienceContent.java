package com.anthropic.claude.api.experience;

import defpackage.mdj;
import defpackage.n97;
import defpackage.onf;
import defpackage.qg9;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003\u0082\u0001\u0005\u0004\u0005\u0006\u0007\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/anthropic/claude/api/experience/ExperienceContent;", "", "Companion", "n97", "Lcom/anthropic/claude/api/experience/BannerContent;", "Lcom/anthropic/claude/api/experience/ChatInputBannerContent;", "Lcom/anthropic/claude/api/experience/ChatTooltipContent;", "Lcom/anthropic/claude/api/experience/SpotlightContent;", "Lcom/anthropic/claude/api/experience/UnknownContent;", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
@qg9(discriminator = ExperienceContent.DISCRIMINATOR)
public interface ExperienceContent {
    public static final n97 Companion = n97.a;
    public static final String DISCRIMINATOR = "template_key";
}
