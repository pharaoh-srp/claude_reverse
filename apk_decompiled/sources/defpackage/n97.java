package defpackage;

import com.anthropic.claude.api.experience.BannerContent;
import com.anthropic.claude.api.experience.ChatInputBannerContent;
import com.anthropic.claude.api.experience.ChatTooltipContent;
import com.anthropic.claude.api.experience.ExperienceContent;
import com.anthropic.claude.api.experience.SpotlightContent;
import com.anthropic.claude.api.experience.UnknownContent;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.modules.a;

/* JADX INFO: loaded from: classes.dex */
public final class n97 {
    public static final /* synthetic */ n97 a = new n97();
    public static final nnf b;

    static {
        a aVar = new a();
        kce kceVar = jce.a;
        w3c w3cVar = new w3c(kceVar.b(ExperienceContent.class));
        w3cVar.e(kceVar.b(SpotlightContent.class), SpotlightContent.Companion.serializer());
        w3cVar.e(kceVar.b(ChatTooltipContent.class), ChatTooltipContent.Companion.serializer());
        w3cVar.e(kceVar.b(BannerContent.class), BannerContent.Companion.serializer());
        w3cVar.e(kceVar.b(ChatInputBannerContent.class), ChatInputBannerContent.Companion.serializer());
        w3cVar.b(new xg5(16));
        w3cVar.a(aVar);
        b = aVar.b();
    }

    public final KSerializer serializer() {
        kce kceVar = jce.a;
        int i = 6;
        return new odf("com.anthropic.claude.api.experience.ExperienceContent", kceVar.b(ExperienceContent.class), new pl9[]{kceVar.b(BannerContent.class), kceVar.b(ChatInputBannerContent.class), kceVar.b(ChatTooltipContent.class), kceVar.b(SpotlightContent.class), kceVar.b(UnknownContent.class)}, new KSerializer[]{xc1.a, qt2.a, tc3.a, tig.a, new lq6("com.anthropic.claude.api.experience.UnknownContent", UnknownContent.INSTANCE, new Annotation[]{new gl0(i)})}, new Annotation[]{new gl0(i)});
    }
}
