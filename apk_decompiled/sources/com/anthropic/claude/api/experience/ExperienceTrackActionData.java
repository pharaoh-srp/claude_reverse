package com.anthropic.claude.api.experience;

import defpackage.mdj;
import defpackage.onf;
import defpackage.qg9;
import defpackage.ya7;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003\u0082\u0001\u0004\u0004\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/anthropic/claude/api/experience/ExperienceTrackActionData;", "", "Companion", "ya7", "Lcom/anthropic/claude/api/experience/TrackActionedData;", "Lcom/anthropic/claude/api/experience/TrackDismissedData;", "Lcom/anthropic/claude/api/experience/TrackShownData;", "Lcom/anthropic/claude/api/experience/TrackUnknownActionData;", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
@qg9(discriminator = "type")
public interface ExperienceTrackActionData {
    public static final ya7 Companion = ya7.a;
    public static final String DISCRIMINATOR = "type";
}
