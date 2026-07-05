package defpackage;

import com.anthropic.claude.analytics.screens.AnalyticsScreen;
import com.anthropic.claude.analytics.screens.AnalyticsScreens$ChatListScreen;
import com.anthropic.claude.analytics.screens.AnalyticsScreens$ChatScreen;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class nx {
    public static final /* synthetic */ nx a = new nx();

    public final KSerializer serializer() {
        kce kceVar = jce.a;
        return new odf("com.anthropic.claude.analytics.screens.AnalyticsScreen", kceVar.b(AnalyticsScreen.class), new pl9[]{kceVar.b(AnalyticsScreens$ChatListScreen.class), kceVar.b(AnalyticsScreens$ChatScreen.class)}, new KSerializer[]{ox.a, qx.a}, new Annotation[]{new pi(2)});
    }
}
