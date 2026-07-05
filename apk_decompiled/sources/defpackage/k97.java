package defpackage;

import com.anthropic.claude.api.experience.ExperienceClientAction;
import com.anthropic.claude.api.experience.NewChatAction;
import com.anthropic.claude.api.experience.OpenLinkAction;
import com.anthropic.claude.api.experience.RefreshCacheAction;
import com.anthropic.claude.api.experience.RemoteAction;
import com.anthropic.claude.api.experience.UnknownClientAction;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.modules.a;

/* JADX INFO: loaded from: classes.dex */
public final class k97 {
    public static final /* synthetic */ k97 a = new k97();
    public static final nnf b;

    static {
        a aVar = new a();
        kce kceVar = jce.a;
        w3c w3cVar = new w3c(kceVar.b(ExperienceClientAction.class));
        w3cVar.e(kceVar.b(NewChatAction.class), NewChatAction.Companion.serializer());
        w3cVar.e(kceVar.b(OpenLinkAction.class), OpenLinkAction.Companion.serializer());
        w3cVar.e(kceVar.b(RefreshCacheAction.class), RefreshCacheAction.Companion.serializer());
        w3cVar.e(kceVar.b(RemoteAction.class), RemoteAction.Companion.serializer());
        w3cVar.b(new xg5(15));
        w3cVar.a(aVar);
        b = aVar.b();
    }

    public final KSerializer serializer() {
        kce kceVar = jce.a;
        int i = 5;
        return new odf("com.anthropic.claude.api.experience.ExperienceClientAction", kceVar.b(ExperienceClientAction.class), new pl9[]{kceVar.b(NewChatAction.class), kceVar.b(OpenLinkAction.class), kceVar.b(RefreshCacheAction.class), kceVar.b(RemoteAction.class), kceVar.b(UnknownClientAction.class)}, new KSerializer[]{m2c.a, lhc.a, wce.a, qee.a, new lq6("com.anthropic.claude.api.experience.UnknownClientAction", UnknownClientAction.INSTANCE, new Annotation[]{new gl0(i)})}, new Annotation[]{new gl0(i)});
    }
}
