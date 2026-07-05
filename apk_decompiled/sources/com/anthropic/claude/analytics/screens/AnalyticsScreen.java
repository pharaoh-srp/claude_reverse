package com.anthropic.claude.analytics.screens;

import defpackage.mdj;
import defpackage.nx;
import defpackage.onf;
import defpackage.qg9;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00062\u00020\u0001:\u0001\u0007R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/anthropic/claude/analytics/screens/AnalyticsScreen;", "", "", "getScreenName", "()Ljava/lang/String;", "screenName", "Companion", "nx", "Lcom/anthropic/claude/analytics/screens/AnalyticsScreens$ChatListScreen;", "Lcom/anthropic/claude/analytics/screens/AnalyticsScreens$ChatScreen;", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
@qg9(discriminator = "screenName")
public interface AnalyticsScreen {
    public static final nx Companion = nx.a;

    String getScreenName();
}
